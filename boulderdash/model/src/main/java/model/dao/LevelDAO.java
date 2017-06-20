package model.dao;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import contract.EntityType;
import model.BlockEnd;
import model.BlockVoid;
import model.Entity;
import model.EntityDiamond;
import model.EntityRock;


public class LevelDAO extends AbstractDAO
{
	private static String sqlGetBackGround   = "{call GetBackGround(?)}";


	/**
	 * Gets the all examples.
	 *
	 * @return the all examples
	 * @throws SQLException
	 *             the SQL exception
	 */
	public static ArrayList<Entity> getBackground(final int id) throws SQLException 
	{
		final CallableStatement callStatement = prepareCall(sqlGetBackGround);
		ArrayList<Entity> example = new ArrayList<Entity>();
		if (callStatement.execute()) 
		{
			final ResultSet result = callStatement.getResultSet();

			for (boolean isResultLeft = result.first(); isResultLeft; isResultLeft = result.next()) 
			{
				int posx = result.getInt(2);
				int posy = result.getInt(3);

				
				switch(result.getInt(4))
				{
				case 1:
					example.add(new BlockEnd(posx,posy));
					break;
				case 2:
					example.add(new EntityDiamond(posx,posy));
					example.add(new BlockVoid(posx,posy));
					break;
				case 3:
					example.add(new EntityDiamond(posx,posy));
					example.add(new BlockVoid(posx,posy));
					break;
				case 4:
					example.add(new EntityRock(posx,posy));
					example.add(new BlockVoid(posx,posy));
					break;
				case 5:
					example.add(new BlockWall(posx,posy));
					break;
				case 6:
					type = EntityType.VOID;
					break;
				default :
					break;
				}
				
				
			}
			example.add(new IEntity(result.getInt(idColumnIndex), result.getString(nameColumnIndex)));

			result.close();
		}
		return examples;
	}



}

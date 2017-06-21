package model.dao;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import contract.IEntity;
import model.BlockEnd;
import model.BlockVoid;
import model.BlocWall;
import model.EntityDiamond;
import model.EntityEnemy;
import model.EntityPlayer;
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
	public static ArrayList<IEntity> getBackground(final int id) throws SQLException 
	{
		final CallableStatement callStatement = prepareCall(sqlGetBackGround);
		ArrayList<IEntity> example = new ArrayList<IEntity>();
		callStatement.setInt(1, id);

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
					example.add(new BlocWall(posx,posy));
					break;
				case 6:
					example.add(new EntityPlayer(posx,posy));
					example.add(new BlockVoid(posx,posy));
					break;
				case 7:
					example.add(new EntityEnemy(posx,posy));
					example.add(new BlockVoid(posx,posy));
					break;
				default:
					break;


				}

				result.close();
			}
			
		}
		return example;
	}

}

package model;

import java.sql.SQLException;
import java.util.ArrayList;

import contract.EntityType;
import contract.IEntity;
import contract.OrderType;
import model.dao.LevelDAO;

import contract.IModel;

public class Model implements IModel{
	

	private ArrayList <IEntity> model;
	private EntityPlayer playerref;
	
	
	/**
	 * @param world Number of the world (1 to 5).
	 */
	public Model(int world) 
	{
		 
		 try {
			model = LevelDAO.getBackground(world);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
			for (int i = 0; i < model.size(); i++)
			{
				if(model.get(i).getType() == EntityType.PLAYER)
				{
					playerref = (EntityPlayer) model.get(i);
				}
			}
		 
		 
	}
	
	public void Update(OrderType order)
	{
		for(int i = 0; i <model.size(); i++)
			if(model.get(i).canExec())
			model = model.get(i).Update(model, order);
		
		
	}
	
	/**
	 * The player won't win if he doesn't pick 3 diamonds.
	 * Otherwise he will win.
	 */
	public boolean isVictory()
	{
		if(playerref.getScore() != 3)
		return false;
		else
		return true;
	}
	public boolean isLost()
	{
		boolean isAlive = false;
		for(int i = 0; i <model.size(); i++)
			if(model.get(i).getType())
		
	}
	public ArrayList<IEntity> GetMap()
	{
		return model;
		
	}
	
}

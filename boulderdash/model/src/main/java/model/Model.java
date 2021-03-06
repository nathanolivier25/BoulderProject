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
		Reload(world);

	}

	public void Update(OrderType order)
	{
		for(int i = 0; i <model.size(); i++)
			if(model.get(i).canExec())
				model = model.get(i).Update(model, order);


	}
	
	public void Reload(int world)
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
	

	/**
	 * The player won't win if he doesn't pick 3 diamonds.
	 * Otherwise he will win.
	 */
	public boolean isVictory()
	{
		if(playerref.getScore() >= 3)
		{
			for(int i = 0; i <model.size(); i++)
				if(model.get(i).GetPosx() == playerref.GetPosx() && model.get(i).GetPosy() == playerref.getPosy() 
				&& model.get(i).getType() == EntityType.END)
					return true;
		}
		return false;
	}
	public boolean isLost()
	{
		boolean isDead = true;
		for(int i = 0; i <model.size(); i++)
			if(model.get(i).getType() == EntityType.PLAYER)
				isDead = false;

		return isDead;
	}
	public ArrayList<IEntity> GetMap()
	{
		return model;

	}

}

package model;

import java.sql.SQLException;
import java.util.ArrayList;

import contract.IEntity;
import contract.OrderType;
import model.dao.LevelDAO;

import contract.IModel;

public class Model implements IModel{
	

	private ArrayList <IEntity> model;
	
	public Model(int world) 
	{
		 
		 try {
			model = LevelDAO.getBackground(world);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 
	}
	
	public void Update(OrderType order)
	{
		for(int i = 0; i <model.size(); i++)
			model = model.get(i).Update(model, order);
		
		
	}
	public boolean isVictory()
	{
		return false;

	}
	public boolean isLost()
	{
		return false;
		
	}
	public ArrayList<IEntity> GetMap()
	{
		return model;
		
	}
	


	public int getScore()
	{
		return 0;
	}
	
}

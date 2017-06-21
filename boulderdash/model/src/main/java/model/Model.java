package model;

import java.sql.SQLException;
import java.util.ArrayList;

import contract.IEntity;
import contract.OrderType;
import model.dao.LevelDAO;

import contract.IModel;

public class Model implements IModel{
	

	private ArrayList <IEntity> model;
	private int score;
	
	public void model(int world) 
	{
		 score = 0;
		 
		 try {
			model = LevelDAO.getBackground(world);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 
	}
	
	public void Update(OrderType order)
	{
		
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
		return score;
	}

	public void setScore(int score) 
	{
		this.score = score;
	}
	
}

package model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import contract.IEntity;
import contract.OrderType;
import model.Entity;
import model.dao.LevelDAO;

import contract.IModel;

public class Model implements IModel{
	

	private ArrayList <IEntity> model;
	private int score;
	private int sizeX;
	private int sizeY;
	
	public void model(int world) 
	{
		 score = 0;
		 sizeX = 20;
		 sizeY = 20;
		 
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

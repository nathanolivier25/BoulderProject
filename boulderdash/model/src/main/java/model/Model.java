package model;

import java.util.ArrayList;

import contract.IEntity;
import contract.OrderType;
import model.Entity;
import model.dao.LevelDAO;
import contract.IModel;

public class Model implements IModel{
	
	
	protected LevelDAO leveldao;

	private ArrayList <Entity> model;
	private int score;
	private int sizeX;
	private int sizeY;
	
	public void model(int world, int level) 
	{
		
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
		return null;
		
	}
	


	public int getScore()
	{
		return score;
	}

	public void setScore(int score) 
	{
		this.score = score;
	}

	public LevelDAO getLeveldao() 
	{
		return leveldao;
	}

	public void setLeveldao(LevelDAO leveldao) 
	{
		this.leveldao = leveldao;
	}

	public ArrayList<Entity> getModel() 
	{
		return model;
	}

	public void setModel(ArrayList<Entity> model) 
	{
		this.model = model;
	}


	
}

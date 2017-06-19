package model;

import java.util.ArrayList;

import contract.IEntity;
import contract.OrderType;
import model.Entity;

public class Model {

	private ArrayList <Entity>;
	private int score;
	
	public void model(int world, int level) {
		
	}
	
	public void Update(OrderType order){
		
	}
	public boolean isVictory() {

	}
	public boolean isLost(){
		
	}
	public ArrayList<IEntity> GetMap(){
		
	}
	
	protected Entity entity;
	
	public Model() {
		this.entity = new Entity(score, score, null);
		this.entity.setModel(this);
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public Entity getEntity() {
		return entity;
	}

	public void setEntity(Entity entity) {
		this.entity = entity;
	}
}

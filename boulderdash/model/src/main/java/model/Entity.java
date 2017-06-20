package model;

import java.util.ArrayList;

import contract.EntityType;
import contract.OrderType;

public abstract class Entity {

	public int Posx;
	public int Posy;
	public EntityType typeID;

	public Entity(int Posx, int Posy, EntityType typeID) {

	}

	protected Model model;

	public Model getModel() {
		return model;
	}

	public void setModel(Model model) {
		this.model = model;
	}

	public ArrayList<Entity> Update(ArrayList<Entity> test, OrderType order) {
		return null;
		// TODO Auto-generated method stub
		
	}

	
}
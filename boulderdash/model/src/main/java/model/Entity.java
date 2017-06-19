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

	public void Update() {
		// TODO Auto-generated method stub
		
	}

	public abstract void Update(ArrayList<Entity> test, OrderType order);
}
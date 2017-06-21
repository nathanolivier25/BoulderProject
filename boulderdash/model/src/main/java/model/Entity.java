package model;

import java.util.ArrayList;

import contract.EntityType;
import contract.IEntity;
import contract.OrderType;

public abstract class Entity implements IEntity{

	public int Posx;
	public int Posy;
	public EntityType typeID;

	public Entity(int Posx, int Posy, EntityType typeID) {

	}

	public EntityType getTypeID() {
		return typeID;
	}

	public int getPosx() {
		return Posx;
	}

	public void setPosx(int posx) {
		Posx = posx;
	}

	public int getPosy() {
		return Posy;
	}

	public void setPosy(int posy) {
		Posy = posy;
	}

	public ArrayList<Entity> Update(ArrayList<Entity> test, OrderType order) {
		return null;
		// TODO Auto-generated method stub

	}

}
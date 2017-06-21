package model;

import java.util.ArrayList;

import contract.EntityType;
import contract.OrderType;

public class EntityEnemy extends Entity{

	public EntityEnemy(int Posx, int Posy) {
		super(Posx, Posy, EntityType.ENEMY);
	}

	@Override
	public ArrayList<Entity> Update(ArrayList<Entity> test, OrderType order) {

		return test;
	}
	
    
}

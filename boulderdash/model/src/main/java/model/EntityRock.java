package model;

import java.util.ArrayList;

import contract.EntityType;
import contract.OrderType;

public class EntityRock extends Entity{

	public EntityRock(int Posx, int Posy) {
		super(Posx, Posy, EntityType.ROCK);
	}

	@Override
	public ArrayList<Entity> Update(ArrayList<Entity> test, OrderType order) {

		// TODO Auto-generated method stub
		return test;
	}
}

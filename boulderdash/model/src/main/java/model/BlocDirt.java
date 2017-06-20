package model;

import java.util.ArrayList;

import contract.EntityType;
import contract.OrderType;

public class BlocDirt extends Entity {

	public BlocDirt(int Posx, int Posy) {
		super(Posx, Posy, EntityType.DIRT);
	}

	@Override
	public ArrayList<Entity> Update(ArrayList<Entity> test, OrderType order) {

		// TODO Auto-generated method stub
		return test;
		
	}
}

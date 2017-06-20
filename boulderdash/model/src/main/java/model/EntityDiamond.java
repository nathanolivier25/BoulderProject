package model;

import java.util.ArrayList;

import contract.EntityType;
import contract.OrderType;

public class EntityDiamond extends Entity{

	public EntityDiamond(int Posx, int Posy) {
		super(Posx, Posy, EntityType.DIAMOND);
	}

	@Override
	public ArrayList<Entity> Update(ArrayList<Entity> test, OrderType order) {

		// TODO Auto-generated method stub
		return test;
	}

}

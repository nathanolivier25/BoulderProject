package model;

import java.util.ArrayList;

import contract.EntityType;
import contract.OrderType;

public class EntityPlayer extends Entity{

	public EntityPlayer(int Posx, int Posy) {
		super(Posx, Posy, EntityType.PLAYER);
	}

	@Override
	public ArrayList<Entity> Update(ArrayList<Entity> test, OrderType order) {

		// TODO Auto-generated method stub
		return test;
	}
}

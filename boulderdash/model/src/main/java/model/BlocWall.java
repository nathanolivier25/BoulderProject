package model;

import java.util.ArrayList;

import contract.EntityType;
import contract.IEntity;
import contract.OrderType;

public class BlocWall extends Entity{

	public BlocWall(int Posx, int Posy) {
		super(Posx, Posy, EntityType.WALL);
	}

	
	public ArrayList<IEntity> Update(ArrayList<IEntity> test, OrderType order) {

		// TODO Auto-generated method stub
		return test;
	}
	
	@Override
	public int GetPosx() {
		// TODO Auto-generated method stub
		return super.getPosx();
	}

	@Override
	public int GetPosy() {
		// TODO Auto-generated method stub
		return super.getPosy();
	}

	@Override
	public EntityType getType() {
		// TODO Auto-generated method stub
		return super.getType();
	}
}

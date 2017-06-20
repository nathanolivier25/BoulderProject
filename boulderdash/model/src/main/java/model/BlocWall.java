package model;

import java.util.ArrayList;

import contract.EntityType;
import contract.OrderType;

public class BlocWall extends Entity{

	public BlocWall(int Posx, int Posy) {
		super(Posx, Posy, EntityType.WALL);
	}

	@Override
	public void Update(ArrayList<Entity> test, OrderType order) {
		// TODO Auto-generated method stub
		
	}

}

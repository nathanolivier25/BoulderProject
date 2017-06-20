package model;

import java.util.ArrayList;

import contract.EntityType;
import contract.OrderType;

public class BlockEnd extends Entity{

	public BlockEnd(int Posx, int Posy) {
		super(Posx, Posy, EntityType.END);
	}

	@Override
	public void Update(ArrayList<Entity> test, OrderType order) {
		// TODO Auto-generated method stub
		
	}

}

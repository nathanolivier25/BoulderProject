package model;

import java.util.ArrayList;

import contract.EntityType;
import contract.OrderType;

public class BlockVoid extends Entity{

	public BlockVoid(int Posx, int Posy) {
		super(Posx, Posy, EntityType.VOID);
	}

	@Override
	public void Update(ArrayList<Entity> test, OrderType order) {
		// TODO Auto-generated method stub
		
	}

}

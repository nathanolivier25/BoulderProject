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

		
		for  (int i = 0; i < test.size(); i++)
		{
				if 	(test.get(i).getPosx() == this.getPosx() && test.get(i).getPosy() == this.getPosy() && test.get(i).getTypeID() == EntityType.PLAYER)
				{
					test.add(new BlockVoid(getPosx(), getPosy()));
				}
		}
		// TODO Auto-generated method stub
		return test;

	}
}

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

		for (int i = 0; i < test.size(); i++)
		{
			if (test.get(i).getPosx() == this.getPosx() && test.get(i).getPosy() == this.getPosy()+1 && test.get(i).getTypeID() == EntityType.VOID)
			{
				Posy = Posy+1;
			}
		}
		return test;
	}
}

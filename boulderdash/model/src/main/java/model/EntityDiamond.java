package model;

import java.util.ArrayList;

import contract.EntityType;
import contract.OrderType;

public class EntityDiamond extends Entity{

	public EntityDiamond(int Posx, int Posy) {
		super(Posx, Posy, EntityType.DIAMOND);
	}

	// Falling diamond.
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

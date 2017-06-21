package model;

import java.util.ArrayList;

import contract.EntityType;
import contract.IEntity;
import contract.OrderType;

public class EntityRock extends Entity{

	public EntityRock(int Posx, int Posy) {
		super(Posx, Posy, EntityType.ROCK);
	}

	
	public ArrayList<IEntity> Update(ArrayList<IEntity> test, OrderType order) {

		for (int i = 0; i < test.size(); i++)
		{
			if (test.get(i).getPosx() == this.getPosx() && test.get(i).getPosy() == this.getPosy()+1 && test.get(i).getType() == EntityType.VOID)
			{
				Posy = Posy+1;
			}
		}
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

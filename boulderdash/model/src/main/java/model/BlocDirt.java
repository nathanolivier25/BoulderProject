package model;

import java.util.ArrayList;

import contract.EntityType;
import contract.IEntity;
import contract.OrderType;

public class BlocDirt extends Entity {

	public BlocDirt(int Posx, int Posy) {
		super(Posx, Posy, EntityType.DIRT);
	}

	public ArrayList<IEntity> Update(ArrayList<IEntity> test, OrderType order) {

		
		for  (int i = 0; i < test.size(); i++)
		{
				if 	(test.get(i).GetPosx() == this.getPosx() && test.get(i).GetPosy() == this.getPosy() && test.get(i).getType() == EntityType.PLAYER)
				{
					test.add(new BlockVoid(getPosx(), getPosy()));
				}
		}
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

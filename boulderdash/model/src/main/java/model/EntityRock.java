package model;

import java.util.ArrayList;

import contract.EntityType;
import contract.IEntity;
import contract.OrderType;

public class EntityRock extends Entity{
	/**
	 * @param Posx Horizontal location for the EntityRock.
	 * @param Posy Vertical location for the EntityRock.
	 */
	public EntityRock(int Posx, int Posy) {
		super(Posx, Posy, EntityType.ROCK,500);
	}

	/**
	 * The rock can't fall if there are a void AND a player below it.
	 * Otherwise, it will fall.
	 */
	public ArrayList<IEntity> Update(ArrayList<IEntity> test, OrderType order) {

		boolean canFall = true;
		for (int i = 0; i < test.size(); i++)
		{
			
			if (test.get(i).GetPosx() == this.getPosx() && test.get(i).GetPosy() == this.getPosy()+1)
			{
				if((test.get(i).getType() != EntityType.VOID) && (test.get(i).getType() !=EntityType.PLAYER) 
						&& (test.get(i).getType() !=EntityType.ENEMY))
				{
					canFall = false;
				}
			}

		} 	
		
		if(canFall)
		{
			Posy = Posy + 1;
			for (int i = 0; i < test.size(); i++)
			{
				if (test.get(i).GetPosx() == this.getPosx() && test.get(i).GetPosy() == this.getPosy() 
						&& (test.get(i).getType() == EntityType.PLAYER || test.get(i).getType() == EntityType.ENEMY))
				{
					test.remove(i);
				}
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

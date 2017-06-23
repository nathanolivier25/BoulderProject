package model;

import java.util.ArrayList;

import contract.EntityType;
import contract.IEntity;
import contract.OrderType;

public class EntityDiamond extends Entity{

	public EntityDiamond(int Posx, int Posy) {
		super(Posx, Posy, EntityType.DIAMOND);
	}

	// Falling diamond.
	
	public ArrayList<IEntity> Update(ArrayList<IEntity> test, OrderType order) {

			boolean canFall = true;
			for (int i = 0; i < test.size(); i++)
			{
				if (test.get(i).GetPosx() == this.getPosx() && test.get(i).GetPosy() == this.getPosy()+1)
				{
					//If there is something else than an empty place below the diamond won't fall
					EntityType temp = test.get(i).getType();
					if((temp != EntityType.VOID) && (test.get(i).getType() !=EntityType.PLAYER))
					{
						canFall = false;
					}	
				}
			} 		
			if(canFall)
			{
				Posy = Posy + 1;
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

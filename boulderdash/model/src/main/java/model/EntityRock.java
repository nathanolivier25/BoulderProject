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
			
			if (test.get(i).GetPosx() == this.getPosx() && test.get(i).GetPosy() == this.getPosy()+1)
			{
				//If there is another rock bellow the rock, it will not move.
				if(test.get(i).getType() == EntityType.ROCK)
				{
					//If there is another rock bellow the rock AND if there is a void on the right of the first rock AND on the right of the second rock,
					//The first rock will fall on the right of the other rock.
					if(test.get(i).GetPosx() == this.getPosx()+1 && test.get(i).GetPosy() == this.getPosy() && test.get(i).getType() == EntityType.VOID && test.get(i).GetPosx() == this.getPosx()+1 && test.get(i).GetPosy() == this.getPosy()+1 && test.get(i).getType() == EntityType.VOID)
					{
						Posx = Posx+1;
						Posy = Posy+1;
					}
					
					//If there is another rock bellow the rock AND if there is a void on the left of the first rock AND on the left of the second rock,
					//The first rock will fall on the left of the other rock.
					if (test.get(i).GetPosx() == this.getPosx()-1 && test.get(i).GetPosy() == this.getPosy() && test.get(i).getType() == EntityType.VOID && test.get(i).GetPosx() == this.getPosx()-1 && test.get(i).GetPosy() == this.getPosy()+1 && test.get(i).getType() == EntityType.VOID)
					{
						Posx = Posx-1;
						Posy = Posy-1;
					}
				}
				
				//If there is a "void" bellow the rock, it will fall at the position of the void.
				else if(test.get(i).getType() == EntityType.VOID)
				{
					Posy = Posy+1;
				}
				
				//If there is an enemy bellow the rock, it will fall on it.
				else if(test.get(i).getType() == EntityType.ENEMY)
				{
					Posy = Posy+1;
				}
				
				//If there is a player bellow the rock, it will fall on it.
				else if(test.get(i).getType() == EntityType.PLAYER)
				{
					Posy = Posy+1;
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

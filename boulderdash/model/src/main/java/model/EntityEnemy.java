package model;

import java.util.ArrayList;

import contract.EntityType;
import contract.IEntity;
import contract.OrderType;

/**
 * EntityEnemy is the class that define the behavior of our enemies
 * It's defined by the following elements :
 * @author Group 1
 * @version 1
 */
public class EntityEnemy extends Entity{
	
	 private OrderType previousSide;
	/**
	 * @param Posx Horizontal location for the EntityEnemy.
	 * @param Posy Vertical location for the EntityEnemy.
	 */
	public EntityEnemy(int Posx, int Posy) {
		super(Posx, Posy, EntityType.ENEMY,500);
		previousSide = OrderType.UP;
	}
	
	public ArrayList<IEntity> Update(ArrayList<IEntity> test, OrderType order) {


			if (previousSide == OrderType.UP) {
				boolean canmove = true;

				for (int i = 0; i < test.size(); i++) 
				{
					if (test.get(i).GetPosx() == this.GetPosx() && test.get(i).GetPosy() == this.GetPosy() - 1)
					{
						if((test.get(i).getType() != EntityType.VOID) && (test.get(i).getType() != EntityType.PLAYER))
						{
							canmove = false;
						}
					}
					
				}
				
				if(canmove)
				{
					Posy = Posy - 1;
					for (int i = 0; i < test.size(); i++)
					{
						if (test.get(i).GetPosx() == this.getPosx() && test.get(i).GetPosy() == this.getPosy() && test.get(i).getType() == EntityType.PLAYER)
						{
							test.remove(i);
						}
					}	
				}
				else
					this.previousSide = OrderType.RIGHT;
			}
			else if (previousSide == OrderType.DOWN) {
				boolean canmove = true;

				for (int i = 0; i < test.size(); i++) 
				{
					if (test.get(i).GetPosx() == this.getPosx() && test.get(i).GetPosy() == this.getPosy() + 1)
					{
						if((test.get(i).getType() != EntityType.VOID) && (test.get(i).getType() !=EntityType.PLAYER))
						{
							canmove = false;
						}
					}
				}
				if(canmove)
				{
					Posy = Posy + 1;
					for (int i = 0; i < test.size(); i++)
					{
						if (test.get(i).GetPosx() == this.getPosx() && test.get(i).GetPosy() == this.getPosy() && test.get(i).getType() == EntityType.PLAYER)
						{
							test.remove(i);
						}
					}	
				}
					else
						this.previousSide = OrderType.LEFT;

			}
			else if (previousSide == OrderType.LEFT) {
				boolean canmove = true;

				for (int i = 0; i < test.size(); i++) 
				{
					if (test.get(i).GetPosx() == this.getPosx()-1 && test.get(i).GetPosy() == this.getPosy())
					{
						if((test.get(i).getType() != EntityType.VOID) && (test.get(i).getType() != EntityType.PLAYER))
						{
							canmove = false;
						}
					}
				}
				
				if(canmove)
				{
					Posx = Posx - 1;
					for (int i = 0; i < test.size(); i++)
					{
						if (test.get(i).GetPosx() == this.getPosx() && test.get(i).GetPosy() == this.getPosy() && test.get(i).getType() == EntityType.PLAYER)
						{
							test.remove(i);
						}
					}	
				}
					else
						this.previousSide = OrderType.UP;

			}
			else  {
				boolean canmove = true;

				for (int i = 0; i < test.size(); i++) 
				{
					if (test.get(i).GetPosx() == this.getPosx()+1 && test.get(i).GetPosy() == this.getPosy())
					{
						if((test.get(i).getType() != EntityType.VOID) && (test.get(i).getType() !=EntityType.PLAYER))
						{
							canmove = false;
						}
					}
				}
				if(canmove)
				{
					Posx = Posx + 1;
					for (int i = 0; i < test.size(); i++)
					{
						if (test.get(i).GetPosx() == this.getPosx() && test.get(i).GetPosy() == this.getPosy() && test.get(i).getType() == EntityType.PLAYER)
						{
							test.remove(i);
						}
					}	
				}
					else
						this.previousSide = OrderType.DOWN;
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

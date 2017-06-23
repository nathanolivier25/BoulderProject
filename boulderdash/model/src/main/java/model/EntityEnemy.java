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
	
	/**
	 * @param Posx Horizontal location for the EntityEnemy.
	 * @param Posy Vertical location for the EntityEnemy.
	 */
	public EntityEnemy(int Posx, int Posy) {
		super(Posx, Posy, EntityType.ENEMY);
	}
	
	public ArrayList<IEntity> Update(ArrayList<IEntity> test, OrderType order) {

		for (int i = 0; i < test.size(); i++)
		{
			if (test.get(i).GetPosx() == this.getPosx()+1 && test.get(i).GetPosy() == this.getPosy() && test.get(i).getType() == EntityType.VOID)
			{
				Posx = Posx+1;
			}
			if (test.get(i).GetPosx() == this.getPosx()-1 && test.get(i).GetPosy() == this.getPosy() && test.get(i).getType() == EntityType.VOID)
			{
				Posx = Posx-1;
			}
			if (test.get(i).GetPosx() == this.getPosx() && test.get(i).GetPosy() == this.getPosy()+1 && test.get(i).getType() == EntityType.VOID)
			{
				Posy = Posy+1;
			}
			if (test.get(i).GetPosx() == this.getPosx()+1 && test.get(i).GetPosy() == this.getPosy()-1 && test.get(i).getType() == EntityType.VOID)
			{
				Posy = Posy-1;
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

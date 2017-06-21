package model;

import java.util.ArrayList;

import contract.EntityType;
import contract.OrderType;

public class EntityEnemy extends Entity{

	//OrderType Direction = OrderType.RIGHT;
	
	
	public EntityEnemy(int Posx, int Posy) {
		super(Posx, Posy, EntityType.ENEMY);
	}

	@Override
	public ArrayList<Entity> Update(ArrayList<Entity> test, OrderType order) {

		for (int i = 0; i < test.size(); i++)
		{
			if (test.get(i).getPosx() == this.getPosx()+1 && test.get(i).getPosy() == this.getPosy() && test.get(i).getType() == EntityType.VOID)
			{
				Posx = Posx+1;
			}
			if (test.get(i).getPosx() == this.getPosx()-1 && test.get(i).getPosy() == this.getPosy() && test.get(i).getType() == EntityType.VOID)
			{
				Posx = Posx-1;
			}
			if (test.get(i).getPosx() == this.getPosx() && test.get(i).getPosy() == this.getPosy()+1 && test.get(i).getType() == EntityType.VOID)
			{
				Posy = Posy+1;
			}
			if (test.get(i).getPosx() == this.getPosx()+1 && test.get(i).getPosy() == this.getPosy()-1 && test.get(i).getType() == EntityType.VOID)
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

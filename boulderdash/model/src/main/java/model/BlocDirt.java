package model;

import java.util.ArrayList;

import contract.EntityType;
import contract.IEntity;
import contract.OrderType;

/**
 * BlocDirt is the class that define the "behavior" of our rocks.
 * 
 * @author Group 1
 * @version 1
 */
public class BlocDirt extends Entity {

	/**
	 * @param Posx Horizontal location for the BlockDirt.
	 * @param Posy Vertical location for the BlockDirt.
	 */
	public BlocDirt(int Posx, int Posy) {
		super(Posx, Posy, EntityType.DIRT,0);
	}

	public ArrayList<IEntity> Update(ArrayList<IEntity> test, OrderType order) {



		for (int i = 0; i < test.size(); i++) {
			if (test.get(i).GetPosx() == this.getPosx() && test.get(i).GetPosy() == this.getPosy()
					&& test.get(i).getType() == EntityType.PLAYER) 
			{
				test.add(new BlockVoid(getPosx(), getPosy()));

				for (int j = 0; j < test.size(); j++) {
					if (test.get(j).GetPosx() == this.getPosx() && test.get(j).GetPosy() == this.getPosy() 
							&& test.get(j).getType() == EntityType.DIRT) 
						test.remove(j);
				}
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

package model;

import java.util.ArrayList;

import contract.EntityType;
import contract.IEntity;
import contract.OrderType;

/**
 * BlockEnd is the class that define the "behavior" of our end.
 * 
 * @author Group 1
 * @version 1
 */

public class BlockEnd extends Entity{

	/**
	 * @param Posx Horizontal location for the BlockEnd.
	 * @param Posy Vertical location for the BlockEnd.
	 */
	public BlockEnd(int Posx, int Posy) {
		super(Posx, Posy, EntityType.END,0);
	}

	
	public ArrayList<IEntity> Update(ArrayList<IEntity> test, OrderType order)
	{

		
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

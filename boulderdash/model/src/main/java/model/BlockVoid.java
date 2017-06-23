package model;

import java.util.ArrayList;

import contract.EntityType;
import contract.IEntity;
import contract.OrderType;

/**
 * BlockVoid is the class that define the "behavior" of our voids.
 * 
 * @author Group 1
 * @version 1
 */
public class BlockVoid extends Entity{
	/**
	 * @param Posx Horizontal location for the BlockVoid.
	 * @param Posy Vertical location for the BlockVoid.
	 */
	public BlockVoid(int Posx, int Posy) {
		super(Posx, Posy, EntityType.VOID,0);
	}

	
	public ArrayList<IEntity> Update(ArrayList<IEntity> test, OrderType order) {

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

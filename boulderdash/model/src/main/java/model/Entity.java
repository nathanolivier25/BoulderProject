package model;

import java.util.ArrayList;

import contract.EntityType;
import contract.IEntity;
import contract.OrderType;

public abstract class Entity implements IEntity{

	public int Posx;
	public int Posy;
	public EntityType typeID;
	public long timeMillisAtRestart;
	public long millisUntilUpdate;


	public Entity(int Posx, int Posy, EntityType typeID,long millisBeforeUpdate) {
		this.Posx = Posx;
		this.Posy = Posy;
		this.typeID = typeID;
		this.millisUntilUpdate = millisBeforeUpdate;
	}

	public void restartClock()
	{
		timeMillisAtRestart = System.currentTimeMillis();
	}

	public boolean canExec()
	{
		long t = System.currentTimeMillis() - timeMillisAtRestart;
		if(t<millisUntilUpdate)
			return false;
		else
		{
			restartClock();
			return true;
		}
	}



	public EntityType getType() {
		return typeID;
	}

	public int getPosx() {
		return Posx;
	}

	public void setPosx(int posx) {
		Posx = posx;
	}

	public int getPosy() {
		return Posy;
	}

	public void setPosy(int posy) {
		Posy = posy;
	}

	public ArrayList<IEntity> Update(ArrayList<IEntity> test, OrderType order) {
		restartClock();
		return test;
		// TODO Auto-generated method stub

	}

}




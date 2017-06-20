package model;

import java.util.ArrayList;

import contract.EntityType;
import contract.OrderType;

public class EntityEnemy extends Entity{

	public EntityEnemy(int Posx, int Posy) {
		super(Posx, Posy, EntityType.ENEMY);
	}

	@Override
	public void Update(ArrayList<Entity> test, OrderType order) {
		// TODO Auto-generated method stub
		
	}

}

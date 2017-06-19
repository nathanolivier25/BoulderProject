package model;

import contract.EntityType;
import contract.OrderType;

public abstract class Entity {

	public int Posx;
	public int Posy;
	public EntityType typeID;

		public void Entity(int Posx, int Posy, EntityType typeID) {
			
		}
	public abstract Update void (ArrayList<Entity>, OrderType order) {
	}
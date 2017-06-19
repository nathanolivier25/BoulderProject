package model;

import contract.EntityType;

public class Entity {

	public int Posx;
	public int Posy;
	public EntityType typeID;

	public Entity(int Posx, int Posy, EntityType typeID) {

	}



	protected Model model;

	public Model getModel() {
		return model;
	}

	public void setModel(Model model) {
		this.model = model;
	}
}
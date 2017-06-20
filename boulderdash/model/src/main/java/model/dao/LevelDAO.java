package model.dao;

import model.Model;

public class LevelDAO extends AbstractDAO{
	protected Model model;

	public Model getModel() {
		return model;
	}

	public void setModel(Model model) {
		this.model = model;
	}
}

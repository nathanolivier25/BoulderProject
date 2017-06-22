package model;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import contract.EntityType;
import contract.IEntity;
import contract.OrderType;

public class EntityPlayer extends Entity {

	public EntityPlayer(int Posx, int Posy) {
		super(Posx, Posy, EntityType.PLAYER);
	}

	public ArrayList<IEntity> Update(ArrayList<IEntity> test, OrderType order) {

		for (int i = 0; i < test.size(); i++) {
			if (order == OrderType.RIGHT) {
				if (test.get(i).GetPosx() == this.getPosx() + 1 && test.get(i).GetPosy() == this.getPosy()
						&& test.get(i).getType() == EntityType.DIRT || test.get(i).getType() == EntityType.VOID
						|| test.get(i).getType() == EntityType.END) {
					Posx = Posx + 1;
				}
				if (test.get(i).GetPosx() == this.getPosx() + 1 && test.get(i).GetPosy() == this.getPosy()
						&& test.get(i).getType() == EntityType.DIAMOND) {
					Posx = Posx + 1;
				}
				if (test.get(i).GetPosx() == this.getPosx() + 1 && test.get(i).GetPosy() == this.getPosy()
						&& test.get(i).getType() == EntityType.ROCK) {
					if (test.get(i).GetPosx() == this.getPosx() + 2 && test.get(i).GetPosy() == this.getPosy()
							&& test.get(i).getType() == EntityType.VOID) {
						Posx = Posx + 1;
					}
				}
			}
			else if (order == OrderType.LEFT) {
				if (test.get(i).GetPosx() == this.getPosx() + 1 && test.get(i).GetPosy() == this.getPosy()
						&& test.get(i).getType() == EntityType.DIRT || test.get(i).getType() == EntityType.VOID
						|| test.get(i).getType() == EntityType.END) {
					Posx = Posx - 1;
				}
				if (test.get(i).GetPosx() == this.getPosx() + 1 && test.get(i).GetPosy() == this.getPosy()
						&& test.get(i).getType() == EntityType.DIAMOND) {
					Posx = Posx - 1;
				}
				if (test.get(i).GetPosx() == this.getPosx() + 1 && test.get(i).GetPosy() == this.getPosy()
						&& test.get(i).getType() == EntityType.ROCK) {
					if (test.get(i).GetPosx() == this.getPosx() + 2 && test.get(i).GetPosy() == this.getPosy()
							&& test.get(i).getType() == EntityType.VOID) {
						Posx = Posx - 1;
					}
				}

			}
			else if (order == OrderType.UP) {
				if (test.get(i).GetPosx() == this.getPosx() + 1 && test.get(i).GetPosy() == this.getPosy()
						&& test.get(i).getType() == EntityType.DIRT || test.get(i).getType() == EntityType.VOID
						|| test.get(i).getType() == EntityType.END) {
					Posy = Posy + 1;
				}
				if (test.get(i).GetPosx() == this.getPosx() + 1 && test.get(i).GetPosy() == this.getPosy()
						&& test.get(i).getType() == EntityType.DIAMOND) {
					Posy = Posy + 1;
				}
			}
			else if (order == OrderType.DOWN) {
				if (test.get(i).GetPosx() == this.getPosx() + 1 && test.get(i).GetPosy() == this.getPosy()
						&& test.get(i).getType() == EntityType.DIRT || test.get(i).getType() == EntityType.VOID
						|| test.get(i).getType() == EntityType.END) {
					Posy = Posy - 1;
				}
				if (test.get(i).GetPosx() == this.getPosx() + 1 && test.get(i).GetPosy() == this.getPosy()
						&& test.get(i).getType() == EntityType.DIAMOND) {
					Posy = Posy - 1;
				}
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

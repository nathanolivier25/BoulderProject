package model;

import java.util.ArrayList;

import javax.swing.JLabel;

import contract.EntityType;
import contract.IEntity;
import contract.OrderType;

public class EntityPlayer extends Entity {
	

	public int Score = 0;
	public String ScoreCount = "Score: " + Score;
	JLabel scoreLabel = new JLabel("Score : 0");
	public void someoneScore() {
		
		Score++;
		scoreLabel.setText("Score : " + Score);
		scoreLabel.setLocation(5, 5);
	}

	public void setScore(int score) {
		Score = score;
	}

	public EntityPlayer(int Posx, int Posy) {
		super(Posx, Posy, EntityType.PLAYER);
	}

	public ArrayList<IEntity> Update(ArrayList<IEntity> test, OrderType order) {

		for (int i = 0; i < test.size(); i++) 
		{
			if (test.get(i).GetPosx() == this.getPosx() && test.get(i).GetPosy() == this.getPosy()
					&& test.get(i).getType() == EntityType.DIAMOND) 
			{
				for (int j = 0; j < test.size(); j++) 
				{
					if (test.get(j).GetPosx() == this.getPosx() && test.get(j).GetPosy() == this.getPosy()
							&& test.get(j).getType() == EntityType.DIAMOND)
						test.remove(j);
					{
						Score = Score+1;
					}
				}
			}
		}
		if (order == OrderType.RIGHT) {
			Posx = Posx + 1;
		}

		if (order == OrderType.LEFT) {
			Posx = Posx - 1;
		}
		if (order == OrderType.UP) {
			Posy = Posy - 1;
		}

		if (order == OrderType.DOWN) {
			Posy = Posy + 1;
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

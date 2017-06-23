package model;

import java.util.ArrayList;


import contract.EntityType;
import contract.IEntity;
import contract.OrderType;

public class EntityPlayer extends Entity {

	public int Score = 0;

	public EntityPlayer(int Posx, int Posy) {
		super(Posx, Posy, EntityType.PLAYER,100);
	}

	public int getScore() {

		return Score;
	}

	public void setScore(int score) {
		Score = score;
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
					{
						test.remove(j);
						Score = Score+1;
					}
				}
			}

		}

		//void dirt diamond

		if (order == OrderType.RIGHT) {
			boolean canmove = true;

			for (int i = 0; i < test.size(); i++) 
			{
				if (test.get(i).GetPosx() == this.getPosx()+1 && test.get(i).GetPosy() == this.getPosy())
				{
					if((test.get(i).getType() != EntityType.VOID) && (test.get(i).getType() !=EntityType.DIRT) && (test.get(i).getType() !=EntityType.DIAMOND))
					{
						if(test.get(i).getType() == EntityType.ROCK)
						{
							boolean canrockmove = true;
							for (int j = 0; j < test.size(); j++) 
							{
								if (test.get(j).GetPosx() == this.getPosx()+2 && test.get(j).GetPosy() == this.getPosy())
								{
									if(test.get(j).getType() != EntityType.VOID)
									{
										canrockmove = false;
									}
								}
							}
							if(canrockmove)
							{
								test.get(i).setPosx(test.get(i).GetPosx() + 1);
							}
							else
								canmove = false;	
						}
						else
							canmove = false;
					}
				}
			}
			if(canmove)
				Posx = Posx + 1;
		}







		if (order == OrderType.LEFT) {
			boolean canmove = true;

			for (int i = 0; i < test.size(); i++) 
			{
				if (test.get(i).GetPosx() == this.getPosx()-1 && test.get(i).GetPosy() == this.getPosy())
				{
					if((test.get(i).getType() != EntityType.VOID) && (test.get(i).getType() !=EntityType.DIRT) && (test.get(i).getType() !=EntityType.DIAMOND))
					{
						if(test.get(i).getType() == EntityType.ROCK)
						{
							boolean canrockmove = true;
							for (int j = 0; j < test.size(); j++) 
							{
								if (test.get(j).GetPosx() == this.getPosx()-2 && test.get(j).GetPosy() == this.getPosy())
								{
									if(test.get(j).getType() != EntityType.VOID)
									{
										canrockmove = false;
									}
								}
							}
							if(canrockmove)
							{
								test.get(i).setPosx(test.get(i).GetPosx() - 1);
							}
							else
								canmove = false;	
						}
						else
							canmove = false;
					}
				}
			}
			if(canmove)
				Posx = Posx - 1;
		}



		if (order == OrderType.UP) {
			boolean canmove = true;

			for (int i = 0; i < test.size(); i++) 
			{
				if (test.get(i).GetPosx() == this.getPosx() && test.get(i).GetPosy() == this.getPosy() - 1)
				{
					if((test.get(i).getType() != EntityType.VOID) && (test.get(i).getType() !=EntityType.DIRT) && (test.get(i).getType() !=EntityType.DIAMOND))
					{
						canmove = false;
					}
				}
			}
			if(canmove)
				Posy = Posy - 1;
		}
		
		
		
		if (order == OrderType.DOWN) {
			boolean canmove = true;

			for (int i = 0; i < test.size(); i++) 
			{
				if (test.get(i).GetPosx() == this.getPosx() && test.get(i).GetPosy() == this.getPosy() + 1)
				{
					if((test.get(i).getType() != EntityType.VOID) && (test.get(i).getType() !=EntityType.DIRT) && (test.get(i).getType() !=EntityType.DIAMOND))
					{
						canmove = false;
					}
				}
			}
			if(canmove)
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

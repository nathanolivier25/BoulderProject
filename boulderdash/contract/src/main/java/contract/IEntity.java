package contract;

import java.util.ArrayList;

import model.Entity;

public interface IEntity 
{

	public int GetPosx();
	
	public void setPosx(int posx);

	public int GetPosy();
	
	public void setPosy(int posy);

	public EntityType getType();
	
	public ArrayList<IEntity> Update(ArrayList<IEntity> test, OrderType order);

	

	

}

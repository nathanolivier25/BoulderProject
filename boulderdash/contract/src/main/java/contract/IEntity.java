package contract;
/**
 * IEntity is an interface that call abstract methods.
 * @author Group 1
 * @version 1
 */
import java.util.ArrayList;


public interface IEntity 
{
	
	public int Posx = 0;
	public int Posy = 0;
	public EntityType typeID = null;
	
	
	public int GetPosx();
	
	public void setPosx(int posx);

	public int GetPosy();
	
	public void setPosy(int posy);

	public EntityType getType();
	
	public ArrayList<IEntity> Update(ArrayList<IEntity> test, OrderType order);

	

	

}

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
	
	
	/**
	 * There are the Getters and Setters from Posx, Posy and typeID.
	 */
	public int GetPosx();
	
	public void setPosx(int posx);

	public int GetPosy();
	
	public void setPosy(int posy);


	public EntityType getType();
	
	/**
	 * @param test That's the name of the ArrayList.
	 * @param order That's an OrderType.
	 */
	public ArrayList<IEntity> Update(ArrayList<IEntity> test, OrderType order);

	

	

}

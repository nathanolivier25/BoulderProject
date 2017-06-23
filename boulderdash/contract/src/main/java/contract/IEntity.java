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
	/**
	 * @return return
	 */
	public int GetPosx();
	
	/**
	 * @param posx the x location.
	 */
	public void setPosx(int posx);

	/**
	 * @return return
	 */
	public int GetPosy();
	
	/**
	 * @param posy the y location.
	 */
	public void setPosy(int posy);


	/**
	 * @return return
	 */
	public EntityType getType();
	
	/**
	 * @param test That's the name of the ArrayList.
	 * @param order That's an OrderType.
	 * @return return
	 */
	public ArrayList<IEntity> Update(ArrayList<IEntity> test, OrderType order);

	

	

}

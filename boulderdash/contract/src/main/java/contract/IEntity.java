package contract;
/**
 * IEntity est une interface qui permet d'appeler des methode abstraite 
 * de la classe Entity
 * @author Groupe 1
 * @version 1
 */
import java.util.ArrayList;


public interface IEntity 
{
	/**
	 * Posx est de type int et prend la valeur 0
	 * Posy est de type int et prend la valeur 0
	 *typeID est de type EntityType et prend la valeur null 
	 */
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

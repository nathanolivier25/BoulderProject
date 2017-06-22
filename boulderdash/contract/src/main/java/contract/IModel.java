package contract;
/**
 * L'interface IModel  est une interface qui permet d'appeler des methode abstraite 
 * de la classe Model
 * @author Groupe 1
 * @version 1
 */
import java.util.ArrayList;

public interface IModel {

	public void Update(OrderType order);

	public ArrayList<IEntity> GetMap();

	public boolean isVictory();

	public boolean isLost();

}

package contract;
/**
 * L'interface IView est une interface qui permet d'appeler des methode abstraite 
 * de la classe View
 * @author Groupe 1
 * @version 1
 */
import java.util.ArrayList;
public interface IView {

	public void DrawMap(ArrayList <IEntity> View);
	public OrderType GetOrder();
	
}

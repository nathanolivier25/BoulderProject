package contract;
/**
 * the IModel interface is an interface that call abstract method.
 *
 * @author Group 1
 * @version 1
 */
import java.util.ArrayList;

public interface IModel {

	public void Update(OrderType order);

	public ArrayList<IEntity> GetMap();

	public boolean isVictory();

	public boolean isLost();

}

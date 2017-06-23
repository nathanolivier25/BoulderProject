package contract;

import java.util.ArrayList;

/**
 * the IModel interface is used to call abstract methods.
 *
 * @author Group 1
 * @version 1
 */
public interface IModel {

	public void Update(OrderType order);

	public void Reload(int world);
	public ArrayList<IEntity> GetMap();

	public boolean isVictory();

	public boolean isLost();

}

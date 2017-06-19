package contract;

import java.util.ArrayList;

public interface IModel {

	public void Update(OrderType order);

	public ArrayList<IEntity> GetMap();

	public boolean isVictory();

	public boolean isLost();

}

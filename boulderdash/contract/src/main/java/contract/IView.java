package contract;

import java.util.ArrayList;

/**
 * The IView interface is used to call the abstract methods
 * from the View class.
 * 
 * @author Group 1
 * @version 1
 */
public interface IView {

	public void DrawMap(ArrayList <IEntity> View);
	public OrderType GetOrder();
	public void DrawVictoryMessage();
	public void DrawGameOverMessage();
	
}

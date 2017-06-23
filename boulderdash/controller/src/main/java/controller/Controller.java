package controller;

import java.time.Clock;

import contract.IModel;
import contract.IView;
import contract.OrderType;

public class Controller 
{
	private boolean ingame;
	private IModel model;
	private IView view;
	private Clock clock;

	
	
	/**
	 * @param model Name of IModel
	 * @param view Name of IView
	 */
	public Controller (IModel model, IView view)
	{
		this.model = model;
		this.view = view;
		ingame = true;

	}
	
	public void run()
	{
		OrderType order = null;
		
		while(true)
		{
			ingame = true;
			int level = view.DrawStartMenu();
			
			model.Reload(level);
			view.Reload(level);
			
			while(ingame == true)
			{
				
				model.Update(order);
				
				
				view.DrawMap(model.GetMap());
				order = view.GetOrder();
				
				if(model.isLost() == true || model.isVictory() == true)
				{
					
					if (model.isLost() == true)
					{ 
						view.DrawGameOverMessage();
					}
					if (model.isVictory() == true)
					{
						view.DrawVictoryMessage();
					}
					ingame = false;
				}
						
			}
			
		}
		
	}
}

	
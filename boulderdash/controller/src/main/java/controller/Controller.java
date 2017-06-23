package controller;

import java.time.Clock;

import contract.IModel;
import contract.IView;
import contract.OrderType;

public class Controller 
{
	private boolean running;
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
		running = true;
	}
	
	public void run()
	{
		OrderType order = null;
		
		
		while(running == true)
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
				running = false;
			}
				
			/*
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//*/
					
		}
	}
}

	
package controller;

import java.time.Clock;
import contract.IModel;
import contract.IView;
import contract.OrderType;

/**
 * The Controller class 
 * la classe controller permet de faire le lien entre le model et la vue 
 * @author Groupe 1
 * @version  1
 */
public class Controller 
{
	private boolean running;
	private IModel model;
	private IView view;
	private Clock clock;

	/**
	 * Controlleur's constructor
	 * @param model
	 * @param view
	 */
	public Controller (IModel model, IView view)
	{
		this.model = model;
		this.view = view;
		running = true;
	}
	/**
	 * The run method 
	 * la methode run permet de mettre en lien le model et la vue pour l'affichage de la map 
	 * ici que la victor ou la defaite de la partie 
	 */
	public void run()
	{
		OrderType order = null;
		
		
		while(running == true)
		{
			
			model.Update(order);
			
			
			view.DrawMap(model.GetMap());
			order = view.GetOrder();
			
			if(model.isLost() == true || model.isVictory() == true)
				running = false;
			
			
					
		}
	}
}

	
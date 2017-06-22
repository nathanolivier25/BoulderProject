package controller;
/**
 * la classe controller permet de faire le lien entre le model et la vue 
 * @author Groupe 1
 * @versio  1
 */
import java.time.Clock;
import contract.IModel;
import contract.IView;
import contract.OrderType;


public class Controller 
{
	/**
	 * running est de type boolean 
	 * model est de type IModel
	 * view est de type IView
	 * clock est de type Clock
	 */
	private boolean running;
	private IModel model;
	private IView view;
	private Clock clock;

	/**
	 * <b> Constructeur de Controlleur
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

	
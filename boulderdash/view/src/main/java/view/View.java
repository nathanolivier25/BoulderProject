package view;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.text.html.parser.Entity;

import contract.OrderType;
import contract.IEntity;
import contract.IView;


public class View implements IView {
	
	private ArrayList <ElementSprite> image;
	private JFrame windows;
	private OrderType lastOrder;
	
	public View()
	{
		
	}
	
	public void DrawMap(ArrayList<IEntity> DrawMap)
	{
		
	}
	
	public void loadImage()
	
	{
		
	}
	
	public void keyPressed(KeyEvent e)
	{
		switch (e)
		{
			case KeyEvent.VK_UP:
				lastOrder = OrderType.UP ; 
				break;
			case KeyEvent.VK_DOWN:
				lastOrder = OrderType.DOWN;
				break;
			case KeyEvent.VK_RIGHT:
				lastOrder = OrderType.RIGHT;
				break;
			case KeyEvent.VK_LEFT:
				lastOrder = OrderType.LEFT;
				break;
			default:
				break;
		}
		
	}
	public void keyReleased(KeyEvent e)
	{
		
	}
	
	public OrderType GetOrder()
	{
		return lastOrder;
		
	}



}

	


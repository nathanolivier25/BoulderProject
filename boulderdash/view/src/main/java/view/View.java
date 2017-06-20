package view;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.JFrame;

import contract.OrderType;
import contract.EntityType;
import contract.IEntity;
import contract.IView;


public class View implements IView, KeyListener{
	
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
		image.add(new ElementSprite("c:/monmagnifiquechemin",0,0,16,16,EntityType.WALL));
		image.add(new ElementSprite("c:/monmagnifiquechemin",17,0,36,16,EntityType.DIRT));
		image.add(new ElementSprite("c:/monmagnifiquechemin",33,0,48,16,EntityType.VOID));
		image.add(new ElementSprite("c:/monmagnifiquechemin",0,0,16,16,EntityType.ROCK));
		
		
	}
	
	public void keyPressed(KeyEvent e)
	{
		switch (e.getKeyCode())
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
		lastOrder = null; 
	}
	
	public OrderType GetOrder()
	{
		return lastOrder;
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) 
	{
		
		
	}



}

	


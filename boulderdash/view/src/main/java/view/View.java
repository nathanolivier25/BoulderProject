package view;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.JFrame;

import contract.OrderType;
import model.BlockVoid;
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
	
	public void DrawMap(ArrayList<IEntity> drawMap)
	{
		for  (int i = 0; i < drawMap.size(); i++)
		{
			EntityType A = drawMap.get(i).GetType();
			
			for  (int j = 0; j < image.size(); j++)
			{
				if (image.get(j).getType() == A)
				{
				
					image.get(j).setWhereToDraw(drawMap.get(i).GetPosx(), drawMap.get(i).GetPosy());
					image.get(j).paintComponent(windows.getGraphics());
				}
				
			}
		}
	}
	
	public void loadImage()
	
	{
		image.add(new ElementSprite("74359.png",0,0,EntityType.WALL));
		image.add(new ElementSprite("74359.png",17,0,EntityType.DIRT));
		image.add(new ElementSprite("74359.png",33,0,EntityType.VOID));
		image.add(new ElementSprite("74359.png",49,0,EntityType.ROCK));
		image.add(new ElementSprite("74359.png",65,0,EntityType.DIAMOND));
		image.add(new ElementSprite("74359.png",97,0,EntityType.END));
		image.add(new ElementSprite("74359.png",145,0,EntityType.ENEMY));
				
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

	


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
		this.image = new ArrayList <ElementSprite>();
		this.lastOrder = null;
		this.windows = new JFrame();
		
		windows.setTitle("Boulder Dash of the dead");
		windows.setSize(800, 600);
		windows.setLocationRelativeTo(null);
		windows.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		windows.setVisible(true);
		
		loadImage();
	}
	
	public void DrawMap(ArrayList<IEntity> drawMap)
	{
		for  (int i = 0; i < drawMap.size(); i++)
		{
			EntityType A = drawMap.get(i).getType();
			
			for  (int j = 0; j < image.size(); j++)
			{
				if (image.get(j).getType() == A)
				{
				
					image.get(j).setWhereToDraw(drawMap.get(i).GetPosx()*16, drawMap.get(i).GetPosy()*16);
					image.get(j).paintComponent(windows.getGraphics());
				}
				
			}
		}
	}
	
	public void loadImage()
	
	{
		image.add(new ElementSprite("74359.png",0,0,EntityType.WALL));
		image.add(new ElementSprite("74359.png",16,0,EntityType.DIRT));
		image.add(new ElementSprite("74359.png",32,0,EntityType.VOID));
		image.add(new ElementSprite("74359.png",48,0,EntityType.ROCK));
		image.add(new ElementSprite("74359.png",64,0,EntityType.DIAMOND));
		image.add(new ElementSprite("74359.png",96,0,EntityType.END));
		image.add(new ElementSprite("74359.png",144,0,EntityType.ENEMY));
		image.add(new ElementSprite("74359.png",48,224,EntityType.PLAYER));
				
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

	


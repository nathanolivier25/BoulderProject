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
		/*swtich (keyCode)
		{
			case KeyEvent.VK_UP;
				
		}*/
		
		
		
		if (e.getKeyCode() == KeyEvent.VK_UP);
		{
			// return up;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN);
		if (e.getKeyCode() == KeyEvent.VK_LEFT);
		if (e.getKeyCode() == KeyEvent.VK_RIGHT);
		
	}
	
	public void keyReleased(KeyEvent e)
	{
		
	}
	
	public OrderType GetOrder()
	{
		return lastOrder;
		
	}



}

	


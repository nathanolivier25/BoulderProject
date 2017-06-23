package view;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import javax.swing.JFrame;

import contract.OrderType;
import contract.EntityType;
import contract.IEntity;
import contract.IView;
/** 
 * View is the class allowing to display the windows and load a picture. 
 * The class allows key management to move a player.
 * 
 * <ul> 
 * <li> Here are all our pictures<li>
 * <li> Allow to display the game <li>
 * <li> Take in memory the last movement order <li>
 * <li> Contain the map size <li>
 * @author Group 1
 * @version 1
 */
/**
 * This class uses the IView and KeyListener interface.
 */
public class View implements IView, KeyListener{
	/**
	 * image in an ArrayListe<ElementSprite> 
	 * windows is a JFrame 
	 * lasterOrder in an  OrderType
	 * mapSizeX, mapSizeY are int 
	 */
	private ArrayList <ElementSprite> image;
	private JFrame windows;
	private OrderType lastOrder;
	private int mapSizeX;
	private int mapSizeY;
	/**
	 * <b> View's constructor <b>
	 * 
	 *  
	 */
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

		mapSizeX = 20;
		mapSizeY = 20;


		loadImage();
		
		windows.addKeyListener(this);
		windows.requestFocus();
	}

	/**
	 * DrawMap Method
	 * @param drawMap
	 * 
	 * It takes the pictures then draw them on the map
	 */
	public void DrawMap(ArrayList<IEntity> drawMap)
	{
		int startX = (windows.getSize().width-(mapSizeX *16))/2;
		int startY = (windows.getSize().height-(mapSizeY *16))/2;

		BufferedImage bimage = new BufferedImage(windows.getWidth(), windows.getHeight(), BufferedImage.TYPE_INT_ARGB);

		for  (int i = 0; i  < drawMap.size(); i++)
		{
			EntityType A = drawMap.get(i).getType();

			if(A == EntityType.DIRT || A == EntityType.WALL || A == EntityType.END || A == EntityType.VOID)
				for  (int j = 0; j < image.size(); j++)
				{
					if (image.get(j).getType() == A)
					{

						image.get(j).setWhereToDraw(drawMap.get(i).GetPosx()*16 + startX, drawMap.get(i).GetPosy()*16 + startY);
						image.get(j).paintComponent(bimage.getGraphics());
					}

				}
		}

		for  (int i = 0; i  < drawMap.size(); i++)
		{
			EntityType A = drawMap.get(i).getType();

			if(A == EntityType.ROCK || A == EntityType.DIAMOND || A == EntityType.ENEMY || A == EntityType.PLAYER)
				for  (int j = 0; j < image.size(); j++)
				{
					if (image.get(j).getType() == A)
					{

						image.get(j).setWhereToDraw(drawMap.get(i).GetPosx()*16 + startX, drawMap.get(i).GetPosy()*16 + startY);
						image.get(j).paintComponent(bimage.getGraphics());
					}

				}
		}

		windows.getGraphics().drawImage(bimage, 0, 0, null);
	}
	/**
	 * loadImage is used to take the localization of all sprite in the picture files.
	 */

	public void loadImage()

	{

		image.add(new ElementSprite("74359.png",0,0,EntityType.WALL));
		image.add(new ElementSprite("74359.png",16,0,EntityType.DIRT));
		image.add(new ElementSprite("74359.png",32,0,EntityType.VOID));
		image.add(new ElementSprite("74359.png",48,0,EntityType.ROCK));
		image.add(new ElementSprite("74359.png",64,0,EntityType.DIAMOND));
		image.add(new ElementSprite("74359.png",96,0,EntityType.END));
		image.add(new ElementSprite("74359.png",144,0,EntityType.ENEMY));
		image.add(new ElementSprite("74336.png",48,224,EntityType.PLAYER));

	}
	/**
	 * The keyPressed method is the one that give the order to move when we press our keyboard.
	 */
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
	/**
	 * The keyReleased method is used to know when we release a key on the keyboard.
	 * @param e
	 */
	public void keyReleased(KeyEvent e)
	{
		lastOrder = null; 
	}
	/**
	 * OrderType gives a movement order.
	 * @return lastOrder
	 */
	public OrderType GetOrder()
	{
		return lastOrder;

	}
	/**
	 * The keyTyped method comes from the interface KeyListener.
	 * It's not used here.
	 * @param arg0
	 */
	public void keyTyped(KeyEvent arg0) 
	{


	}
	
	
}




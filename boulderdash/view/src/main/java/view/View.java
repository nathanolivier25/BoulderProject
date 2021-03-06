package view;

import java.awt.Color;
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
	 */
	private ArrayList <ElementSprite> image;
	private JFrame windows;
	private OrderType lastOrder;
	private int mapSizeX;
	private int mapSizeY;
	private EndMessage gamerOverMessage;
	private EndMessage victoryMessage;
	private StartMenu menu;
	/**
	 * View's constructor 
	 * setTitle That's the name of our game.
	 * setSize is the windows size.
	 * 
	 */
	public View(int world)
	{
		this.image = new ArrayList <ElementSprite>();
		this.lastOrder = null;
		this.windows = new JFrame();

		windows.setTitle("Boulder Dash of the dead");
		windows.setSize(800, 600);
		windows.setLocationRelativeTo(null);
		windows.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		windows.setResizable(false);
		windows.setVisible(true);


		loadImage(world);
		
		windows.addKeyListener(this);
		windows.requestFocus();
		menu = new StartMenu(windows);
		
		this.gamerOverMessage = new EndMessage("game_over.png");
		this.victoryMessage = new EndMessage("victory.png");
			
	}
	
	
	public void Reload(int world)
	{
		mapSizeX = 0;
		mapSizeY = 0;
		windows.repaint();
		windows.getContentPane().setBackground(Color.BLACK);
		image.clear();
		loadImage(world);
	}
	
	
	public int DrawStartMenu()
	{
		return menu.run();
	}
	

	/**
	 * DrawMap Method
	 * @param drawMap that's the name of our arrayList.
	 * 
	 * It takes the pictures then draw them on the map
	 */
	public void DrawMap(ArrayList<IEntity> drawMap)
	{
		
		if(mapSizeX == 0 && mapSizeY == 0)
		{
			for  (int i = 0; i  < drawMap.size(); i++)
			{
				if(drawMap.get(i).GetPosx() > mapSizeX)
					mapSizeX = drawMap.get(i).GetPosx();
				
				if(drawMap.get(i).GetPosy() > mapSizeY)
					mapSizeY = drawMap.get(i).GetPosy();	
			}
		}
		

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

	private void loadImage(int xline)

	{
		xline--;
		xline*=64;
		
		image.add(new ElementSprite("74359.png",0,xline,EntityType.WALL));
		image.add(new ElementSprite("74359.png",16,xline,EntityType.DIRT));
		image.add(new ElementSprite("74359.png",32,xline,EntityType.VOID));
		image.add(new ElementSprite("74359.png",48,xline,EntityType.ROCK));
		image.add(new ElementSprite("74359.png",64,xline,EntityType.DIAMOND));
		image.add(new ElementSprite("74359.png",96,xline,EntityType.END));
		image.add(new ElementSprite("74359.png",144,xline,EntityType.ENEMY));
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
	
	
	public void close()
	{
		windows.setVisible(false);
	}
	
	
	
	
	
	/**
	 * The keyReleased method is used to know when we release a key on the keyboard.
	 * @param e return an error.
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
	 * @param arg0 it's an argument.
	 */
	public void keyTyped(KeyEvent arg0) 
	{


	}
	
	public void DrawVictoryMessage()
	{
		victoryMessage.DrawEndPicture(windows.getGraphics());
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void DrawGameOverMessage()
	{
		gamerOverMessage.DrawEndPicture(windows.getGraphics());
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}




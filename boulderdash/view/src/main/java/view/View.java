/** 
 * View is the class allowing to display the windows and load a picture. 
 * The class allow key management to move a player
 * 
 * <ul> 
 * <li> Contient la liste des image<li>
 * <li> Permet d'afficher la fenetre du jeux <li>
 * <li> Stocke le dernier ordre exécuter sur le clavier <li>
 * <li> Contient la taille de la map <li>
 * @author Groupe 1
 * @version 1
 */
package view;
/**
 * import des différentes classe utiliser pour l'utilisation 
 * */
import java.awt.Graphics2D;
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
 * Classe view implemente l'interface IView et KeyListener
 */
public class View implements IView, KeyListener{
	/**
	 * image est de type ArrayListe<ElementSprite> 
	 * windows est de type JFrame 
	 * lasterOrder est de type OrderType
	 * mapSizeX, mapSizeY sont de type int 
	 */
	private ArrayList <ElementSprite> image;
	private JFrame windows;
	private OrderType lastOrder;
	private int mapSizeX;
	private int mapSizeY;
	/**
	 * la
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
	}

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

	public void loadImage()

	{
		image.add(new ElementSprite("74359.png",0,0,EntityType.WALL));
		image.add(new ElementSprite("74359.png",16,0,EntityType.DIRT));
		image.add(new ElementSprite("74359.png",32,0,EntityType.VOID));
		image.add(new ElementSprite("74359.png",48,0,EntityType.ROCK));
		image.add(new ElementSprite("74359.png",64,0,EntityType.DIAMOND));
		image.add(new ElementSprite("74359.png",96,0,EntityType.END));
		image.add(new ElementSprite("74359.png",134,0,EntityType.ENEMY));
		image.add(new ElementSprite("74336.png",48,224,EntityType.PLAYER));

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




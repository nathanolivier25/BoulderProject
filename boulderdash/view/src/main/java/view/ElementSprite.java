package view;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import contract.EntityType;

public class ElementSprite 
{
	private BufferedImage buffer;
	private int drawx;
	private int drawy;
	private EntityType id;
/**	
	* @param x the X coordinate of the upper-left corner of the
	*          specified rectangular region
	* @param y the Y coordinate of the upper-left corner of the
	*          specified rectangular region
	* @param w the width of the specified rectangular region
	* @param h the height of the specified rectangular region
	* */
	
	public ElementSprite(String path, int x1, int y1, EntityType type)
	{
		id = type;
		try {
            BufferedImage temp = ImageIO.read(new File(path));
            buffer = temp.getSubimage(x1, y1, 16, 16);
            
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
		
	}
	/**
	 * Methode paintComponent que lon surcharge qui permet de dessiner sur la fenetre
	 * @param g varaible qui contient la partie graphique de la fenetre
	 */
	public void paintComponent(Graphics g) 
	{
		g.drawImage(buffer, drawx, drawy, null);
	}
	/**
	 * la methode régle  ou il faut déssiner 
	 * @param x
	 * @param y
	 */
	public void setWhereToDraw(int x, int y)
	{
		drawx = x;
		drawy = y;
	}
	
	/**
	 * la methode donne le type d'entité a fournir. 
	 * @return il retourne id de l'entité
	 */
	public EntityType getType()
	{
		return id;
	}
	
}

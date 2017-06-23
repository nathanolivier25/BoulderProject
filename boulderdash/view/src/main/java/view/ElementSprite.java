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
	* @param x1 the X coordinate of the upper-left corner of the
	*          specified rectangular region
	* @param y1 the Y coordinate of the upper-left corner of the
	*          specified rectangular region
	* @param path equals the path of our pictures.
	* @param type equals the type of our entities.
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
	 * The paintComponent method draws the map on the frame.
	 * @param g is a variable that contains the graphics par of the frame.
	 */
	public void paintComponent(Graphics g) 
	{
		g.drawImage(buffer, drawx, drawy, null);
	}
	/**
	 * This method says where we need to draw the map.
	 * @param x that's the horizontal location in the arraylist.
	 * @param y that's the vertical location in the arraylist.
	 */
	public void setWhereToDraw(int x, int y)
	{
		drawx = x;
		drawy = y;
	}
	
	/**
	 * This method gives what object is needed to draw. 
	 * @return the object ID.
	 */
	public EntityType getType()
	{
		return id;
	}
	
}

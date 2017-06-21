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
	
	public void paintComponent(Graphics g) 
	{
		g.drawImage(buffer, drawx, drawy, null);
	}
	public void setWhereToDraw(int x, int y)
	{
		drawx = x;
		drawy = y;
	}
	
	public EntityType getType()
	{
		return id;
	}
	
}

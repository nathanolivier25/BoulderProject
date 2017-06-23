package view;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public abstract class EndMessage
{
private BufferedImage image;
private int tps;


	public EndMessage (String chemin, int tps)
	{
		try 
		{
			image = ImageIO.read(new File(chemin));
		} 
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		this.tps = tps; 
		
	}
	
	public void DrawEndPicture(Graphics g)
	{
		g.drawImage(image, 0, 0, null);
	}
}

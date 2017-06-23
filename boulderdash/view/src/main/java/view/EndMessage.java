package view;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class EndMessage
{
private BufferedImage image;


	public EndMessage (String chemin)
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
	}
	
	public void DrawEndPicture(Graphics g)
	{
		g.drawImage(image, 0, 0, null);
	}
}

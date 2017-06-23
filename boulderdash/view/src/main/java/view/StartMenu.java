package view;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class StartMenu implements MouseListener{

	private JFrame window;
	private int worldToLoad;
	private BufferedImage img;
	
	public StartMenu(JFrame app)
	{
		window = app;
		try {
			img = ImageIO.read(new File("mainmenu.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		window.addMouseListener(this);
	}
	
	
	
	public int run()
	{
		 worldToLoad = 0;
				while(worldToLoad == 0)
				{
					window.getGraphics().drawImage(img, 0, 0, null);
				}
		return worldToLoad;
		
	}



	@Override
	public void mouseClicked(MouseEvent e) {
		
		if(e.getX()>= 150 && e.getX() <= 625 && e.getY() >= 193 && e.getY() < 248)
			worldToLoad = 1;
		else if(e.getX()>= 150 && e.getX() <= 625 && e.getY() >= 262 && e.getY() < 313)
			worldToLoad = 2;
		else if(e.getX()>= 150 && e.getX() <= 625 && e.getY() >= 325 && e.getY() < 376)
			worldToLoad = 3;
		else if(e.getX()>= 150 && e.getX() <= 625 && e.getY() >= 393 && e.getY() < 445)
			worldToLoad = 4;
		else if(e.getX()>= 150 && e.getX() <= 625 && e.getY() >= 460 && e.getY() < 513)
			worldToLoad = 5;
		
	}



	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	
}

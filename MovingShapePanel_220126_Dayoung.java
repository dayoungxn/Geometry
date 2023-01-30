
import java.awt.Font;
import java.awt.Color; 
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MovingShapePanel_220126_Dayoung extends JPanel implements Runnable
{
	private Shape_220126_Dayoung sh;

	//use an array of Molecule
	//Molecule[] molecules;

	public MovingShapePanel_220126_Dayoung()
	{
		setBackground(Color.WHITE);
		setVisible(true);

		//refer sh to a new Shape


		new Thread(this).start();
	}

	public void update(Graphics window)
	{
		paint(window);
	}

	public void paint(Graphics window)
	{
		window.setColor(Color.WHITE);
		window.fillRect(0,0,getWidth(), getHeight());
		window.setColor(Color.BLUE);
		window.drawRect(20,20,getWidth()-40,getHeight()-40);
		window.setFont(new Font("TAHOMA",Font.BOLD,18));
		window.drawString("CREATE YOUR OWN SHAPE!",40,40);

		//tell sh to move and draw

		//this code handles the left and right walls
		if(!(sh.getX()>=10 && sh.getX()<=730))
		{
			sh.setX(-sh.getX());
		}

		//add code to handle the top and bottom walls

	}

   public void run()
   {
   	try
   	{
           while(true)
   	   {
   	      Thread.currentThread().sleep(10);
              repaint();
           }
        }catch(Exception e)
        {
        }
   }
}
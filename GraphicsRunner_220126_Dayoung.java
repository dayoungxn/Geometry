
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; 

public class GraphicsRunner_220126_Dayoung extends JFrame
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public GraphicsRunner_220126_Dayoung()
	{
		super("MAKE YOUR OWN SHAPE");

		setSize(WIDTH,HEIGHT);

		getContentPane().add(new ShapePanel_220126_Dayoung());

		//getContentPane().add(new MovingShapePanel());

		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main( String args[] )
	{
		GraphicsRunner_220126_Dayoung run = new GraphicsRunner_220126_Dayoung();
	}
}
package hw_01;
import javax.swing.JPanel;
import java.awt.Polygon;

public abstract class AbstractDrawFunction extends JPanel{
	private Polygon p = new Polygon();
	
	//return the y-coordinate
	abstract double f(double x);
}

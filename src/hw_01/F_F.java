package hw_01;

public class F_F extends AbstractDrawFunction {

	@Override
	double f(double x) {
		double y = 5 * Math.cos(x) + Math.sin(x);//to compute 5 * cos(x) + sin(x)
		return y;
	}
}

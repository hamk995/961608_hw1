package hw_01;

public class F_E extends AbstractDrawFunction {

	@Override
	double f(double x) {
		double y = Math.cos(x) + 5 * Math.sin(x);//to compute cos(x) + 5 * sin(x)
		return y;
	}
}

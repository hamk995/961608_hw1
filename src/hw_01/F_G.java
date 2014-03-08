package hw_01;

public class F_G extends AbstractDrawFunction {

	@Override
	double f(double x) {
		double y = Math.log10(x) + (x * x);//to compute log10(x) + x * x
		return y;
	}
}

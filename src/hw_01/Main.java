package hw_01;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		F_A a = new F_A();
		System.out.println("(A)Please enter an integer about x : ");
		double A = input.nextDouble();
		System.out.println("f(x) = " +a.f(A) + "\n");
		
		F_B b = new F_B();
		System.out.println("(B)Please enter an integer about x : ");
		double B = input.nextDouble();
		System.out.println("f(x) = " +b.f(B) + "\n");
		
		F_C c = new F_C();
		System.out.println("(C)Please enter an integer about x : ");
		double C = input.nextDouble();
		System.out.println("f(x) = " +c.f(C) + "\n");
		
		F_D d = new F_D();
		System.out.println("(D)Please enter an integer about x : \n");
		double D = input.nextDouble();
		System.out.println("f(x) = " +d.f(D) + "\n");
		
		F_E e = new F_E();
		System.out.println("(E)Please enter an integer about x : ");
		double E = input.nextDouble();
		System.out.println("f(x) = " +e.f(E) + "\n");
		
		F_F f = new F_F();
		System.out.println("(F)Please enter an integer about x : ");
		double F = input.nextDouble();
		System.out.println("f(x) = " +f.f(F) + "\n");
		
		F_G g = new F_G();
		System.out.println("(G)Please enter an integer about x : ");
		double G = input.nextDouble();
		System.out.println("f(x) = " +g.f(G) + "\n");
		
		System.out.println("The test is over!!!!");
	}
}

package classes;

public class Teste {
	private double a;
	private double b;
	private double c;
	private double delta;
	private double x1;
	private double x2;

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	public double getDelta() {
		return delta;
	}

	public void setDelta(double delta) {
		this.delta = delta;
	}

	public double getX1() {
		return x1;
	}

	public void setX1(double x1) {
		this.x1 = x1;
	}

	public double getX2() {
		return x2;
	}

	public void setX2(double x2) {
		this.x2 = x2;
	}

	public Teste() {
		super();
	}

	public void calculoBaskara(int a, int b, int c) {
		this.a = a;
		this.b = Math.pow(b, 2);
		this.c = c;
		this.delta = this.b - (4 * this.a * this.c);
		if (this.delta < 0) {
			System.out.println("Não a raizes Reais, pois Delta é um numero menor que 0, Delta = "+ this.delta);
		} else {
			this.x1 = (-(b) + (Math.sqrt(delta))) / 2 * this.a;
			this.x2 = (-(b) - (Math.sqrt(delta))) / 2 * this.a;
			System.out.println("Os valores de x1 é "+ this.x1);
			System.out.println("Os valores de x2 é "+ this.x2);
		}
	}

}

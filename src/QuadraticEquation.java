public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    private double delta;
    public QuadraticEquation() {

    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public double getDiscriminant() {
        return delta  = b*b-4*a*c ;
    }

    public double getRoot1() {
        return (-b + Math.pow(delta, 0.5)) / 2 * a;
    }

    public double getRoot2() {
        return (-b - Math.pow(delta, 0.5)) / 2 * a;
    }
}

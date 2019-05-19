import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the a:");
        double a = input.nextDouble();
        System.out.println("Enter the b:");
        double b = input.nextDouble();
        System.out.println("Enter the c:");
        double c = input.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        System.out.println("a:"+quadraticEquation.getA());
        System.out.println("b:"+quadraticEquation.getB());
        System.out.println("c:"+quadraticEquation.getC());
        double delta = quadraticEquation.getDiscriminant();
        System.out.println("delta: "+delta);

        if (delta>0){
            System.out.println("x1: "+quadraticEquation.getRoot1()+"x2: "+quadraticEquation.getRoot2());
        }else if (delta==0){
            System.out.println("x1 = x2: "+quadraticEquation.getRoot1());
        }else{
            System.out.println("The equation has no roots");
        }
    }
}

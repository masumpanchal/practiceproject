import java.util.Scanner;
public class ComplexNumber {

    double real, img;

    ComplexNumber(double r, double i){
        this.real = r;
        this.img = i;
    }
    public static ComplexNumber sum(ComplexNumber c1, ComplexNumber c2) {
        ComplexNumber temp = new ComplexNumber(0, 0);

        temp.real = c1.real + c2.real;
        temp.img = c1.img + c2.img;

        return temp;

    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        ComplexNumber c1 = new ComplexNumber();
        ComplexNumber c2 = new ComplexNumber();
        ComplexNumber temp = sum(c1, c2);

        System.out.println("Enter c1 real Number : ");
        c1.real = sc.nextDouble();
        System.out.println("Enter c1 img Number : ");
        c1.img = sc.nextDouble();
        System.out.println("Enter c2 real Number : ");
        c2.real = sc.nextDouble();
        System.out.println("Enter c2 img Number : ");
        c2.img = sc.nextDouble();

        System.out.println("Sum is " + temp.real+ "+" + temp.img + "i");

    }



}

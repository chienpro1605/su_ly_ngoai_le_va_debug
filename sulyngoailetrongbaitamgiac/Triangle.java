package sulyngoailetrongbaitamgiac;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập cạnh a của tam giác");
        double a = scanner.nextDouble();
        System.out.println("nhập cạnh b của tam giác");
        double b = scanner.nextDouble();
        System.out.println("nhập cạnh c");
        double c = scanner.nextDouble();
        checkTamGiac(a,b,c);
    }
    public static void checkTamGiac(double a, double b,double c){
        try {
            if(a<=0||b<=0||c<=0|| a+b<=c|| a+c<=b||b+c<=a) throw new Exception();
            else System.out.println("nó chính là tam giác");
        }catch (Exception e){
            System.err.println("nó éo phải tam giác đâu nhập lại đi");
        }

    }
}

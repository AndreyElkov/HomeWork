package AndreyElkov.lesson3.exercise1;

import java.util.Scanner;

public class QuadraticEquation {

    public static void main(String[] args) {
        System.out.println("программа решает квадратное уравнение");
        System.out.println("ax∧2+bx+c=0");
        System.out.println("Введите a; b; c;");
        double a, b, c;
        double D;
        Scanner in = new Scanner(System.in);
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();
        D = b * b - 4 * a * c;
        if (a == 0) {
            System.out.println("Первый коэффициент не может быть 0");
        }
        else if (D > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("Уровнение имеет два корня:");
            System.out.println(+ x1 +" "+ x2);
        } else if (D == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println("Уровнение имеет один корень:");
            System.out.println(+ x);
        }
        else {
            System.out.println("Нет действительных решений уравнения");
        }
    }
}
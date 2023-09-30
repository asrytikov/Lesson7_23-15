package dz4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello");
        while (true){
            System.out.println("Operation: 1 - \"+\", 2 - \"-\", 3- Exit");
            int oper = scanner.nextInt();
            if (oper == 3) System.exit(0);
            System.out.println("Input 1 int");
            int a = scanner.nextInt();
            System.out.println("Input 1 int");
            int b = scanner.nextInt();

            int temp = operation(a, b, oper);

            while (true){
                System.out.println("Input 2 int");
                b = scanner.nextInt();
                System.out.println("Operation: 1 - \"+\", 2 - \"-\", 3- Exit");
                oper = scanner.nextInt();
                temp = operation(temp, b, oper);
            }





        }
    }

    static int sum(int a, int b){
        System.out.printf("Summa %d + %d = %d \n", a, b, a+b);
        return a + b;
    }

    static void razn(int a, int b){
        System.out.printf("Razn %d - %d = %d \n", a, b, a-b);
    }

    static int operation(int a, int b, int oper){
        int temp = 0;
        switch (oper){
            case 1:
                temp = sum(a,b);
                break;
            case 2:
                razn(a,b);
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("Error");
        }

        return temp;
    }
}
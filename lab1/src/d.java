import java.util.Scanner;

public class d {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите кол-во чисел: ");
        int a = in.nextInt();
        int av = 0;
        int ar = 0;
        int at = 0;
        int[] myArray = new int[a];
        for (int i = 0; i < a; i++) {
            myArray[i] = in.nextInt();
        }
        for (int i = 0; i < a; i++) {
            int y = myArray[i] % 5;
            int z = myArray[i] % 7;
            if (y == 0) {
                if (z == 0) {
                    at = 1;

                }
            }
        }
        if (at == 1) {
            System.out.println("Делятся на 7 и на 5");}
        else
            System.out.println("Введенные числа не делятся на 7 и на 5");
        for (int i = 0; i < a; i++) {
            int y = myArray[i] % 5;
            int z = myArray[i] % 7;
            if (y == 0) {
                if (z == 0) {
                    System.out.print(myArray[i] + " ");
                }
            }
        }
        for (int i = 0; i < a; i++) {
            int y = myArray[i] % 5;
            if (y == 0) {
                ar = 1;
            }
        }
        System.out.println();
        if (ar == 1) {
            System.out.println("Делятся на 5");}
        else
            System.out.println("Введенные числа не делятся на 5");

        for (int i = 0; i < a; i++) {
            int y = myArray[i] % 5;
            if (y == 0) {
                System.out.print(myArray[i] + " ");
            }
        }
        for (int i = 0; i < a; i++) {
            int y = myArray[i] % 7;
            if (y == 0) {
                 av = 1;
            }
        }
        System.out.println();
        if (av == 1) {
        System.out.println("Делятся на 7");}
        else
            System.out.println("Введенные числа не делятся на 7");
        for (int i = 0; i < a; i++) {
            int y = myArray[i] % 7;
            if (y == 0) {
                System.out.print(myArray[i] + " ");
            }
        }

    }
}
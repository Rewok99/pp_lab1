import java.util.Scanner;

public class z2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите кол-во чисел: ");
        int number = in.nextInt();
        System.out.println("Введите числа: ");
        int[] myArray = new int[number];
        for (int i = 0; i < number; i++) {
            myArray[i] = in.nextInt();
        }
        System.out.println("Элементы в обратном порядке: ");
        for (int i = myArray.length - 1; i >= 0; i--) {
            System.out.println(myArray[i]);

        }
    }
}
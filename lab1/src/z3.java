import java.util.Scanner;
public class z3 {
    public static void main(String[] args) {
        int[][] matrix;
        int up = 1;
        int max = 0;
        int iup = 0;
        int jup = 0;
        int iiup = 0;
        int jjup = 0;
        int idown = 0;
        int jdown = 0;
        int iidown = 0;
        int jjdown = 0;
        Scanner a = new Scanner(System.in);
        System.out.print("Введите кол-во строк: ");
        int n = a.nextInt();
        System.out.print("Введите кол-во столбцов: ");
        int p = a.nextInt();
        matrix = new int[n][p];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < p; j++) {
                matrix[i][j] = ((int) (Math.random() * 10));
            }
        }
        System.out.println("Матрица: ");
        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < p; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
// НАХОДИМ ВОЗРАСТАЮЩИЕ
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < p; j++)
            {
                if (j == p - 1) {
                    if (i != n - 1) {
                        if (matrix[i][j] < matrix[i + 1][0]) {
                            up++;
                        }
                        else {
                            if (up>max) {
                                max = up;
                                up = 1;
                                iup = i;
                                jup = j;
                            }
                            up=1;
                        }
                    }
                }
                else if (matrix[i][j] < matrix[i][j+1])
                {
                    up++;
                }
                else {
                    if (up>max) {
// НАХОДИМ ПОСЛЕДНИЙ ЭЛЕМЕНТ ВОЗРАСАТЮЩИХ И ДЛИННУ СТРОКИ
                        max = up;
                        up = 1;
                        iup = i;
                        jup = j;
                    }
                    up=1;
                }
            }
        }
        System.out.println();
        System.out.println("Наибольшее колличество возрастающих элементов подряд: "+max);
// НАХОДИМ ПЕРВЫЙ ЭЛЕМЕНТ ВОЗРАСАТЮЩИХ
        jjup= (iup*p+jup+1)-max;
        while (jjup>=p) {
            iiup++;
            jjup=jjup-p;
        }
// ВЫВОДИМ ВОЗРАСТАЮЩИЕ
        System.out.println("Эти эллементы: ");
        for (int i = iiup; i <= iup; i++) {
            for (int j = 0; j <p; j++) {
                if (i==iiup) {
                    if (j>=jjup) {
                        if (i==iup) {
                            if (j<=jup) {
                                System.out.print(matrix[i][j]+" ");
                            }
                        }
                        else System.out.print(matrix[i][j]+" ");
                    }
                }
                else if (i==iup) {
                    if (j<=jup) {
                        System.out.print(matrix[i][j]+" ");
                    }
                }
                if (i!=iiup)
                    if (i!=iup)
                        System.out.print(matrix[i][j]+" ");
            }
        }
        max =0;
        up =1;
// НАХОДИМ УБЫВАЮЩИЕ
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < p; j++)
            {
                if (j == p - 1) {
                    if (i != n - 1) {
                        if (matrix[i][j] > matrix[i + 1][0]) {
                            up++;
                        }
                        else {
                            if (up>max) {
                                max = up;
                                up = 1;
                                idown = i;
                                jdown = j;
                            }
                            up=1;
                        }
                    }
                }
                else if (matrix[i][j] > matrix[i][j+1])
                {
                    up++;
                }
                else {
                    if (up>max) {
// НАХОДИМ ПОСЛЕДНИЙ ЭЛЕМЕНТ УБЫВАЮЩИХ И ДЛИННУ СТРОКИ
                        max = up;
                        up = 1;
                        idown = i;
                        jdown = j;
                    }
                    up=1;
                }
            }
        }
        System.out.println();
        System.out.println("Наибольшее колличество убывающих элементов подряд: "+max);
// НАХОДИМ ПЕРВЫЙ ЭЛЕМЕНТ УБЫВАЮЩИХ
        jjdown= (idown*p+jdown+1)-max;
        while (jjdown>=p) {
            iidown++;
            jjdown=jjdown-p;
        }
// ВЫВОДИМ УБЫВАЮЩИЕ
        System.out.println("Эти эллементы: ");
        for (int i = iidown; i <= idown; i++) {
            for (int j = 0; j <p; j++) {
                if (i==iidown) {
                    if (j>=jjdown) {
                        if (i==idown) {
                            if (j<=jdown) {
                                System.out.print(matrix[i][j]+" ");
                            }
                        }
                        else System.out.print(matrix[i][j]+" ");
                    }
                }
                else if (i==idown) {
                    if (j<=jdown) {
                        System.out.print(matrix[i][j]+" ");
                    }
                }
                if (i!=iidown)
                    if (i!=idown)
                        System.out.print(matrix[i][j]+" ");
            }
        }
        System.out.println();
        System.out.println("Разработчики - Прохин, Фролов. Задание получено 18.02.2022 в 9:55.");
        System.out.println("Дата сдачи: 25.02.2022. Время сдачи: 9:55.");
    }
}





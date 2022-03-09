import java.util.Scanner;

public class z1 {
    public static void main(String[] args) {
        int min = 11;
        int ch = 0;
        int count0=0;
        int count1=0;
        int count2=0;
        int count3=0;
        int count4=0;
        int count5=0;
        int count6=0;
        int count7=0;
        int count8=0;
        int count9=0;
        int count = 0;
        int kk=0;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите кол-во чисел: ");
        int number = in.nextInt();
        System.out.println("Введите числа: ");
        int[] myArray = new int[number];
        for (int i = 0; i <number ; i++) {
            myArray[i] = in.nextInt();
        }

        for (int i = 0; i <number ; i++) {
            count=0;
            count0=0;
            count1=0;
            count2=0;
            count3=0;
            count4=0;
            count5=0;
            count6=0;
            count7=0;
            count8=0;
            count9=0;
            int chis = myArray[i];
            String str = new String();
            str = String.valueOf(chis);;
            kk=str.length();
            char[] cv = str.toCharArray();
            char[] c = new char[1000];
            for (int j = 0; j <kk ; j++)
            {
                c[j]=cv[j];
            }
            for (int j = 0; j <kk ; j++)
            {
                if (c[j]=='0')
                    count0=1;
                if (c[j]=='1')
                    count1=1;
                if (c[j]=='2')
                    count2=1;
                if (c[j]=='3')
                    count3=1;
                if (c[j]=='4')
                    count4=1;
                if (c[j]=='5')
                    count5=1;
                if (c[j]=='6')
                    count6=1;
                if (c[j]=='7')
                    count7=1;
                if (c[j]=='8')
                    count8=1;
                if (c[j]=='9')
                    count9=1;
            }
            count = count0+count1+count2+count3+count4+count5+count6+count7+count8+count9;
            if (count < min) {
                ch = myArray[i];
                min = count;
            }

        }
        System.out.println(ch);
    }
}


package guru.qa;

import java.util.Scanner;

//имя class всегда пишется с заглавной буквы
public class Main {
    public static void main(String[] args) {
        //ввод с клавиатуры
        Scanner in = new Scanner(System.in);
        //переполнение
        byte b1 = 120;
        byte b2 = - 70;
        byte b3 = (byte)(Byte.MAX_VALUE+1);
        short s0 = (short)(Short.MIN_VALUE-1);
        System.out.println("1 решение = " + b1+b2);
        System.out.println("2 решение = " + b3);
        System.out.println("3 решение = " + s0);

        //целые числа
        System.out.print("Введите х =");
        int x = in.nextInt();
        System.out.print("Введите y =");
        int y = in.nextInt();
        //числа с плавающей точкой (с клавиатуры ввод через запятую)
        System.out.print("Введите z =");
        double z = in.nextDouble();
        System.out.print("Введите g =");
        double g = in.nextDouble();

        //математические операторы + вычисления между различными типами данных
        System.out.println("4 решение = " + x + y);
        System.out.println("5 решение = " + (x + y) / z);
        System.out.println("6 решение = " + (x - z));
        System.out.println("7 решение = " + (g * y - x));
        System.out.println("8 решение = " + (g - z) / (z + x));
        System.out.println("9 решение = " + (x % y));

        //условные операторы
        if (x < y) {
            System.out.println("x меньше");
        } else if (x > y) {
            System.out.println("х больше");
        }
    }

}


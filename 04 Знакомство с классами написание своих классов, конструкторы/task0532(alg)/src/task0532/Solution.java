package task0532;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Задача по алгоритмам
Написать программу, которая:
1. считывает с консоли число N, которое должно быть больше 0
2. потом считывает N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.


Requirements:
1. Программа должна считывать числа с клавиатуры.
2. Программа должна выводить число на экран.
3. В классе должен быть метод public static void main.
4. Нельзя добавлять новые методы в класс Solution.
5. Программа должна выводить на экран максимальное из введенных N чисел.
6. Программа не должна ничего выводить на экран, если N меньше либо равно 0.*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = 0;
        int number = 0;
        do {
            System.out.print("Введите число: ");
            number = Integer.parseInt(reader.readLine());
        }
        while (number <= 0);

        for (int x = 0; x < number; x++) {
            System.out.printf("Введите %d-ое число: ", (x + 1));
            int num = Integer.parseInt(reader.readLine());
            maximum = Math.max(maximum, num);
        }
        System.out.println(maximum);
    }
}

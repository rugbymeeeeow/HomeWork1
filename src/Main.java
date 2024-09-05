import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //🛑Задача 1: Четное или нечетное число
//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите целое число: ");
//        int num = in.nextInt();
//        if(num % 2 == 0) {
//            System.out.println("Число является четным");
//        }
//        else {
//            System.out.println("Число является нечетным");
//        }
//        in.close();
//////////////////////////////////////////////////////

        //🛑Задача 2: Минимальное из трех чисел
//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите три целых числа: ");
//        int a = in.nextInt();
//        int b = in.nextInt();
//        int c = in.nextInt();
//        int min = Math.min(a, Math.min(b, c));
//        System.out.println("Минимальное число: " + min);
//////////////////////////////////////////////////////

        //🛑Задача 3: Таблица умножения
//        System.out.print("Таблица умножения на 5:");
//        for (int i = 1; i <= 10; i++){
//            System.out.println("5 * " + i + " = " + (5 * i));
//        }
//////////////////////////////////////////////////////

        //🛑Задача 4: Сумма чисел от 1 до N
//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите любое число: ");
//        int n = in.nextInt();
//        int sum = n * (n + 1)/2;
//        System.out.print("Сумма чисел от 1 до " + n + " : " + sum);
//////////////////////////////////////////////////////

        //🛑Задача 5: Число Фибоначчи
//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите любое число: ");
//        int n = in.nextInt();
//        int a = 0;
//        int b = 1;
//        System.out.print("Первые числа Фибоначчи для числа " + n + ": ");
//        for (int i = 0; i < n; i++) {
//            System.out.print(a + " ");
//            int fn = a + b;
//            a = b;
//            b = fn;
//        }
//        System.out.println();
//        in.close();
//////////////////////////////////////////////////////

        //🛑Задача 6: Проверка простого числа
//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите любое число: ");
//        int n = in.nextInt(); boolean isPrime = true;
//        if (n <= 1) {
//            isPrime = false;
//        }
//        for(int i = 2; i < Math.sqrt(n); i++){
//            if(n % i == 0){
//                isPrime = false;
//                break;
//            }
//        }
//        System.out.println(n + (isPrime ? " является простым числом" : " не является простым числом"));
//////////////////////////////////////////////////////

        //🛑Задача 7: Обратный порядок чисел
//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите любое число: ");
//        int n = in.nextInt();
//        System.out.print("Обратный порядок чисел от " + n + " до 1: ");
//        for(int i = n; i >= 1; i--){
//            System.out.print(i + " ");
//        }
//////////////////////////////////////////////////////

        //🛑Задача 8: Сумма четных чисел
//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите любое число: ");
//        int a = in.nextInt();
//        int b = in.nextInt();
//        int c = 0;
//
//        for(int i = a; i <= b; i++){
//            if (i % 2 == 0) {
//                c += i;
//            }
//        }
//        System.out.println("Сумма четных чисел от " + a + " до " + b + ": " + c);
//        }
//////////////////////////////////////////////////////

        //🛑Задача 9: Реверс строки
//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите строку: ");
//        String str = in.nextLine();
//        String reversed = new StringBuilder(str).reverse().toString();
//        System.out.println("Обратная строка: " + reversed);
//////////////////////////////////////////////////////

        //🛑Задача 10: Количество цифр в числе
//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите целое число: ");
//        String number = in.nextLine();
//        int digitCount = number.replace("-", "").length();
//        System.out.println("Количество цифр в числе " + number + ": " + digitCount);
//////////////////////////////////////////////////////

        //🛑Задача 11: Факториал числа
//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите целое число N: ");
//        int n = in.nextInt();
//        long factorial = 1;
//        for (int i = 1; i <= n; i++) {
//            factorial *= i;
//        }
//        System.out.println("Факториал числа " + n + " равен " + factorial);
//////////////////////////////////////////////////////

        //🛑Задача 12: Сумма цифр числа
//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите целое число: ");
//        int number = in.nextInt();
//        int sum = 0;
//        number = Math.abs(number);
//        while (number > 0) {
//            sum += number % 10;
//            number /= 10;
//        }
//        System.out.println("Сумма цифр числа: " + sum);
//////////////////////////////////////////////////////

        //🛑Задача 13: Палиндром
//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите строку: ");
//        String str = in.nextLine();
//        String reversed = new StringBuilder(str).reverse().toString();
//        if(reversed.equals(str)){
//            System.out.println("Строка является палиндромом.");
//        } else {
//            System.out.println("Строка не является палиндромом.");
//        }
//////////////////////////////////////////////////////

        //🛑Задача 14: Найти максимальное число в массиве
//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите размер массива: ");
//        int size = in.nextInt();
//        int[] array = new int[size];
//        System.out.println("Введите элементы массива:");
//        for (int i = 0; i < size; i++) {
//            array[i] = in.nextInt();
//        }
//        int max = array[0];
//        for (int num : array) {
//            if (num > max) {
//                max = num;
//            }
//        }
//        System.out.println("Максимальное число в массиве: " + max);
//////////////////////////////////////////////////////

        //🛑Задача 15: Сумма всех элементов массива
//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите размер массива: ");
//        int size = in.nextInt();
//        int[] array = new int[size];
//        System.out.println("Введите элементы массива:");
//        for (int i = 0; i < size; i++) {
//            array[i] = in.nextInt();
//        }
//        int sum = 0;
//        for (int num : array) {
//            sum += num;
//        }
//        System.out.println("Сумма всех элементов массива: " + sum);
//////////////////////////////////////////////////////

        //🛑Задача 16: Количество положительных и отрицательных чисел
//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите размер массива: ");
//        int size = in.nextInt(); int[] array = new int[size];
//        System.out.println("Введите элементы массива:");
//        for (int i = 0; i < size; i++) {
//            array[i] = in.nextInt();
//        }
//        int positiveCount = 0, negativeCount = 0;
//        for (int num : array) {
//            if (num > 0) positiveCount++;
//            else if (num < 0) negativeCount++;
//        }
//        System.out.println("Количество положительных чисел: " + positiveCount);
//        System.out.println("Количество отрицательных чисел: " + negativeCount);
//////////////////////////////////////////////////////

        //🛑Задача 17: Простые числа в диапазоне
//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите два целых числа A и B: ");
//        int A = in.nextInt();
//        int B = in.nextInt();
//
//        System.out.println("Простые числа в диапазоне от " + A + " до " + B + ":");
//        for (int i = A; i <= B; i++) {
//            if (isPrime(i)) {
//                System.out.print(i + " ");
//            }
//        }
//    }
//    private static boolean isPrime(int num) {
//        if (num < 2) return false;
//        for (int i = 2; i <= Math.sqrt(num); i++) {
//            if (num % i == 0) return false;
//        }
//        return true;
//////////////////////////////////////////////////////

        //🛑Задача 18: Подсчет гласных и согласных в строке
//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите строку: ");
//        String input = in.nextLine().toLowerCase();
//        int vowelCount = 0, consonantCount = 0;
//        for (char ch : input.toCharArray()) {
//            if (Character.isLetter(ch)) {
//                if ("aeiouyAEIOUYаеёиоуыэюяАЕЁИОУЫЭЮЯ".indexOf(ch) != -1)
//                {
//                    vowelCount++;
//                } else
//                {
//                    consonantCount++;
//                }
//            }
//        }
//        System.out.println("Количество гласных: " + vowelCount);
//        System.out.println("Количество согласных: " + consonantCount);
//////////////////////////////////////////////////////

        //🛑Задача 19: Перестановка слов в строке
//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите строку, состоящую из нескольких слов: ");
//        String n = in.nextLine();
//        String[] words = n.split(" ");
//        StringBuilder reversed = new StringBuilder();
//        for (int i = words.length - 1; i >= 0; i--) {
//            reversed.append(words[i]);
//            if (i != 0) reversed.append(" ");
//        }
//        System.out.println("Слова в обратном порядке: " + reversed.toString());
//////////////////////////////////////////////////////

        //🛑Задача 20: Число Армстронга
//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите целое число: ");
//        int num = in.nextInt();
//        int originalNumber = num;
//        int sum = 0;
//        int digitsCount = String.valueOf(num).length();
//        while (num > 0) {
//            int digit = num % 10;
//            sum += Math.pow(digit, digitsCount);
//            num /= 10;
//        }
//        if (sum == originalNumber) {
//            System.out.println(originalNumber + " является числом Армстронга!");
//        } else {
//            System.out.println(originalNumber + " не является числом Армстронга!");
//        }
    }
}
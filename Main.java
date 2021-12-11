import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.print("Введите любое положительное число: ");
        int n = readValue();
        checkValue(n);

        int valueOfTribonacci = countValueOfTribonacci(n);

        printValueOfTribonacci(valueOfTribonacci);

    }

    private static int readValue() {
        Scanner scn = new Scanner(System.in);
        return scn.nextInt();
    }

    private static void checkValue(int n) {
        if (n < 0) {
            System.out.println("Положительное или равное нулю!");
            return;
        }
    }

    private static int countValueOfTribonacci(int n) {
        int a = 0;
        int b = 0;
        int c = 1;
        int res = 0;

        if (n == 0) {
            return res;
        }

        while (res < n) {
            res = a + b + c;
            a = b;
            b = c;
            c = res;
        }

        return res;
    }

    private static void printValueOfTribonacci(int valueOfTribonacci) {
        System.out.print("Наименьшее большее или равное нулю значение: " + valueOfTribonacci);

    }

}




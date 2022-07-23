package _9_Chisla;

public class Example_random_2 {
    public static void main(String[] args) {

        int a = 0;
        int b = 10;

        int random_number1 = a+(int)(Math.random()*b); // генерация 1-го числа
        System.out.println("1-ое случайное число: " + random_number1);

        int random_number2 = a+(int)(Math.random()*b); // генерация 1-го числа
        System.out.println("1-ое случайное число: " + random_number2);

        int random_number3 = a+(int)(Math.random()*b); // генерация 1-го числа
        System.out.println("1-ое случайное число: " + random_number3);
    }
}

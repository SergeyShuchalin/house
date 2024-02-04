import java.util.Scanner;

public class DzSh4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Введите количество копеек от 1 до 99: ");
        int a = input.nextInt();
        // Вариант 1 (if else)
        if (a >= 1 && a <= 99) {

            if (a % 10 == 1 && a != 11) {
                System.out.println(a + " копейка");
            } else if (a % 10 >= 2 && a % 10 <= 4 && a != 12 && a != 13 && a != 14) {
                System.out.println(a + " копейки");
            } else {
                System.out.println(a + " копеек");
            }
        }
        else {
            System.out.println(a > 99 ? "введенное значение выше указанного диапазона" : "введенное значение ниже указанного диапазона");
        }

        //Вариант 2 (a ? "" : "")
        System.out.println(a < 1 ? "введенное значение ниже указанного диапазона" : a > 99 ? "введенное значение выше указанного диапазона" :
             a%10 == 1 && a != 11 ? a+ " копейка" : a % 10 >= 2 && a % 10 <= 4 && a != 12 && a != 13 && a != 14 ? a+ " копейки" : a+ " копеек");


        // Вариант 3 (switch)
        /*switch (a) {
            case 1, 21, 31, 41, 51, 61, 71, 81, 91:
                System.out.println(a + " копейка");
                break;
            case 2, 3, 4, 22, 23, 24, 32, 33, 34, 42, 43, 44, 52, 53, 54, 62, 63, 64, 72, 73, 74, 82, 83, 84, 92, 93, 94:
                System.out.println(a+ " копейки");
                break;
            case 5, 6, 7, 8, 9, 25, 26, 27, 28, 29, 35, 36, 37, 38, 39, 45, 46, 47, 48, 49, 55, 56, 57, 58, 59, 65, 66,
                67, 68, 69, 75, 76, 77, 78, 79, 85, 86, 87, 88, 89, 95, 96, 97, 98, 99, 10, 11, 12, 13, 14, 15, 16, 17, 18,
                19, 20, 30, 40, 50, 60, 70, 80, 90:
                System.out.println(a+ " копеек");
                break;
            default:
                System.out.println(a > 99 ? "введенное значение выше указанного диапазона" : "введенное значение ниже указанного диапазона");
                break;
        }*/



        input.close();


    }
}
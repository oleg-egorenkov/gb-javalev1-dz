public class domz01 {
    public static void main(String[] args) {    //Задание 01
        byte pby = 127;
        short psh = 32767;
        int pin = 2147483647;
        long plo = 9223372036854775807L;
        float pfl = 123.45f;
        double pdo = 12.3456789;
        boolean pbo = true;
        char pch = 'S'; //Задание 02

        System.out.println(calculate(2,3,4,2));
        System.out.println(task10and20(5,6));
        isPositiveOrNegative(-58);
        System.out.println(isNegative(9));
        greetings("Фарид");
        visokosniy(2018);
    }

    public static int calculate(int a, int b, int c, int d) {
        return  a * (b + (c / d));
    }   //Задание 03

    public static boolean task10and20(int x1, int x2) {
        int sum = x1 + x2;
        if (sum >= 10 && sum <=20) {
            return true;
        }else{
            return false;
            }
        }  //Задание 04

    public static void isPositiveOrNegative(int x) {
        if(x>=0) {
            System.out.println("Чмсло положительное");
        } else {
            System.out.println("Чмсло отрицательное");
        }
    }   //Задание 05

    public static boolean isNegative(int x) {
        if(x<0) {
            return true;
        }
        return false;
    }   //Задание 06

    public static void greetings(String name) {
        System.out.println("Привет " + name + "!");
    }   //Задание 07

    public static void visokosniy(int x){
        boolean vis = false;  //По умолчанию год не високосный
        if (x%4 == 0){
            vis = true; //Если делится на 4 - то меняем на високосный
        };
        if (x%100 == 0){
            vis = false; //Если делится на 100 - то меняем на не високосный
        };
        if (x%400 == 0){
            vis = true; //Если делится на 400 - то меняем на високосный
        };
        if (vis) {
            System.out.println("Год " + x + " явлется високосным");
        }else{
            System.out.println("Год " + x + " не явлется високосным");
        }
    }//Задание 08

}

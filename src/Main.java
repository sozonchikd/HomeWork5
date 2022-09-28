public class Main {
    public static void main(String[] args) {
        // Домашка 5, условный оператор 2
        System.out.println("Задание 5.1");
        int clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        // Задание 2
        System.out.println("Задание 5.2");
        int clientDeviceYear = 2021;
        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
            else {
                System.out.println("Установите приложение для iOS по ссылке");
            }
        }
        if (clientOS == 1){
            if (clientDeviceYear <2015) {
                System.out.println("Установите облегченную версию приложения для Android  по ссылке");
        }
            else {
                System.out.println("Установите приложение для Android по ссылке");
        }}

    }
}
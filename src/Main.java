public class Main {
    public static void main(String[] args) {
        // Домашка 5, условный оператор 2
        System.out.println("Задание 5.1");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        // Задание 2
        System.out.println("Задание 5.2");
        int clientDeviceYear = 2015;
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
        // Задание 5.3
        System.out.println("Задание 5.3");
int year = 2021;
if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
    System.out.println(year + " Год является високосным");}
else {
    System.out.println(year + " Год не является високосным");
}
        // Задание 5.4
        System.out.println("Задание 5.4");
int deliveryDistance = 9;
if (deliveryDistance <= 20) {
    System.out.println("Потребуется 1 день");
}if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется 2 дня");
        }
if (deliveryDistance > 60 && deliveryDistance < 100) {
    System.out.println("Потребуется 3 дня");
}     // 2 Вариант
        int deliveryDays = 1;
if (deliveryDistance > 20) {deliveryDays ++;}
if (deliveryDistance > 60) {deliveryDays ++;}
        System.out.println("Потребуется дней: " + deliveryDays);

     // Задание 5.5
        System.out.println("Задание 5.5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
            break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }




    }
}
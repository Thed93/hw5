package ru.skypro.hw5;

public class Main {
    static int tusk;

    public static void tuskNumber() {
        tusk++;
        System.out.println("\n" + "Задание № " + tusk);
    }

    public static void main(String[] args) {
        tuskNumber();
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        tuskNumber();
        int clientDeviceYear = 2012;

        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для IOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для IOS по ссылке");
            }
        }
        if (clientOS == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }

        tuskNumber();
        int year = 1995;
        if (year % 400 == 0) {
            System.out.println("Год высокостный");
        } else if (year % 100 == 0) {
            System.out.println("Год не высокостный");
        } else if (year % 4 == 0) {
            System.out.println("Год высокостный");
        } else {
            System.out.println("Год не высокостный");
        }

        tuskNumber();
        int deliveryDistance = 69;
        int numberOfDays = 0;

            if (deliveryDistance > 0) {
                numberOfDays++;
                if (deliveryDistance >= 20) {
                    numberOfDays++;
                    if (deliveryDistance >= 60 && deliveryDistance < 100) {
                        numberOfDays++;
                    }
                }
            }
        System.out.println("Потребуется дней: " + numberOfDays);

            tuskNumber();
            int monthNumber = 12;
            switch (monthNumber) {
                case 1 :
                case 2 :
                case 12 :
                    System.out.println("Сейчас зима");
                    break;
                case 3 :
                case 4 :
                case 5 :
                    System.out.println("Сейчас весна");
                    break;
                case 6 :
                case 7 :
                case 8 :
                    System.out.println("Сейчас лето");
                    break;
                case 9 :
                case 10 :
                case 11 :
                    System.out.println("Сейчас осень");
                    break;

            }



    }
}
import java.time.LocalDate;

public class Main {
    // Задача 1
    public static void checkYear(int yearCheck) {
        if (yearCheck % 4 == 0 && yearCheck % 100 != 0 || yearCheck % 400 == 0) {
            System.out.println(yearCheck + " год является високосным");
        } else {
            System.out.println(yearCheck + " год не является високосным");
        }
    }

    // Задача 2
    public static void checkVersion(int device, int year) {
        String operSystem;
        int currentYear = LocalDate.now().getYear();
        if (device == 0) {
            operSystem = "iOS";
        } else {
            operSystem = "Android";
        }
        if (year < currentYear) {
            System.out.println("Установите облегченную версию приложения для " + operSystem + " по ссылке");
        } else {
            System.out.println("Установите версию приложения для " + operSystem + " по ссылке");
        }
    }

    // Задача 3
    public static int checkDistance(int deliveryDistance) {
        int day = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + day);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            day = day + 1;
            System.out.println("Потребуется дней: " + day);
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            day = day + 2;
            System.out.println("Потребуется дней: " + day);
        } else {
            System.out.println("Доставки нет");
        }
        return day;
    }

    public static void main(String[] args) {
        // к 1 задаче
        checkYear(2021);

        // ко 2 задаче
        checkVersion(0, 2024);

        // к 3 задаче
        checkDistance(95);
    }
}
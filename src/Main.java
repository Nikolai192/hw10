import java.time.LocalDate;

public class Main
{
    public static void main(String[] args) {
    yearLeap(1804);
    mobilApplication(0, 2024);
    cardDelivery(25);
    }

    public static void yearLeap(int year) {
        if ( year < 1584) {
            System.out.println("Високосный год не введен");
        } else if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год високосный");
        } else {
            System.out.println(year + " год не високосный");
        }
    }
    public static void mobilApplication(int clientPhoneOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if ( clientPhoneOS == 1 && clientDeviceYear < currentYear ) {
            System.out.println("Скачай облегченную версию приложения для Android по ссылке");
        } else if (clientPhoneOS == 1 && clientDeviceYear > currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientPhoneOS == 0 && clientDeviceYear < currentYear) {
            System.out.println("Скачай облегченную версию приложения для IOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для IOS по ссылке");
        }
    }
    public static void cardDelivery(int deliveryDistance) {
        if (deliveryDistance <= 20) {
            System.out.println("Потребуются одни сутки на доставку");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется двое суток на доставку");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется трое суток на доставку");
        } else {
            System.out.println("Доставка не осуществляется");
        }
    }
}
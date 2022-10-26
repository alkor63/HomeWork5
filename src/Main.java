public class Main {
    public static void main(String[] args) {

// Home Work 5
        System.out.println("********** Home Work 5 **********");

// Task 1
        System.out.println(" * Task 1 ");
        boolean clientOS = true;
        if (clientOS) System.out.println("Установите версию приложения для Android по ссылке");
        else System.out.println("Установите версию приложения для iOS по ссылке");

// Task 2
        System.out.println(" * Task 2 ");
        int clientDeviceYear;
        clientDeviceYear = 2014;
        String lightVersion;
        if (clientDeviceYear >= 2015) lightVersion = " ";
        else lightVersion = " облегченную ";
        if (clientOS) System.out.println("Установите"+lightVersion+"версию приложения для Android по ссылке");
        else System.out.println("Установите"+lightVersion+"версию приложения для iOS по ссылке");

// Task 3
        System.out.println(" * Task 3 ");
        int yearNum;
        yearNum = 2100;
        double yearDiv4 = yearNum/4.0;
        if (yearDiv4 % 1 != 0.0) System.out.println(yearNum + "год не високосный");
        else if (yearDiv4 % 25 == 0.0 && yearDiv4 % 100 != 0.0) System.out.println(yearNum + "год не високосный");
                else System.out.println(yearNum + " - високосный год");

// Task 4
        System.out.println(" * Task 4 ");
        int deliveryDistance = 95;
        System.out.println("Потребуется дней: " + (1+(deliveryDistance+19)/40));

// Task 5
        System.out.println(" * Task 5 ");
        byte monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println(monthNumber + " месяц принадлежит к сезону зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(monthNumber + " месяц принадлежит к сезону весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(monthNumber + " месяц принадлежит к сезону лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(monthNumber + " месяц принадлежит к сезону осень");
                break;
            default:
                System.out.println("У нас нет месяца с номером " + monthNumber);
        }
    }
}
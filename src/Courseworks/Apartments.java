package Courseworks;

import java.util.Scanner;

public class Apartments {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество этажей: ");
        int floorsAmount = scanner.nextInt();

        System.out.print("Введите количество подъездов: ");
        int entrancesAmount = scanner.nextInt();

        System.out.print("Введите номер квартиры: ");
        int apartmentNumber = scanner.nextInt();

        final int apartmentsAmountPerFloor = 4;

        int apartmentsAmount = floorsAmount * entrancesAmount * apartmentsAmountPerFloor;

        if (apartmentNumber > apartmentsAmount) {
            System.out.println("В данном доме квартиры № " + apartmentNumber + " нет");
        } else {
            int apartmentPositionOnSite = apartmentNumber % apartmentsAmountPerFloor;

            if (apartmentPositionOnSite == 0) {
                System.out.println("Квартира ближняя справа");
            } else if (apartmentPositionOnSite == 1) {
                System.out.println("Квартира ближняя слева");
            } else if (apartmentPositionOnSite == 2) {
                System.out.println("Квартира дальняя слева");
            } else {
                System.out.println("Квартира дальняя справа");
            }

            int entranceNumber = (int) Math.ceil((double) apartmentNumber / (floorsAmount * apartmentsAmountPerFloor));
            System.out.println("Подъезд № " + entranceNumber);

            int floorNumber = (int) Math.ceil((double) (apartmentNumber - ((entranceNumber - 1) *
                    apartmentsAmountPerFloor * floorsAmount)) / apartmentsAmountPerFloor);
            System.out.println("Этаж № " + floorNumber);
        }
    }
}
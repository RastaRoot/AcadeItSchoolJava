package Lesson7;

public class RangeMain {
    public static void main(String[] args) {
        Range range = new Range(10.0, 15.0);
        System.out.println(range.getFrom());
        System.out.println(range.getTo());

        range.setFrom(15.0);
        range.setTo(20.0);
        System.out.println("Длина диапазона: " + range.getLength());

        System.out.println(range.isInside(19.0));
        System.out.println(range.isInside(14.0));
    }
}
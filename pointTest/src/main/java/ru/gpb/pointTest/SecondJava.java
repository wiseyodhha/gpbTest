package ru.gpb.pointTest;

public class SecondJava {

    public static void main(String[] args) {
        Point p1 = new Point(2.3, -3.5);
        Point p2 = new Point(-5.7, 8.1);

        System.out.println("Расстояние между точками (" + p1.x + ", " + p1.y + ")" + " и (" + p2.x + ", " + p2.y + ") = " + DistanceBetweenPoints.distance(p1, p2));

    }
}

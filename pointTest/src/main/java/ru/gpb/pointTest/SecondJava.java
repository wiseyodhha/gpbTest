package ru.gpb.pointTest;

public class SecondJava {

    public static void main(String[] args) {
        Point p1 = new Point(4, 2);
        Point p2 = new Point(3, 5);

  //      System.out.println("Расстояние между точками " + "(" + p1.x + ", " + p1.y + ")" + " И " + "(" + p2.x + ", " + p2.y + ")" + " = " + DistanceBetweenPoints.distance(p1, p2));

        System.out.println("Расстояние между точками " + "(" + p1.x + ", " + p1.y + ")" + " И " + "(" + p2.x + ", " + p2.y + ")" + " = " + DistanceBetweenPoints.distance2(p1, p2));
    }
}

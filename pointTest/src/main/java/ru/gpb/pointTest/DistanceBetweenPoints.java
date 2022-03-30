package ru.gpb.pointTest;

public class DistanceBetweenPoints {

 //   public static double distance(Point p1, Point p2) {
 //       return Math.sqrt((p2.y - p1.y) * (p2.y - p1.y) + (p2.x - p1.x) * (p2.x - p1.x));
 //   }

    public static double distance2(Point p1, Point p2) {
        return Math.sqrt(Math.pow((p2.y - p1.y), 2)  + Math.pow((p2.x - p1.x), 2));
    }

}
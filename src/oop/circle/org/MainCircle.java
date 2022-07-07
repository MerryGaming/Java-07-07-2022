package oop.circle.org;

import java.util.Scanner;

public class MainCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Scanner scan = new Scanner(System.in);

        System.out.printf("Nhap bán kính hình tròn là: ");
        circle.setRadius(Double.parseDouble(scan.nextLine()));


        System.out.println("Bán kính hình tròn là: " + circle.getRadius());

        System.out.println(circle.toString());

        System.out.println("Diện tich hinh tron la: " + circle.getArea());

        System.out.println("Chu vi hinh tron la: " + circle.getCircumference());
    }
}

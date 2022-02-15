package org.example;

public class App {
    public static void main(String[] args) {
        System.out.println("Треугольник");
    }
    public static int getSquare(int a, int b, int c) {
        return (int)
                Math.sqrt(((a + b + c) / 2) * (((a + b + c) / 2) - a) * (((a + b + c) / 2) - b) * (((a + b + c) / 2) - c));
    }

    // Обыгрываем проверку "нуля" перемножением сторон треугольника
    public static int getNull(int a, int b, int c) {
        return a*b*c;
    }

    // Проверка отрицательных значений
    public static boolean getNegative(int a, int b, int c) {
        if ((a < 0) || (b < 0) || (c < 0)) {
            return false;
        }
        else return true;
    }
    // Проверка существования треугольника
    public static boolean getTriangle(int a, int b, int c) {
        if ((a<b+c) && (b<a+c) && (c<a+b)) {
            return true;
        }
        else return false;
    }

}

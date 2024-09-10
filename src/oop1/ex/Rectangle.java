package oop1.ex;

public class Rectangle {
    int width;
    int height;

    boolean isSquare() {
        return width == height;
    }

    int calculatePerimeter() {
        return (width + height) * 2;
    }

    int calculateArea() {
        return width * height;
    }
}

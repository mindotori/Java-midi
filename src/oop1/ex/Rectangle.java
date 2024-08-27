package oop1.ex;

public class Rectangle {
    int width;
    int height;

     int calculateArea() { //매개변수 필요없다
        return width * height;
    }
     int calculatePerimeter() {
        return 2 * (width + height);
    }
     boolean isSquare() {
        return width == height;
    }
}

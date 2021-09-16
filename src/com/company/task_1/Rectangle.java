package com.company.task_1;

public class Rectangle {
    double height;
    double width;

    Rectangle() {

    }
    Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    double area() {
        return this.height * this.width;
    }

}

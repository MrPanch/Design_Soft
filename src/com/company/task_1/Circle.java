package com.company.task_1;



public class Circle {
    double radius;
    Circle() {
        this.radius = 0;
    }

    Circle(double radius){
        this.radius = radius;
    }

    double area() {
        return Math.PI * Math.pow(radius, 2);
    }
}
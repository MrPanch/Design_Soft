package com.company.task_1;

public class Square {
    double length;

    Square() {

    }
    Square(double length) {
        this.length = length;
    }

    double area(){
        return this.length * this.length;
    }
}

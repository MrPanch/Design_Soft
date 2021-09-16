package com.company.task_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void area() {
        Circle circle1 = new Circle(1);
        Circle circle2 = new Circle(42);

        assertEquals(circle1.area(), Math.PI);
        assertEquals(circle2.area(), 42 * 42 * Math.PI);
    }

    @Test
    void init(){
        Circle circle1 = new Circle(5);
        assertEquals(circle1.radius, 5);
    }
}
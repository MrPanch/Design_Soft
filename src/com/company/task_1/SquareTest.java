package com.company.task_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void area() {
        Square square1 = new Square(1);
        Square square2 = new Square(3.2);
        Square square3 = new Square(42);

        assertEquals(square1.area(), 1);
        assertEquals(square2.area(), 3.2 * 3.2);
        assertEquals(square3.area(), 42 * 42);
    }
}
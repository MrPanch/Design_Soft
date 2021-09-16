package com.company.task_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void area() {
        Rectangle rec1 = new Rectangle(4,2);
        Rectangle rec2 = new Rectangle(2,4);
        Rectangle rec3 = new Rectangle(1,8);
        double expected = 8;
        assertEquals(rec1.area(), expected);
        assertEquals(rec2.area(), expected);
        assertEquals(rec3.area(), expected);
    }
}
package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    static Logger logger = LoggerFactory.getLogger(TriangleTest.class);

    @Test
    @DisplayName("Позитивный тест площади треугольника")
    void getSquareTest() {
        logger.info("Позитивный тест площади треугольника");
        assertEquals(6, App.getSquare(3, 4, 5));
    }

    @Test
    @DisplayName("Передаем ноль")
    void getNullTest() {
        logger.info("Передаем ноль");
        assertEquals(0, App.getNull(0, 3, 3));
    }

    @Test
    @DisplayName("Передаем отрицательное значение")
    void getNegativeTest() {
        logger.info("Передаем отрицательное значение");
        assertFalse(App.getNegative(1, -3, 1));
    }

    @Test
    @DisplayName("Проверка существования треугольника")
    void getTriangleTest() {
        logger.info("Проверка существования треугольника");
        assertTrue(App.getTriangle(3, 3, 3));
    }

}


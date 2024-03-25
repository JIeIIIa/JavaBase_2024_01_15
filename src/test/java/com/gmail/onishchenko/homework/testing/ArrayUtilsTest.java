package com.gmail.onishchenko.homework.testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class ArrayUtilsTest {
    @ParameterizedTest // see documentation: https://junit.org/junit5/docs/current/user-guide/#writing-tests-parameterized-tests
    @MethodSource("averageSource")
    void average(int[] array, double expected) {
        // given
        double delta = 0.000000001;

        // when
        double result = ArrayUtils.average(array);

        // then
        Assertions.assertEquals(expected, result, delta);
    }

    public static Stream<Arguments> averageSource() {
        return Stream.of(
                Arguments.of(null, 0),
                Arguments.of(new int[]{}, 0),
                Arguments.of(new int[]{1}, 1.0),
                Arguments.of(new int[]{1, 2, 3}, 2.0),
                Arguments.of(new int[]{-10, 4, -2, 3}, -1.25)
        );
    }

    @Test
    void nullMatrix() {
        // given

        // when
        boolean result = ArrayUtils.isSquare(null);

        //then
        Assertions.assertFalse(result);
    }


    @Test
    void emptyMatrix() {
        // given

        // when
        boolean result = ArrayUtils.isSquare(new int[][]{});

        //then
        Assertions.assertFalse(result);
    }

    @Test
    void notSquareMatrix() {
        // given
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {0, 0},
                {1, 2, 3, 4}
        };

        // when
        boolean result = ArrayUtils.isSquare(matrix);

        //then
        Assertions.assertFalse(result);
    }

    @Test
    void notSquareMatrixWithNullRow() {
        // given
        int[][] matrix = {
                {1, 2, 3, 4},
                null,
                {5, 6, 7, 8},
                {1, 2, 3, 4}
        };

        // when
        boolean result = ArrayUtils.isSquare(matrix);

        //then
        Assertions.assertFalse(result);
    }

    @Test
    void squareMatrix() {
        // given
        int[][] matrix = {
                {1, 2, 3, 4},
                {0, 0, 0, 0},
                {5, 6, 7, 8},
                {1, 2, 3, 4}
        };

        // when
        boolean result = ArrayUtils.isSquare(matrix);

        //then
        Assertions.assertTrue(result);
    }
}
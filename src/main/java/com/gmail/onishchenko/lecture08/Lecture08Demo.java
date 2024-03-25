package com.gmail.onishchenko.lecture08;

public class Lecture08Demo {

    public static void main(String[] args) {
//        demo3();
        int[] array = {1, 10005, 17, 10, 15};
        System.out.println(toStringByFor(array));
        bubbleSort(array);
        System.out.println(toStringByFor(array));




        int element = 15;
        int index = demo5(array, element);
        System.out.println("Found at index: " + index);
    }


    public static String toStringByFor(int[] array) {
        if (array == null) {
            return "";
        }
        String result = "[";
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                result += ", ";
            }
            result += array[i];
        }
        result += "]";

        return result;
    }

    /**
     * O(1)
     */
    public static int getFirst(int[] array) {
        return array[0];
    }

    /**
     * O(1)
     */
    public static int sum(int a, int b) {
        return a + b;
    }


    /**
     * O(N)
     */
    // f(n) = n
    public static int sum(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
        }

        return result;
    }

//    /**
//     * O(N)
//     */
//    // g(n) == n + g(n-1);
//    public static int sumRecursion(int n) {
//        if (n == 1) {
//            return 1;
//        } else {
//            return n + sumRecursion(n - 1);
//        }
//    }

    /**
     * O(N) = 2*N ~ N
     */
    public static int sum2(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += sumPair(i, i + 1, 1);
        }
        return sum;
    }

    /**
     * O(1)
     */
    public static int sumPair(int a, int b, int c) {
        return a + b + c;
    }

    /**
     * O(N)
     */
    public static void demo1() {
        int[] array = {1, 2, 3, 4, 5};
        int min = array[0];
        int max = array[0];
        for (int x : array) {
            if (x < min) {
                min = x;
            }
            if (x > max) {
                max = x;
            }
        }
    }

    /**
     * З точки зору команд процесораа, цей варіант повільніший
     * Але BigO демонструє як себе поводить алгоритм
     * O(N)
     */

    public static void demo2() {
        int[] array = {1, 2, 3, 4, 5};
        int min = array[0];
        int max = array[0];
        for (int x : array) {
            if (x < min) {
                min = x;
            }
        }
        for (int x : array) {
            if (x > max) {
                max = x;
            }
        }
    }

    /**
     * O(N^2) ~ (n/2 + 3) * (n - 2) == 1/2 * n^2 + 2 * n - 6 ~ n^2 + n ~ n^2
     * O(N) * O(N)
     */
    public static void demo3() {
        int n = 10;
        int steps = 0;
        for (int i = 0; i < n / 2 + 3; i++) { // n
            for (int j = 0; j < n - 2; j++) { //
                System.out.print(i * j + " ");
                steps++;
            }
            System.out.println();
        }
        System.out.println(steps);
    }

    /**
     * O(N^3)
     */
    public static void demo4() {
        int n = 10;
        for (int i = 0; i < n; i++) { // n * (N^2)
            for (int j = 0; j < n; j++) {
                for (int l = 0; l < n; l++) {

                }
            }
        }
    }


    // 1 4 5 6 9 14 15 20 21
    // 4


    /**
     * O(logN)
     * Найгірший варіант для масива із 16 елементів
     * N = 16 - 2^4
     * N = 8 - 2^3
     * N = 4 - 2^2
     * N = 2 - 2^1
     * N = 1 - 2^0
     * <p>
     * 2^4=16 - 2^k = N тоді з математики відомо, що   k = log2N
     * O(k) = O(log2N)
     * Основа логорифма не береться до уваги, logA(N) = logB(N)/logB(A), а 1/logB(A) = константа:
     * O(k) = O(logN)
     */
    public static int demo5(int[] array, int elementToSearch) {
        int firstIndex = 0;
        int lastIndex = array.length - 1;

        while (firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            if (array[middleIndex] == elementToSearch) {
                return middleIndex;
            } else if (array[middleIndex] < elementToSearch) {
                firstIndex = middleIndex + 1;
            } else {
                lastIndex = middleIndex - 1;
            }
        }

        return -1;
    }

    // O(N^2)
    public static void bubbleSort(int[] array) {
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                }
            }
        }

    }
}

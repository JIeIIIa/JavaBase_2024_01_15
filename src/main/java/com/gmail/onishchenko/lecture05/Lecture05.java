package com.gmail.onishchenko.lecture05;

import java.util.ArrayList;
import java.util.List;

public class Lecture05 {
    public static void main(String[] args) {
        String[] numbers = {
                "AA1111AA",
                "AA2222AA",
                "BB3333AA",
                "AC4444AB",
                "AA5555AA",
                "AA6666AA"
        };

//        whileLoop(numbers);
//        doWhileLoop(numbers);
//        forLoop(numbers);
//        forEachLoop(numbers);
////        nestedLoop();
//        listExample(numbers);

        postPreIncrement();
    }

    private static void postPreIncrement() {
        int count = 42;
        System.out.println(count);
        count++;  // count += 1 <=> count = (int) (count + 1);
        System.out.println(count);
        ++count; // count += 1 <=> count = count + 1;
        System.out.println(count);

        count = 44;
        int result = 10+ ++count+count++ - --count;
        System.out.println("result = " + result + " count = " + count);

        count = 44;
        result = 10 + (count++);
        System.out.println("result = " + result + " count = " + count);
    }

    private static void listExample(String[] numbers) {
        List<String> list = new ArrayList<>();
        list.add("qwerty");
        list.add("asd");
        list.add("sdfg");

        for (String number : list) {
            System.out.println(number);
        }
    }

    private static void nestedLoop() {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }

    private static void forEachLoop(String[] numbers) {
        System.out.println(" -= FOR EACH LOOP =-");
        int count = 0;

        for (String number : numbers) {
            if (number.startsWith("AA")) {
                count++;
            }
        }
        System.out.println("count = " + count);
    }

    private static void forLoop(String[] numbers) {
        System.out.println(" -= FOR LOOP =-");
        int count = 0;
        for (int i = 0; i >= 0 && i < numbers.length; i++, count++) {
            if (numbers[i].startsWith("AA")) {
                count++;
            }
        }
        System.out.println("count = " + count);
    }

    private static void forLoop2(String[] numbers) {
        System.out.println(" -= FOR LOOP =-");
        int count = 0;
        int index = 0;
        for (; ; ) {
            if (index < numbers.length) {
                break;
            }
            if (numbers[index].startsWith("AA")) {
                count++;
            }
            index++;
        }
        System.out.println("count = " + count);
    }

    public static void naiveImplementation(String[] numbers) {
        int count = 0;
        if (numbers[0].startsWith("AA")) {
            count++;
        }
        if (numbers[1].startsWith("AA")) {
            count++;
        }
        if (numbers[2].startsWith("AA")) {
            count++;
        }
        if (numbers[3].startsWith("AA")) {
            count++;
        }
        if (numbers[4].startsWith("AA")) {
            count++;
        }
        if (numbers[5].startsWith("AA")) {
            count++;
        }
        System.out.println("count = " + count);
    }

    private static void doWhileLoop(String[] numbers) {
        System.out.println(" -= DO-WHILE LOOP =-");
        int count = 0;
        int index = 0;
        do {
            if (index >= numbers.length) {
                break;
            }
            if (numbers[index].startsWith("AA")) {
                count++;
            }
            index++;
        } while (index < numbers.length);
        System.out.println("count == " + count);
    }


    private static void whileLoop(String[] numbers) {
        System.out.println(" -= WHILE LOOP =-");
//          1. загальна кільксть = 0
//          2. беремо перший номер
//          3. якщо номер мість АА, то загальну кількість збільшуємо на 1
//          4. якщо ще є номери, які не перевірили, то взяти наступний номер і перейти до кроку 3
        int count = 0;
        int index = 0;
        while (index < numbers.length) {
            if (numbers[index].startsWith("AA")) {
                count++;
            }
            index++;
        }

        System.out.println("count == " + count);
    }
}

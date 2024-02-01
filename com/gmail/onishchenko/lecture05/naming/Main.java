package com.gmail.onishchenko.lecture05.naming;

public class Main {
    public static void main(String[] args) {
        int a, d, s, l = 21;

        int[] f = {1, 4, 3, 2, 5, 6, 7, 6, 5, 3, 5, 6, 7, 8, 6, 5, 4, 3, 7, 8, 7, 0};
a = s = d = 0;

a = f[0];
      d = a;     int      i = 0;
        while (l > i)
                    {
                        System.out.println("Print i == " + i + " l == " + l);
        if (a > f[i])
                           a = f[i];
        if (d < f[i]) {
                d = f[i];}
                s += f[i];
                        i++;
                    }


          s /= l;

            System.out.println("Max: " + a);System.out.println("Min: " + d);
                            System.out.println("Avg: " + s);

        }
}

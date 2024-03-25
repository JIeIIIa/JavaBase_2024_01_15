package com.gmail.onishchenko.homework;

public class Dynasty {
    public static void main(String[] args) {
        int eachTypeSoldierLi = 860;
        int warriorLi = 13;
        int archerLi = 860;
        int riderLi = 46;
        int totalAttackLi = 860 * (warriorLi + archerLi + riderLi);
        System.out.println("General attack of the Li dynasty: " + totalAttackLi);

        int eachTypeSoldierMing = (int) (eachTypeSoldierLi * 1.5);
        int warriorMing = 9;
        int archerMing = 35;
        int riderMing = 12;
        int totalAttackMing = eachTypeSoldierMing * (warriorMing + archerMing + riderMing);
        System.out.println("General attack of the Ming dynasty: " + totalAttackMing);
    }
}

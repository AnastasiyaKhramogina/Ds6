package ru.netology.services;

public class HolidaysWithExpensesService {
    public int calculate(int income, int expenses, int threshold) {
        int rest = 0;
        int money = 0;
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) {
                rest++;
                money = (money - expenses) / 3;
            } else {
                money = money + income - expenses;
            }
        }
        return rest;
    }
}


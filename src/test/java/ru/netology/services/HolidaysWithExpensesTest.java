package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HolidaysWithExpensesTest {
    @Test
    void WorkingSchedule() {
        HolidaysWithExpensesService service =new HolidaysWithExpensesService();

        int income =10000;
        int expenses= 3000;
        int threshold=15000;
        int expected =3;

        int actual = service.calculate (income, expenses,threshold);
        Assertions.assertEquals(expected, actual);

    }

}

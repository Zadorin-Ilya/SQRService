package ru.netology.sqr;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    @Test
    public void test() {
        SQRService service = new SQRService();
        int actual = service.calculate(200, 300);

        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testzero() {
        SQRService service = new SQRService();
        int actual = service.calculate(0, 0);

        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
}





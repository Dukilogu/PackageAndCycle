package ru.netology.sqr.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.sqr.SQRService;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvSource({
            "3,200,300",
            "8,0,300",
            "0,200,0"
    })
    public void testCheckCalcSQR(int expected, int x, int y) {
        SQRService service = new SQRService();

        int actual = service.calcSQR(x, y);

        Assertions.assertEquals(expected, actual);
    }
}
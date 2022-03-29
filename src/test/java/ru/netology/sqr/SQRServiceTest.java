package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(
            value = {
                    "Max counter,100,9801,90",
                    "Min counter, 2501, 2600, 0",
                    "Critical path,200,300,3"
            }
    )
    void shouldCalculate(String testName,int underRange, int upperRange, int expected) {

        SQRService service = new SQRService();

        int actual = service.calculate(underRange, upperRange);

        assertEquals(expected, actual);



    }



    }















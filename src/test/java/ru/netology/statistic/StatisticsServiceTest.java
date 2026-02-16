package ru.netology.statistic;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

public class StatisticsServiceTest {
    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();
        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};

        long expected = 12;
        long actual = service.findMax(incomesInBillions);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void secondBranchtMax() {
        StatisticsService service = new StatisticsService();
        long[] arr = {-2, -15, -18};
        long expected = -2;
        long actual = service.findMax(arr);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void assignmentNewMax() {
        StatisticsService service = new StatisticsService();
        long[] arr = {2, 15, 18};
        long expected = 18;
        long actual = service.findMax(arr);
        Assertions.assertEquals(expected, actual);
    }


}

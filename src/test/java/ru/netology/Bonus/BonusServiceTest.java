package ru.netology.Bonus;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

    public class BonusServiceTest {

        @ParameterizedTest
        @CsvFileSource(resources = "/data.csv")
        void shouldCalculateForRegisteredAndUnderLimit(boolean registered, long amount, long expected) {
            BonusService service = new BonusService();

            long actual = service.calculate(amount, registered);

            Assertions.assertEquals(expected, actual);
        }

        @ParameterizedTest
        @CsvFileSource
        void shouldCalculateForRegisteredAndOverLimit(boolean registered, long amount, long expected) {
            BonusService service = new BonusService();

            long actual = service.calculate(amount, registered);

            Assertions.assertEquals(expected, actual);
        }

        @ParameterizedTest
        @CsvFileSource
        void shouldCalculateForUnregisteredAndUnderLimit(boolean registered, long amount, long expected) {
            BonusService service = new BonusService();

            long actual = service.calculate(amount, registered);

            Assertions.assertEquals(expected, actual);
        }

        @ParameterizedTest
        @CsvFileSource
        void shouldCalculateForUnregisteredAndOverLimit(boolean registered, long amount, long expected) {
            BonusService service = new BonusService();

            long actual = service.calculate(amount, registered);

            Assertions.assertEquals(expected, actual);
        }
    }


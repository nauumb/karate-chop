import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KarateChopTest {

    private static KarateChop karateChop;

    @BeforeAll
    static void setup() {
        System.out.println("@BeforeAll - executes once before all test methods in this class");
    }

    @BeforeEach
    void init() {
        System.out.println("@BeforeEach - executes before each test method in this class");
    }

    @AfterEach
    void tearDown() {
        System.out.println("@AfterEach - executed after each test method.");
    }

    @AfterAll
    static void done() {
        System.out.println("@AfterAll - executed after all test methods.");
    }

    @Test
    void karateChopperOK() {

        List<Integer> karatekas = new ArrayList<>();

        karatekas.add(1);
        karatekas.add(2);
        karatekas.add(3);
        karatekas.add(4);
        karatekas.add(5);
        karatekas.add(6);
        karatekas.add(7);
        karatekas.add(8);
        karatekas.add(9);
        karatekas.add(10);

        int expected = 0;
        int karateka = 1;
        int actual = KarateChop.find(karatekas, karateka);

        assertEquals(expected, actual);
    }

    @Test
    void karateChopperKO() {

        List<Integer> karatekas = new ArrayList<>();

        karatekas.add(1);
        karatekas.add(2);
        karatekas.add(3);
        karatekas.add(4);
        karatekas.add(5);
        karatekas.add(6);
        karatekas.add(7);
        karatekas.add(8);
        karatekas.add(9);
        karatekas.add(10);

        int expected = -1;
        int karateka = 100;
        int actual = KarateChop.find(karatekas, karateka);

        assertEquals(expected, actual);
    }

}
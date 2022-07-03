import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KarateChopTest {

    private static KarateChop karateChop;

    @BeforeAll
    static void setup() {
        System.out.println("@BeforeAll - executes once before all test methods in this class");
        karateChop = new KarateChop();
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
    void helloWorld() {

        List<Integer> karatekas = new ArrayList<>();

        karatekas.add(1);
        karatekas.add(2);
        karatekas.add(3);
        karatekas.add(4);
        karatekas.add(5);

        Integer expected = 1;
        Integer karateka = 2;
        Integer actual = karateChop.karateChopper(karateka, karatekas);

        assertEquals(expected, actual);
    }
}

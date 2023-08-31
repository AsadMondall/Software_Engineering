package in.at.maven;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

  class Addition {

    public int add(int num1, int num2) {
        return num1 + num2;
    }
}


public class AppTest {

    @Test
    public void testAddition() {
        Addition addition = new Addition();
        int result = addition.add(4, 5);
        assertEquals(9, result);
    }
}
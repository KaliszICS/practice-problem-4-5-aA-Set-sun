import org.junit.jupiter.api.*;
import java.lang.reflect.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("PracticeProblem Tests")
class PracticeProblemTest {

    // ─────────────────────────────────────────────
    //  triangle()
    // ─────────────────────────────────────────────

    @Test
    @DisplayName("triangle(1) returns single asterisk")
    void triangleTest1() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class<?>[] cArg = { int.class };
            Method method = testClass.getDeclaredMethod("triangle", cArg);
            assertEquals("*\n", (String) method.invoke(null, 1));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("triangle(3) returns 3-row triangle")
    void triangleTest2() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class<?>[] cArg = { int.class };
            Method method = testClass.getDeclaredMethod("triangle", cArg);
            String expected = "*\n**\n***\n";
            assertEquals(expected, (String) method.invoke(null, 3));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("triangle(5) returns 5-row triangle")
    void triangleTest3() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class<?>[] cArg = { int.class };
            Method method = testClass.getDeclaredMethod("triangle", cArg);
            String expected = "*\n**\n***\n****\n*****\n";
            assertEquals(expected, (String) method.invoke(null, 5));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("triangle(0) returns empty string")
    void triangleTest4() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class<?>[] cArg = { int.class };
            Method method = testClass.getDeclaredMethod("triangle", cArg);
            assertEquals("", (String) method.invoke(null, 0));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    // ─────────────────────────────────────────────
    //  pyramid()
    // ─────────────────────────────────────────────

    @Test
    @DisplayName("pyramid(1) returns single asterisk centered")
    void pyramidTest1() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class<?>[] cArg = { int.class };
            Method method = testClass.getDeclaredMethod("pyramid", cArg);
            assertEquals("*\n", (String) method.invoke(null, 1));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("pyramid(4) returns 4-row pyramid")
    void pyramidTest2() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class<?>[] cArg = { int.class };
            Method method = testClass.getDeclaredMethod("pyramid", cArg);
            String expected =
                "   *\n" +
                "  * *\n" +
                " * * *\n" +
                "* * * *\n";
            assertEquals(expected, (String) method.invoke(null, 4));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("pyramid(2) returns 2-row pyramid")
    void pyramidTest3() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class<?>[] cArg = { int.class };
            Method method = testClass.getDeclaredMethod("pyramid", cArg);
            String expected =
                " *\n" +
                "* *\n";
            assertEquals(expected, (String) method.invoke(null, 2));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("pyramid(0) returns empty string")
    void pyramidTest4() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class<?>[] cArg = { int.class };
            Method method = testClass.getDeclaredMethod("pyramid", cArg);
            assertEquals("", (String) method.invoke(null, 0));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    // ─────────────────────────────────────────────
    //  multiplicationTable()
    // ─────────────────────────────────────────────

    @Test
    @DisplayName("multiplicationTable(1) returns 1x1 table")
    void multiplicationTableTest1() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class<?>[] cArg = { int.class };
            Method method = testClass.getDeclaredMethod("multiplicationTable", cArg);
            assertEquals("1\n", (String) method.invoke(null, 1));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("multiplicationTable(3) returns 3x3 table")
    void multiplicationTableTest2() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class<?>[] cArg = { int.class };
            Method method = testClass.getDeclaredMethod("multiplicationTable", cArg);
            String expected =
                "1 2 3\n" +
                "2 4 6\n" +
                "3 6 9\n";
            assertEquals(expected, (String) method.invoke(null, 3));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("multiplicationTable(2) returns 2x2 table")
    void multiplicationTableTest3() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class<?>[] cArg = { int.class };
            Method method = testClass.getDeclaredMethod("multiplicationTable", cArg);
            String expected =
                "1 2\n" +
                "2 4\n";
            assertEquals(expected, (String) method.invoke(null, 2));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("multiplicationTable(5) first and last row correct")
    void multiplicationTableTest4() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class<?>[] cArg = { int.class };
            Method method = testClass.getDeclaredMethod("multiplicationTable", cArg);
            String result = (String) method.invoke(null, 5);
            String[] rows = result.split("\n");
            assertEquals(5, rows.length, "Should have 5 rows");
            assertEquals("1 2 3 4 5", rows[0], "First row incorrect");
            assertEquals("5 10 15 20 25", rows[4], "Last row incorrect");
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("multiplicationTable(0) returns empty string")
    void multiplicationTableTest5() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class<?>[] cArg = { int.class };
            Method method = testClass.getDeclaredMethod("multiplicationTable", cArg);
            assertEquals("", (String) method.invoke(null, 0));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }
}
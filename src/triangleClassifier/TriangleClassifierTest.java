package triangleClassifier;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {
    TriangleClassifier triangleClassifier = new TriangleClassifier();

    @Test
    void triangleClassifier() {
        int a = 2;
        int b = 2;
        int c = 2;
        String expected = "Tam giác đều";
        String result = triangleClassifier.triangleClassifier(a, b, c);
        assertEquals(expected, result);
    }
    @Test
    void triangleClassifier2() {
        int a = 2;
        int b = 2;
        int c = 3;
        String expected = "Tam giác cân";
        String result = triangleClassifier.triangleClassifier(a, b, c);
        assertEquals(expected, result);
    }
    @Test
    void triangleClassifier3() {
        int a = 3;
        int b = 4;
        int c = 5;
        String expected = "Tam giác vuông";
        String result = triangleClassifier.triangleClassifier(a, b, c);
        assertEquals(expected, result);
    }
    @Test
    void triangleClassifier4() {
        int a = 3;
        int b = 4;
        int c = 6;
        String expected = "Tam giác thường";
        String result = triangleClassifier.triangleClassifier(a, b, c);
        assertEquals(expected, result);
    }

    @Test
    void isTriangle() {
        int a = 8;
        int b = 2;
        int c = 3;
        boolean expected = false;
        boolean result = triangleClassifier.isTriangle(a, b, c);
        assertEquals(expected, result);
    }

    @Test
    void isTriangle1() {
        int a = 0;
        int b = 1;
        int c = 1;
        boolean expected = false;
        boolean result = triangleClassifier.isTriangle(a, b, c);
        assertEquals(expected, result);
    }

    @Test
    void isTriangle2() {
        int a = -1;
        int b = 2;
        int c = 1;
        boolean expected = false;
        boolean result = triangleClassifier.isTriangle(a, b, c);
        assertEquals(expected, result);
    }

    @Test
    void isTriangle3() {
        int a = 3;
        int b = 4;
        int c = 5;
        boolean expected = true;
        boolean result = triangleClassifier.isTriangle(a, b, c);
        assertEquals(expected, result);
    }
}
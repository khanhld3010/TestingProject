package triangleClassifier;

public class TriangleClassifier {
    public String triangleClassifier(int a, int b, int c) {
        //throw new UnsupportedOperationException("Unimplemented method 'triangleClassifier'");
        if (!isTriangle(a, b, c)) {
            return "đây không phải là tam giác";
        }
        if (a == b && a == c) {
            return "Tam giác đều";
        }
        if ((a * a + b * b == c * c) || (a * a + c * c == b * b) || (b * b + c * c == a * a)) {
            return "Tam giác vuông";
        }
        if (a == b || a == c || b == c) {
            return "Tam giác cân";
        }
        return "Tam giác thường";
    }

    boolean isTriangle(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            return false;
        }
        return a + b > c && a + c > b && b + c > a;
    }
}

public class Triangle {

    public static String triangleType(int a, int b, int c) {

        if (!isValidSide(a) || !isValidSide(b) || !isValidSide(c)) {
            return "Value of a, b, or c is not in the range of permitted values.";
        }

        if (!isTriangle(a, b, c)) {
            return "NotATriangle";
        }

        if (a == b && b == c) {
            return "Equilateral";
        } else if (a == b || b == c || c == a) {
            return "Isosceles";
        } else {
            return "Scalene";
        }
    }

    private static boolean isValidSide(int side) {
        return side >= 1 && side <= 200;
    }

    private static boolean isTriangle(int a, int b, int c) {
        return a < b + c && b < a + c && c < a + b;
    }
}

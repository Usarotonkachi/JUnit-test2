import org.junit.Test;
import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void testBoundaryValues() {
        assertEquals("Equilateral", Triangle.triangleType(1, 1, 1)); // Lower bound for Equilateral
        assertEquals("Isosceles", Triangle.triangleType(1, 2, 2)); // Lower bound for Isosceles
        assertEquals("Scalene", Triangle.triangleType(3, 4, 5)); // Lower bound for Scalene
        assertEquals("Value of a, b, or c is not in the range of permitted values.",
                Triangle.triangleType(200, 200, 400)); // Upper bound for NotATriangle
    }

    @Test
    public void testEquivalencePartitioning() {
        assertEquals("Equilateral", Triangle.triangleType(100, 100, 100)); // Equilateral
        assertEquals("Isosceles", Triangle.triangleType(100, 100, 150)); // Isosceles
        assertEquals("Scalene", Triangle.triangleType(100, 150, 200)); // Scalene
        assertEquals("Value of a, b, or c is not in the range of permitted values.",
                Triangle.triangleType(0, 100, 150)); // Invalid input
    }

    @Test
    public void testErrorGuessing() {
        assertEquals("NotATriangle", Triangle.triangleType(1, 2, 3)); // Sum of two sides less than third side
        assertEquals("NotATriangle", Triangle.triangleType(10, 20, 50)); // Sum of two sides less than third side
    }

    @Test
    public void testBranchCoverage() {
        assertEquals("Equilateral", Triangle.triangleType(10, 10, 10)); // All sides equal
        assertEquals("Isosceles", Triangle.triangleType(10, 10, 15)); // Exactly one pair of sides equal
        assertEquals("Scalene", Triangle.triangleType(10, 15, 20)); // No pair of sides equal
        assertEquals("Value of a, b, or c is not in the range of permitted values.", Triangle.triangleType(0, 10, 15)); // Invalid
                                                                                                                        // input
    }
}
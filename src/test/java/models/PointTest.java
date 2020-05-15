package models;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void equals_True_SameXandY() {
        // Arrange
        Point p1 = new Point(1,2);
        Point p2 = new Point(1,2);
        // Act
        boolean result = p1.equals(p2);
        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void equals_False_DifferentXandY() {
        // Arrange
        Point p1 = new Point(1,2);
        Point p2 = new Point(1,3);
        // Act
        boolean result = p1.equals(p2);
        // Assert
        Assert.assertFalse(result);
    }
}

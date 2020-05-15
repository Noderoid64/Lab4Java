package services;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SequenceServiceTest {

    private SequenceService sequenceService;

    @Before
    public void setup () {
        sequenceService = new SequenceService();
    }

    @Test
    public void act_0_EmptyArray() {
        // Arrange
        int [] inputArray = new int[] {};
        int restriction = 12;
        // Act
        int result = sequenceService.act(inputArray, restriction);
        // Assert
        Assert.assertNotNull(result);
        Assert.assertTrue(result == 0);
    }

    @Test
    public void act_13_ForTheCase() {
        // Arrange
        int [] inputArray = new int[] {3,4,5,8,9};
        int restriction = 13;
        // Act
        int result = sequenceService.act(inputArray, restriction);
        // Assert
        Assert.assertNotNull(result);
        Assert.assertTrue(result == 13);
    }

    @Test
    public void getMax_3_2and3() {
        // Arrange
        int a = 2;
        int b = 3;
        // Act
        int result = sequenceService.getMax(a,b);
        // Assert
        Assert.assertNotNull(result);
        Assert.assertTrue(result == 3);
    }
}

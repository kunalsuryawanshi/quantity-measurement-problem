package com.quantitymesurement;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuantityMeasurementTest {
    QuantityMeasurement quantityMeasurement = new QuantityMeasurement();

    // Given Two feet when not Equal Should return False
    @Test
    public void givenTwoFeet_WhenNotEqual_ShouldReturnFalse() {
        boolean res = quantityMeasurement.compareLengths(0.0,16.0);
        Assertions.assertFalse(res);
    }

    // Given Two feet when Equal Should return True
    @Test
    public void givenTwoFeet_WhenNotEqual_ShouldReturnTrue() {
        boolean res = quantityMeasurement.compareLengths(0.0,0.0);
        Assertions.assertTrue(res);
    }
    /*
     * 1: Null Check
     * Given feet When null should return True
     */
    @Test
    public void givenFeet_WhenNull_ShouldReturnTrue() {
        boolean res = quantityMeasurement.nullCheck(null,null);
        Assertions.assertTrue(res);
    }
    @Test
    public void givenOneFeet_WhenNull_ShouldReturnTrue() {
        boolean res = quantityMeasurement.nullCheck(null,2.0);
        Assertions.assertTrue(res);
    }
    @Test
    public void givenFeet_WhenNotNull_ShouldReturnFalse() {
        boolean res = quantityMeasurement.nullCheck(5.0,5.0);
        Assertions.assertFalse(res);
    }
    /*
     * 3: Type Check
     * Given Feet When Different Data Type Should Return False
     */
    @Test
    public void givenFeet_WhenIntegerType_ShouldReturnFalse() {
        boolean res = quantityMeasurement.compareDataType(1, 1.0);
        Assertions.assertFalse(res);
    }
    @Test
    public void givenFeet_WhenStringType_ShouldReturnFalse() {
        boolean res = quantityMeasurement.compareDataType("9", 1.0);
        Assertions.assertFalse(res);
    }
    @Test
    public void givenFeet_WhenDoubleType_ShouldReturnTrue() {
        boolean res = quantityMeasurement.compareDataType(1.0, 10.0);
        Assertions.assertTrue(res);
    }
    /*
     * 4: Value Check for equality
     * Given Feet When Not Equal Should Return False
     */
    @Test
    public void givenFeet_WhenNotEqual_ShouldReturnFalse() {
        double feet1 =quantityMeasurement.compareLengths(1.0);
        double feet2 =quantityMeasurement.compareLengths(9.0);
        Assertions.assertNotEquals(feet1,feet2);
    }
    /* Given Feet When Equal Should Return True */
    @Test
    public void givenFeet_WhenEqual_ShouldReturnTrue() {
        double feet1 =quantityMeasurement.compareLengths(9.0);
        double feet2 =quantityMeasurement.compareLengths(9.0);
        Assertions.assertEquals(feet1,feet2);
    }
    /*
     * TC 1.7-1.12 : Performing similar test for Inch
     * 1: Null Check
     */
    @Test
    public void givenInch_WhenNotNull_ShouldReturnFalse() {
        boolean res = quantityMeasurement.nullCheck(36.0,36.0);
        Assertions.assertFalse(res);
    }
    /* Given Inch When Null Should Return True */
    @Test
    public void givenInch_WhenNull_ShouldReturnTrue() {
        boolean res = quantityMeasurement.nullCheck(null,null);
        Assertions.assertTrue(res);
    }
    /* Given Single Inch Value When Null Should Return True */
    @Test
    public void givenSingleInch_WhenNull_ShouldReturnTrue() {
        boolean res = quantityMeasurement.nullCheck(null,12.0);
        Assertions.assertTrue(res);
    }
}
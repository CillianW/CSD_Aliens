package com.company;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class RaygunTest {

    //test method names follow the format "methodName_Condition_ExpectedResult"

    @Test
    //public void testFireAt();
    public void fireAt_ChargeFullAlienDodging_cChrgEquals9AlienHealthEquals10() {
        //Arrange
        Raygun myRaygun = new Raygun(10,10);
        Alien testAlien = new Alien(true, 10);

        int expectedCharge = 9;
        int actualCharge;
        int expectedAlienHealth = 10;
        int actualAlienHealth;

        //Act
        myRaygun.fireAt(testAlien);

        actualCharge = myRaygun.getcChrg();
        actualAlienHealth = testAlien.getAlienHealth();

        //Assert
        Assert.assertEquals(actualCharge, expectedCharge);
        Assert.assertEquals(actualAlienHealth, expectedAlienHealth);
    }

    @Test
    //public void testFireAt();
    public void fireAt_ChargeFullAlienNotDodging_cChrgEquals9AlienHealthEquals10() {
        //Arrange
        Raygun myRaygun = new Raygun(10,10);
        Alien testAlien = new Alien(false, 10);

        int expectedCharge = 9;
        int actualCharge;
        int expectedAlienHealth = 9;
        int actualAlienHealth;

        //Act
        myRaygun.fireAt(testAlien);

        actualCharge = myRaygun.getcChrg();
        actualAlienHealth = testAlien.getAlienHealth();

        //Assert
        Assert.assertEquals(actualCharge, expectedCharge);
        Assert.assertEquals(actualAlienHealth, expectedAlienHealth);
    }

    @Test
    //public void testRecharge()
    public void recharge_CurrentChargeEquals1_1() {
        //Arrange
        Raygun myRaygun = new Raygun(10,1);

        int expectedCharge = 2;
        int actualCharge;

        //Act
        myRaygun.recharge();
        actualCharge = myRaygun.getcChrg();

        //Assert
        Assert.assertEquals(actualCharge, expectedCharge);
    }

    @Test
    //public void testRecharge()
    public void recharge_CurrentChargeFull_10() {
        //Arrange
        Raygun myRaygun = new Raygun(10,10);

        int expectedCharge = 10;
        int actualCharge;

        //Act
        myRaygun.recharge();
        actualCharge = myRaygun.getcChrg();

        //Assert
        Assert.assertEquals(actualCharge, expectedCharge);
    }

    @Test
    //public void testIsCharged()
    public void isCharged_RaygunIsCharged_True() {
        //Arrange
        Raygun myRaygun = new Raygun(10,5);

        boolean expectedResult = true;
        boolean actualResult;

        //Act
        actualResult = myRaygun.isCharged();

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    //public void testIsCharged()
    public void isCharged_RaygunIsNotCharged_False() {
        //Arrange
        Raygun myRaygun = new Raygun(10,0);

        boolean expectedResult = false;
        boolean actualResult;

        //Act
        actualResult = myRaygun.isCharged();

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    //public void testIsFullyCharged()
    public void isFullyCharged_RaygunIsFullyCharged_True() {
        //Arrange
        Raygun myRaygun = new Raygun(10, 10);

        boolean expectedResult = true;
        boolean actualResult;

        //Act
        actualResult = myRaygun.isFullyCharged();

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    //public void testIsFullyCharged()
    public void isFullyCharged_RaygunIsNotFullyCharged_False() {
        //Arrange
        Raygun myRaygun = new Raygun(10, 9);

        boolean expectedResult = false;
        boolean actualResult;

        //Act
        actualResult = myRaygun.isFullyCharged();

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }
}
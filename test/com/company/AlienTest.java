package com.company;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

//Cillians Alien Test

public class AlienTest {

    //test method names follow the format "methodName_Condition_ExpectedResult"

    @Test
    //public void testIsDead();
    public void isDead_HealthAboveZero_False() {
        //Arrange
        Alien testAlien = new Alien(true, 10);

        boolean expectedResult = false;
        boolean actualResult;

        //Act
        actualResult = testAlien.isDead();

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    //public void testIsDead();
    public void isDead_HealthEqualsZero_True() {
        //Arrange
        Alien testAlien = new Alien(false, 0);

        boolean expectedResult = true;
        boolean actualResult;

        //Act
        actualResult = testAlien.isDead();

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    //public void testSetDead();
    public void setDead_HealthAboveZero_False() {
        //Arrange
        Alien testAlien = new Alien(true, 10);

        boolean expectedResult = true;
        boolean actualResult;

        //Act
        testAlien.setDead(true);
        actualResult = testAlien.isDead();

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    //public void testSetDead();
    public void setDead_HealthEqualsZero_True() {
        //Arrange
        Alien testAlien = new Alien(true, 10);

        boolean expectedResult = true;
        boolean actualResult;

        //Act
        testAlien.setDead(true);
        actualResult = testAlien.isDead();

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    //public void testIsDodging();
    public void isDodging_AlienIsDodging_true() {
        //Arrange
        Alien testAlien = new Alien(true, 10);

        boolean expectedResult = true;
        boolean actualResult;

        //Act
        actualResult = testAlien.isDodging();

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    //public void testIsDodging();
    public void isDodging_AlienIsNotDodging_false() {
        //Arrange
        Alien testAlien = new Alien(false, 0);

        boolean expectedResult = false;
        boolean actualResult;

        //Act
        actualResult = testAlien.isDodging();

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    //public void testGetAlienHealth();
    public void getAlienHealth_AlienHealthEquals5_5() {
        //Arrange
        Alien testAlien = new Alien(true, 5);

        int expectedResult = 5;
        int actualResult;

        //Act
        actualResult = testAlien.getAlienHealth();

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    //public void testSetAlienHealth();
    public void setAlienHealth_AlienHealthEquals7_7() {
        //Arrange
        Alien testAlien = new Alien(true, 10);

        int expectedResult = 7;
        int actualResult;

        //Act
        testAlien.setAlienHealth(7);
        actualResult = testAlien.getAlienHealth();

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    //public void testDodge();
    public void dodge_AlienIsDodging_True() {
        //Arrange
        Alien testAlien = new Alien(true, 10);

        boolean expectedResult = true;
        boolean actualResult;

        //Act
        testAlien.dodge();
        actualResult = testAlien.isDodging();

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    //public void testHit()
    public void hit_AlienIsHitWithInitialHealthOf10_9() {
        //Arrange
        Alien testAlien = new Alien(true, 10);

        int expectedResult = 9;
        int actualResult;

        //Act
        testAlien.hit();
        actualResult = testAlien.getAlienHealth();

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    //public void testMiss();
    public void miss_AlienIsMissed_DodgingIsFalse() {
        //Arrange
        Alien testAlien = new Alien(true, 10);

        boolean expectedResult = false;
        boolean actualResult;

        //Act
        testAlien.miss();
        actualResult = testAlien.isDodging();

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }
}
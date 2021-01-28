package com.company;
import org.testng.Assert;
import org.testng.annotations.Test;
/**
 * Test suite for the Raygun class .
 * Author: Rosangela Kelwattes
 * Date: 25/01/2021
 */
public class TestRaygun {

    @Test
    public void testFireAtHit() {

        //given
        Raygun raygun = new Raygun(10,10);
        Alien alien = new Alien(false, 1);
        int ExpectedAlienHealth = 0;
        int ActualAlienHealth;

        //when
        raygun.fireAt(alien);
        ActualAlienHealth =  alien.getAlienHealth();

        //then
        Assert.assertEquals(ActualAlienHealth, ExpectedAlienHealth );
    }

    @Test
    public void testFireAtMiss(){

        //given
        Raygun raygun = new Raygun(10,10);
        Alien testAlien = new Alien(true, 1);

        int ExpectedAlienHealth = 1;
        int ActualAlienHealth;

        //when
        raygun.fireAt(testAlien);
        ActualAlienHealth =  testAlien.getAlienHealth();

        //then
        Assert.assertEquals(ActualAlienHealth, ExpectedAlienHealth);
    }

    @Test
    public void testIsChargedTrue() {

        //given
        Raygun raygun = new Raygun(10,5);
        boolean ExpectedResult = true;
        boolean ActualResult;

        //when
        ActualResult= raygun.isCharged();

        //then
        Assert.assertEquals(ActualResult, ExpectedResult);
    }

    @Test
    public void testIsChargedFalse() {

        //given
        Raygun raygun = new Raygun(10,0);
        boolean ExpectedResult = false;
        boolean ActualResult;

        //when
        ActualResult= raygun.isCharged();

        //then
        Assert.assertEquals(ActualResult, ExpectedResult);
    }

    @Test
    public void isFullyChargedTrue(){

        //given
        Raygun raygun = new Raygun(10,  10);
        boolean ExpectedResult = true;
        boolean ActualResult;

        //when
        ActualResult = raygun.isCharged();

        //then
        Assert.assertEquals(ActualResult, ExpectedResult);
    }

    @Test
    public void testFullyChargedFalse(){

        //given
        Raygun raygun = new Raygun(10,0);
        boolean ExpectedResult = false;
        boolean ActualResult;

        //when
        ActualResult = raygun.isCharged();

        //then
        Assert.assertEquals(ActualResult, ExpectedResult);
    }

    @Test
    public void testRecharge1() {
        //given
        Raygun myRaygun = new Raygun(10,1);

        int expectedCharge = 2;
        int actualCharge;

        //when
        myRaygun.recharge();
        actualCharge = myRaygun.getCurrentCharge();

        //then
        Assert.assertEquals(actualCharge, expectedCharge);
    }

    @Test
    void teardown()
    {
        System.out.println("Rest");
    }

}

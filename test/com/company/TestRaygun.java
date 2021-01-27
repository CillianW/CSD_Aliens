package com.company;
import com.company.Alien;
import com.company.Raygun;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * testFireAtHit() The gun should only fire if it is charged.
 * Firing the gun will reduce the charge by 1.
 * If the bug isDodging bug.miss() should be called, otherwise bug.hit */
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
        actualCharge = myRaygun.getcChrg();

        //then
        Assert.assertEquals(actualCharge, expectedCharge);
    }

    @Test
    void teardown()
    {
        System.out.println("Rest");
    }

}
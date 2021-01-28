package com.company;

/**
 * Description: The class implements an Alien for a game.
 * The health of the alien object determines if the alien is alive and or dodging.
 * If the health attribute is 0 then the alien attribute 'dead' MUST be true.
 * The alien cannot be dodging if they are dead.
 * Likewise, the alien cannot be dead if they health value is >0.
 * Author: Dr. Shane Wilson
 * Date: 21/01/2021
 * Version information: 1.0
 */
public class Alien {

    private boolean dead;
    private boolean dodging;
    private int alienHealth;

    /**
     * Construct the Alien object and initialise the data members appropriately.
     *
     * @param dodging
     * @param alienHealth
     */
    public Alien(boolean dodging, int alienHealth) {
        this.dodging = dodging;
        this.alienHealth = alienHealth;
        if(alienHealth == 0) {
            this.setDead(true);
        }
    }

    /**
     * @param dead
     */

    public void setDead(boolean dead) {
        this.dead = dead;
    }

    /**
     * @param dodging
     */
    public void setDodging(boolean dodging) {
        this.dodging = dodging;
    }

    /**
     * @param alienHealth
     */
    public void setAlienHealth(int alienHealth) {
        this.alienHealth = alienHealth;
    }

    /**
     * @return true If the health attribute is 0.
     */
    public boolean isDead() {
        //removed these if statements and implemented one if statement in hit()
//        if (alienHealth < 0) {
//            dead = true;
//        }
//        if (alienHealth > 0) {
//            dead = false;
//        }
        return dead;
    }

    /**
     * @return false if alien is dead
     */
    public boolean isDodging() {
        return dodging;
    }

    /**
     * @return int alienHealth
     */
    public int getAlienHealth() {
        return alienHealth;
    }

    /**
     * Set dodging to true if the alien is alive
     */
    public void dodge() {
        if (!isDead()) dodging = true;
    }

    /**
     * Reduces the alien health by 1.
     * Minimum Alien health should 0
     */
    public void hit() {
        if (alienHealth > 0) {
            this.alienHealth--;
        }

        //if statements implemented here instead of in isDead()
        if (alienHealth ==0){
            this.setDead(true);
        }
    }

    /**
     * Set dodging to false
     */
    public void miss() {
        dodging = false;
    }

}

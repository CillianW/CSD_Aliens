/*
 * Classname: Alien.java
 *
 * Version information: 1.0
 *
 * Date: 21/01/2021
 *
 * Description: The class implements an Alien for a game. The health of the alien object determines if the alien is
 * alive and or dodging. If the health attribute is 0 then the alien attribute 'dead' MUST be true. The alien cannot be
 * dodging if they are dead. Likewise, the alien cannot be dead if they health value is >0.
 * Author: Dr. Shane Wilson
 *
 */

//Cillian's Alien Class

package com.company;

public class Alien {
    //Data members
    private boolean dead;
    private boolean dodging;
    private int alienHealth;

    //Class constructors
    public Alien(boolean dodging, int alienHealth) {
        this.dodging = dodging;
        this.alienHealth = alienHealth;
        dead = (alienHealth > 0) ? false:true;
    }

    // Methods
    //check if alien is dead
    public boolean isDead() {
        return dead;
    }

    //if alienHealth reaches, alien is dead
    public void setDead(boolean dead) {
        this.dead = dead;
    }

    //check if alien is dodging
    public boolean isDodging() {
        return dodging;
    }

    //check alien health
    public int getAlienHealth() {
        return alienHealth;
    }

    //set alien health
    public void setAlienHealth(int alienHealth) {
        this.alienHealth = alienHealth;

        if(alienHealth < 1){
            this.dead = true;
        }
    }

    //if alien is dead, alien is not dodging. otherwise, alien is dodging
    public void dodge() {
        dodging = (dead) ? false:true;
    }

    public void hit() {
        alienHealth = (alienHealth > 0) ? alienHealth-1 : 0;

        if(alienHealth == 0){
            setDead(true);
        }
    }

    public void miss() {
        this.dodging = false;
    }

}

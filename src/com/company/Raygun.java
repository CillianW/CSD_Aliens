/*
 * Classname: Raygun.java
 *
 * Version information: 1.0
 *
 * Date: 21/01/2021
 *
 * Description: The class implements a ray gun for a game
 *
 * Author: Dr. Shane Wilson
 *
 */

//Cillian's Raygun Class

package com.company;

public class Raygun {
    //Data members
    private int maxCharge; //The maximum charge the Raygun can hold
    private int currentCharge; //The current level of charge the Raygun has

    //Class constructors
    public Raygun(int maxCharge, int currentCharge) {
        this.maxCharge = maxCharge;
        this.currentCharge = currentCharge;
    }

    /* only fire if raygun has a charge
    if alien is dodging, call Alien.miss()
    if alien is not dodging, call Alien.hit()
    reduce charge by 1 if raygun has fired */
    public void fireAt(Alien a) {
      if (isCharged()) {
            if (a.isDodging()) {
                a.miss();
            } else {
                a.hit();
            }
            
             this.currentCharge--;
        }else{
            this.currentCharge = 0;
        }
    }

    /*increase charge by 1
    do not exceed max charge*/
    public void recharge() {
        this.currentCharge = (getCurrentCharge() < getMaxCharge()) ? this.currentCharge +1 : this.maxCharge;
    }

    // return true if charge > 0
    public boolean isCharged() {
        if(currentCharge > 0) return true;

        return false;
    }

    // return true if current charge = max charge
    public boolean isFullyCharged() {
        if(currentCharge == maxCharge) return true;

        return false;
    }

    // return max charge
    public int getMaxCharge() {
        return maxCharge;
    }

    //set mChrg
    public void setMaxCharge(int maxCharge) {
        this.maxCharge = maxCharge;
    }

    // return current charge
    public int getCurrentCharge() {
        return currentCharge;
    }

}

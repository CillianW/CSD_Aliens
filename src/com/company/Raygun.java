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

package com.company;

public class Raygun {
    //Data members
    private int mChrg; //The maximum charge the Raygun can hold
    private int cChrg; //The current level of charge the Raygun has

    //Class constructors
    public Raygun(int mChrg, int cChrg) {
        this.mChrg = mChrg;
        this.cChrg = cChrg;
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
            
             this.cChrg--;
        }else{
            this.cChrg = 0;
        }
    }

    /*increase charge by 1
    do not exceed max charge*/
    public void recharge() {
        this.cChrg = (getcChrg() < getmChrg()) ? this.cChrg+1 : this.mChrg;
    }

    // return true if charge > 0
    public boolean isCharged() {
        if(getcChrg() > 0){
            return true;
        }else{
            return false;
        }
    }

    // return true if current charge = max charge
    public boolean isFullyCharged() {
        if(cChrg == mChrg){
            return true;
        }else{
            return false;
        }
    }

    // return max charge
    public int getmChrg() {
        return mChrg;
    }

    //set mChrg
    public void setmChrg(int mChrg) {
        this.mChrg = mChrg;
    }

    // return current charge
    public int getcChrg() {
        return cChrg;
    }

}

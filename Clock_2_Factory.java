/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

public class Clock_2_Factory implements TimeFactory{
    
    @Override
    public IClock CreateClock(){
        return new Clock_2();
    }
}

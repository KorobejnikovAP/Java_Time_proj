/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Саша
 */
public class Model {
    
    ArrayList<IClock> allTime = new ArrayList<>();
   
    ArrayList<IObserver> allO = new ArrayList<>();
    
    Iterator<IClock> getAllTime(){
        return allTime.iterator();
    }
    
    void refrash(){
        for (IObserver iObserver : allO){
            iObserver.refrash();
        }
    }
   
    
    void addTime1(){
        IClock t = new Clock_1();
        allTime.add(t);
        refrash();
    }
    
    void addTime2(){
        IClock t = new Clock_2();
        allTime.add(t);
        refrash();
    }
    
    void addObserver(IObserver o){
        allO.add(o);
    }
    

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class WatchStore implements Store{
       ArrayList<IClock> time ;  
       
       WatchStore(){
           time = new ArrayList<>();
       }
       
       @Override
       public void getTime(IClock t){
           time.add(t);
       }
       
       @Override
       public void getInfo(){
           if (time.size() == 0)
               System.err.println("Магазин пуст");
           else{
             Comparator<IClock> comp = new Comparator<IClock>() {
                 @Override
                 public int compare(IClock o1, IClock o2) {
                     return o1.GetPrice() > o2.GetPrice() ? 1:-1;
                 }
             };
             
             IClock t = Collections.max(time, comp);
             System.out.println(t.GetName());
             System.out.println(t.GetPrice());
           }   
       }
       
       @Override
       public void setTime(String _s){
          for (IClock t : time){
              t.SetStartTime(_s);
          }
       }
       
       @Override 
       public String getPopName(){
           HashMap<String, Integer> map = new HashMap<>();
           for (IClock t : time){
               if (map.containsKey(t.GetName()))
                   map.put(t.GetName(), map.get(t.GetName())+1);
               else
                   map.put(t.GetName(), 1);
           }
           int max = 0;
           for (Integer m : map.values())
               if (m > max)
                   max = m;
           for (String m : map.keySet())
               if (map.get(m) == max)
                   return m;
           return "Магазин пуст";
        }
}

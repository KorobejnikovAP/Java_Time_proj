/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

//import javax.swing.JFrame;
        
public class Main {

    public static void main(String[] args) throws timeException {
        IClock t1 = new Clock_1(12, 34, "sitizen", 10000);
        IClock t2 = new Clock_1(12, 34, "sitizen", 15000);
        IClock t3 = new Clock_1(12, 34, "sitizen", 17000);
        IClock t4 = new Clock_2(12, 34, 50, "Rolex", 20000);
        IClock t5 = new Clock_2(11, 14, 50, "Rolex", 70000);
        
        //t5.ChangeTime(-10, 10, 10);
        
        Store store = new WatchStore();
        store.getTime(t1);
        store.getTime(t2);
        store.getTime(t3);
        store.getTime(t4);
        store.getTime(t5);
        
        store.getInfo();
        store.setTime("10:12:12");
        System.out.println(store.getPopName());
        
        
    }
}

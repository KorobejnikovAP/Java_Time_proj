/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;


public class Clock_2 implements IClock{
    int hou, min, sec, price ;
    String name ;
    
    public Clock_2(){
        hou = 0;
        min = 0;
        sec = 0;
        name = "";
        price = 0;
    }
    public Clock_2(int _hou, int _min, int _sec, String _name, int _price){
        hou = _hou;
        min = _min;
        sec = _sec;
        name = _name;
        price = _price;
    }
    public Clock_2(Clock_2 c){
        this(c.hou, c.min, c.sec, c.name, c.price);
    }
    
    @Override
    public String GetName(){
        return name;
    }
    
    @Override
    public int GetPrice(){
        return price;
    }
    
    @Override    
    public void SetStartTime(String _s){
        
        hou = Integer.parseInt(String.valueOf( _s.charAt(0)))*10 + Integer.parseInt(String.valueOf( _s.charAt(1)));
        min = Integer.parseInt(String.valueOf( _s.charAt(3)))*10 + Integer.parseInt(String.valueOf( _s.charAt(4)));
        sec = Integer.parseInt(String.valueOf( _s.charAt(6)))*10 + Integer.parseInt(String.valueOf( _s.charAt(7)));
    }
    
    @Override
    public void ChangeTime(int _hou, int _min, int _sec) throws timeException{
        if ((_hou < 0)||(_min < 0)||(_sec < 0)) throw new timeException(1, "Error");
        hou += _hou;
        min += _min;
        sec += _sec;
    }   

    @Override
    public void SetName(String _s) {
        name = _s;
    }
    
    @Override
    public void SetPrice(int _p) {
        price = _p;
    }
    
    @Override
    public String GetStartTime() {
        return (String.valueOf(hou)+":"+String.valueOf(min)+":"+String.valueOf(sec));
    }
}

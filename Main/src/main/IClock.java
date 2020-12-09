/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

public interface IClock {
    String GetName();
    void SetName(String _s);
    int GetPrice();
    void SetPrice(int _p);
    String GetStartTime ();
    void SetStartTime (String _s);
    void ChangeTime (int _hou, int _min, int _sec)throws timeException;
    
}

    
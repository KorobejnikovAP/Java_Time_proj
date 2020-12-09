/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

public class timeException extends Exception{
    private int i = 0;
    public timeException(int i, String message) {
       super(message);
       this.i = i;
    }
    @Override
    public String toString() {
        return "timeException{" + "i=" + i + "}:" + this.getMessage();
    } 
}

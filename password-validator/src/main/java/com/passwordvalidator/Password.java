/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.passwordvalidator;

/**
 *
 * @author gdeignacio
 */
public class Password {
    
    public String pwd;
    
    public Password(String pwd){
        this.pwd = pwd;
    }
    
   @Override
   public String toString() {
        return this.pwd;
    }
    
}

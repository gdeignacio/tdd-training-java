package com.passwordvalidator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gdeignacio
 */
class PasswordValidator {

    boolean valida(Password password) {
        
        if (password==null) return false;
        
        if (password.pwd == null || password.pwd.length()<9) return false;
        
        if (password.pwd.equals(password.pwd.toLowerCase())) return false;
        
        if (!password.pwd.contains("_")) return false;
        
        boolean hasDigit = false;
        
        for (char c: password.pwd.toCharArray()) {
            if (Character.isDigit(c)){
                hasDigit = true;
                break;
            };
        }
        
        if (!hasDigit) return false;
        
        return true;
        
    }
    
    
    
}

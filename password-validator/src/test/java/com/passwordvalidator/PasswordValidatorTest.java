package com.passwordvalidator;


import static org.junit.Assert.*;

import org.junit.Test;

public class PasswordValidatorTest {

	@Test
	public void renameMe() {
		assertTrue(true);
	}
        
        
        @Test
	public void shouldBeOk() {
            
            Password password = new Password("Abcdefghijk_1");
            PasswordValidator pv = new PasswordValidator();
		
            assertTrue(pv.valida(password));
	}
        
        @Test
	public void shouldBeNotNull() {
            
            Password password = null;
            PasswordValidator pv = new PasswordValidator();
		
            assertFalse(pv.valida(password));
	}
        
        @Test
	public void shouldBeStringNotNull() {
            
            Password password = new Password(null);
            PasswordValidator pv = new PasswordValidator();
		
            assertFalse(pv.valida(password));
	}
        
        @Test
	public void shouldBeLongerThan8() {
            
            Password password = new Password("Abcdef_1");
            PasswordValidator pv = new PasswordValidator();
		
            assertFalse(pv.valida(password));
	}
        
        
        @Test
	public void shouldHaveCapitalLetter() {
            
            Password password = new Password("abcdefg_1");
            PasswordValidator pv = new PasswordValidator();
		
            assertFalse(pv.valida(password));
	}
        
        
        @Test
	public void shouldHaveUndesrscore() {
            
            Password password = new Password("Abcdefgh1");
            PasswordValidator pv = new PasswordValidator();
		
            assertFalse(pv.valida(password));
	}
        
        
        @Test
	public void shouldHaveANumber() {
            
            Password password = new Password("Abcdefg_a");
            PasswordValidator pv = new PasswordValidator();
		
            assertFalse(pv.valida(password));
	}
        
        
        
}

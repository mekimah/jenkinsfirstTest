/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.monprojetmavenavecjenkinsa18;

/**
 *
 * @author HP
 */
public class Tritype {
    
    public String generer(int nombre) {
		if(nombre%15 == 0) {
			return "fizzbuzz";
		}
		if(nombre % 3 == 0 ) {
			return "fizz";
		}
		if(nombre % 5 == 0) {
			return "buzz";
		}
		return String.valueOf(nombre);
		}
}

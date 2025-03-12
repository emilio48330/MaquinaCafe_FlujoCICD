/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ariel Guzman
 */
public class TestAzuquero {
    Azucarero azuquero;
    
    public void setUp(){
    azuquero = new Azucarero(10);
    }
    
    public void deberiadevolverVerdaderoSiHaySuficienteAzucarEnElAzuquero(){
     boolean resultado = azuquero.hasAzucar(5);
     assertEquals = (true, resultado);
     resultado = azuquero.hasAzucar(10);
     asserEquals(true, resultado);
    }
    
     public void deberiadevolverFalsoPorqueNoHaySuficienteAzucarEnElAzuquero(){
     
     boolean resultado = azuquero.hasAzucar(15);
     asserEquals(false, resultado);
    }
     
     
     public void deberiaRestarAzucarAlAzuquero(){
     
         azuquero.giveAzucar(5);
         asserEquals(5, azuquero.getCantidadAzucar());
         azuquero.giveAzucar(2);
     asserEquals(3, azuquero.getCantidadAzucar());
    }
     
    
}

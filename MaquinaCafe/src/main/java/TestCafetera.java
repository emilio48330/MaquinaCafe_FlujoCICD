/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ariel Guzman
 */
public class TestCafetera {
    public void deberiaDevolverVerdaderoSiExisteCafe()){
        Cafetera cafetera = new Cafetera(10);
        
        boolean resultado = cafetera.hasCafe(5);
        assertEquals(true,resultado);
        
    }
    
    public void deberiaDevolverFalsoSiNoExisteCafe()){
        Cafetera cafetera = new Cafetera(10);
        
        boolean resultado = cafetera.hasCafe(11);
        assertEquals(false,resultado);
        
    }
    
     public void deberiaRestarcafeAlaCafetera()){
        Cafetera cafetera = new Cafetera(10);
        
        cafetera.giveCafe(7);
        assertEquals(3,cafetera.getCantidadCafe());
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ariel Guzman
 */


public class TestVaso {
    public void deberiaDevolverVerdaderoSiExistenVasos(){
        Vaso vasosPequenos = new Vaso(2,10);
        
        boolean resultado = vasosPequeños.hasVasos(1);
        assertEquals(true,resultado);
        
    }
    
    public void deberiaDevolverFalsoSiNoExistenVasos(){
        Vaso vasosPequenos = new Vaso(1,10);
        
        boolean resultado = vasosPequeños.hasVasos(2);
        assertEquals(false,resultado);
        
    }
    
    public void deberiaRestarCantidadDeVaso(){
        Vaso vasosPequenos = new Vaso(5,10);
        
        vasosPequenos.giveVasos(1);
        assertEquals(4,vasosPequenos.getCantidadVasos());
        
    }
    
    
    
    
    
}

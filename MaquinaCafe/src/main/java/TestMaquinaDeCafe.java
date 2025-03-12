/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ariel Guzman
 */
public class TestMaquinaDeCafe {
    Cafetera cafetera;
    Vaso vasosPequeno;
    Vaso vasosGrande;
    Vaso vasosMediano;
    Azucarero azucarero;
    MaquinaDeCafe maquinaDeCafe;
    
    public void setUp(){
    cafetera = new Cafetera(50);
    vasosPequeno = new Vaso(5,10);
    vasosMediano = new Vaso (5,20);
    vasosGrande = new Vaso (5,30);
    azucarero = new Azucarero(20);
    
    maquinaDeCafe=new MaquinaDeCafe();
    maquinaDeCafe.setCafetera(cafetera);
    maquinaDeCafe.setVasosPequeno(vasosPequeno);
    maquinaDeCafe.setVasosMediano(vasosMediano;
    maquinaDeCafe.setVasosGrande(vasosGrande);
    maquinaDeCafe.setAzucarero(azucarero);
    }
    
    public void deberiaDevolverUnVasoPequeno(){
    Vaso vaso = maquinaDeCafe.getTipoDeVaso("pequeño");
    assertEquals(MaquinaDeCafe.vasosPequeno, vaso);
    }
    
    
}

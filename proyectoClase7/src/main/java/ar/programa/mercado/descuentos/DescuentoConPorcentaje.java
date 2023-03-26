/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.programa.mercado.descuentos;

import ar.programa.mercado.Producto;



/**
 *
 * @author pbarzaghi
 */
public class DescuentoConPorcentaje extends DescuentoImpl {
    
    
    
   // Guardo el porcentaje por el que tengo que multuplicar el valor del porducto
   //  ejemplo Valor Producto 100. y deseo sacar el 10 % entonces estoy guargardo
   //         0,90 para despues multiplicar 100 * 0,90 = 90 
   // Descontando asi el 10%
    
    public void setDescuento(Producto producto,double porcentaje){
        
        Double descontar = (100- porcentaje) /100.0;
       
        super.setDescuento(producto,descontar);                
                
  
    }
   
      
  
    
}

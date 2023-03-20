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
public class DescuentoConPorcentajeTope extends DescuentoImpl  {

   private double topePorcentaje;
   

  
  
   public void setDescuento(Producto producto,Double valorPorc){
    
       double valorTope=0.0;
        
        if(valorPorc > topePorcentaje)
            valorTope= (100-topePorcentaje)/100;
            
        else
              valorTope= (100-valorPorc)/100;
   
    super.setDescuento(producto, valorTope);
   }
   
   public void setValorDesc(Double valorDesc){
   
      this.topePorcentaje=valorDesc;
   }
   
   
    
}

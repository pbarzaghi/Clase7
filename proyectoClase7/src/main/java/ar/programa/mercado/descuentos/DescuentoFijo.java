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
public class DescuentoFijo extends DescuentoImpl{

  private Double montoFijo;

   public void setValorDesc(double valorDesc){
     
       this.montoFijo=valorDesc;
   
   }
    
     public void setDescuento(Producto producto,Double montoFijo){
       
        super.setDescuento(producto,montoFijo);                
                
  
    }
    
      public  Double getDescuento(Producto producto){
    
          Double  desc=super. getDescuento(producto);
           System.out.println(" resultado de getDescuento "+ ( producto.getPrecio()-desc));
       return producto.getPrecio()-desc;
   
    
    }
   
   
  
    
}

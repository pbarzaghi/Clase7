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

 // private double montoFijo;

 
    
     public void setDescuentoXProd(Producto producto,double montoFijo){
       
        super.setDescuento(producto,montoFijo);                
                
  
    }
    
      public  double getDescuentoXProducto(Producto producto){
    
          //double  desc=super. getDescuento(producto);
          // System.out.println(" resultado de getDescuento "+ ( producto.getPrecio()-desc));
          
       return producto.getPrecio()-getValorDescuento();
   
    
    }
   
   
  
    
}

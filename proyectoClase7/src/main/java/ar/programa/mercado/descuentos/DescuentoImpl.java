/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.programa.mercado.descuentos;

import ar.programa.mercado.Producto;


import java.util.HashMap;

/**
 *
 * @author pbarzaghi
 */


public class DescuentoImpl implements Descuento {

  private static  HashMap tablaDesc;
  private double valorDesc;
    
    
    
     public void setDescuento(Producto producto,double valor){
    
        if (tablaDesc == null){
            tablaDesc =new HashMap();
            tablaDesc.put(producto, valor);
        }else if( tablaDesc.containsKey(producto))
            tablaDesc.replace(producto,producto);
        else
            tablaDesc.put(producto, valor);                
                
  
    }
     
     public void setValorDesc(double valorDesc){
        this.valorDesc=valorDesc;
     
     }
    
   


    /*
      Metodo getDescuento retorna el valor que es un float en caso de existir
      Caso que no exista el producto retorna 1.
     
    */

    public  double getDescuento(Producto producto){
    
         if(tablaDesc !=null)     
         if( tablaDesc.containsKey(producto))
           return ( (Double) tablaDesc.get(producto));
       
       return 1.0;
   
    
    }
}

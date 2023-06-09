/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.programa.mercado;

import ar.programa.mercado.descuentos.Descuento;
import ar.programa.mercado.descuentos.DescuentoConPorcentaje;
import ar.programa.mercado.descuentos.DescuentoConPorcentajeTope;
import ar.programa.mercado.descuentos.DescuentoFijo;

import ar.programa.mercado.descuentos.TipoDescuentoEnum;

/**
 * Esta case es es el Iten de cada producto y la cantidad que lleva
 *  @author pbarzaghi
 */
public class ItemDeCarro {
    private Producto producto;
    private int cantidad;
    private double precioItem;
   
    
    public ItemDeCarro(Producto producto,int cantidad){
      this.producto=producto;
      this.cantidad=cantidad;
    
    }
    
    /*
     Este metodo retorna el valor del producto con su descuento segun su tipo
     enviado por parametro
     Retornando el resultado segun la cantidad por el valor del producto con
     el descuestro realizado
    
     return double
    */
    
    
    public double getPrecioItemConDescuento(TipoDescuentoEnum tipo){
        
      Descuento descuento;
      double resultado= 0.0;
      
       if(TipoDescuentoEnum.FIJO == tipo){
               descuento=new DescuentoFijo();
            //   descuento.setValorDesc(valor);
            //   descuento.setDescuento(producto, valor);
               resultado=producto.getPrecio()-  descuento.getDescuento(producto);
       }
        else if(TipoDescuentoEnum.PORCENTAJE== tipo){ 
               descuento=new DescuentoConPorcentaje();
            //   descuento.setValorDesc(valor);
               resultado=producto.getPrecio() * descuento.getDescuento(producto);
        }else if (TipoDescuentoEnum.TOPE_PORCENTAJE == tipo){
            descuento=new DescuentoConPorcentajeTope();
            //descuento.setValorDesc(valor);
            resultado=producto.getPrecio() * descuento.getDescuento(producto);
        }else
            resultado=producto.getPrecio();
         
   
       return  (cantidad * resultado );
    
    }
    
            
}  
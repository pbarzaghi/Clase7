/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.programa.mercado;

import ar.programa.mercado.descuentos.Descuento;
import ar.programa.mercado.descuentos.TipoDescuentoEnum;
import ar.programa.personal.Persona;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author pbarzaghi
 */
public class Carro {
    private Persona comprador;
   // private ItemDeCarro itemProducto1;
   // private ItemDeCarro itemProducto2;
   // private ItemDeCarro itemProducto3;
    private List<ItemDeCarro> listaItemDeCarrito;
    private TipoDescuentoEnum tipoDescuento;
    private Descuento descuento;
    //private double valorDesc;
  

  
    
    
    
    public Carro(Persona comprador){
         this.comprador=comprador;
      }
    
    public void addItemDeCarrito(ItemDeCarro item){
    
        if(this.listaItemDeCarrito == null)
            listaItemDeCarrito=new ArrayList();
       
       
        listaItemDeCarrito.add(item);
    }
  
   
    /**
     * @return the comprador
     */
    public Persona getComprador() {
        return comprador;
    }

    /**
     * @param comprador the comprador to set
     */
    public void setComprador(Persona comprador) {
        this.comprador = comprador;
    }

   
    
    /*
      Este metodo retorna la suma de todos los item 
    */
      public double getPrecioDelCarro(){
      double sumaItem=0.0;
      
   
      for (ItemDeCarro itemCarro :listaItemDeCarrito ){
          
          sumaItem+=itemCarro.getPrecioXCantidad();
         
      }
     if(sumaItem>0.0)      
       return  descuento.getDescuentoGral(sumaItem);
     else
     return sumaItem;
    }
    
    
    
    
    public double getPrecioCompra(){
      double sumaItem=0.0;
      
   
      for (ItemDeCarro itemCarro :listaItemDeCarrito ){
          
          sumaItem+=itemCarro.getPrecioItemConDescuento(this.tipoDescuento);
          System.out.println(" Suma Item"+sumaItem);
      }
    
     return sumaItem;
    }

    /**
     * @param tipoDescuento the tipoDescuento to set
     */
    public void setTipoDescuento(TipoDescuentoEnum tipoDescuento) {
        this.tipoDescuento = tipoDescuento;
    
         
    }

    /**
     * @return the descuento
     */
    public Descuento getDescuento() {
        return descuento;
    }

    /**
     * @param descuento the descuento to set
     */
    public void setDescuento(Descuento descuento) {
        this.descuento = descuento;
    }
    
    
    
}

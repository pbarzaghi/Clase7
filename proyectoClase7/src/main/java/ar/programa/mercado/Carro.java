/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.programa.mercado;

import ar.programa.mercado.descuentos.TipoDescuentoEnum;
import ar.programa.personal.Persona;

/**
 * 
 * @author pbarzaghi
 */
public class Carro {
    private Persona comprador;
    private ItemDeCarro itemProducto1;
    private ItemDeCarro itemProducto2;
    private ItemDeCarro itemProducto3;
    private TipoDescuentoEnum tipoDescuento;
    //private double valorDesc;

  
    
    
     public Carro(Persona comprador, ItemDeCarro item1, ItemDeCarro item2,
             ItemDeCarro item3){
         this.comprador=comprador;
       this.itemProducto1=item1;
       this.itemProducto2=item2;
       this.itemProducto3=item3;
      // this.valorDesc=0.0;
     //  this.tipoDescuento=TipoDescuentoEnum.NINGUNO;
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

    /**
     * @return the itemProducto1
     */
    public ItemDeCarro getItemProducto1() {
        return itemProducto1;
    }

    /**
     * @param itemProducto1 the itemProducto1 to set
     */
    public void setItemProducto1(ItemDeCarro itemProducto1) {
        this.itemProducto1 = itemProducto1;
    }

    /**
     * @return the itemProducto2
     */
    public ItemDeCarro getItemProducto2() {
        return itemProducto2;
    }

    /**
     * @param itemProducto2 the itemProducto2 to set
     */
    public void setItemProducto2(ItemDeCarro itemProducto2) {
        this.itemProducto2 = itemProducto2;
    }

    /**
     * @return the itemProducto3
     */
    public ItemDeCarro getItemProducto3() {
        return itemProducto3;
    }

    /**
     * @param itemProducto3 the itemProducto3 to set
     */
    public void setItemProducto3(ItemDeCarro itemProducto3) {
        this.itemProducto3 = itemProducto3;
    }
    
    /*
      Este metodo retorna la suma de todos los item 
    */
    
    public double getPrecioCompra(){
      double sumaItem=0.0;
      
      
      if(this.itemProducto1!=null)
          sumaItem+=this.itemProducto1.getPrecioItemConDescuento(this.tipoDescuento);
      
     if(this.itemProducto2!=null)
          sumaItem+=this.itemProducto2.getPrecioItemConDescuento(this.tipoDescuento);
      
     
     if(this.itemProducto3!=null)
          sumaItem+=this.itemProducto3.getPrecioItemConDescuento(this.tipoDescuento);
      
     
     return sumaItem;
    }

    /**
     * @param tipoDescuento the tipoDescuento to set
     */
    public void setTipoDescuento(TipoDescuentoEnum tipoDescuento) {
        this.tipoDescuento = tipoDescuento;
      //  this.valorDesc=valorDesc;
    }
    
    
    
}

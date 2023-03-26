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
   

  
  
   public void setDescuento(Producto producto,double valorPorc){
    
       double valorTope=0.0;
        
        if(valorPorc > getTopePorcentaje())
            valorTope= (100-getTopePorcentaje())/100;
            
        else
              valorTope= (100-valorPorc)/100;
   
    super.setDescuento(producto, valorTope);
   }
   
  
    @Override
    public double getDescuentoGral(double suma) {
       return suma -(  (suma * getValorDescuento())/100);
    } 

    /**
     * @return the topePorcentaje
     */
    public double getTopePorcentaje() {
        return topePorcentaje;
    }

    /**
     * @param topePorcentaje the topePorcentaje to set
     */
    public void setTopePorcentaje(double topePorcentaje) {
        this.topePorcentaje = topePorcentaje;
    }
  
   
   }

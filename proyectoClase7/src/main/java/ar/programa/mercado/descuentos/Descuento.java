/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.programa.mercado.descuentos;

import ar.programa.mercado.Producto;



public interface Descuento {
    
    
public Double getDescuento(Producto producto);
public void setDescuento(Producto producto,Double porciento);

public void setValorDesc(Double valorDesc);



}

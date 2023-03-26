/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.programa.mercado.descuentos;

import ar.programa.mercado.Producto;



public interface Descuento {
    
    
public double getDescuento(Producto producto);
public void setDescuento(Producto producto,double porciento);

public void setValorDescuento(double valorDesc);
public double getValorDescuento();
public double getDescuentoGral(double suma);



}

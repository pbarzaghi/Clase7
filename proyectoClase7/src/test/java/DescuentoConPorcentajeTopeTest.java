
import ar.programa.mercado.Producto;
import ar.programa.mercado.descuentos.Descuento;

import ar.programa.mercado.descuentos.DescuentoConPorcentajeTope;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pbarzaghi
 */
public class DescuentoConPorcentajeTopeTest {
    
    
       @Test  
      public void tope10PorcValor100PesosyCon30PorcDescDa90Pesos(){
                // Tope descuento 10%
                // Valor del producto $100
                // POrcentaje dado para descontar 30% superando al tope
                Producto producto =new Producto();
                producto.setNombre("Yerba1");
                producto.setCodigo("1111");
                producto.setPrecio(100.0);

               
                Descuento porcentaje=new DescuentoConPorcentajeTope();
                // TOPE DE PORCENTAJE
                porcentaje.setValorDesc(10);
                porcentaje.setDescuento(producto, 30.0);



                Assertions.assertEquals(90.0,  producto.getPrecio()*porcentaje.getDescuento(producto));



  
  }
    
    
    
}

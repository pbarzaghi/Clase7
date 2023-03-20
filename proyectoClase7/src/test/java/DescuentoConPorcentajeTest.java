
import ar.programa.mercado.Producto;
import ar.programa.mercado.descuentos.Descuento;
import ar.programa.mercado.descuentos.DescuentoConPorcentaje;
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
public class DescuentoConPorcentajeTest {
    
    
    
     @Test  
  public void descontar10PorcValor100delPrecioDelProductoDa90(){
      // Descuenta 10% del valor del producto que vale $100 quedando $90
      Producto producto =new Producto();
      producto.setNombre("Yerba1");
      producto.setCodigo("1111");
      producto.setPrecio(100.0);
      
      double valorDescuento=10.0;
      Descuento porcentaje=new DescuentoConPorcentaje();
      porcentaje.setDescuento(producto, valorDescuento);
    
        
        
      Assertions.assertEquals(90.0,  producto.getPrecio()*porcentaje.getDescuento(producto));
      

      
  
  }
    
}

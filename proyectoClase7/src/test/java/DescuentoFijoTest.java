/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import ar.programa.mercado.Producto;
import ar.programa.mercado.descuentos.Descuento;
import ar.programa.mercado.descuentos.DescuentoFijo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
/**
 *
 * @author pbarzaghi
 */

public class DescuentoFijoTest {
   
  @Test  
  public void descontar5PesosValor100delPrecioDelProducto(){
      // Descuenta $5 fijos del valor del producto que vale $100 quedando $95
      Producto producto =new Producto();
      producto.setNombre("Yerba");
      producto.setCodigo("1111");
      producto.setPrecio(100.0);
      
      double valorDescuento=5.0;
      Descuento fijo=new DescuentoFijo();
      fijo.setDescuento(producto, valorDescuento);
      
      Assertions.assertEquals(95.0,  (producto.getPrecio()- fijo.getDescuento(producto)));
      

      
  
  }
    
}

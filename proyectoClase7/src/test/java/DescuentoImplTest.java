
import ar.programa.mercado.Producto;
import ar.programa.mercado.descuentos.Descuento;
import ar.programa.mercado.descuentos.DescuentoImpl;
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
public class DescuentoImplTest {
    
     @Test
    public void retornarPrecioProductoSinDescuento(){
        Producto producto =new Producto();
        producto.setNombre("Yerba");
        producto.setCodigo("1111");
        producto.setPrecio(100.0);
       
         Descuento sinDescuento=new DescuentoImpl();
         
         Assertions.assertEquals(100.0,  producto.getPrecio()*sinDescuento.getDescuento(producto));
    }
    
}

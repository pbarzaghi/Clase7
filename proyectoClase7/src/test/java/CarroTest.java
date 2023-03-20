
import ar.programa.mercado.Carro;
import ar.programa.mercado.ItemDeCarro;
import ar.programa.mercado.Producto;
import ar.programa.mercado.descuentos.Descuento;
import ar.programa.mercado.descuentos.DescuentoConPorcentaje;
import ar.programa.mercado.descuentos.DescuentoConPorcentajeTope;
import ar.programa.mercado.descuentos.DescuentoFijo;
import ar.programa.mercado.descuentos.TipoDescuentoEnum;
import ar.programa.personal.Persona;
import ar.programa.personal.TipoDocumento;
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
public class CarroTest {
    
    
    
    /*
     Testear un carro con un solo item donde un producto los 3 productos van a tener
     1 tipo de descuento
           Descuento en peso  $15
         
    
    */  
    
   @Test
    public void carroConDescuentoFijoenPesos(){
     
      Producto producto =new Producto();
      producto.setNombre("Yerba");
      producto.setCodigo("1111");
      producto.setPrecio(100.0);
      

      Producto producto1 =new Producto();
      producto1.setNombre("Azulcar");
      producto1.setCodigo("2222");
      producto1.setPrecio(50.0);
     
      Producto producto2 =new Producto();
      producto2.setNombre("Maiz");
      producto2.setCodigo("3333");
      producto2.setPrecio(100.0);
      
      Descuento fijo=new DescuentoFijo();
      // 15 pesos de descuento para el primer producto
      fijo.setDescuento(producto, 15.0);
        // 10 pesos de descuento para el primer producto
      fijo.setDescuento(producto1, 10.0);
    // 40 pesos de descuento para el primer producto
      fijo.setDescuento(producto2, 40.0);
      
      
      ItemDeCarro item1 = new ItemDeCarro(producto, 1);
      ItemDeCarro item2 = new ItemDeCarro(producto1, 2);
      ItemDeCarro item3 = new ItemDeCarro(producto2, 1);
      
      Persona comprador=new Persona("Pablo", "Barzaghi","232323" , TipoDocumento.DNI);
      
     // Carro 
   
     Carro carro =new Carro(comprador, item1, item2, item3);
     carro.setTipoDescuento(TipoDescuentoEnum.FIJO);
      
      
      
        System.out.println("CarroTest.carroConDescuentoFijode15Pesos() ----- "+carro.getPrecioCompra());
     
      Assertions.assertEquals(75.0,carro.getPrecioCompra());
      
    }
    
    
     @Test
    public void carroConDescPorcentajeTope10Porc(){
      Producto producto =new Producto();
      producto.setNombre("Yerba mate");
      producto.setCodigo("1111000");
      producto.setPrecio(100.0);
      

      Producto producto1 =new Producto();
      producto1.setNombre("Azulcar negra");
      producto1.setCodigo("2222111");
      producto1.setPrecio(50.0);
     
      Producto producto2 =new Producto();
      producto2.setNombre("Maiz mezcla");
      producto2.setCodigo("33332222");
      producto2.setPrecio(100.0);
      
      // Descuento con tope
      Descuento descuento = new DescuentoConPorcentajeTope();
      descuento.setValorDesc(10.0);
      descuento.setDescuento(producto,30.0);
      descuento.setDescuento(producto1,5.0);
      descuento.setDescuento(producto2,2.0);
      
      
       ItemDeCarro item1 = new ItemDeCarro(producto, 1);
      ItemDeCarro item2 = new ItemDeCarro(producto1, 1);
      ItemDeCarro item3 = new ItemDeCarro(producto2, 1);
   
      Persona comprador=new Persona("Pablo", "Barzaghi","232323" , TipoDocumento.DNI);
      
      Carro carro =new Carro(comprador, item1, item2, item3);
      carro.setTipoDescuento(TipoDescuentoEnum.TOPE_PORCENTAJE);
      
      
      System.out.println("CarroTest.carroConDescPorcentajeTope10Porc() ----- "+carro.getPrecioCompra());
     
      Assertions.assertEquals(235.5,carro.getPrecioCompra());
        
    
    }
    
     @Test
    public void carroConDescDel30PorcientoDado(){
          Producto producto =new Producto();
      producto.setNombre("Yerba misionera");
      producto.setCodigo("1111444");
      producto.setPrecio(100.0);
      

      Producto producto1 =new Producto();
      producto1.setNombre("Azulcar mascabo");
      producto1.setCodigo("2222555");
      producto1.setPrecio(50.0);
     
      Producto producto2 =new Producto();
      producto2.setNombre("Maizy girasol");
      producto2.setCodigo("3333666");
      producto2.setPrecio(100.0);
      
      // Descuento con tope
      Descuento descuento = new DescuentoConPorcentaje();
      descuento.setValorDesc(10.0);
      descuento.setDescuento(producto,30.0);
      descuento.setDescuento(producto1,30.0);
      descuento.setDescuento(producto2,30.0);
      
      
       ItemDeCarro item1 = new ItemDeCarro(producto, 1);
       ItemDeCarro item2 = new ItemDeCarro(producto1, 1);
      ItemDeCarro item3 = new ItemDeCarro(producto2, 1);
      
  
      
      Persona comprador=new Persona("Pablo", "Barzaghi","232323" , TipoDocumento.DNI);
      
     Carro    carro =new Carro(comprador, item1, item2, item3);
      carro.setTipoDescuento(TipoDescuentoEnum.PORCENTAJE);
      
      
      System.out.println("CarroTest.carroConDescDel30PorcientoDado() ----- "+carro.getPrecioCompra());
     
      Assertions.assertEquals(175.0,carro.getPrecioCompra());
        
    
    }
   
}

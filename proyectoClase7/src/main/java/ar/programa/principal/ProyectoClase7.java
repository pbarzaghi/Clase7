/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ar.programa.principal;

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

/**
 *
 * @author Usuario
 */
public class ProyectoClase7 {

     private static Producto producto1;
    private static Producto producto2;
    private static Producto producto3;
    private static Producto producto4;
    private static Producto producto5;
    private static Producto producto6;
    
    //private static Descuento tablaDesc;
    
    private static Persona comprador1;
    private static Persona comprador2;
    
    private static ItemDeCarro itemCarro1;
    private static ItemDeCarro itemCarro2;
    private static ItemDeCarro itemCarro3;  
    
    private static ItemDeCarro itemCarro4;
    private static ItemDeCarro itemCarro5;
    private static ItemDeCarro itemCarro6;
    
    private static Carro carro1;
    private static Carro carro2;
   
    public static void main(String[] args) {
        
        cargaGral();
        imprimirPreciosCarros();
       
        
        
    }
    
    
    private static void cargaGral() {
        cargaProductos();
        cargarComprador();
        cargarItemCarro();
        cargarCarro();
    }
   
    /*
      Este metodo me permite cargar los productos y tambien tengo una clase
     descuento que solo me da una sola instancia 
    */
    private static void cargaProductos() {
      
        producto1=new Producto();
        producto1.setNombre("Harina blanca flor");
        producto1.setCodigo("111111");
        producto1.setPrecio(100.0);
      
        
        producto2=new Producto();
        producto2.setNombre("Azucar");
        producto2.setCodigo("111112");
        producto2.setPrecio(102.0);
        
        
        
        producto3=new Producto();
        producto3.setNombre("Dulce de leche");
        producto3.setCodigo("111113");
        producto3.setPrecio(103.0);
        
        producto4=new Producto();
        producto4.setNombre("Papa");
        producto4.setCodigo("111114");
        producto4.setPrecio(104.0);
      
        producto5=new Producto();
        producto5.setNombre("Lechuga");
        producto5.setCodigo("111115");
        producto5.setPrecio(105.0);
        
        producto6=new Producto();
        producto6.setNombre("Tomate");
        producto6.setCodigo("111116");
        producto6.setPrecio(106.0);
       
       
    /*
       Descuento  tablaDesc= new DescuentoConPorcentaje();
                
        tablaDesc.setDescuento(producto1, 10);
        tablaDesc.setDescuento(producto4, 10);
        tablaDesc.setDescuento(producto6, 10);
      
       
      
        Descuento  tablaDesc= new DescuentoFijo();
                
        tablaDesc.setDescuento(producto1, 10);
        tablaDesc.setDescuento(producto4, 10);
        tablaDesc.setDescuento(producto6, 10);
       
   */
         Descuento  tablaDesc= new DescuentoConPorcentajeTope();
         tablaDesc.setValorDesc(10.0);
                
        tablaDesc.setDescuento(producto1,5.0);
        tablaDesc.setDescuento(producto4, 30.0);
        tablaDesc.setDescuento(producto6, 50.0);
     
    }

    private static void cargarComprador() {
         comprador1=new Persona ("Pablo","Barzaghi","222222",TipoDocumento.DNI);
         comprador2=new Persona ("Guillermina","Lateana","Af3222",TipoDocumento.PASAPORTE
         );
             
    }

    private static void cargarItemCarro() {
     
        itemCarro1=new ItemDeCarro(producto1, 1);
      //  itemCarro1.getPrecioItemConDescuento(TipoDescuentoEnum.FIJO);
        
       /* itemCarro2=new ItemDeCarro(producto2, 1);
        itemCarro3=new ItemDeCarro(producto3, 1);
        
        itemCarro4=new ItemDeCarro(producto6, 1);
        itemCarro5=new ItemDeCarro(producto5, 1);
        itemCarro6=new ItemDeCarro(producto4, 1);
       */ 
        
    
    }

    private static void cargarCarro() {
        carro1=new Carro(comprador1, itemCarro1, itemCarro2, itemCarro3);
        carro1.setTipoDescuento(TipoDescuentoEnum.TOPE_PORCENTAJE);
       //carro2 =new Carro(comprador2, itemCarro1,null, itemCarro5);
                
           
    }

    private static void imprimirPreciosCarros() {
      
      System.out.println("El carro 1 de " + carro1.getComprador().getNombreCompleto() +" Gasto un total : "+carro1.getPrecioCompra());
    //  System.out.println("El carro 2 de " + carro2.getComprador().getNombreCompleto() +" Gasto un total : "+carro2.getPrecioCompra());
    
    
    }
}

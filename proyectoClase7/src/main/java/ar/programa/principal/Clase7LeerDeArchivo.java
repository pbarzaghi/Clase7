/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.programa.principal;

import ar.programa.mercado.Carro;
import ar.programa.mercado.ItemDeCarro;
import ar.programa.mercado.Producto;
import ar.programa.mercado.descuentos.Descuento;
import ar.programa.mercado.descuentos.DescuentoConPorcentaje;
import ar.programa.mercado.descuentos.DescuentoConPorcentajeTope;
import ar.programa.mercado.descuentos.DescuentoFijo;
import ar.programa.mercado.descuentos.DescuentoImpl;
import ar.programa.mercado.descuentos.TipoDescuentoEnum;
import ar.programa.personal.Persona;
import ar.programa.personal.TipoDocumento;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author pbarzaghi
 */
public class Clase7LeerDeArchivo {
    
    
    
     private static String path="E:\\UTN\\Proyectos\\Clase7\\proyectoClase7\\";
    
    private static HashMap tablaObjectos=new HashMap();
    
    
    private static Carro carro;
    
    public static void main(String[] args) {
        
       
      leerArchivosProductos();
     
      leerArchivosCompradores();
      
      leerArchivosItemCarros();
      
      generarCostoDelCarro();
      
       System.out.println("El carro 1 de " + carro.getComprador().getNombreCompleto() +" Gasto un total : "+carro.getPrecioCompra());
        
        
    }
    
    
    private static void leerArchivosProductos()
    {
        
        String fileProducto="producto.txt";
        
       try { 
        List<String> productos= Files.readAllLines(Paths.get(path+fileProducto));
        for(int i=1; i< productos.size();i++) {
           String[]  cadena=productos.get(i).split(",");
          Producto producto = new Producto();
          // Nombre
           producto.setNombre(cadena[0]);
           //Precio
           producto.setPrecio(Double.parseDouble(cadena[1]));
                 //Codigo
           producto.setCodigo(cadena[2]);
           tablaObjectos.put(Producto.class+cadena[0], producto);     
            System.out.println("Productos "+cadena[0]+" "+cadena[1]+" "+cadena[2]);
        }
       }catch(IOException io){
               System.out.println(io.getMessage());
       }
      
    }

    private static void leerArchivosCompradores() {
         String fileCompradores="personas.txt";
        
       try { 
        List<String> compradores= Files.readAllLines(Paths.get(path+fileCompradores));
        for(int i=1; i< compradores.size();i++) {
           String[]  cadena=compradores.get(i).split(",");
         TipoDocumento tipo;
           if("DNI".equals(cadena[2])) 
               tipo=TipoDocumento.DNI;
           else
                if("CELULA".equals(cadena[2])) 
                  tipo=TipoDocumento.CELULA ;
                else 
                     if("LIBRETA_ENLORAMIENTO".equals(cadena[2])) 
                        tipo=TipoDocumento.CELULA;
                       else
                          tipo=TipoDocumento.PASAPORTE;
            
           Persona persona = new Persona(cadena[0],cadena[1],cadena[2],tipo);
           tablaObjectos.put(Persona.class+String.valueOf(i), persona);     
           System.out.println("Persona "+ cadena[0]+" "+cadena[1]+" "+cadena[2]);
        }
       }catch(IOException io){
               System.out.println(io.getMessage());
       }
      
 
    
    }

    private static void leerArchivosItemCarros() {
          String fileItemCarro="itemDeCarrito.txt";
        
       try { 
        List<String> items= Files.readAllLines(Paths.get(path+fileItemCarro));
        for(int i=1; i< items.size();i++) {
           String[]  cadena=items.get(i).split(",");
       
           ItemDeCarro itemdeCarro =new ItemDeCarro((Producto)tablaObjectos.get(Producto.class+cadena[2]), Integer.parseInt(cadena[0]));
           tablaObjectos.put(ItemDeCarro.class+String.valueOf(i), itemdeCarro);     
           System.out.println("itemDeCarrito " +cadena[0]+" "+cadena[1]+" "+cadena[2]);
        }
       }catch(IOException io){
               System.out.println(io.getMessage());
       }
      
       


    }

    private static void generarCostoDelCarro() {
        
        Persona comprador = (Persona)tablaObjectos.get(Persona.class+"1");
        ItemDeCarro item1=(ItemDeCarro)tablaObjectos.get(ItemDeCarro.class+"1");
        ItemDeCarro item2= (ItemDeCarro)tablaObjectos.get(ItemDeCarro.class+"2"); 
        ItemDeCarro item3= (ItemDeCarro)tablaObjectos.get(ItemDeCarro.class+"3"); 
        carro = new Carro(comprador,item1,item2,item3);
        Descuento descuento;
        
       String cadena = JOptionPane.showInputDialog("Tipo descuentos : 1 -Porcentaje . 2- Tope Porcentaje . 3- Monto Fijo . 4 Sin Descuento");
      
        switch (cadena) {
                case "1":
                     carro.setTipoDescuento(TipoDescuentoEnum.TOPE_PORCENTAJE);
                      descuento=new DescuentoConPorcentajeTope();
                       break;
                case "2":    
                       carro.setTipoDescuento(TipoDescuentoEnum.PORCENTAJE);
                       descuento=new DescuentoConPorcentaje();
                       break;
                case "3":
                       carro.setTipoDescuento(TipoDescuentoEnum.FIJO);
                        descuento=new DescuentoFijo();
                       break;
                default:   
                      carro.setTipoDescuento(TipoDescuentoEnum.NINGUNO);
                       descuento=new DescuentoImpl();
                       break;
                     
         }        
           double valorDescuento= Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor descuento "));
           System.out.println("valor de descuento "+valorDescuento);
          descuento.setValorDesc(valorDescuento);
       
    
       
       
    
    }
    
}

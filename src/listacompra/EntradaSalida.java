/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listacompra;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author luis
 */
public class EntradaSalida {
    static Scanner sc=new Scanner(System.in);
   // static Producto p=new Producto();
    public static int pedirOpciones()
    {
        System.out.println("1-Insertar producto");
        System.out.println("2-Listar productos");
        System.out.println("3-Salir");
        int opcion=sc.nextInt();
        sc.nextLine();
        return opcion;
    }
    public static Producto pedirProducto()
    {
        Producto p=new Producto();
        System.out.println("Introduce el nombre");
        String nombre=sc.nextLine();
        System.out.println("Introduce la marca");
        String marca=sc.nextLine();
        System.out.println("Introduce la cantidad");
        
        int cantidad=sc.nextInt();
        sc.nextLine();
       p.setCantidad(cantidad);
       p.setMarca(marca);
       p.setNombre_producto(nombre);
        //Recordar hacerlo static
        return p;
        
    }
    public static void mostrarListaCompra(ArrayList<Producto> lista_compra)
    {
        for (int i=0; i<lista_compra.size(); i++)
        {
           Producto p= lista_compra.get(i);//Casteo
            System.out.println(p.toString());
        }
    }
}

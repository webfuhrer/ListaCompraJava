/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listacompra;

import java.util.ArrayList;

/**
 *
 * @author luis
 */
public class ListaCompra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      ArrayList lista_compra=new ArrayList();
      int opcion=EntradaSalida.pedirOpciones();//Qué quiere hacer  3-SALIR
      while (opcion!=3)
      {
          switch (opcion)
                  {
              case 1:
                  Producto p=EntradaSalida.pedirProducto();
                  lista_compra.add(p);
                  break;
              case 2:
                  EntradaSalida.mostrarListaCompra(lista_compra);
                    }
           opcion=EntradaSalida.pedirOpciones();
      }
    }
    
}

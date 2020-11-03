import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class TienditaSocketsServer {
  public static String relativePath = System.getProperty("user.dir"); //Ruta relativa de nuestro directorio

  public static void main(String[] args) {
    final int port = 25001;//Puerto de nuestro Servidor ( puede ser del 1 al 2^16)

    try {
      ServerSocket servidor = new ServerSocket(port); // Escuchamos el servidor en el puerto
      servidor.setReuseAddress(true); //Esto es para que no se congele 15 segundos algo asi xd
      System.out.println("Servidor Iniciado con exito en el puerto: " + servidor.getLocalPort());

      Articulos item1 = new Articulos("1000 recetas de tomate",500,14,0,"URLimagen");
      Articulos item2 = new Articulos("La biblia del tomate",1000,26,20,"URLimagen");
      Articulos item3 = new Articulos("Tomate en polvo para rebozar 1kg",80,84,0,"ULRimagen");
      Articulos item4 = new Articulos("Tomate en polvo para gelatinas 1kg",50,26,0,"URLimagen");
      Articulos item5 = new Articulos("Tomate frito triturado 1kg",75,13,0,"URLimagen");
      Articulos item6 = new Articulos("Tomate entero pelado 250gr",15,55,0,"URLimagen");
      Articulos item7 = new Articulos("Zumo de tomate 2L pack de 3",300,77,50,"URLimagen");
      ArrayList<Articulos> listaArticulos = new ArrayList<Articulos>();
      System.out.println(item1.getNombre());
      item1.setDescuento(50);
      System.out.println("Precio: "+ item1.getPrecio());

      for(;;) {
        Socket cliente = servidor.accept(); // Esperamos a que algun cliente de conecte al servidor.
        System.out.println("Un cliente se ha conectado: " + cliente);

        /* Para leer en el socket cliente */
        InputStream is = cliente.getInputStream(); //Asociamos el stream con el cliente
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr); //El BufferedReader se usa para leer del cliente al servidor.

        /* Para escribir en el socket cliente */
        OutputStream os = cliente.getOutputStream(); //Asociamos el stream con el cliente
        OutputStreamWriter osr = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(osr); //El BufferedWriter se usa para escribir del servidor al cliente.


      } //FIN FOREVER
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TienditaSocketsServer {
  public static String relativePath = System.getProperty("user.dir"); //Ruta relativa de nuestro directorio

  public static void main(String[] args) {
    final int port = 25001;//Puerto de nuestro Servidor ( puede ser del 1 al 2^16)

    try {
      ServerSocket servidor = new ServerSocket(port); // Escuchamos el servidor en el puerto
      servidor.setReuseAddress(true); //Esto es para que no se congele 15 segundos algo asi xd
      System.out.println("Servidor Iniciado con exito en el puerto: " + servidor.getLocalPort());

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








      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

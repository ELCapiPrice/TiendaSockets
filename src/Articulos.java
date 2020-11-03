public class Articulos {
  private String nombre, imagen;
  private int stock, descuento;
  private double precio;

  public Articulos(String nombre, double precio, int stock, int descuento, String imagen){
    nuevoArticulo(nombre, precio, stock, descuento , imagen);
  }

  private void nuevoArticulo(String nombre, double precio, int stock, int descuento , String imagen){
    this.nombre = nombre;
    this.stock = stock;
    this.descuento = descuento; //En porcentaje 5% 10% 50% 90%
    this.imagen = imagen; //URL
    if(descuento>0){
      double descuentoDecimal = descuento / 100.00;
      this.precio = precio - (precio*descuentoDecimal);
    } else{
      this.precio = precio;
    }
  }

  public void setNombre(String nombre){
    this.nombre = nombre;
  }
  public String getNombre(){
    return this.nombre;
  }
  public void setPrecio(int precio){
    this.precio = precio;
  }
  public double getPrecio(){
    return this.precio;
  }
  public void setStock(int stock){
    this.stock = stock;
  }
  public int getStock(){
    return this.stock;
  }
  public void setDescuento(int descuento){
    double descuentoDecimal = descuento / 100.00;
    this.precio = precio - (precio*descuentoDecimal);
  }
  public int getDescuento(){
    return this.descuento;
  }
  public void setImagen(String imagen){
    this.imagen = imagen;
  }
  public String getImagen(){
    return this.imagen;
  }
}

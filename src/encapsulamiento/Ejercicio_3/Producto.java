package encapsulamiento.Ejercicio_3;

public class Producto {
    private String codigo;
    private String nombre;
    private double precio;
    private int stock;

    // Creamos el metodo
    public Producto(String codigo, String nombre, double precio, int stock){
        this.codigo = codigo;
        this.nombre = nombre;
        setPrecio(precio);
        setStock(stock);
    }

    public void aplicarDescuento(double porcentaje) {
        if (porcentaje >= 0 && porcentaje <= 100) {
            double descuento = this.precio * (porcentaje / 100.0);
            this.precio -= descuento;
            // Resta el descuento al precio actual
            System.out.println("Descuento del " + porcentaje + "% aplicado correctamente."); }
        else {
            System.out.println("Error: El porcentaje debe estar entre 0 y 100."); }
    }

    public boolean hayStock() {
        return this.stock > 0;
    }

    // Getters
    public String getCodigo(){return codigo;}
    public String getNombre(){return nombre;}
    public double getPrecio(){return precio;}
    public int getStock(){return stock;}

    // Setters
    public void setPrecio(double precio){
        if (precio >= 0) this.precio = precio;
           else System.out.println("Precio inválido.");
    }

    public void setStock(int stock){
        if (stock >= 0) this.stock = stock;
        else System.out.println("Stock inválido.");
    }

    public void vender (int unidades){
        if (unidades <= 0){
            System.out.println("Cantidad inválida.");
        } else if(unidades > stock){
            System.out.println("Sin stock suficiente. Disponible: " + stock);
        }else {
            stock -= unidades;
            System.out.println("Venta realizada: " + unidades + " unidades.");
        }
    }


    public void reabastecer (int unidades){
        if (unidades > 0){
            stock += unidades;
            System.out.println("Stock actualizado. Nuveo stock: " + stock);
        }
    }
}


package encapsulamiento.Ejercicio_3;

public class MainProducto {
    public static void main(String[] args) {
        // 1. Instanciamos un producto en memoria
        Producto p = new Producto("P-001", "Teclado Mecánico", 180000.0, 10);

        System.out.println("=== DATOS INICIALES ===");
        System.out.println("Producto: " + p.getNombre());
        System.out.println("Precio inicial: $" + p.getPrecio());
        System.out.println("Stock inicial: " + p.getStock());

        // 2. Probamos aplicarDescuento con 15%
        System.out.println("\n=== APLICANDO DESCUENTO DEL 15% ===");
        p.aplicarDescuento(15.0);
        System.out.println("Precio con descuento: $" + p.getPrecio());

        // 3. Verificamos si hay stock disponible usando hayStock()
        System.out.println("\n=== VERIFICACIÓN DE STOCK ===");
        System.out.println("¿Hay stock disponible?: " + (p.hayStock() ? "Sí" : "No"));
    }
}

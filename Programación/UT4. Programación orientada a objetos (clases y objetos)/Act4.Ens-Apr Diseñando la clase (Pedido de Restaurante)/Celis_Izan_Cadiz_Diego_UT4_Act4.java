import java.util.ArrayList;


class Pedido {
    public enum EstadoPedido {
        EN_PREPARACION,
        LISTO_PARA_ENTREGAR,
        ENTREGADO;
    }

    // Atributo estático para generar id único
    private static int generadorID = 1;

    // Atributos
    private int pedidoID;
    private String nombreCliente;
    private EstadoPedido estado;
    private ArrayList<Articulo> articulos;
    // Contador de artículos añadidos
    private int contadorArticulos;

    // Constructor
    public Pedido(String nombreCliente) {
        this.pedidoID = generadorID++;
        this.nombreCliente = nombreCliente;
        this.estado = EstadoPedido.EN_PREPARACION;
        this.articulos = new ArrayList<>();
        this.contadorArticulos = 0;
    }

    // Método para añadir un artículo, limite de 5
    public void añadirArticulo(String nombre, double cantidad, double precio) {
        if (cantidad <= 0 || precio <= 0) {
            System.out.println("Error: La cantidad y el precio deben ser mayores que 0.");
        }
        if (contadorArticulos >= 5) {
            System.out.println("No se pueden agregar más de 5 artículos.");
            return;
        }
        articulos.add(new Articulo(nombre, cantidad, precio));
        contadorArticulos++;
        System.out.println("Artículo añadido: " + nombre + " | Cantidad: " + cantidad + " | Precio por unidad: " + precio + "$");
    }

    // Método para calcular el precio total
    public double calcularPrecioTotal() {
        double total = 0;
        for (Articulo art : articulos) {
            total += art.getCantidad() * art.getPrecio();
        }
        return total;
    }

    // Método para cambiar el estado del pedido
    public void cambiarEstado(EstadoPedido nuevoEstado) {
        this.estado = nuevoEstado;
        System.out.println("Estado actualizado a: " + this.estado);
    }

    // Método para mostrar resumen del pedido
    public void mostrarResumen() {
        System.out.println("\n--- Resumen del Pedido ---");
        System.out.println("ID: " + this.pedidoID);
        System.out.println("Cliente: " + this.nombreCliente);
        System.out.println("Estado: " + this.estado);
        System.out.println("Articulos:");
        // Mostramos todos los artículos
        for (Articulo art : articulos) {
            System.out.println(" - " + art.getNombre() + " | Cantidad: " + art.getCantidad() + " | Precio por unidad: " + art.getPrecio() + "$");
        }
        System.out.println("Precio Total: " + calcularPrecioTotal() + "$");
        System.out.println("----------------------------------\n");
    }
}


class Articulo {
    // Atributos
    private String nombre;
    private double cantidad;
    private double precio;

    // Constructor
    public Articulo(String nombre, double cantidad, double precio) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    // Getters
    public String getNombre() {
        return this.nombre;
    }

    public double getCantidad() {
        return this.cantidad;
    }

    public double getPrecio() {
        return this.precio;
    }
}


public class Celis_Izan_Cadiz_Diego_UT4_Act4 {
    public static void main(String[] args) {
        // Pedido 1 -----------------------------------------
        System.out.println("\n--- PEDIDO 1 ---\n");
        // Creando un pedido
        Pedido pedido1 = new Pedido("Izan Carlo Celis Afonso");
        // Añadiendo artículos al pedido
        System.out.println("Añadiendo articulos...");
        pedido1.añadirArticulo("Lasaña", 3, 8.28);
        pedido1.añadirArticulo("Pizza", 2, 6.19);
        pedido1.añadirArticulo("Pasta", 1, 7.39);
        pedido1.añadirArticulo("Flan de huevo", 1, 8.48);
        pedido1.añadirArticulo("Mouse de chocolate", 2, 6.18);
        pedido1.añadirArticulo("Tarta de queso", 1, 9.34);
        // Cambiamos el estado del pedido
        System.out.println("\nActualizando estado...");
        pedido1.cambiarEstado(Pedido.EstadoPedido.LISTO_PARA_ENTREGAR);
        // Muestra el resumen del pedido
        pedido1.mostrarResumen();
        // Cambiamos el estado del pedido
        System.out.println("Actualizando estado...");
        pedido1.cambiarEstado(Pedido.EstadoPedido.ENTREGADO);
        // ---------------------------------------------------------

        System.out.println("");
        System.out.println("");

        // Pedido 2 -----------------------------------------
        System.out.println("\n--- PEDIDO 2 ---\n");
        // Creando un pedido
        Pedido pedido2 = new Pedido("Diego Lázaro Cádiz Torres");
        // Añadiendo artículos al pedido
        System.out.println("Añadiendo articulos...");
        pedido2.añadirArticulo("Pizza", 3, 6.19);
        pedido2.añadirArticulo("Flan de huevo", 1, 8.48);
        pedido2.añadirArticulo("Tarta de queso", 1, 9.34);
        // Cambiamos el estado del pedido
        System.out.println("\nActualizando estado...");
        pedido2.cambiarEstado(Pedido.EstadoPedido.LISTO_PARA_ENTREGAR);
        // Muestra el resumen del pedido
        pedido2.mostrarResumen();
        // Cambiamos el estado del pedido
        System.out.println("Actualizando estado...");
        pedido2.cambiarEstado(Pedido.EstadoPedido.ENTREGADO);
        // ---------------------------------------------------------
    }
}
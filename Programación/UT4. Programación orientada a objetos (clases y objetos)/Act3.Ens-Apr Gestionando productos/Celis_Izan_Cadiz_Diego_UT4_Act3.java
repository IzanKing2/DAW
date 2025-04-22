import java.time.LocalDateTime;


class Producto {
    // Atributos -----------------
    private int id;
    private String nombre;
    private String descripcion;
    private double precio;
    private int stock;
    private String categoria;
    private String proveedor;
    private LocalDateTime fechaCreacion;
    // -----------------------------------

    // Constructor --------------------------------------------------------------------------------------------------------
    Producto(int id, String nombre, String descripcion, double precio, int stock, String categoria, String proveedor) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.categoria = categoria;
        this.proveedor = proveedor;
        this.fechaCreacion = LocalDateTime.now();
    }
    // -----------------------------------------------

    // Métodos -----------------------------------
    public void mostrarInformacion() {
        tab();
        System.out.println("ID: " + getId());
        tab();
        System.out.println("Nombre: " + getNombre());
        tab();
        System.out.println("Descripción: " + getDescripcion());
        tab();
        System.out.println("Precio: " + getPrecio() + "$");
        tab();
        System.out.println("Stock: " + getStock());
        tab();
        System.out.println("Categoría: " + getCategoria());
        tab();
        System.out.println("Proveedor: " + getProveedor());
        tab();
        System.out.println("Fecha de creación: " + getFechaCreacion());
    }

    public void tab() {
        System.out.print("\t");
    }

    public void ajustarStock(int cantidad) {
        int total = this.stock + cantidad;
        setStock(total);
    }
    // -----------------------------------------------

    // Métodos getter ----------------------
    public int getId() {
        return this.id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public double getPrecio() {
        return this.precio;
    }

    public int getStock() {
        return this.stock;
    }

    public String getCategoria() {
        return this.categoria;
    }

    public String getProveedor() {
        return this.proveedor;
    }

    public LocalDateTime getFechaCreacion() {
        return this.fechaCreacion;
    }
    // -----------------------------------------

    // Métodos setter ---------------------------------------------------------
    public void setPrecio(double precio) { // El precio debe ser mayor que 0
        if (precio > 0) {
            this.precio = precio;
        } else {
            System.out.println("Error! Dato no válido");
        }
    }

    public void setStock(int stock) { // El stock debe ser 0 o positivo
        if (stock >= 0) {
            this.stock = stock;
        } else {
            System.out.println("Error! El stock no puede ser negativo");
        }
    }

    public void setNombre(String nombre) { // Nombre no puede ser null ni estar vacio
        if((nombre == null) || (nombre.equals(""))) {
            System.out.println("Error! Es obligatorio introducir un valor");
        } else {
            this.nombre = nombre;
        }
    }

    public void setCategoria(String categoria) { // Categoria no puede ser null ni estar vacio
        if((categoria == null) || (categoria.equals(""))) {
            System.out.println("Error! Es obligatorio introducir un valor");
        } else {
            this.categoria = categoria;
        }
    }

    public void setProveedor(String proveedor) { // Proveedor no puede ser null ni estar vacio
        if((proveedor == null) || (proveedor.equals(""))) {
            System.out.println("Error! Es obligatorio introducir un valor");
        } else {
            this.proveedor = proveedor;
        }
    }
    // --------------------------------------------------------------------------------------------
}


public class Celis_Izan_Cadiz_Diego_UT4_Act3 {
    /**
     *  Método principal
     * @param args
     */
    public static void main(String[] args) {
        // Producto 1 ---------------------------------------------------------------------------------------------------------------------------------------------------------
        Producto producto1 = new Producto(101, "Laptop", "Portátil de 14 pulgadas", 1000.0, 10, "Electrónica", "TechSupplier");

        System.out.println("\n-------------- PRIMER PRODUCTO");

            // provando mostrarInformación()
        producto1.mostrarInformacion();
            // modificando el stock
        System.out.println();
        producto1.ajustarStock(5);
        System.out.println();
        System.out.println("------- Modificando stock");
        producto1.mostrarInformacion();

            // provando getNombre()
        System.out.println();
        System.out.println(producto1.getNombre());
        System.out.println("------- Modificando nombre");
        producto1.setNombre("Laptop AMD7");
        System.out.println(producto1.getNombre());
        // -------------------------------------------------------------------

        // Producto 2 ---------------------------------------------------------------------------------------------------------------------------------------------
        Producto producto2 = new Producto(102, "PS5", "Play Station 5", 492.0, 12, "Electronica", "SonyTech");

        System.out.println("\n-------------- SEGUNDO PRODUCTO");

            // provando mostrarInformación()
            producto2.mostrarInformacion();
            // modificando el stock
        System.out.println();
        producto2.ajustarStock(-5);
        System.out.println();
        System.out.println("------- Modificando stock");
        producto2.mostrarInformacion();

            // provando getNombre()
        System.out.println();
        System.out.println(producto2.getNombre());
        System.out.println("------- Modificando nombre");
        producto2.setNombre("PS5 pro");
        System.out.println(producto2.getNombre());
        // ------------------------------------------------------------

        // Producto 3 ---------------------------------------------------------------------------------------------------------------------------------------------------
        Producto producto3 = new Producto(103, "PC Gaming", "4080ti i7 8GRam", 1620.0, 4, "Electrónica", "TechSupplier");

        System.out.println("\n-------------- TERCER PRODUCTO");

            // provando mostrarInformación()
            producto3.mostrarInformacion();
            // modificando el stock
        System.out.println();
        producto3.ajustarStock(-6);
        System.out.println();
        System.out.println("------- Modificando stock");
        producto3.mostrarInformacion();

            // provando getNombre()
        System.out.println();
        System.out.println(producto3.getNombre());
        System.out.println("------- Modificando nombre");
        producto3.setNombre("PC Nvidia");
        System.out.println(producto3.getNombre());
        // -------------------------------------------------------------
    }
}
import java.util.ArrayList;
import java.util.List;

public class GestorDeProductos {
    private List<Producto> productos;

    // Constructor
    public GestorDeProductos() {
        this.productos = new ArrayList<>();
    }

    // Método para añadir un producto
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    // Método para listar todos los productos
    public void listarProductos() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos disponibles.");
        } else {
            System.out.println("Lista de productos:");
            for (Producto producto : productos) {
                System.out.println("ID: " + producto.getId() +
                        ", Nombre: " + producto.getNombre() +
                        ", Cantidad: " + producto.getCantidad() +
                        ", Precio: $" + producto.getPrecio());
            }
        }
    }public void modificarProducto(int id, String nuevoNombre, int nuevaCantidad, double nuevoPrecio) {
        Producto productoAModificar = null;

        // Buscar el producto por ID
        for (Producto producto : productos) {
            if (producto.getId() == id) {
                productoAModificar = producto;
                break;
            }
        }

        // Modificar los atributos si el producto fue encontrado
        if (productoAModificar != null) {
            productoAModificar.setNombre(nuevoNombre);
            productoAModificar.setCantidad(nuevaCantidad);
            productoAModificar.setPrecio(nuevoPrecio);
            System.out.println("Producto modificado exitosamente.");
        } else {
            System.out.println("Producto con ID " + id + " no encontrado.");
        }
    }public double calcularValorTotal() {
        double valorTotal = 0;

        for (Producto producto : productos) {
            valorTotal += producto.getCantidad() * producto.getPrecio();
        }

        return valorTotal;
    }
    /*
    // Main para probar gestor de productos
    public static void main(String[] args) {
        GestorDeProductos gestor = new GestorDeProductos();

        // Agregar productos
        gestor.agregarProducto(new Producto(1, "Producto A", 10, 15.50));
        gestor.agregarProducto(new Producto(2, "Producto B", 5, 25.00));
        gestor.agregarProducto(new Producto(3, "Producto C", 20, 10.75));

        // Listar productos
        gestor.listarProductos();
    }
    //////////////////////////////////////////////////////////////////////
    //Main para probar el modificar producto
    public static void main(String[] args) {
        GestorDeProductos gestor = new GestorDeProductos();

        // Agregar productos
        gestor.agregarProducto(new Producto(1, "Producto A", 10, 15.50));
        gestor.agregarProducto(new Producto(2, "Producto B", 5, 25.00));

        // Listar productos antes de la modificación
        System.out.println("Antes de la modificación:");
        gestor.listarProductos();

        // Modificar el producto con ID 1
        gestor.modificarProducto(1, "Producto Modificado", 20, 18.75);

        // Listar productos después de la modificación
        System.out.println("Después de la modificación:");
        gestor.listarProductos();
    }
    //////////////////////////////////////////////////////////////////////
    public static void main(String[] args) {
    GestorDeProductos gestor = new GestorDeProductos();

    // Agregar productos
    gestor.agregarProducto(new Producto(1, "Producto A", 10, 15.50));
    gestor.agregarProducto(new Producto(2, "Producto B", 5, 25.00));
    gestor.agregarProducto(new Producto(3, "Producto C", 20, 10.75));

    // Listar productos
    gestor.listarProductos();

    // Calcular y mostrar el valor total del inventario
    double valorTotal = gestor.calcularValorTotal();
    System.out.println("Valor total del inventario: $" + valorTotal);
}

    //*/

}

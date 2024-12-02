import java.util.ArrayList;

public class Inventario {
    //Atributo
    private ArrayList<Producto> productos;

    //Metodo constructor
    public Inventario(){
        productos = new ArrayList<>();
    }

    //Metodo para agregar productos
    /**
     * Agrega un nuevo producto al inventario, validando que no exista un producto con el mismo ID.
     *
     * @param id El ID del producto.
     * @param nombre El nombre del producto.
     * @param cantidad La cantidad del producto.
     * @param precio El precio del producto.
     */
    public void agregarProducto(int id, String nombre, int cantidad, double precio){
        // Validar si ya existe un producto con el mismo ID
        for (Producto producto : productos) {
            if (producto.getId() == id) {
                System.out.println("Error: Ya existe un producto con el ID " + id);
                return; // Si se encuentra un duplicado, se sale del método
            }
        }

        // Si no se encontró un duplicado, se crea el nuevo producto y se agrega al inventario
        Producto nuevoProducto = new Producto (id,nombre, cantidad, precio);
        productos.add(nuevoProducto);
    }

    public void consultarInventario (){
        if (productos.isEmpty()){
            System.out.println("El inventario está vacío.");
        }else{

        }
    }
}
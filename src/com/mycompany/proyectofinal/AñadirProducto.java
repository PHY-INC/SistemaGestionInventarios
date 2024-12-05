package com.mycompany.proyectofinal;
import com.mycompany.proyectofinal.GestorDeProductos;
import com.mycompany.proyectofinal.Producto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AñadirProducto extends JFrame {
    private JTextField idField; // Campo para el ID
    private JTextField nombreField; // Campo para el nombre
    private JTextField precioField; // Campo para el precio
    private JTextField cantidadField; // Campo para la cantidad
    private GestorDeProductos gestorDeProductos;

    public AñadirProducto(GestorDeProductos gestorDeProductos) {
        this.gestorDeProductos = gestorDeProductos;
        initComponents();
    }

    private void initComponents() {
        setTitle("Añadir Producto");
        setSize(300, 250);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new GridLayout(5, 2));

        // Crear campos de texto
        idField = new JTextField();
        nombreField = new JTextField();
        precioField = new JTextField();
        cantidadField = new JTextField(); // Inicializar campo de cantidad

        // Crear etiquetas
        JLabel idLabel = new JLabel("ID:");
        JLabel nombreLabel = new JLabel("Nombre:");
        JLabel precioLabel = new JLabel("Precio:");
        JLabel cantidadLabel = new JLabel("Cantidad:"); // Etiqueta para cantidad

        // Crear botón de añadir
        JButton addButton = new JButton("Añadir");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarProducto();
            }
        });

        // Añadir componentes al marco
        add(idLabel);
        add(idField);
        add(nombreLabel);
        add(nombreField);
        add(precioLabel);
        add(precioField);
        add(cantidadLabel); // Añadir etiqueta de cantidad
        add(cantidadField); // Añadir campo de cantidad
        add(addButton);
    }

    private void agregarProducto() {
        try {
            int id = Integer.parseInt(idField.getText()); // Obtener ID
            String nombre = nombreField.getText();
            double precio = Double.parseDouble(precioField.getText());
            int cantidad = Integer.parseInt(cantidadField.getText()); // Obtener cantidad

            // Crear un nuevo producto con el ID, nombre, precio y cantidad
            Producto nuevoProducto = new Producto(id, nombre, cantidad, precio);
            gestorDeProductos.agregarProducto(nuevoProducto);

            // Limpiar campos
            idField.setText("");
            nombreField.setText("");
            precioField.setText("");
            cantidadField.setText(""); // Limpiar campo de cantidad

            JOptionPane.showMessageDialog(this, "Producto añadido con éxito.");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un ID, precio y cantidad válidos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}

package com.mycompany.proyectofinal;

import javax.swing.*;
import java.awt.*;

/**
 * Ventana para añadir productos al inventario.
 */
public class AñadirProducto extends JFrame {

    public AñadirProducto() {
        initComponents();
    }

    private void initComponents() {
        // Panel principal
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        panel.setBackground(new Color(245, 245, 245)); // Fondo gris claro
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Título
        JLabel titleLabel = new JLabel("Añadir Producto", JLabel.CENTER);
        titleLabel.setFont(new Font("Segoe UI", Font.BOLD, 18));
        titleLabel.setForeground(new Color(50, 50, 50)); // Texto gris oscuro
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.insets = new Insets(10, 10, 20, 10);
        panel.add(titleLabel, gbc);

        // Etiquetas y campos de texto
        JLabel nameLabel = new JLabel("Nombre del producto:");
        JTextField nameField = new JTextField(20);
        JLabel quantityLabel = new JLabel("Cantidad:");
        JTextField quantityField = new JTextField(20);
        JLabel priceLabel = new JLabel("Precio (por unidad):");
        JTextField priceField = new JTextField(20);

        gbc.gridwidth = 1;

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.insets = new Insets(5, 10, 5, 10);
        panel.add(nameLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        panel.add(nameField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(quantityLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        panel.add(quantityField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(priceLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        panel.add(priceField, gbc);

        // Botones
        JButton saveButton = createButton("Guardar", new Color(100, 149, 237)); // Azul sobrio
        JButton cancelButton = createButton("Cancelar", new Color(128, 128, 128)); // Gris medio

        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.insets = new Insets(15, 10, 10, 5);
        panel.add(saveButton, gbc);

        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.insets = new Insets(15, 5, 10, 10);
        panel.add(cancelButton, gbc);

        // Configuración de la ventana
        this.add(panel);
        this.setTitle("Añadir Producto");
        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        // Listeners para botones
        saveButton.addActionListener(e -> {
            String nombre = nameField.getText().trim();
            String cantidad = quantityField.getText().trim();
            String precio = priceField.getText().trim();

            if (nombre.isEmpty() || cantidad.isEmpty() || precio.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Producto añadido: " + nombre, "Éxito", JOptionPane.INFORMATION_MESSAGE);
                // Aquí podrías añadir lógica para guardar el producto en una base de datos o lista.
                this.dispose(); // Cierra la ventana tras guardar
            }
        });

        cancelButton.addActionListener(e -> this.dispose()); // Cierra la ventana
    }

    /**
     * Crea un botón con estilo predeterminado.
     *
     * @param text  Texto del botón
     * @param color Color de fondo del botón
     * @return JButton configurado
     */
    private JButton createButton(String text, Color color) {
        JButton button = new JButton(text);
        button.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        button.setBackground(color);
        button.setForeground(Color.WHITE);
        button.setFocusPainted(false);
        button.setBorder(BorderFactory.createLineBorder(new Color(169, 169, 169))); // Borde gris suave
        return button;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new AñadirProducto().setVisible(true);
        });
    }
}

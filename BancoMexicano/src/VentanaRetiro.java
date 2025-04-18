import javax.swing.*;
import java.awt.event.*;

public class VentanaRetiro extends JFrame {

    public VentanaRetiro(CuentaBancaria cuenta) {
        setTitle("Retiro");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel lblCantidad = new JLabel("Cantidad a retirar:");
        lblCantidad.setBounds(30, 30, 200, 25);
        add(lblCantidad);

        JTextField txtCantidad = new JTextField();
        txtCantidad.setBounds(30, 60, 200, 25);
        add(txtCantidad);

        JButton btnRetirar = new JButton("Retirar");
        btnRetirar.setBounds(30, 100, 100, 30);
        add(btnRetirar);

    btnRetirar.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            try {
                double cantidad = Double.parseDouble(txtCantidad.getText());
                boolean exito = cuenta.retirar(cantidad);

                if (exito) {
                    JOptionPane.showMessageDialog(null, "Retiro realizado correctamente. Saldo actual: $" + cuenta.getSaldo());
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Fondos insuficientes o cantidad inválida.");
                }

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Ingresa una cantidad válida.");
            }
        }
    });


        setVisible(true);
    }
}

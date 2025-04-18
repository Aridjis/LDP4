import javax.swing.*;
import java.awt.event.*;

public class VentanaDeposito extends JFrame {

    public VentanaDeposito(CuentaBancaria cuenta) {
        setTitle("Depósito");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel lblCantidad = new JLabel("Cantidad a depositar:");
        lblCantidad.setBounds(30, 30, 200, 25);
        add(lblCantidad);

        JTextField txtCantidad = new JTextField();
        txtCantidad.setBounds(30, 60, 200, 25);
        add(txtCantidad);

        JButton btnDepositar = new JButton("Depositar");
        btnDepositar.setBounds(30, 100, 100, 30);
        add(btnDepositar);

        btnDepositar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double cantidad = Double.parseDouble(txtCantidad.getText());
                    cuenta.depositar(cantidad);
                    JOptionPane.showMessageDialog(null, "Depósito realizado correctamente. Saldo actual: $" + cuenta.getSaldo());
                    dispose();
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Ingresa una cantidad válida.");
                }
            }
        });


        setVisible(true);
    }
}

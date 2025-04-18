import javax.swing.*;
import java.awt.event.*;

public class VentanaPrincipal extends JFrame {

    private CuentaBancaria cuenta;

    public VentanaPrincipal() {
        cuenta = new CuentaBancaria();

        setTitle("Banco Mexicano");
        setSize(300, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        JButton btnDeposito = new JButton("Depósito");
        btnDeposito.setBounds(80, 30, 120, 30);
        add(btnDeposito);

        JButton btnRetiro = new JButton("Retiro");
        btnRetiro.setBounds(80, 70, 120, 30);
        add(btnRetiro);

        JButton btnSaldo = new JButton("Saldo (pendiente)");
        btnSaldo.setBounds(80, 110, 120, 30);
        add(btnSaldo);

        JButton btnSalir = new JButton("Salir (pendiente)");
        btnSalir.setBounds(80, 150, 120, 30);
        add(btnSalir);

        // Acción botón Depósito
        btnDeposito.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new VentanaDeposito(cuenta);
            }
        });

        // Acción botón Retiro
        btnRetiro.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new VentanaRetiro(cuenta);
            }
        });

        setVisible(true);
    }
}


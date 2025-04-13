
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaIMC extends JFrame {
    public VentanaIMC() {
        setTitle ("Calculadora de IMC");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        
        JLabel etiquetaPeso = new JLabel ("Peso (kg):");
        etiquetaPeso.setBounds(30, 30, 100, 25);
        add(etiquetaPeso);
        
        JTextField campoPeso = new JTextField();
        campoPeso.setBounds (150, 30, 200, 25);
        add(campoPeso);
        
        JLabel etiquetaEstatura = new JLabel("Estatura (m):");
        etiquetaEstatura.setBounds(30, 70, 100,25);
        add(etiquetaEstatura);
        
        JTextField campoEstatura = new JTextField();
        campoEstatura.setBounds (150, 70, 200, 25);
        add(campoEstatura);
        
        JButton botonCalcular = new JButton("Calcular IMC");
        botonCalcular.setBounds(130, 120, 140, 30);
        add(botonCalcular);
        
        JLabel etiquetaResultado = new JLabel("Resultado: ");
        etiquetaResultado.setBounds(30, 170, 320, 25);
        add(etiquetaResultado);
        
        botonCalcular.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                try{
                    double peso = Double.parseDouble(campoPeso.getText());
                    double estatura = Double.parseDouble(campoEstatura.getText());
                    
                    Paciente paciente = new Paciente(peso, estatura);
                    String clasificacion = paciente.clasificarIMC();
                    double imc = paciente.calcularIMC();
                    
                    etiquetaResultado.setText(String.format("IMC: %.2f - %s", imc, clasificacion)); 
                } catch (NumberFormatException ex){
                    etiquetaResultado.setText("Pof favor, ingresa valores válidos.");
                }
            }
        });
    }
}

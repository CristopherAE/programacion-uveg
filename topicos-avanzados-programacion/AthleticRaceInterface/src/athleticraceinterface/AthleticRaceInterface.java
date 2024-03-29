package athleticraceinterface;


import java.awt.Font;
import java.awt.event.ActionEvent;
import java.util.Arrays;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;


public class AthleticRaceInterface extends JFrame {
    
    public AthleticRaceInterface() {
        
        setTitle("Carrera atlética");
        setSize(480, 590);
        setResizable(false);
        setLocationRelativeTo(null);
        getContentPane().setLayout(new AbsoluteLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel lblRegistrarCorredor = new JLabel("Registrar corredor");
        lblRegistrarCorredor.setFont(new Font("sansserif", 1, 18));
        getContentPane().add(lblRegistrarCorredor, new AbsoluteConstraints(20, 20, 170, -1));
        
        JTextField txtRegistro = new JTextField("Ingresar nombre...");
        txtRegistro.setFont(new Font("sansserif", 0, 14));
        getContentPane().add(txtRegistro, new AbsoluteConstraints(20, 50, 260, 40));
        
        JButton btnRegistrar = new JButton("Registrar");
        btnRegistrar.setFont(new Font("sansserif", 1, 14));
        getContentPane().add(btnRegistrar, new AbsoluteConstraints(300, 50, 160, 40));
        
        JLabel lblCorredoresRegistrados = new JLabel("Corredores registrados");
        lblCorredoresRegistrados.setFont(new Font("sansserif", 1, 18));
        getContentPane().add(lblCorredoresRegistrados, new AbsoluteConstraints(20, 110, 230, -1));
        
        JScrollPane scroll1 = new JScrollPane();
        JTextArea txtAreaRegistro = new JTextArea();
        txtAreaRegistro.setFont(new Font("sansserif", 0, 14));
        txtAreaRegistro.setColumns(20);
        txtAreaRegistro.setRows(5);
        txtAreaRegistro.setEditable(false);
        scroll1.setViewportView(txtAreaRegistro);
        getContentPane().add(scroll1, new AbsoluteConstraints(20, 140, 440, 160));
        
        JLabel lblResultados = new JLabel("Resultados");
        lblResultados.setFont(new Font("sansserif", 1, 18));
        getContentPane().add(lblResultados, new AbsoluteConstraints(20, 320, 170, -1));
        
        JTextArea txtAreaResultados = new JTextArea();
        txtAreaResultados.setFont(new Font("sansserif", 0, 14));
        txtAreaResultados.setEditable(false);
        txtAreaResultados.setColumns(20);
        txtAreaResultados.setRows(5);
        JScrollPane scroll2 = new JScrollPane();
        scroll2.setViewportView(txtAreaResultados);
        getContentPane().add(scroll2, new AbsoluteConstraints(20, 350, 280, 190));
        
        JButton btnIniciar = new JButton("Iniciar");
        btnIniciar.setFont(new Font("sansserif", 1, 14));
        getContentPane().add(btnIniciar, new AbsoluteConstraints(320, 350, 140, 50));
        JButton btnReiniciar = new JButton("Reiniciar");
        btnReiniciar.setFont(new Font("sansserif", 1, 14));
        getContentPane().add(btnReiniciar, new AbsoluteConstraints(320, 420, 140, 50));
        JButton btnTerminar = new JButton("Terminar");
        btnTerminar.setFont(new Font("sansserif", 1, 14));
        getContentPane().add(btnTerminar, new AbsoluteConstraints(320, 490, 140, 50));
        
        // Define un arreglo que contendrá a los cinco competidores.
        Runner[] competidores = new Runner[5];
        
        btnRegistrar.addActionListener((ActionEvent ae) -> {
            if (competidores[competidores.length - 1] != null) {
                JOptionPane.showMessageDialog(
                        rootPane,
                        "Ya has introducido 5 corredores.",
                        "Advertencia",
                        JOptionPane.WARNING_MESSAGE
                );
            }
            
            String nombreCompetidor = txtRegistro.getText();
            
            if ("".equals(nombreCompetidor) || nombreCompetidor == null) {
                JOptionPane.showMessageDialog(
                        rootPane,
                        "No has introducido un nombre válido.",
                        "Advertencia",
                        JOptionPane.WARNING_MESSAGE
                );
            } else {
                for (int i = 0; i < competidores.length; i++) {
                    if (competidores[i] == null) {
                        Runner nuevoCompetidor = new Runner(nombreCompetidor);
                        competidores[i] = nuevoCompetidor;
                        txtAreaRegistro.setText(
                                txtAreaRegistro.getText() +
                                        (i + 1) + " - " + competidores[i].getName() + "\n"
                        );
                        break;
                    }
                }
            }
        });
        
        btnIniciar.addActionListener((ActionEvent ae) -> {
            boolean iniciarCarrera = true;
            
            for (Runner competidor : competidores) {
                if (competidor == null) {
                    JOptionPane.showMessageDialog(
                            rootPane,
                            "No has introducido los nombres de 5 competidores",
                            "Advertencia",
                            JOptionPane.WARNING_MESSAGE
                    );
                    iniciarCarrera = false;
                    break;
                }
            }
            
            if (iniciarCarrera) {
                Buffer contador = new Buffer();
                ThreadRunner hilo1 = new ThreadRunner(competidores[0], txtAreaResultados, contador);
                ThreadRunner hilo2 = new ThreadRunner(competidores[1], txtAreaResultados, contador);
                ThreadRunner hilo3 = new ThreadRunner(competidores[2], txtAreaResultados, contador);
                ThreadRunner hilo4 = new ThreadRunner(competidores[3], txtAreaResultados, contador);
                ThreadRunner hilo5 = new ThreadRunner(competidores[4], txtAreaResultados, contador);

                Thread t1 = new Thread(hilo1);
                Thread t2 = new Thread(hilo2);
                Thread t3 = new Thread(hilo3);
                Thread t4 = new Thread(hilo4);
                Thread t5 = new Thread(hilo5);

                t1.start();
                t2.start();
                t3.start();
                t4.start();
                t5.start();
            }
        });
        
        btnReiniciar.addActionListener((ActionEvent ae) -> {
            Arrays.fill(competidores, null);
            txtRegistro.setText("Ingresar nombre...");
            txtAreaRegistro.setText("");
            txtAreaResultados.setText("");
        });
        
        btnTerminar.addActionListener((ActionEvent ae) -> {
            System.exit(0);
        });
        
        setVisible(true);
    }
    

    
    public static void main(String[] args) {
        AthleticRaceInterface ventana = new AthleticRaceInterface();
    }
    
}

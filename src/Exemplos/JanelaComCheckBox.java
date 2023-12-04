package Exemplos;
import javax.swing.*;
public class JanelaComCheckBox extends JFrame {
    private final JCheckBox cbPizza, cbRefri;
    public JanelaComCheckBox(String title) {
        super(title);
        super.setLayout(null);
        this.cbPizza = new JCheckBox("Pizza");
        this.cbRefri = new JCheckBox("Refrigerante");
        this.cbPizza.setBounds(10,10,150,20);
        this.cbRefri.setBounds(10,35,150,20);
        this.getContentPane().add(this.cbPizza);
        this.getContentPane().add(this.cbRefri);
        this.confJanela();
    }
    private void confJanela() {
        super.setSize(400,300);
        super.setLocationRelativeTo(null);
        //super.getContentPane().setBackground(Color.GRAY);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setVisible(true);
    }
    public static void main(String[] args) {
        JanelaComCheckBox escolha = new JanelaComCheckBox("Escolha");
        escolha.setVisible(true);
    }
}

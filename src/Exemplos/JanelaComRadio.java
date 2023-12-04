package Exemplos;
import javax.swing.*;
public class JanelaComRadio extends JFrame {
    private final JRadioButton rbAprovado,rbReprovado;
    private final ButtonGroup bgSituacao;
    public JanelaComRadio(String title) {
        super(title);
        super.setLayout(null);
        this.rbAprovado = new JRadioButton("Aprovado");
        this.rbReprovado = new JRadioButton("Reprovado");
        this.rbAprovado.setBounds(10, 10, 150, 20);
        this.rbReprovado.setBounds(10, 35, 150, 20);
        this.bgSituacao = new ButtonGroup();
        this.bgSituacao.add(this.rbAprovado);
        this.bgSituacao.add(this.rbReprovado);
        this.getContentPane().add(this.rbAprovado);
        this.getContentPane().add(this.rbReprovado);
        this.confJanela();
    }
    private void confJanela() {
           super.setSize(400,300);
           super.setLocationRelativeTo(null);
           super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           super.setVisible(true);
    }
    public static void main(String[] args) {
           JanelaComRadio situacao = new JanelaComRadio("Situação");
           situacao.setVisible(true);
    }
}
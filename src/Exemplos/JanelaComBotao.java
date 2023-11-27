package Exemplos;
import java.awt.*;
import javax.swing.*;
public class JanelaComBotao extends JFrame {
    JButton btnGravar = new JButton("Gravar"); //Aqui você vai criar o objeto botão Gravar
    JButton btnFechar = new JButton("Fechar"); //Aqui você vai criar o objeto botão Fechar
    //Aqui está o método construtor, não esquece disso hein!
    public JanelaComBotao() {
        setLayout(new FlowLayout()); //Posiciona os componentes um após o outro
        getContentPane().add(btnGravar); //Adiciona o botão Gravar
        getContentPane().add(btnFechar); //Adiciona o botão Fechar
        setBounds(150,150,700,500); //Aqui você define a posição e o tamanho da janela ao mesmo tempo
        setTitle("Janela com Botão"); //Aqui você define o título da janela
        setVisible(true); //Aqui você mostra a janela na tela

    }
    public static void main(String[] args) {
        JanelaComBotao janela = new JanelaComBotao(); //Cria o objeto janela com botões
    }
}

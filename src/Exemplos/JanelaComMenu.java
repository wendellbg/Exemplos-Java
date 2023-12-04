package Exemplos;
import javax.swing.*;
import java.awt.*;
public class JanelaComMenu extends JFrame {
    //Criando atributos de JMenuBar
    private final JMenuBar barraMenu;
    private final JMenu mnArquivo, mnSalvar;
    private final JMenuItem mnNovo,mnAjuda,mnMod1,mnMod2;
    public JanelaComMenu(String titulo) {
        super(titulo);
        super.setLayout(null);
        //Criando o menu principal
        this.barraMenu = new JMenuBar();
        //Criando menus
        this.mnArquivo = new JMenu("Arquivo");
        this.mnSalvar = new JMenu("Salvar como..");
        //Criando Itens de menus
        this.mnNovo = new JMenuItem("Novo");
        this.mnAjuda = new JMenuItem("Ajuda");
        this.mnMod1 = new JMenuItem("Modo 1");
        this.mnMod2 = new JMenuItem("Modo 2");
        //Adicionando Itens de Menu no menu Salvar
        this.mnSalvar.add(this.mnMod1);
        this.mnSalvar.add(this.mnMod2);
        //Adicionando Menus e Itens do Menu de Arquivo
        this.mnArquivo.add(this.mnNovo);
        this.mnArquivo.add(this.mnSalvar);
        //Adicionando Menu e Itens de Menu na Barra Principal
        this.barraMenu.add(this.mnArquivo);
        this.barraMenu.add(this.mnAjuda);
        //definindo coordenadas
        this.barraMenu.setBounds(0,0,400,20);
        //Adicionando Barra Principal na camada da Barra de Menus
        super.getLayeredPane().add(this.barraMenu);
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
        JanelaComMenu menu = new JanelaComMenu("Cadastro");
        menu.setVisible(true);
    }
}

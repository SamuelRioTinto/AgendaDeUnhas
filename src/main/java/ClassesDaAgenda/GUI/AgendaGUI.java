package ClassesDaAgenda.GUI;


import ClassesDaAgenda.OperacoesDaAgenda;
import ClassesDaAgenda.OperacoesDoSistema;
import ClassesDaAgenda.controller.AgendaAddController;
import ClassesDaAgenda.controller.AgendaEscolhaDeAtendimentoController;
import ClassesDaAgenda.controller.AgendaRemoveController;
import ClassesDaAgenda.controller.AgendaSearchController;

import javax.swing.*;
import java.awt.*;


public class AgendaGUI extends JFrame{
    JLabel linha1, linha2;
    ImageIcon AgendaImg = new ImageIcon("./imgs/imagem_agenda.jpg");
    ImageIcon addImg = new ImageIcon("./imgs/icons/add_cliente.png");
    ImageIcon pesqImg = new ImageIcon("./imgs/icons/search_cliente.png");
    ImageIcon removeImg = new ImageIcon("./imgs/icons/remove_cliente.png");
    ImageIcon escolhaDeAtendimentoImg=new ImageIcon("./imgs/icons/add_atendimento.png");


    JButton botaoAdicionar, botaoPesquisar, botaoRemover,botaoEscolhaDeAtendimento ;
    OperacoesDoSistema operacoes = new OperacoesDaAgenda();

    public AgendaGUI(){
        setTitle("Agenda de Atendimentos");
        setSize(800,600); //tamanho da janela
        setLocation(150, 150);
        setResizable(false);
        getContentPane().setBackground(Color.white);
        linha1 = new JLabel("Minha Agenda de Atendimentos", JLabel.CENTER);
        linha1.setForeground(Color.red);
        linha1.setFont(new Font("Serif", Font.BOLD, 24));
        linha2 = new JLabel(AgendaImg, JLabel.CENTER);
        botaoAdicionar = new JButton("Adicionar",addImg);
        botaoAdicionar.addActionListener(new AgendaAddController(operacoes, this));
        botaoPesquisar = new JButton("Pesquisar", pesqImg);
        botaoPesquisar.addActionListener(new AgendaSearchController(operacoes, this));
        botaoRemover = new JButton("Remover", removeImg);
        botaoRemover.addActionListener(new AgendaRemoveController(operacoes, this));
        botaoEscolhaDeAtendimento = new JButton("Adicionar atendimento para o cliente ",escolhaDeAtendimentoImg);
        botaoEscolhaDeAtendimento.addActionListener(new AgendaEscolhaDeAtendimentoController(operacoes, this));
        getContentPane().setLayout(new GridLayout(3,2));
        getContentPane().add(linha1);
        getContentPane().add(botaoAdicionar);
        getContentPane().add(linha1);
        getContentPane().add(botaoEscolhaDeAtendimento);
        getContentPane().add(linha2);
        getContentPane().add(botaoPesquisar);
        getContentPane().add(new JLabel());
        getContentPane().add(botaoRemover);



    }

    public static void main(String [] args){
        JFrame janela = new AgendaGUI();
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

package ClassesDaAgenda.controller;

import ClassesDaAgenda.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AgendaEscolhaDeAtendimentoController implements ActionListener {

    private OperacoesDoSistema operacoes;
    private JFrame janelaPrincipal;

    public AgendaEscolhaDeAtendimentoController(OperacoesDoSistema operacoes, JFrame janela) {
        this.operacoes = operacoes;
        this.janelaPrincipal = janela;
    }

    @Override
    public void actionPerformed(ActionEvent e){
        EnumTipoAtendimento tipo=null;
        EnumMes mes=null;
        EnumDia dia=null;

        String cpf = JOptionPane.showInputDialog(janelaPrincipal, "digite seu cpf" );

        int tipoAtendimento=Integer.parseInt(
                JOptionPane.showInputDialog(janelaPrincipal,"informe o tipo de atendimento : \n1 - PÉS" +
                        "\n2 - MAOS \n3 - PES_MAOS"));

        switch (tipoAtendimento){
            case 1 ->{tipo=EnumTipoAtendimento.PES;}

            case 2 ->{tipo=EnumTipoAtendimento.MAOS;}

            case 3 ->{tipo=EnumTipoAtendimento.PES_MAOS;}
        }

        int qualDia=Integer.parseInt(JOptionPane.showInputDialog(janelaPrincipal,"informe dia do atendiemnto :" +
                "\n1 - SEGUNDA_FEIRA \n2 - TERCA_FEIRA \n3 - QUARTA_FEIRA \n4 - QUINTA_FEIRA \n5 - SEXTA_FEIRA"));

        switch (qualDia){
            case 1 -> {dia=EnumDia.SEGUNDA_FEIRA;}

            case 2 -> {dia=EnumDia.TERCA_FEIRA;}

            case 3 -> {dia=EnumDia.QUARTA_FEIRA;}

            case 4 -> {dia=EnumDia.QUINTA_FEIRA;}

            case 5 -> {dia=EnumDia.SEXTA_FEIRA;}
        }

        int qualMes=Integer.parseInt(JOptionPane.showInputDialog(janelaPrincipal,"informe o mes do atendimento : " +
                "\n1 - JANEIRO \n2 -  FEVEREIRO \n3 -MARCO \n4 - ABRIO \n5 - MAIO \n6 - JUNHO \n7 - JULHO \n8 -AGOSTO" +
                "\n9 - SETEMPRO \n10 -OUTUBRO \n11 - NOVEMBRO \n12 -  DEZEMBRO"));

        switch (qualMes){
            case 1 -> {mes=EnumMes.JANEIRO;}

            case 2 -> {mes=EnumMes.FEVEREIRO;}

            case 3 -> {mes=EnumMes.MARCO;}

            case 4 -> {mes=EnumMes.ABRIO;}

            case 5 -> {mes=EnumMes.MAIO;}

            case 6 -> {mes=EnumMes.JUNHO;}

            case 7 -> {mes=EnumMes.JULHO;}

            case 8 -> {mes=EnumMes.AGOSTO;}

            case 9 -> {mes=EnumMes.SETEMPRO;}

            case 10 -> {mes=EnumMes.OUTUBRO;}

            case 11 -> {mes=EnumMes.NOVEMBRO;}

            case 12 -> {mes=EnumMes.DEZEMBRO;}
        }

        String horario=JOptionPane.showInputDialog(janelaPrincipal,"digite o seu horario dos eu atendimento: ");

        double preco=Double.parseDouble(JOptionPane.showInputDialog(janelaPrincipal,"digite o preço do seu atendimento: "));

        boolean cadastrou=operacoes.EscolhaDeAtendimento(cpf,mes,dia,horario,tipo,preco);

        if(cadastrou){
            JOptionPane.showMessageDialog(janelaPrincipal,"o atendimento foi cadastrato ");

        }else{
            JOptionPane.showMessageDialog(janelaPrincipal,"atendimento não foi cadastrado");
        }
    }
}

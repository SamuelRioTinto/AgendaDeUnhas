package ClassesDaAgenda;

public class Atendimento {

    private EnumMes mes;
    private EnumDia dia;
    private String horario;
    private EnumTipoAtendimento atendimento;
    private double preco;

    public Atendimento(EnumMes mes,EnumDia dia,String horario,EnumTipoAtendimento atendimento,double preco){
        this.mes=mes;
        this.dia=dia;
        this.horario=horario;
        this.atendimento=atendimento;
        this.preco=preco;
    }

    public EnumMes getMes() {
        return mes;
    }

    public void setMes(EnumMes mes) {
        this.mes = mes;
    }

    public EnumDia getDia() {
        return dia;
    }

    public void setDia(EnumDia dia) {
        this.dia = dia;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public EnumTipoAtendimento getAtendimento() {
        return atendimento;
    }

    public void setAtendimento(EnumTipoAtendimento atendimento) {
        this.atendimento = atendimento;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Atendimento{" +
                "mes=" + mes +
                ", dia=" + dia +
                ", horario='" + horario + '\'' +
                ", atendimento=" + atendimento +
                ", preco=" + preco +
                '}';
    }
}

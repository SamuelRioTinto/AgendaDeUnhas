package ClassesDaAgenda;

public class Atendimento {

    private EnumMes mes;
    private EnumDia dia;
    private String horario;

    public Atendimento(EnumMes mes,EnumDia dia,String horario){
        this.mes=mes;
        this.dia=dia;
        this.horario=horario;
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


    public String toString() {
        return "Atendimento foi marcado para {" + "mes=" + mes + ", dia=" + dia + ", horario='" + horario + '\'' + '}';
    }
}

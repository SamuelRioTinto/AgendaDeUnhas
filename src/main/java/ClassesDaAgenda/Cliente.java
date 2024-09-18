package ClassesDaAgenda;

public class Cliente {

    private String nome;
    private String telefone;
    private String cpg;
    private Atendimento atendimento;

    public Cliente(String nome,String telefone,String cpg,Atendimento atendimento){
        this.nome=nome;
        this.telefone=telefone;
        this.cpg=cpg;
        this.atendimento=atendimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpg() {
        return cpg;
    }

    public void setCpg(String cpg) {
        this.cpg = cpg;
    }

    public Atendimento getAtendimento() {
        return atendimento;
    }

    public void setAtendimento(Atendimento atendimento) {
        this.atendimento = atendimento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", cpg='" + cpg + '\'' +
                ", atendimento=" + atendimento +
                '}';
    }
}

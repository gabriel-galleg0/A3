package entidades;

public class Cliente {
    private int id;
    private String nome;
    private String cpf;
    private String Telefone;
    private String Endereco;
    private String nivel;

    public Cliente(String nome, String cpf, String Telefone, String Endereco, String nivel) {
         this.nome = nome;
        this.cpf = cpf;
        this.Telefone = Telefone;
        this.Endereco = Endereco;
        this.nivel = nivel;
    }
    
    public Cliente(int id, String nome, String cpf, String Telefone, String Endereco, String nivel){
        this.nome = nome;
        this.cpf = cpf;
        this.Telefone = Telefone;
        this.Endereco = Endereco;
        this.nivel = nivel;
    }
    
    public Cliente(){
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
}
    


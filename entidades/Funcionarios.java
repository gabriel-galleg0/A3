/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author gabri
 */
public class Funcionarios {
    private int id;
    private String nome;
    private String cpf;
    private String Telefone;
    private String Endereco;
    private String cargo;

    public Funcionarios(String nome, String cpf, String Telefone, String Endereco, String cargo) {
        this.nome = nome;
        this.cpf = cpf;
        this.Telefone = Telefone;
        this.Endereco = Endereco;
        this.cargo = cargo;
    }

    public Funcionarios(int id, String nome, String cpf, String Telefone, String Endereco, String cargo) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.Telefone = Telefone;
        this.Endereco = Endereco;
        this.cargo = cargo;
    }

    public Funcionarios() {
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    
    
    
    
}


package com.locadorafx.Entities.Clientes;

public final class Cliente extends Pessoa{


    public Cliente(String nome, String sobrenome, String cpf, String email, String rg, String endereco) {
        super(nome, sobrenome, cpf, email, rg, endereco);
    }

    //----------------------------------------------------------------------------
    public String toString() {
        return "Cliente -> id: -erro- nome: %s sobrenome: %s cpf: %s email: %s RG: %s, Endereço: %s".formatted(/*id,*/ getNome(), getSobrenome(), getCpf(), getEmail(), getRg(), getEndereco());
    }
}

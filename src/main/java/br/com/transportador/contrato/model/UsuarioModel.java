package br.com.transportador.contrato.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "geral.usuario")
@Getter
@Setter

public class UsuarioModel {

    @Id
    public Integer cpf;
    @Column(nullable = false, length = 50)
    public String nome;
    @Column(nullable = false, length = 50)
    public String login;
    @Column(nullable = false, length = 65)
    public String senha;

}

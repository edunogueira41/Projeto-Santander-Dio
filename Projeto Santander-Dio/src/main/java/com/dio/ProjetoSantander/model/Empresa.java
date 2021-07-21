package com.dio.ProjetoSantander.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Empresa {
        @Id
        @GeneratedValue
        private long id;

        private String descricao;
        private String cnpj;
        private String endereco;
        private String bairro;
        private String cidade;
        private String estado;
        private String telefone;
}

package com.youtube.jovemtranquilao.orientacaoAObjetos;

import java.util.Date;

import com.youtube.jovemtranquilao.spring.entity.Pessoa;

public class Maternidade {

    public  Pessoa nascer(String name, String sexo){
        Pessoa pessoa = new Pessoa();
        pessoa.setNome(name);
        pessoa.setSexo(sexo);
        pessoa.setDataDeNascimento(new Date());
        return pessoa;
    }

}

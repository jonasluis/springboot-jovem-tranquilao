package com.youtube.jovemtranquilao.spring.business;

import com.youtube.jovemtranquilao.spring.entity.Pessoa;

public class PessoaBusiness {
	
	void mudarSexo(Pessoa pessoa, String novoSexo, String novoNome) {
        pessoa.setSexo(novoSexo);
        pessoa.setNome(novoNome);
    }

    void casar(Pessoa pessoa, String antigoSobrenome, String novoSobrenome){
        pessoa.setNome(pessoa.getNome().replace(antigoSobrenome, novoSobrenome));
    }
}

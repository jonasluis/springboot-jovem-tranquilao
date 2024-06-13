package com.youtube.jovemtranquilao.orientacaoAObjetos;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import com.youtube.jovemtranquilao.spring.entity.Pessoa;

public class CadastroDePessoa {

    List<Pessoa> pessoaList = new ArrayList<>();

    Maternidade maternidade = new Maternidade();

    public static void main(String[] args) throws ParseException {

        new CadastroDePessoa().rodar();
    }

    private void rodar() {
        Pessoa zumba = maternidade.nascer("Zumba Games", "Masculino");
        Pessoa zefrina = maternidade.nascer("Zefrina Silva", "Feminino");
        Pessoa joao = maternidade.nascer("Joao Silva", "Masculino");
        Pessoa robo = maternidade.nascer("Robo Android", "Robo");

        pessoaList.add(zumba);
        pessoaList.add(zefrina);
        pessoaList.add(joao);
        pessoaList.add(robo);

        List<Pessoa> homemList = new ArrayList<>();
        List<Pessoa> mulherList = new ArrayList<>();
        List<Pessoa> outrosGenerosList = new ArrayList<>();

        for (Pessoa pessoa : pessoaList){
            if (pessoa.getSexo().equals("Masculino")){
                homemList.add(pessoa);
            } else if (pessoa.getSexo().equals("Feminino")){
                mulherList.add(pessoa);
            } else {
                outrosGenerosList.add(pessoa);
            }
        }
        System.out.println(outrosGenerosList);

    }
}

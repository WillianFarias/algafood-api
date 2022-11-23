package com.algaworks.algafood.jpa;

import com.algaworks.algafood.AlgafoodApiApplication;
import com.algaworks.algafood.domain.model.Cozinha;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import java.util.List;

public class ConsultaCozinhaMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);

        CadastroCozinha cadastroCozinha = applicationContext.getBean(CadastroCozinha.class);

        //Listar cozinhas persistidas
//        List<Cozinha> cozinhas = cadastroCozinha.cozinhas();
//
//        for (Cozinha cozinha : cozinhas) {
//            System.out.println(cozinha.getNome());
//        }

//        Cadastra novas cozinhas
//        Cozinha cozinhaBrasileira = new Cozinha();
//        cozinhaBrasileira.setNome("Brasileira");
//
//        Cozinha cozinhaMexicana = new Cozinha();
//        cozinhaMexicana.setNome("Mexicana");
//
//        cadastroCozinha.adicionar(cozinhaBrasileira);
//        cadastroCozinha.adicionar(cozinhaMexicana);

//        busca por id
//        System.out.println(cadastroCozinha.buscar(1L).getNome());

//      atualiza
        Cozinha cozinhaBrasileira = new Cozinha();
        cozinhaBrasileira.setId(1);
        cozinhaBrasileira.setNome("Brasileira");

        cadastroCozinha.adicionar(cozinhaBrasileira);
    }
}

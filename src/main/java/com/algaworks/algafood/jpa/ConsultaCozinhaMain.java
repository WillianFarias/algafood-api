package com.algaworks.algafood.jpa;

import com.algaworks.algafood.AlgafoodApiApplication;
import com.algaworks.algafood.domain.model.Cozinha;
import com.algaworks.algafood.domain.model.FormaPagamento;
import com.algaworks.algafood.domain.model.Restaurante;
import com.algaworks.algafood.domain.repository.CozinhaRepository;
import com.algaworks.algafood.domain.repository.FormaPagamentoRepository;
import com.algaworks.algafood.domain.repository.RestauranteRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import java.util.List;

public class ConsultaCozinhaMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);

//        CozinhaRepository cozinhaRepository = applicationContext.getBean(CozinhaRepository.class);
        RestauranteRepository restauranteRepository = applicationContext.getBean(RestauranteRepository.class);
        FormaPagamentoRepository formaPagamentoRepository = applicationContext.getBean(FormaPagamentoRepository.class);

        List<Restaurante> restaurantes = restauranteRepository.todos();

        for (Restaurante restaurante : restaurantes) {
            System.out.println(restaurante.getNome() + " taxa frete: " + restaurante.getTaxaFrete() + " cozinha: "
                    + restaurante.getCozinha().getNome());
        }

        List<FormaPagamento> formasDePagamento = formaPagamentoRepository.todas();
        for (FormaPagamento formaPagamento : formasDePagamento) {
            System.out.println(formaPagamento.getDescricao());
        }

        //LISTAR
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

//        BUSCA
//        System.out.println(cadastroCozinha.buscar(1L).getNome());

//      ATUALIZA
//        Cozinha cozinhaBrasileira = new Cozinha();
//        cozinhaBrasileira.setId(1L);
//        cozinhaBrasileira.setNome("Brasileira");
//
//        cadastroCozinha.salvar(cozinhaBrasileira);

//      REMOVE
        Cozinha cozinha = new Cozinha();
        cozinha.setId(1L);

//        cozinhaRepository.remover(cozinha);
    }
}

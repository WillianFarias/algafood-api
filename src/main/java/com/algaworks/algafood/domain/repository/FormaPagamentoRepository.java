package com.algaworks.algafood.domain.repository;

import com.algaworks.algafood.domain.model.FormaPagamento;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface FormaPagamentoRepository {

    List<FormaPagamento> todas();
    FormaPagamento porId(Long id);
    FormaPagamento adicionar(FormaPagamento formaPagamento);
    void remover(FormaPagamento formaPagamento);
}

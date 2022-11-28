package com.algaworks.algafood.domain.repository;

import com.algaworks.algafood.domain.model.Estado;

import java.util.List;

public interface EstadoRepository {

    List<Estado> todos();
    Estado porId(Long id);
    Estado cadastrar(Estado estado);
    void remover(Estado estado);
}

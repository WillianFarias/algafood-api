package com.algaworks.algafood.infrastructure.repository;

import com.algaworks.algafood.domain.model.Permissao;
import com.algaworks.algafood.domain.repository.PermissaoRespository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class PermissaoRepositoryImpl implements PermissaoRespository {

    @PersistenceContext
    EntityManager manager;

    @Override
    public List<Permissao> todos() {
        return manager.createQuery("from permissao", Permissao.class).getResultList();
    }

    @Override
    public Permissao porId(Long id) {
        return manager.find(Permissao.class, id);
    }

    @Transactional
    @Override
    public Permissao adicionar(Permissao permissao) {
        return manager.merge(permissao);
    }

    @Transactional
    @Override
    public void remover(Permissao permissao) {
        permissao = porId(permissao.getId());
        manager.remove(permissao);
    }
}

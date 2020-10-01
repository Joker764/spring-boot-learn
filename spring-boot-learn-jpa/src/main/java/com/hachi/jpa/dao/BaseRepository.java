package com.hachi.jpa.dao;

import com.hachi.jpa.entity.BaseEntity;
import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.stream.Collectors;

public class BaseRepository<T extends BaseEntity, ID> extends SimpleJpaRepository<T, ID> {

    private final EntityManager entityManager;

    public BaseRepository(JpaEntityInformation<T, ?> entityInformation, EntityManager entityManager) {
        super(entityInformation, entityManager);
        this.entityManager = entityManager;
    }

    @Override
    public List<T> findAll() {
        return super.findAll().stream().filter(entity -> entity.getDeletingDatetime() != null).collect(Collectors.toList());
    }
}

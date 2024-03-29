package ru.cft.starterkit.repository;

import ru.cft.starterkit.entity.SampleEntity;
import ru.cft.starterkit.exception.ObjectNotFoundException;

import java.util.Collection;

public interface SampleEntityRepository {

    SampleEntity add(SampleEntity entity);

    SampleEntity get(Long id) throws ObjectNotFoundException;

    Collection<SampleEntity> getOrders();

    SampleEntity update(Long id, Double price, String status, String date) throws ObjectNotFoundException;

    SampleEntity update(Long id, String status, Long supID) throws ObjectNotFoundException;
}

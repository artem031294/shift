package ru.cft.starterkit.service.implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.cft.starterkit.entity.SampleEntity;
import ru.cft.starterkit.exception.ObjectNotFoundException;
import ru.cft.starterkit.repository.SampleEntityRepository;
import ru.cft.starterkit.service.SampleEntityService;

import java.util.Collection;
import java.util.UUID;

@Service
public class SampleEntityServiceImpl implements SampleEntityService {

    private final SampleEntityRepository sampleEntityRepository;

    @Autowired
    public SampleEntityServiceImpl(SampleEntityRepository sampleEntityRepository) {
        this.sampleEntityRepository = sampleEntityRepository;
    }

    @Override
    public SampleEntity add(String foo, Double bar) {
        return null;
    }

    @Override
    public SampleEntity get(Long id) throws ObjectNotFoundException {
        return sampleEntityRepository.get(id);
    }

    @Override
    public Collection<SampleEntity> getOrders() {
        return sampleEntityRepository.getOrders();
    }

    @Override
    public SampleEntity add(SampleEntity sampleEntity) {
        sampleEntity.setBaz(UUID.randomUUID());
        return sampleEntityRepository.add(sampleEntity);
    }

    @Override
    public SampleEntity reply(Long id, Double price, String status, String date) throws ObjectNotFoundException {
        return sampleEntityRepository.update(id, price, status, date);
    }

    @Override
    public SampleEntity accept(Long id, String status, Long supID) throws ObjectNotFoundException {
        return sampleEntityRepository.update(id, status, supID);
    }

}

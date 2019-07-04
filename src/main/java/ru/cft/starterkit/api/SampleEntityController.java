package ru.cft.starterkit.api;

import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import ru.cft.starterkit.entity.SampleEntity;
import ru.cft.starterkit.exception.ObjectNotFoundException;
import ru.cft.starterkit.service.SampleEntityService;

import java.util.Collection;

@CrossOrigin
@RestController
public class SampleEntityController {

    private final SampleEntityService sampleEntityService;

    @Autowired
    public SampleEntityController(SampleEntityService sampleEntityService) {
        this.sampleEntityService = sampleEntityService;
    }

    @PostMapping(
            path="/add",
            consumes = "application/json",
            produces = "application/json"
    )
    public SampleEntity add(@RequestBody SampleEntity sampleEntity) {
        return sampleEntityService.add(sampleEntity);
    }

    @GetMapping(
            path = "/order/{id}",
            produces = "application/json"
    )
    public SampleEntity get(@PathVariable(name = "id") Long id) {
        try {
            return sampleEntityService.get(id);
        } catch (ObjectNotFoundException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage(), e);
        }
    }

    @GetMapping(
            path = "/orders",
            produces = "application/json"
    )
    public Collection<SampleEntity> getOrders() {
        return sampleEntityService.getOrders();
    }


    @PostMapping(
            path="/reply/{id}",
            consumes = "application/json",
            produces = "application/json"
    )
    public SampleEntity reply(@PathVariable(name = "id") Long id, @RequestBody SampleEntity sampleEntity) {

        try {
            String status = "replied";
            String date = sampleEntity.getDate();
            Double price = sampleEntity.getPrice();
            return sampleEntityService.reply(id, price, status, date);
        } catch (ObjectNotFoundException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage(), e);
        }
    }


}

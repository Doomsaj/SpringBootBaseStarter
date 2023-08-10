package ir.doomsaj.starter.controller;

import ir.doomsaj.starter.exception.NotFoundException;
import ir.doomsaj.starter.model.dto.BaseDto;
import ir.doomsaj.starter.model.entity.BaseEntity;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ir.doomsaj.starter.service.IBaseService;

import java.util.List;


public class BaseRestController<T extends BaseEntity, GD extends BaseDto, PD extends BaseDto> implements IBaseController<GD, PD>{
    protected IBaseService<T, GD, PD> baseService;

    public BaseRestController(IBaseService<T, GD, PD> baseService) {
        this.baseService = baseService;
    }

    @Override
    @GetMapping("{id}")
    public ResponseEntity<GD> findBydId(@PathVariable(name = "id") Long id) throws NotFoundException {
        return new ResponseEntity<>(baseService.findById(id), HttpStatus.OK);
    }

    @Override
    @GetMapping
    public ResponseEntity<List<GD>> findAll() {
        return new ResponseEntity<>(baseService.findAll(), HttpStatus.OK);
    }

    @Override
    @PostMapping
    public ResponseEntity<GD> create(@RequestBody @Valid PD dto) {
        return new ResponseEntity<>(baseService.create(dto), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<GD> update(PD dto) {
        return null;
    }

    @Override
    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteById(@PathVariable(name = "id") Long id) {
        baseService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

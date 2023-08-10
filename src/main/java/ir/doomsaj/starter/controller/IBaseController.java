package ir.doomsaj.starter.controller;

import ir.doomsaj.starter.exception.NotFoundException;
import ir.doomsaj.starter.model.dto.BaseDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IBaseController<GD extends BaseDto, PD extends BaseDto> {
    ResponseEntity<GD> findBydId(Long id) throws NotFoundException;
    ResponseEntity<List<GD>> findAll();
    ResponseEntity<GD> create(PD dto);
    ResponseEntity<GD> update(PD dto) throws NotFoundException;
    ResponseEntity<Void> deleteById(Long id);
}

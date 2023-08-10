package ir.doomsaj.starter.service;


import ir.doomsaj.starter.exception.NotFoundException;
import ir.doomsaj.starter.model.dto.BaseDto;
import ir.doomsaj.starter.model.entity.BaseEntity;

import java.util.List;

public interface IBaseService<T extends BaseEntity, GD extends BaseDto, PD extends BaseDto> {
    GD findById(Long id) throws NotFoundException;

    List<GD> findAll();

    GD create(PD dto);

    GD update(Long id, PD dto) throws NotFoundException;

    void deleteById(Long id);
}

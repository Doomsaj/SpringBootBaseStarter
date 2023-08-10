package ir.doomsaj.starter.mapper;

import ir.doomsaj.starter.model.dto.BaseDto;
import ir.doomsaj.starter.model.entity.BaseEntity;

public interface IBaseMapper<T extends BaseEntity, GD extends BaseDto, PD extends BaseDto> {
    GD entityToGetDto(T entity);
    T postDtoToEntity(PD dto);
}

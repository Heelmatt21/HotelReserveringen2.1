package Mapper;

import Dto.BetalingenDto;
import Entities.Betalingen;

import java.util.List;

public interface BetalingenMapper {
    Betalingen toEntity(BetalingenDto dto);

    BetalingenDto toDto(Betalingen betalingen);

    List<Betalingen> toEntityList(List<BetalingenDto> dtoList);

    List<BetalingenDto> toDtoList(List<Betalingen> list);
}


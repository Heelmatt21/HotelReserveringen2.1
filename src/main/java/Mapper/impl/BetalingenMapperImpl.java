package Mapper.impl;

import Dto.BetalingenDto;
import Entities.Betalingen;
import Mapper.BetalingenMapper;
import org.glassfish.jersey.Beta;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class BetalingenMapperImpl implements BetalingenMapper {

    @Override
    public Betalingen toEntity(BetalingenDto dto) {
        Betalingen betalingen = new Betalingen();
        betalingen.setBetaling_id(dto.getbetaling_id());
        betalingen.setBetalingDatum((Date) dto.getBetalingDatum());
        betalingen.setBedrag(dto.getBedrag());
        betalingen.setBetalingsmethode(dto.getBetalingsmethode());

        return betalingen;
    }

    @Override
    public BetalingenDto toDto(Betalingen betalingen) {
        BetalingenDto betalingenDto = new BetalingenDto();
        betalingenDto.setBetaling_id(betalingen.getBetaling_id());
        betalingenDto.setBetalingDatum(betalingen.getBetalingDatum());
        betalingenDto.setBedrag(betalingen.getBedrag());
        betalingenDto.setBetalingsmethode(betalingen.getBetalingsmethode());

        return betalingenDto;
    }

    @Override
    public List<Betalingen> toEntityList(List<BetalingenDto> dtoList) {
        List<Betalingen> list = new ArrayList<>();

        for (BetalingenDto betalingenDto : dtoList) {
            list.add(toEntity(betalingenDto));
        }

        return list;
    }

    @Override
    public List<BetalingenDto> toDtoList(List<Betalingen> list) {
        List<BetalingenDto> betalingenDtoList = new ArrayList<>();

        for (Betalingen betalingen : list) {
            betalingenDtoList.add(toDto(betalingen));
        }

        return betalingenDtoList;
    }
    
}

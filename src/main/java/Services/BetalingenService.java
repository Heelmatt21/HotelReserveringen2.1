package Services;

import Dto.BetalingenDto;

import java.util.List;

public interface BetalingenService {
    List<BetalingenDto> getAllBetalingen();

    BetalingenDto createBetalingen(BetalingenDto betalingenDto);

    int deleteBetalingen(int betalingen_id);

    BetalingenDto updateBetalingen(BetalingenDto betalingenDto);

    BetalingenDto findBetalingenById(int betalingen_id);

    List<BetalingenDto> findBetalingenofKlantByKlantID (int klant_id);

    List<BetalingenDto> findBetalingenofReserveringenByReserveringId (int reservering_id);


}
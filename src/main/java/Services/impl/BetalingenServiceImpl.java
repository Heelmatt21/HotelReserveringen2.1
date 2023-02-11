package Services.impl;

import config.JPAConfiguration;
import Dao.BetalingenDao;
import Dto.BetalingenDto;
import Mapper.BetalingenMapper;
import Mapper.impl.BetalingenMapperImpl;
import Services.BetalingenService;

import javax.persistence.EntityManager;
import java.util.List;

public class BetalingenServiceImpl implements BetalingenService {

    private final BetalingenDao betalingenDao;
    private final BetalingenMapper betalingenMapper;

    public BetalingenServiceImpl(EntityManager entityManager) {
        this.betalingenDao = new BetalingenDao(JPAConfiguration.getEntityManager());
        this.betalingenMapper = new BetalingenMapperImpl();
    }

    @Override
    public List<BetalingenDto> getAllBetalingen() {
        return betalingenMapper.toDtoList(betalingenDao.getAllBetalingen());
    }

    @Override
    public BetalingenDto createBetalingen(BetalingenDto betalingenDto) {
        return betalingenMapper.toDto(betalingenDao.createBetalingen(betalingenMapper.toEntity(betalingenDto)));
    }

    @Override
    public int deleteBetalingen(int betaling_id) {
        return betalingenDao.deleteBetalingen(betaling_id);
    }

    @Override
    public BetalingenDto updateBetalingen(BetalingenDto betalingenDto) {
        return betalingenMapper.toDto(betalingenDao.updateBetalingen(betalingenMapper.toEntity(betalingenDto)));
    }

    @Override
    public BetalingenDto findBetalingenById(int betaling_id) {
        return betalingenMapper.toDto(betalingenDao.findBetalingenByID(betaling_id));
    }

    @Override
    public List<BetalingenDto> findBetalingenofKlantByKlantID(int klant_id) {
        return betalingenMapper.toDtoList(betalingenDao.findBetalingenofKlantByKlantID(klant_id));
    }

    @Override
    public List<BetalingenDto> findBetalingenofReserveringenByReserveringId(int reservering_id) {
        return null;
    }
}

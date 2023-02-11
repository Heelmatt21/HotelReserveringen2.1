package controller;

import Dto.BetalingenDto;
import Services.BetalingenService;
import Services.impl.BetalingenServiceImpl;
import config.JPAConfiguration;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;


@Path("betalingen")
public class BetalingenController {
    private final BetalingenService betalingenService;

    public BetalingenController() {
        this.betalingenService = new BetalingenServiceImpl(JPAConfiguration.getEntityManager());
    }

    @Path("/all")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<BetalingenDto> getAlleBetalingen() {
        return betalingenService.getAllBetalingen();
    }

    @Path("/add")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public BetalingenDto add(BetalingenDto betalingenDto) { return betalingenService.createBetalingen(betalingenDto);
    }

    @Path("/update")
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public BetalingenDto update(BetalingenDto betalingenDto) { return betalingenService.updateBetalingen(betalingenDto);
    }

    @Path("/remove")
    @DELETE
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public int remove(int betaling_id) {
        return betalingenService.deleteBetalingen(betaling_id);
    }

    @Path("/find")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public BetalingenDto findBetalingen(BetalingenDto betalingenDto) {
        return betalingenService.findBetalingenById(betalingenDto.getbetaling_id());
    }

    @Path("/find-klanten-betalingen")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public List<BetalingenDto> findBetalingenofKlantByKlantID(int klant_id){
        return betalingenService.findBetalingenofKlantByKlantID(klant_id);
    }

    @Path("/find-betalingen-reservering")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public List<BetalingenDto> findBetalingenofReserveringenByReserveringId (int reservering_id){
        return betalingenService.findBetalingenofReserveringenByReserveringId (reservering_id);
    }
}
    


package br.com.fabio.ejbtransactions;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
@Stateless
public class Service {

    @EJB
    private BeanPersistence persistence;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String doGet() {
        StringBuilder out = new StringBuilder();

        try {
            persistence.save(new Cidade("Rio do Sul"));
            out.append("OK.");
        } catch (Exception ex) {
            ex.printStackTrace();
            out.append("Error.");
        }

        return out.toString();
    }
}
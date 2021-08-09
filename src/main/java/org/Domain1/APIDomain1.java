package org.Domain1;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/hello")
public class APIDomain1 {

    @POST
    public ModelDomain1 sayHello(ModelDomain1 modelDomain1)
    {
       return modelDomain1;
    }
}
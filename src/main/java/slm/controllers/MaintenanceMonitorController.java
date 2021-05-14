package slm.controllers;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("api/MaintenanceMonitor3")
public class MaintenanceMonitorController {
    @GET
    @Path("/{sourceString}")
    @Produces(MediaType.TEXT_PLAIN)
    public String getMaintenanceStringFromSourceString(@PathParam("sourceString") String sourceString){
        return sourceString;
    }
}

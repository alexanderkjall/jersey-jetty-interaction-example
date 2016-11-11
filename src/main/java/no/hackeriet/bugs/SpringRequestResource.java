package no.hackeriet.bugs;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("resource")
@Component
public class SpringRequestResource {

    @Value("${message}")
    private String message;
    private String message2;

    @Autowired
    public void setMessage2(@Value("${message2}") String message2) {
        this.message2 = message2;
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getHello() {
        return message + " world " + message2;
    }
}
package no.hackeriet.bugs;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.spring.scope.RequestContextFilter;

public class App extends ResourceConfig {

    public App() {
        register(RequestContextFilter.class);
        register(SpringRequestResource.class);
    }
}

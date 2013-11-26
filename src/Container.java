import javax.xml.ws.Endpoint;

import services.LolService;

public class Container {

    public static void main(String[] args) {
        LolService lolService = new LolService();
        Endpoint.publish("http://localhost:8080/lolservice", lolService);
    }
}

import javax.xml.ws.Endpoint;

import services.LolService;

public class Container {

    public static void main(String[] args) {
        LolService lolService = new LolService();
        Endpoint.publish("http://0.0.0.0:8080/lolservice", lolService);
    }
}

import client.LolService;
import client.LolServiceService;


public class Client {

    public static void main(String[] args) {
        LolServiceService lolServiceService = new LolServiceService();
        LolService lolServiceProxy = lolServiceService.getLolServicePort();

        System.out.println(lolServiceProxy.doMe());
    }

}

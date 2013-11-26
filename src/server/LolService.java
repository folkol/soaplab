package server;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class LolService {

    private String s = "Hej världen";

    @WebMethod
    public String doMe()
    {
        System.out.println("Någon anropade mig!");
        return s;
    }

    @WebMethod
    public void hitMe(String s) {
        this.s = s;
    }

}

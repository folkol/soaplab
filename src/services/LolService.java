package services;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class LolService {

    @WebMethod
    public String doMe()
    {
        return "Hello world";
    }

}

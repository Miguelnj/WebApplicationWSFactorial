/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fact;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Miguel
 */
@WebService(serviceName = "factorial")
public class factorial {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hellooooo " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "factorial")
    public int factorial(@WebParam(name = "n") int n) {
        //TODO write your implementation code here:
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    
}

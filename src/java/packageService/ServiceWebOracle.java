/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packageService;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author BRYAN
 */
@WebService(serviceName = "ServiceWebOracle")
public class ServiceWebOracle {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "suma")
    public Integer suma(@WebParam(name = "numero_uno") int numero_uno, @WebParam(name = "numero_dos") int numero_dos) {
        //TODO write your implementation code here:
        return numero_uno + numero_dos;
    }
}

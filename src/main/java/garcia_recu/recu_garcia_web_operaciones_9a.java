/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package garcia_recu;

import jakarta.jws.WebService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;

/**
 * @author andre
 */
@WebService(serviceName = "recu_garcia_web_operaciones_9a")
public class recu_garcia_web_operaciones_9a {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Método para calcular la masa
     */
    @WebMethod(operationName = "calcularMasa")
    public double calcularMasa(@WebParam(name = "densidad") double p, @WebParam(name = "volumen") double v) {
        return p * v;
    }
}

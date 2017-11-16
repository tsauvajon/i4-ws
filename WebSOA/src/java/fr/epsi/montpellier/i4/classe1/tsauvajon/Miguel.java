/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.epsi.montpellier.i4.classe1.tsauvajon;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author thomas.sauvajon
 */
@WebService(serviceName = "Miguel")
public class Miguel {

    /**
     * Soy un guerrero latino
     */
    
    @WebMethod(operationName = "migmig")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    @WebMethod(operationName = "add")
    public float add(@WebParam(name = "op1") float op1, @WebParam(name = "op2") float op2) {
        return op1 + op2;
    }
    
    @WebMethod(operationName = "sub")
    public float sub(@WebParam(name = "op1") float op1, @WebParam(name = "op2") float op2) {
        return op1 - op2;
    }
    
    @WebMethod(operationName = "mul")
    public float mul(@WebParam(name = "op1") float op1, @WebParam(name = "op2") float op2) {
        return op1 * op2;
    }
    
    @WebMethod(operationName = "div")
    public float div(@WebParam(name = "op1") float op1, @WebParam(name = "op2") float op2) throws Exception {
        if (op2 == 0) {
          throw new ArithmeticException();
        }
        
        return op1 / op2;
    }
}

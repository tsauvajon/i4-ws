
package fr.epsi.montpellier.i4.classe1.tsauvajon;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Miguel", targetNamespace = "http://tsauvajon.classe1.i4.montpellier.epsi.fr/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Miguel {


    /**
     * 
     * @param op2
     * @param op1
     * @return
     *     returns float
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "add", targetNamespace = "http://tsauvajon.classe1.i4.montpellier.epsi.fr/", className = "fr.epsi.montpellier.i4.classe1.tsauvajon.Add")
    @ResponseWrapper(localName = "addResponse", targetNamespace = "http://tsauvajon.classe1.i4.montpellier.epsi.fr/", className = "fr.epsi.montpellier.i4.classe1.tsauvajon.AddResponse")
    @Action(input = "http://tsauvajon.classe1.i4.montpellier.epsi.fr/Miguel/addRequest", output = "http://tsauvajon.classe1.i4.montpellier.epsi.fr/Miguel/addResponse")
    public float add(
        @WebParam(name = "op1", targetNamespace = "")
        float op1,
        @WebParam(name = "op2", targetNamespace = "")
        float op2);

    /**
     * 
     * @param op2
     * @param op1
     * @return
     *     returns float
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "sub", targetNamespace = "http://tsauvajon.classe1.i4.montpellier.epsi.fr/", className = "fr.epsi.montpellier.i4.classe1.tsauvajon.Sub")
    @ResponseWrapper(localName = "subResponse", targetNamespace = "http://tsauvajon.classe1.i4.montpellier.epsi.fr/", className = "fr.epsi.montpellier.i4.classe1.tsauvajon.SubResponse")
    @Action(input = "http://tsauvajon.classe1.i4.montpellier.epsi.fr/Miguel/subRequest", output = "http://tsauvajon.classe1.i4.montpellier.epsi.fr/Miguel/subResponse")
    public float sub(
        @WebParam(name = "op1", targetNamespace = "")
        float op1,
        @WebParam(name = "op2", targetNamespace = "")
        float op2);

    /**
     * 
     * @param op2
     * @param op1
     * @return
     *     returns float
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "div", targetNamespace = "http://tsauvajon.classe1.i4.montpellier.epsi.fr/", className = "fr.epsi.montpellier.i4.classe1.tsauvajon.Div")
    @ResponseWrapper(localName = "divResponse", targetNamespace = "http://tsauvajon.classe1.i4.montpellier.epsi.fr/", className = "fr.epsi.montpellier.i4.classe1.tsauvajon.DivResponse")
    @Action(input = "http://tsauvajon.classe1.i4.montpellier.epsi.fr/Miguel/divRequest", output = "http://tsauvajon.classe1.i4.montpellier.epsi.fr/Miguel/divResponse")
    public float div(
        @WebParam(name = "op1", targetNamespace = "")
        float op1,
        @WebParam(name = "op2", targetNamespace = "")
        float op2);

    /**
     * 
     * @param op2
     * @param op1
     * @return
     *     returns float
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "mul", targetNamespace = "http://tsauvajon.classe1.i4.montpellier.epsi.fr/", className = "fr.epsi.montpellier.i4.classe1.tsauvajon.Mul")
    @ResponseWrapper(localName = "mulResponse", targetNamespace = "http://tsauvajon.classe1.i4.montpellier.epsi.fr/", className = "fr.epsi.montpellier.i4.classe1.tsauvajon.MulResponse")
    @Action(input = "http://tsauvajon.classe1.i4.montpellier.epsi.fr/Miguel/mulRequest", output = "http://tsauvajon.classe1.i4.montpellier.epsi.fr/Miguel/mulResponse")
    public float mul(
        @WebParam(name = "op1", targetNamespace = "")
        float op1,
        @WebParam(name = "op2", targetNamespace = "")
        float op2);

    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "migmig", targetNamespace = "http://tsauvajon.classe1.i4.montpellier.epsi.fr/", className = "fr.epsi.montpellier.i4.classe1.tsauvajon.Migmig")
    @ResponseWrapper(localName = "migmigResponse", targetNamespace = "http://tsauvajon.classe1.i4.montpellier.epsi.fr/", className = "fr.epsi.montpellier.i4.classe1.tsauvajon.MigmigResponse")
    @Action(input = "http://tsauvajon.classe1.i4.montpellier.epsi.fr/Miguel/migmigRequest", output = "http://tsauvajon.classe1.i4.montpellier.epsi.fr/Miguel/migmigResponse")
    public String migmig(
        @WebParam(name = "name", targetNamespace = "")
        String name);

}

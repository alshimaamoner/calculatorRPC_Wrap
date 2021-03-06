
package servicesource;

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
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CalculatorImpl", targetNamespace = "http://service/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CalculatorImpl {


    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "add", targetNamespace = "http://service/", className = "servicesource.Add")
    @ResponseWrapper(localName = "addResponse", targetNamespace = "http://service/", className = "servicesource.AddResponse")
    @Action(input = "http://service/CalculatorImpl/addRequest", output = "http://service/CalculatorImpl/addResponse")
    public double add(
        @WebParam(name = "arg0", targetNamespace = "")
        double arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        double arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "sub", targetNamespace = "http://service/", className = "servicesource.Sub")
    @ResponseWrapper(localName = "subResponse", targetNamespace = "http://service/", className = "servicesource.SubResponse")
    @Action(input = "http://service/CalculatorImpl/subRequest", output = "http://service/CalculatorImpl/subResponse")
    public double sub(
        @WebParam(name = "arg0", targetNamespace = "")
        double arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        double arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "div", targetNamespace = "http://service/", className = "servicesource.Div")
    @ResponseWrapper(localName = "divResponse", targetNamespace = "http://service/", className = "servicesource.DivResponse")
    @Action(input = "http://service/CalculatorImpl/divRequest", output = "http://service/CalculatorImpl/divResponse")
    public double div(
        @WebParam(name = "arg0", targetNamespace = "")
        double arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        double arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "mul", targetNamespace = "http://service/", className = "servicesource.Mul")
    @ResponseWrapper(localName = "mulResponse", targetNamespace = "http://service/", className = "servicesource.MulResponse")
    @Action(input = "http://service/CalculatorImpl/mulRequest", output = "http://service/CalculatorImpl/mulResponse")
    public double mul(
        @WebParam(name = "arg0", targetNamespace = "")
        double arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        double arg1);

}


package fr.epsi.montpellier.i4.classe1.tsauvajon;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour mul complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="mul">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="op1" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="op2" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mul", propOrder = {
    "op1",
    "op2"
})
public class Mul {

    protected float op1;
    protected float op2;

    /**
     * Obtient la valeur de la propriété op1.
     * 
     */
    public float getOp1() {
        return op1;
    }

    /**
     * Définit la valeur de la propriété op1.
     * 
     */
    public void setOp1(float value) {
        this.op1 = value;
    }

    /**
     * Obtient la valeur de la propriété op2.
     * 
     */
    public float getOp2() {
        return op2;
    }

    /**
     * Définit la valeur de la propriété op2.
     * 
     */
    public void setOp2(float value) {
        this.op2 = value;
    }

}

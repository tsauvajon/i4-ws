
package fr.epsi.montpellier.i4.classe1.tsauvajon;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the fr.epsi.montpellier.i4.classe1.tsauvajon package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _MigmigResponse_QNAME = new QName("http://tsauvajon.classe1.i4.montpellier.epsi.fr/", "migmigResponse");
    private final static QName _Migmig_QNAME = new QName("http://tsauvajon.classe1.i4.montpellier.epsi.fr/", "migmig");
    private final static QName _Mul_QNAME = new QName("http://tsauvajon.classe1.i4.montpellier.epsi.fr/", "mul");
    private final static QName _MulResponse_QNAME = new QName("http://tsauvajon.classe1.i4.montpellier.epsi.fr/", "mulResponse");
    private final static QName _AddResponse_QNAME = new QName("http://tsauvajon.classe1.i4.montpellier.epsi.fr/", "addResponse");
    private final static QName _Sub_QNAME = new QName("http://tsauvajon.classe1.i4.montpellier.epsi.fr/", "sub");
    private final static QName _SubResponse_QNAME = new QName("http://tsauvajon.classe1.i4.montpellier.epsi.fr/", "subResponse");
    private final static QName _Add_QNAME = new QName("http://tsauvajon.classe1.i4.montpellier.epsi.fr/", "add");
    private final static QName _Div_QNAME = new QName("http://tsauvajon.classe1.i4.montpellier.epsi.fr/", "div");
    private final static QName _DivResponse_QNAME = new QName("http://tsauvajon.classe1.i4.montpellier.epsi.fr/", "divResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fr.epsi.montpellier.i4.classe1.tsauvajon
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Add }
     * 
     */
    public Add createAdd() {
        return new Add();
    }

    /**
     * Create an instance of {@link Div }
     * 
     */
    public Div createDiv() {
        return new Div();
    }

    /**
     * Create an instance of {@link Sub }
     * 
     */
    public Sub createSub() {
        return new Sub();
    }

    /**
     * Create an instance of {@link SubResponse }
     * 
     */
    public SubResponse createSubResponse() {
        return new SubResponse();
    }

    /**
     * Create an instance of {@link DivResponse }
     * 
     */
    public DivResponse createDivResponse() {
        return new DivResponse();
    }

    /**
     * Create an instance of {@link MulResponse }
     * 
     */
    public MulResponse createMulResponse() {
        return new MulResponse();
    }

    /**
     * Create an instance of {@link Mul }
     * 
     */
    public Mul createMul() {
        return new Mul();
    }

    /**
     * Create an instance of {@link AddResponse }
     * 
     */
    public AddResponse createAddResponse() {
        return new AddResponse();
    }

    /**
     * Create an instance of {@link Migmig }
     * 
     */
    public Migmig createMigmig() {
        return new Migmig();
    }

    /**
     * Create an instance of {@link MigmigResponse }
     * 
     */
    public MigmigResponse createMigmigResponse() {
        return new MigmigResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MigmigResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tsauvajon.classe1.i4.montpellier.epsi.fr/", name = "migmigResponse")
    public JAXBElement<MigmigResponse> createMigmigResponse(MigmigResponse value) {
        return new JAXBElement<MigmigResponse>(_MigmigResponse_QNAME, MigmigResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Migmig }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tsauvajon.classe1.i4.montpellier.epsi.fr/", name = "migmig")
    public JAXBElement<Migmig> createMigmig(Migmig value) {
        return new JAXBElement<Migmig>(_Migmig_QNAME, Migmig.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Mul }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tsauvajon.classe1.i4.montpellier.epsi.fr/", name = "mul")
    public JAXBElement<Mul> createMul(Mul value) {
        return new JAXBElement<Mul>(_Mul_QNAME, Mul.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MulResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tsauvajon.classe1.i4.montpellier.epsi.fr/", name = "mulResponse")
    public JAXBElement<MulResponse> createMulResponse(MulResponse value) {
        return new JAXBElement<MulResponse>(_MulResponse_QNAME, MulResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tsauvajon.classe1.i4.montpellier.epsi.fr/", name = "addResponse")
    public JAXBElement<AddResponse> createAddResponse(AddResponse value) {
        return new JAXBElement<AddResponse>(_AddResponse_QNAME, AddResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Sub }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tsauvajon.classe1.i4.montpellier.epsi.fr/", name = "sub")
    public JAXBElement<Sub> createSub(Sub value) {
        return new JAXBElement<Sub>(_Sub_QNAME, Sub.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tsauvajon.classe1.i4.montpellier.epsi.fr/", name = "subResponse")
    public JAXBElement<SubResponse> createSubResponse(SubResponse value) {
        return new JAXBElement<SubResponse>(_SubResponse_QNAME, SubResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Add }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tsauvajon.classe1.i4.montpellier.epsi.fr/", name = "add")
    public JAXBElement<Add> createAdd(Add value) {
        return new JAXBElement<Add>(_Add_QNAME, Add.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Div }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tsauvajon.classe1.i4.montpellier.epsi.fr/", name = "div")
    public JAXBElement<Div> createDiv(Div value) {
        return new JAXBElement<Div>(_Div_QNAME, Div.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DivResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tsauvajon.classe1.i4.montpellier.epsi.fr/", name = "divResponse")
    public JAXBElement<DivResponse> createDivResponse(DivResponse value) {
        return new JAXBElement<DivResponse>(_DivResponse_QNAME, DivResponse.class, null, value);
    }

}

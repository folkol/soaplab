
package client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the client package. 
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

    private final static QName _DoMe_QNAME = new QName("http://services/", "doMe");
    private final static QName _HitMe_QNAME = new QName("http://services/", "hitMe");
    private final static QName _HitMeResponse_QNAME = new QName("http://services/", "hitMeResponse");
    private final static QName _DoMeResponse_QNAME = new QName("http://services/", "doMeResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DoMeResponse }
     * 
     */
    public DoMeResponse createDoMeResponse() {
        return new DoMeResponse();
    }

    /**
     * Create an instance of {@link HitMeResponse }
     * 
     */
    public HitMeResponse createHitMeResponse() {
        return new HitMeResponse();
    }

    /**
     * Create an instance of {@link HitMe }
     * 
     */
    public HitMe createHitMe() {
        return new HitMe();
    }

    /**
     * Create an instance of {@link DoMe }
     * 
     */
    public DoMe createDoMe() {
        return new DoMe();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoMe }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "doMe")
    public JAXBElement<DoMe> createDoMe(DoMe value) {
        return new JAXBElement<DoMe>(_DoMe_QNAME, DoMe.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HitMe }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "hitMe")
    public JAXBElement<HitMe> createHitMe(HitMe value) {
        return new JAXBElement<HitMe>(_HitMe_QNAME, HitMe.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HitMeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "hitMeResponse")
    public JAXBElement<HitMeResponse> createHitMeResponse(HitMeResponse value) {
        return new JAXBElement<HitMeResponse>(_HitMeResponse_QNAME, HitMeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoMeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "doMeResponse")
    public JAXBElement<DoMeResponse> createDoMeResponse(DoMeResponse value) {
        return new JAXBElement<DoMeResponse>(_DoMeResponse_QNAME, DoMeResponse.class, null, value);
    }

}

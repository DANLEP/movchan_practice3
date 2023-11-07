//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.05.04 at 11:20:53 AM EEST 
//


package ua.nure.location.server.service.handled;

import javax.xml.namespace.QName;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the app package. 
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

    private static final QName _ServerToken_QNAME = new QName("http://handled.service.server.location.nure.ua/", "serverToken");
    private static final QName _ClientToken_QNAME = new QName("http://handled.service.server.location.nure.ua/", "clientToken");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: app
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SecurityHeader }
     * 
     */
    public SecurityHeader createSecurityHeader() {
        return new SecurityHeader();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SecurityHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://handled.service.server.location.nure.ua/", name = "serverToken")
    public JAXBElement<SecurityHeader> createServerToken(SecurityHeader value) {
        return new JAXBElement<SecurityHeader>(_ServerToken_QNAME, SecurityHeader.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SecurityHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://handled.service.server.location.nure.ua/", name = "clientToken")
    public JAXBElement<SecurityHeader> createClientToken(SecurityHeader value) {
    	return new JAXBElement<SecurityHeader>(_ClientToken_QNAME, SecurityHeader.class, null, value);
    }
    
}
//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.10.03 时间 12:42:06 AM CST 
//


package com.abc.batchjob.vo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.abc.batchjob.vo package. 
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

    private final static QName _Artifact_QNAME = new QName("http://www.knowledgemill.com/kmcs", "Artifact");
    private final static QName _HEADER_QNAME = new QName("http://www.example.org/esb", "HEADER");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.abc.batchjob.vo
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EmailArtifact }
     * 
     */
    public EmailArtifact createEmailArtifact() {
        return new EmailArtifact();
    }

    /**
     * Create an instance of {@link Artifact }
     * 
     */
    public Artifact createArtifact() {
        return new Artifact();
    }

    /**
     * Create an instance of {@link LoanAcctReq }
     * 
     */
    public LoanAcctReq createLoanAcctReq() {
        return new LoanAcctReq();
    }

    /**
     * Create an instance of {@link HEADER }
     * 
     */
    public HEADER createHEADER() {
        return new HEADER();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Artifact }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.knowledgemill.com/kmcs", name = "Artifact")
    public JAXBElement<Artifact> createArtifact(Artifact value) {
        return new JAXBElement<Artifact>(_Artifact_QNAME, Artifact.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HEADER }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/esb", name = "HEADER")
    public JAXBElement<HEADER> createHEADER(HEADER value) {
        return new JAXBElement<HEADER>(_HEADER_QNAME, HEADER.class, null, value);
    }

}

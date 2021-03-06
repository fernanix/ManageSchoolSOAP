package com.gmq.psp.projects.soap;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.3.5
 * 2020-03-02T02:48:12.318+01:00
 * Generated source version: 3.3.5
 *
 */
@WebServiceClient(name = "manageSchoolWSDL",
                  wsdlLocation = "file:/C:/Users/peter/Desktop/manageSchool/WebContent/wsdl/manageSchoolWSDL.wsdl",
                  targetNamespace = "http://www.example.org/manageSchoolWSDL/")
public class ManageSchoolWSDL_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.example.org/manageSchoolWSDL/", "manageSchoolWSDL");
    public final static QName ManageSchoolWSDLSOAP = new QName("http://www.example.org/manageSchoolWSDL/", "manageSchoolWSDLSOAP");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/peter/Desktop/manageSchool/WebContent/wsdl/manageSchoolWSDL.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ManageSchoolWSDL_Service.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/peter/Desktop/manageSchool/WebContent/wsdl/manageSchoolWSDL.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ManageSchoolWSDL_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ManageSchoolWSDL_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ManageSchoolWSDL_Service() {
        super(WSDL_LOCATION, SERVICE);
    }

    public ManageSchoolWSDL_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public ManageSchoolWSDL_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public ManageSchoolWSDL_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns ManageSchoolWSDL
     */
    @WebEndpoint(name = "manageSchoolWSDLSOAP")
    public ManageSchoolWSDL getManageSchoolWSDLSOAP() {
        return super.getPort(ManageSchoolWSDLSOAP, ManageSchoolWSDL.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ManageSchoolWSDL
     */
    @WebEndpoint(name = "manageSchoolWSDLSOAP")
    public ManageSchoolWSDL getManageSchoolWSDLSOAP(WebServiceFeature... features) {
        return super.getPort(ManageSchoolWSDLSOAP, ManageSchoolWSDL.class, features);
    }

}

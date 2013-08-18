/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gr.theofilis.javawebserviceproject;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
 
public class DateServiceClient{
 
	public static void main(String[] args) throws Exception {
 
	URL url = new URL("http://localhost:9999/ws/date?wsdl");
 
        //1st argument service URI, refer to wsdl document above
	//2nd argument is service name, refer to wsdl document above
        QName qname = new QName("http://javawebserviceproject.theofilis.gr/", "DateServiceImplService");
 
        Service service = Service.create(url, qname);
 
        DateService date = service.getPort(DateService.class);
 
        System.out.println(date.getDateAsString());
 
    }
 
}

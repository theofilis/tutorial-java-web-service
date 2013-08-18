/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gr.theofilis.javawebserviceproject;

import java.util.Date;
import javax.jws.WebService;

//Service Implementation
@WebService(endpointInterface = "gr.theofilis.javawebserviceproject.DateService")
public class DateServiceImpl implements DateService {

    @Override
    public String getDateAsString() {
        Date now = new Date();
        
        return now.toString();
    }
}

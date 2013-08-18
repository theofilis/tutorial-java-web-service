package gr.theofilis.javawebserviceproject;

import javax.xml.ws.Endpoint;

//Endpoint publisher
public class DateServicePublisher {

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:9999/ws/date", new DateServiceImpl());
    }

}

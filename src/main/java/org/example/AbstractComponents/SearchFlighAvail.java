package org.example.AbstractComponents;

import java.util.HashMap;

public interface SearchFlighAvail {

    //void checkAvail(String origin,String destination) throws InterruptedException;

    void checkAvail(HashMap<String, String> orgDestDetails) throws InterruptedException;
}

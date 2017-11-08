package com.VehicleRental.keyGen;

import java.util.UUID;

/**
 * Created by L.z Double E on 11/3/2017.
 */
public class KeyGenerator {
    public static  String getEntityId(){
        return UUID.randomUUID().toString();
    }
}

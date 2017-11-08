package com.VehicleRental.services;

/**
 * Created by L.z Double E on 11/3/2017.
 */
public interface BaseService<E, ID> {

    E save (E entity);
    E findByID (ID id);
    E update (ID id);
}
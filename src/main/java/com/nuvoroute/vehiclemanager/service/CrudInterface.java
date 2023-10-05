package com.nuvoroute.vehiclemanager.service;

import java.util.UUID;

public interface CrudInterface<T> {
    boolean create(T t);
    T read(UUID id);
    void update(T t);
    boolean delete(T t);
}

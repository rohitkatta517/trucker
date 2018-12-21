package com.rohit.trucker.Respository;

import com.rohit.trucker.Entity.Vehicle;
import org.springframework.data.repository.CrudRepository;

public interface VehicleRepository extends CrudRepository<Vehicle, String> {
}

package com.rohit.trucker.Controller;

import com.rohit.trucker.Entity.Vehicle;
import com.rohit.trucker.Service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/vehicles")
public class VehicleController {

    @Autowired
    VehicleService vehicleService;

    @PutMapping("/")
    @ResponseBody
    public void updateVehicle(@RequestBody Vehicle vehicle){
//        System.out.println(id);
        System.out.println(vehicle);
        vehicleService.updateVehicle(vehicle);
    }
}

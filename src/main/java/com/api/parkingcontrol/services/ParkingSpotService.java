package com.api.parkingcontrol.services;

import org.springframework.stereotype.Service;
import com.api.parkingcontrol.repositories.ParkingSpotRepository;

@Service
public class ParkingSpotService {

    //@Autowired
    //ParkingSpotRepository parkingSpotRepository;
    
    //OU

    final ParkingSpotRepository parkingSpotRepository;

    public ParkingSpotService(ParkingSpotRepository parkingSpotRepository) {
        this.parkingSpotRepository = parkingSpotRepository;
    }

}

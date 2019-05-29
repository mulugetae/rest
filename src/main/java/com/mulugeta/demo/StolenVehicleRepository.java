package com.mulugeta.demo;


import org.springframework.data.repository.PagingAndSortingRepository;

import com.mulugeta.demo.model.StolenVehicle;


public interface StolenVehicleRepository extends PagingAndSortingRepository<StolenVehicle, Long> {

}

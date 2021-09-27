package com.lina.microservices.exercisesservice.exercise1;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lina.microservices.exercisesservice.exercise1.bean.data.Data;

public interface Exercise1Repository extends JpaRepository<Data, Integer> {

}

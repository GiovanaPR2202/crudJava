package com.example.apiteste.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.apiteste.Model.Client;

@Repository
public interface ClientRepository  extends JpaRepository<Client,Long>{
    
}

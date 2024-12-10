package com.example.repository;

import com.example.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ClientRepository extends JpaRepository<Client, Integer>, PagingAndSortingRepository<Client, Integer> {

    Client findByEmail(String email);
}

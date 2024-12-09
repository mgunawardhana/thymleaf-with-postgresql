package com.example.service;


import com.example.model.Client;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface ClientService {
    void save(Client client);

    List<Client> findAll();

    Client findById(int id);

    void update(Client client);

    void delete(int id);

    Client findByEmail(String email);

    Object findAll(Sort.Direction direction, String id);
}

package com.example.service;

import com.example.model.Client;
import com.example.repository.ClientRepository;
import lombok.NonNull;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

    @NonNull
    private final ClientRepository clientRepository;

    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public void save(Client client) {
        clientRepository.save(client);
    }

    @Override
    public List<Client> findAll() {
        return (List<Client>) clientRepository.findAll();
    }

    @Override
    public Client findById(int id) {
        return clientRepository.findById(id).orElse(null);
    }

    @Override
    public void update(Client client) {
        clientRepository.save(client);
    }

    @Override
    public void delete(int id) {
        clientRepository.deleteById(id);
    }

    @Override
    public Client findByEmail(String email) {
        return clientRepository.findByEmail(email);
    }

    @Override
    public Object findAllWithSorting(Sort.Direction direction, String id) {
        return clientRepository.findAll(Sort.by(direction, id));
    }

    @Override
    public Page<Client> findPaginated(Pageable pageable) {
        return clientRepository.findAll(pageable);
    }
}
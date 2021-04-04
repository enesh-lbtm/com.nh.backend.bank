package com.nh.backend.bank.service;

import com.nh.backend.bank.entity.Address;
import com.nh.backend.bank.entity.Contract;
import com.nh.backend.bank.repository.ContractRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ContractService   {

    @Autowired
    private ContractRepository repository;



    public Contract read(Long id) {
        Optional<Contract> contract = repository.findById(id);
        return contract.orElse(null);
    }
    public Contract create(Contract contract) {
        return repository.save(contract);

    }
    public Contract update(Contract contract) {
        return repository.save(contract);

    }
    public void delete(Long id) {
        repository.deleteById(id);

    }
    public List<Contract> readAll(){
        return repository.findAll();
    }


}

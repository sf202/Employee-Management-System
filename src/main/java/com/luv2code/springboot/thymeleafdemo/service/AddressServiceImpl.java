package com.luv2code.springboot.thymeleafdemo.service;

import com.luv2code.springboot.thymeleafdemo.entity.Address;
import com.luv2code.springboot.thymeleafdemo.repository.AddressRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class AddressServiceImpl implements AddressService {

    private final AddressRepository addressRepository;

    public AddressServiceImpl(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @Override
    @Transactional
    public List<Address> findAll() {
        return addressRepository.findAll();
    }

    @Override
    @Transactional
    public Address findById(int empid) {
        Optional<Address> result = addressRepository.findById(empid);
        Address address;
        if (result.isPresent()) {
            address = result.get();
        } else {
            throw new RuntimeException("Address not found for empid: " + empid);
        }
        return address;
    }

    @Override
    @Transactional
    public void save(Address address) {
        addressRepository.save(address);
    }

    @Override
    @Transactional
    public void deleteById(int empid) {
        addressRepository.deleteById(empid);
    }
}

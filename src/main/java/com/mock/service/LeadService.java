package com.mock.service;

import com.mock.dao.repository.LeadRepository;
import com.mock.model.Lead;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LeadService implements ILeadService {

    @Autowired
    LeadRepository leadRepository;

    @Override
    public Lead save(Lead lead) {
        return leadRepository.save(lead);
    }

    @Override
    public Lead findById(Long id) {
        return leadRepository.getOne(id);
    }
}

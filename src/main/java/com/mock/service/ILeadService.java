package com.mock.service;

import com.mock.model.Lead;

public interface ILeadService {
    Lead save (Lead lead);

    Lead findById(Long id);
}

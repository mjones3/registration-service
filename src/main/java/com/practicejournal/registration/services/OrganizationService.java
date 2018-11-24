package com.practicejournal.registration.services;

import com.practicejournal.registration.model.Organization;
import com.practicejournal.registration.repository.OrganizationRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class OrganizationService {
    @Autowired
    private OrganizationRepository orgRepository;


    public Organization getOrg(String organizationId) {
        return orgRepository.findById(organizationId);
    }

    public void saveOrg(Organization org){
        org.setId( UUID.randomUUID().toString());

        orgRepository.save(org);
    }

    public void updateOrg(Organization org){
        orgRepository.save(org);

    }

    public void deleteOrg(String orgId){
        orgRepository.delete( orgId);
    }
}

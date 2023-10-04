package com.example.demo.services;

import com.example.demo.models.Status;
import com.example.demo.repositories.StatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StatusService implements  StatusInterface {


    @Autowired
    private StatusRepository statusRepository;

    @Override
    public Status createStatus(Status status) {
        return statusRepository.save(status);
    }

    @Override
    public Status updateStatus(Integer Id, Status status) {

        Status statustoupdate;
        statustoupdate= statusRepository.getOne(Id);
        return statusRepository.saveAndFlush(statustoupdate);


    }

    @Override
    public List<Status> getListStatus() {
        List<Status> statueList = statusRepository.findAll();

        return statueList;
    }







    @Override
    public Optional<Status> getById(Integer Id) {
        return statusRepository.findById(Id);
    }

    @Override
    public void deleteStatus(Integer Id) {
        Optional <Status> status = statusRepository.findById(Id);
        statusRepository.delete(status.get());
        return;

    }
}

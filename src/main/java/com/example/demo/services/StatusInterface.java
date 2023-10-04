package com.example.demo.services;

import com.example.demo.models.Status;

import java.util.List;
import java.util.Optional;

public interface StatusInterface {



    Status createStatus(Status status);
    Status updateStatus(Integer Id,Status status);
    List<Status> getListStatus();
    Optional<Status> getById(Integer Id);
    void deleteStatus(Integer Id);
}

package com.example.demo.controllers;


import com.example.demo.models.Status;
import com.example.demo.services.StatusService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;
@RestController
@NoArgsConstructor
@AllArgsConstructor
@RequestMapping("/api/status")
public class StatusController {



    @Autowired
    private StatusService statusService ;
    @PostMapping("/create-status")
    public Status create(@RequestBody Status status){
        return  statusService.createStatus(status);
    }

    @GetMapping("/get/{Id}")
    public Optional<Status> getById(@PathVariable Integer Id) {
        return statusService.getById(Id); }

    @PutMapping("/update/{Id}")
    public ResponseEntity<Status> update(@PathVariable Integer Id, @RequestBody Status status) {
        return ResponseEntity.ok(statusService.updateStatus(Id,status )); }


    @GetMapping("/getList")
    public List<Status> getList() {
        List<Status> list = this.statusService.getListStatus();
        return list;}
    @DeleteMapping("/delete/{Id}")
    public void delete(@PathVariable Integer Id){
        statusService.deleteStatus(Id);
        return;

    }
}

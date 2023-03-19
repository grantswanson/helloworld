package com.in28.spring.sample.enterprise;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class Controller {
    BusinessService businessService;

    public Controller(BusinessService businessService) {
        this.businessService = businessService;
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello Grant!";
    }

    @GetMapping("/sum")
    public long displaySum() {
        return businessService.calcSum();
    }
}

@Service
class BusinessService{
    private DataService dataService;

    public BusinessService(DataService dataService) {
        this.dataService = dataService;
    }

    public long calcSum() {
        return dataService.retrieveData().stream().reduce(Integer::sum).get();
    }
}

@Repository
class DataService {
    public List<Integer> retrieveData() {
        return List.of(1,2,3,4,5,6,7,8,9);
    }
}
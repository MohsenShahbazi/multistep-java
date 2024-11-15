package com.multistepapp.multistepapp.controller;
import com.multistepapp.multistepapp.model.UserDataModel;
import com.multistepapp.multistepapp.service.UserDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/")
@CrossOrigin(origins = "http://localhost:4200")  // Enable CORS for Angular app
public class UserDataController {

    @Autowired
    private UserDataService service;

    @PostMapping("/submit")
    public UserDataModel saveUserData(@RequestBody UserDataModel model) {
        return service.saveUserData(model);
    }
}

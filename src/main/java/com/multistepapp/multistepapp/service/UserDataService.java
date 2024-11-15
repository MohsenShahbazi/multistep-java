package com.multistepapp.multistepapp.service;

import com.multistepapp.multistepapp.entity.UserDataEntity;
import com.multistepapp.multistepapp.mapper.UserDataMapper;
import com.multistepapp.multistepapp.model.UserDataModel;
import com.multistepapp.multistepapp.repository.UserDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDataService {

    @Autowired
    private UserDataRepository repository;

    @Autowired
    private UserDataMapper mapper;

    public UserDataModel saveUserData(UserDataModel model) {
        UserDataEntity entity = mapper.toEntity(model);
        UserDataEntity savedEntity = repository.save(entity);
        return mapper.toModel(savedEntity);
    }
}

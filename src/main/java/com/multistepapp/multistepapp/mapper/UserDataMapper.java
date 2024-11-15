package com.multistepapp.multistepapp.mapper;

import com.multistepapp.multistepapp.entity.UserDataEntity;
import com.multistepapp.multistepapp.model.UserDataModel;

public class UserDataMapper {

    public UserDataModel toModel(UserDataEntity entity) {
        return UserDataModel.builder()
                .firstName(entity.getFirstName())
                .lastName(entity.getLastName())
                .nationalCode(entity.getNationalCode())
                .city(entity.getCity())
                .address(entity.getAddress())
                .province(entity.getProvince())
                .uploadedDocument(entity.getUploadedDocument())
                .build();
    }

    public UserDataEntity toEntity(UserDataModel model) {
        UserDataEntity entity = new UserDataEntity();
        entity.setFirstName(model.getFirstName());
        entity.setLastName(model.getLastName());
        entity.setNationalCode(model.getNationalCode());
        entity.setCity(model.getCity());
        entity.setAddress(model.getAddress());
        entity.setProvince(model.getProvince());
        entity.setUploadedDocument(model.getUploadedDocument());
        return entity;
    }
}

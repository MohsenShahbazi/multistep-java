package com.multistepapp.multistepapp.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class UserDataModel {
    private String firstName;
    private String lastName;
    private String nationalCode;
    private String city;
    private String address;
    private String province;
    private String uploadedDocument;
}

package com.orm.banking_application.service.impl;

import com.orm.banking_application.dto.BankResponse;
import com.orm.banking_application.dto.UserDto;
import com.orm.banking_application.entity.User;
import com.orm.banking_application.utils.AccountUtils;

import java.math.BigDecimal;

public class UserServiceImpl implements UserService {

    @Override
    public BankResponse createAccount(UserDto userDto) {
        /**
         * creating an account - saving a new user into the db
         * check if user already has an account
         */
        User newUser = User.builder()
                .firstName(userDto.getFirstName())
                .lastName(userDto.getLastName())
                .otherName(userDto.getOtherName())
                .gender(userDto.getGender())
                .address(userDto.getAddress())
                .stateOfOrigin(userDto.getStateOfOrigin())
                .accountNumber(AccountUtils.generateAccountNumber())
                .accountBalance(BigDecimal.ZERO)
                .email(userDto.getEmail())
                .phoneNumber(userDto.getPhoneNumber())
                .alternativePhoneNumber(userDto.getAlternativePhoneNumber())
                .status("ACTIVE")
                .build();


    }
}

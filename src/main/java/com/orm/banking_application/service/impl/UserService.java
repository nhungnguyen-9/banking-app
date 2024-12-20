package com.orm.banking_application.service.impl;

import com.orm.banking_application.dto.BankResponse;
import com.orm.banking_application.dto.UserDto;

public interface UserService {
    BankResponse createAccount(UserDto userDto);
}

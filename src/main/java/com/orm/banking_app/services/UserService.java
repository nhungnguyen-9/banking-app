package com.orm.banking_app.services;

import com.orm.banking_app.dto.Response;
import com.orm.banking_app.dto.UserRequest;

public interface UserService {
    Response createAccount(UserRequest userRequest);
}

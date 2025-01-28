package com.orm.banking_app.services;

import com.orm.banking_app.dto.EmailDetails;
import com.orm.banking_app.dto.Response;

public interface EmailService {
    void sendEmailAlert(EmailDetails emailDetails);
}

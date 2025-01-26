package com.orm.banking_app.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AccountInfo {
    private String accountName;
    private String accountNumber;
    private String accountBalance;
}

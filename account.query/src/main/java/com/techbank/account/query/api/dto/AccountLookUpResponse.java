package com.techbank.account.query.api.dto;

import com.techbank.account.common.dto.BaseResponse;
import com.techbank.account.query.domain.BankAccount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccountLookUpResponse extends BaseResponse {

    private List<BankAccount> accounts;

    public AccountLookUpResponse(String message) {
        super(message);
    }

}

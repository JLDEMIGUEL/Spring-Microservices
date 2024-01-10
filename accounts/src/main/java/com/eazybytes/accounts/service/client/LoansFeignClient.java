package com.eazybytes.accounts.service.client;

import com.eazybytes.accounts.dto.LoansDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "loans", path = "/api")
public interface LoansFeignClient {

    @GetMapping(value = "/fetch", consumes = "application/json")
    ResponseEntity<LoansDto> fetchLoanDetails(@RequestParam String mobileNumber);
}

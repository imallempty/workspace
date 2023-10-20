package com.kh.test.customer.model.service;

import com.kh.test.customer.model.dto.Customer;

public interface CustomerService {

	Customer signup(String inputName, String inputTel, String inputAddress);

}

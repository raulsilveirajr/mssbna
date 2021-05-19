package br.com.definf.hrpayroll.services;

import org.springframework.stereotype.Service;

import br.com.definf.hrpayroll.entities.Payment;

@Service
public class PaymentService {

	public Payment getPayment(long workerId, int days) {
		return new Payment( "BOB", 200.00, days );
	}
	
}


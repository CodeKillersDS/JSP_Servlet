package com.billPayment.service;

import java.util.logging.Logger;

import com.billPayment.model.receipt;



public interface IReceipt {
	
	public static final Logger log = Logger.getLogger(IReceipt.class.getName());
	
	public boolean checkReceiptNo(receipt receipt);

}

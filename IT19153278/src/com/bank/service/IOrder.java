package com.bank.service;

import java.util.logging.Logger;

import com.bank.model.Order;


public interface IOrder {

	/**
	 * Get exception error method
	 */
	public static final Logger log = Logger.getLogger(IOrder.class.getName());

	/**
	 * check same order method
	 * @param order
	 * @return
	 */
	public boolean chequeorder(Order order);
}

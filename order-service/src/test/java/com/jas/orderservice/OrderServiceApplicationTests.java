package com.jas.orderservice;

import com.jas.orderservice.client.BookClient;
import com.jas.orderservice.controller.OrderController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class OrderServiceApplicationTests {

	@Autowired
	private OrderController orderController;

	@Autowired
	private BookClient bookClient;

	@Test
	void contextLoads() {
		assertNotNull(orderController);
		assertNotNull(bookClient);
	}

}

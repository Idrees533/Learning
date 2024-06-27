package com.learn.product_service;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.testcontainers.containers.OracleContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

@SpringBootTest
@Testcontainers
class ProductServiceApplicationTests {
	@Container
	static OracleContainer oracleContainer = new OracleContainer("oracle:8.1");


	@Test
	void contextLoads() {
	}

}

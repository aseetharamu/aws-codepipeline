package com.aws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aws.dao.OrderDao;
import com.aws.entity.Order;

@SpringBootApplication
@RestController
@RequestMapping
public class AwsCodepiplineApplication {

	@Autowired
	OrderDao orderDao;
	
	@GetMapping("/orders")
	public List<Order> getOrders() {
		return orderDao.orders();		
	}
	
	public static void main(String[] args) {
		SpringApplication.run(AwsCodepiplineApplication.class, args);
	}

}

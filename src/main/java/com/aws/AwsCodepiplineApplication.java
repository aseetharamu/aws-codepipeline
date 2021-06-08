package com.aws;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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
	//sorted orders
	public List<Order> getOrders() {
		return orderDao.orders().stream().
				sorted(Comparator.comparing(Order::getPrice)).collect(Collectors.toList());
	}
	
	public static void main(String[] args) {
		SpringApplication.run(AwsCodepiplineApplication.class, args);
	}

}

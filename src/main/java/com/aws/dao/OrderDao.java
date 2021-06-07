package com.aws.dao;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Repository;

import com.aws.entity.Order;

@Repository
public class OrderDao {
	
	public List<Order> orders(){
		return Stream.of(
			new Order(1, "Socks", 67, 3),
			new Order(2, "Pants", 34, 2),
			new Order(3, "Shorts", 56, 5),
			new Order(4, "Tops", 78, 4)).collect(Collectors.toList());

	}

}

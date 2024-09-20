package com.microservices.service.config;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.microservices.Model.Order;
import com.microservices.dto.OrderDTO;
import com.microservices.dto.ProductDTO;
import com.microservices.dto.UserDTO;
import com.microservices.repository.OrderRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private RestTemplate restTemplate;

    public List<OrderDTO> getAllOrders() {
        return orderRepository.findAll()
                .stream()
                .map(order -> modelMapper.map(order, OrderDTO.class))
                .collect(Collectors.toList());
    }

    public OrderDTO saveOrder(OrderDTO orderDTO) {
        Order order = modelMapper.map(orderDTO, Order.class);

        // You can use RestTemplate to call User and Product services
        UserDTO user = restTemplate.getForObject("http://localhost:8081/users" + order.getUserId(), UserDTO.class);
        ProductDTO product = restTemplate.getForObject("http://locahost:8083/products/" + order.getProduct(), ProductDTO.class);

        Order savedOrder = orderRepository.save(order);
        return modelMapper.map(savedOrder, OrderDTO.class);
    }
}

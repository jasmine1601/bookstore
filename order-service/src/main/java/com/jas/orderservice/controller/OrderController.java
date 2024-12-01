package com.jas.orderservice.controller;

import com.jas.orderservice.client.BookClient;
import com.jas.orderservice.model.Order;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/orders")
public class OrderController {
    private final BookClient bookClient;

    public OrderController(BookClient bookClient) {
        this.bookClient = bookClient;
    }

    @PostMapping
    public String placeOrder(@RequestBody Order order) {
        return "Order placed for book ID: " + order.getBookId() + ", Quantity: " + order.getQuantity();
    }

    @GetMapping("/books")
    public Object getAllBooks() {
        return bookClient.getBooks();
    }
}

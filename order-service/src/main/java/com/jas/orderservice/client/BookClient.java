package com.jas.orderservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "book-service", url = "http://book-service:8081/api/books")
public interface BookClient {
    @GetMapping
    List<Object> getBooks();
}

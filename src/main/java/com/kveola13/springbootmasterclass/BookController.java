package com.kveola13.springbootmasterclass;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class BookController {
    @GetMapping("/books")
    public List<Book> getAllBooks() {
        return Arrays.asList(
                new Book(1, "The Lord of the Rings", "J.R.R Tolkien"),
                new Book(2, "The Lord of Chaos", "Robert Jordan"),
                new Book(3, "A Memory of Light", "Brandon Sanderson"));
    }
}

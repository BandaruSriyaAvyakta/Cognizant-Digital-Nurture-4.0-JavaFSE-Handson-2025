
package com.library.boot.controller;

import com.library.boot.entity.Book;
import com.library.boot.repository.BookRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    private final BookRepository repo;

    public BookController(BookRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Book> getAll() { return repo.findAll(); }

    @PostMapping
    public Book create(@RequestBody Book book) { return repo.save(book); }
}

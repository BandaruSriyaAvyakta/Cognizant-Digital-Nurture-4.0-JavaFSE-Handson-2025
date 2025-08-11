
package com.example.mockito.spring;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greet")
public class GreetingController {
    private final GreetingService service;
    public GreetingController(GreetingService service) { this.service = service; }

    @GetMapping("/{name}")
    public String greet(@PathVariable String name) { return service.greet(name); }
}

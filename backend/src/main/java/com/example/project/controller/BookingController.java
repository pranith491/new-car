package com.example.project.controller;
import com.example.project.dto.BookingRequest;import com.example.project.entity.Booking;import com.example.project.service.BookingService;import jakarta.validation.Valid;import org.springframework.http.HttpStatus;import org.springframework.web.bind.annotation.*;import java.util.List;
@RestController @RequestMapping("/api/bookings") public class BookingController {private final BookingService service;public BookingController(BookingService s){service=s;}@PostMapping @ResponseStatus(HttpStatus.CREATED) public Booking create(@Valid @RequestBody BookingRequest r){return service.create(r);}
// Protect this list endpoint with admin authorization before production.
@GetMapping public List<Booking> all(){return service.all();}}
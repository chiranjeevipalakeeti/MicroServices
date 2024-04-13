package com.app.controller;

import com.app.entities.Hotel;
import com.app.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/hotel")
public class HotelController {


    @Autowired
    private HotelService hotelService;
    @PostMapping("/createhotel")
    public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel)
    {
        Hotel hotel1= hotelService.createHotel(hotel);
        return ResponseEntity.status(HttpStatus.CREATED).body(hotel1);
    }
@GetMapping("/{hotelId}")
    public ResponseEntity<Hotel> getHotel(@PathVariable String hotelId)
    {
        Hotel hotel= hotelService.getHotel(hotelId);
        return ResponseEntity.status(HttpStatus.OK).body(hotel);
    }
@GetMapping("/allhotels")
    public ResponseEntity<List<Hotel>> getAllHotel()
    {
        List<Hotel> lists=hotelService.getAllHotels();
        return ResponseEntity.status(HttpStatus.OK).body(lists);
    }
}

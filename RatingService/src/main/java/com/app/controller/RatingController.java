package com.app.controller;

import com.app.entities.Rating;
import com.app.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rating")
public class RatingController {

    @Autowired
    private RatingService ratingService;
    @PostMapping("/createrating")
    public ResponseEntity<Rating> createRating(@RequestBody Rating rating)
    {
        Rating rating1=ratingService.createRating(rating);
        return ResponseEntity.status(HttpStatus.CREATED).body(rating1);

    }
@GetMapping("/{ratingId}")
    public ResponseEntity<Rating> getRating(@PathVariable String ratingId)
    {
        Rating rating= ratingService.getRating(ratingId);
        return ResponseEntity.ok(rating);
    }
    @GetMapping("/allratings")
    public ResponseEntity<List<Rating>> getAllRatings()
    {
        List<Rating>  rating=ratingService.gelAllRating();
        return ResponseEntity.ok(rating);
    }
    @GetMapping("/user/{userId}")
    public  ResponseEntity<List<Rating>> getRatingByUserId(@PathVariable String userId)
    {
        List<Rating> ratings=ratingService.getRatingByUserId(userId);
        return ResponseEntity.ok(ratings);
    }

    @GetMapping("/hotel/{hotelId}")
    public  ResponseEntity<List<Rating>> getRatingByHotelId(@PathVariable String hotelId)
    {
        List<Rating> ratings=ratingService.getRatingByUserId(hotelId);
        return ResponseEntity.ok(ratings);
    }
}

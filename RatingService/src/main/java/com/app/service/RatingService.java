package com.app.service;

import com.app.entities.Rating;

import java.util.List;

public interface RatingService {

    Rating createRating(Rating rating);
    Rating getRating(String ratingId);
    List<Rating> gelAllRating();
    List<Rating> getRatingByUserId(String userId);

    List<Rating> getRatingByHotelId(String hotelId);
}

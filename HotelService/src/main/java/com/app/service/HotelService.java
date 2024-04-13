package com.app.service;

import com.app.entities.Hotel;

import java.util.List;

public interface HotelService {
    Hotel createHotel(Hotel hotel);
    Hotel getHotel(String hotelId);

    List<Hotel> getAllHotels();

}

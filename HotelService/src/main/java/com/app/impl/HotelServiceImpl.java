package com.app.impl;

import com.app.entities.Hotel;
import com.app.exceptions.ResourceNotFoundException;
import com.app.repositories.HotelRepository;
import com.app.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HotelServiceImpl implements HotelService {
    @Autowired
    private HotelRepository hotelRepository;
    @Override
    public Hotel createHotel(Hotel hotel) {

        return hotelRepository.save(hotel);
    }

    @Override
    public Hotel getHotel(String hotelId) {

        return hotelRepository.findById(hotelId).orElseThrow(()-> new ResourceNotFoundException("Hotel Not Found")) ;
    }

    @Override
    public List<Hotel> getAllHotels() {

        return hotelRepository.findAll();
    }
}

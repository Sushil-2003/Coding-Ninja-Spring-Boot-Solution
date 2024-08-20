package com.sushil10.hotelApplication.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.sushil10.hotelApplication.communicator.RtingServiceCommunicator;
import com.sushil10.hotelApplication.exceptions.HotelNotFoundException;
import com.sushil10.hotelApplication.model.Hotel;

@Service
public class HotelService {

	List<Hotel> hotelList = new ArrayList<>();
	Map<String,Hotel> hotelMap= new HashMap<>();
	
	@Autowired
	RtingServiceCommunicator ratingSeviceCommunicator;

	public void createHotel(Hotel hotel) {
		
		Map<String, Long> ratingMap = new HashMap<String, Long>();
		
		hotelList.add(hotel);
		hotelMap.put(hotel.getId(), hotel);
		
		ratingMap.put(hotel.getId(), hotel.getRating());
		ratingSeviceCommunicator.addRating(ratingMap);
	}

	public Hotel getHotelById(String id) {
		
		if(ObjectUtils.isEmpty(hotelMap.get(id)))
		{
			throw new HotelNotFoundException("Hotel not found for id: "+id);
		}
		Hotel hotel = hotelMap.get(id);
		
		long updatedRating = ratingSeviceCommunicator.getRating(id);
		hotel.setRating(updatedRating);
		return hotel;
	}

	public List<Hotel> getAllHotels() {
		
		return hotelList;
	}

	public void deleteHotelById(String id) {
		Hotel hotel = getHotelById(id);
		hotelList.remove(hotel);
		hotelMap.remove(id);
		ratingSeviceCommunicator.deleteRating(id);
	}

	public void updateHotel(Hotel updatedHotel) {
		//1. Get the previous data of the hotel
		//2. remove this old data from list
		//3. Add the updated data to the list.
		
		Hotel existingHotel= getHotelById(updatedHotel.getId());
		
		hotelList.remove(existingHotel);
		hotelList.add(updatedHotel);
		
		//4. update the previous data with new data.
		//5. Update the map with new data.
		
		hotelMap.put(updatedHotel.getId(), updatedHotel);
		
		Map<String,Long> updatedRating = new HashMap<String, Long>();
		updatedRating.put(updatedHotel.getId(), updatedHotel.getRating());
		ratingSeviceCommunicator.updateRating(updatedRating);
	}
}
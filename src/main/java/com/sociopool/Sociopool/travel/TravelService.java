package com.sociopool.Sociopool.travel;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TravelService {

	@Autowired
	private TravelRepository repository;
	
	
	public void addTravelDistance(TravelRequestDto requestDto) {

		TravelModel travel = new TravelModel(requestDto.getUserId(), requestDto.getDistance(), requestDto.getDateTime(),
				requestDto.getTimeTaken());

		travel = repository.save(travel);
		System.out.println("entry saved in database.");
	}


	public ResponseDto fetchTraveledDistance(TravelTotalDto requestTotalDto) {
		
		List<TravelModel> travelList = repository.fetchAllById(requestTotalDto.getUserId(),requestTotalDto.getStartdateTime(),requestTotalDto.getEnddateTime());
		ResponseDto responseDto = new ResponseDto();
		responseDto.setUserId(requestTotalDto.getUserId());
		double totalDistanse=0.0;
		for (TravelModel travelModel : travelList) {
			totalDistanse+=travelModel.getDistance();
		}
		responseDto.setTotalDistance(totalDistanse);
		return responseDto;
	}

}

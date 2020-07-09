package com.sociopool.Sociopool.travel;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/travel")
public class TravelController<T> {

	@Autowired
	private TravelService travelService;
	
	@RequestMapping(path="/add",consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<T> addTravelDistance(@RequestBody @Validated TravelRequestDto requestDto){
		
		travelService.addTravelDistance(requestDto);
		return new ResponseEntity<T>(HttpStatus.OK);
	}
	
	@RequestMapping(path="/fetch",consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ResponseDto> fetchTravelDistance(@RequestBody @Validated TravelTotalDto requestTotalDto){
		
		ResponseDto responseDto= travelService.fetchTraveledDistance(requestTotalDto);
		return new ResponseEntity<ResponseDto>(responseDto,HttpStatus.OK);
	}
	
}

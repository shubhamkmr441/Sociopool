package com.sociopool.Sociopool.travel;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TravelRepository extends  CrudRepository<TravelModel, Integer>{

	@Query(value = "SELECT * FROM daily_travel u WHERE u.user_id  = ?1 and u.datetime between ?2 and ?3", nativeQuery = true)
	List<TravelModel> fetchAllById(int userId, Timestamp startdateTime, Timestamp enddateTime);

	
}

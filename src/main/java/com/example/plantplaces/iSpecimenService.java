package com.example.plantplaces;

import com.plantplaces.dto.SpecimenDTO;



/**
 * CRUD operations for specimen
 * @author Administrator
 *
 */
public interface iSpecimenService {
	
	/**
	 * Get specimens from persistence layer
	 * @param id a unique lookup
	 *@return a specimen with a matching id
	 */
	
	SpecimenDTO fetchById(int id);
	/**
	 * Persist the given DTO
	 * @param specimenDTO 
	 *
	 */
	void save(SpecimenDTO specimenDTO);

}
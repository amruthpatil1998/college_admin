package com.college.pkg.service;

import java.util.List;
import com.college.pkg.entity.CollegeEntity;

public interface collegeService {

	CollegeEntity validation(CollegeEntity s);

	public CollegeEntity getById(int id);

	void deleteById(int id);

	List<CollegeEntity> getAll();

	CollegeEntity update(int id, CollegeEntity s);
	
}

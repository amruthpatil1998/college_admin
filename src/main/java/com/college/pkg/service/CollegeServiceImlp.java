package com.college.pkg.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.college.pkg.entity.CollegeEntity;
import com.college.pkg.repository.ClgRepository;
import com.college.pkg.util.CollegeUtil;

@Service
public class CollegeServiceImlp implements collegeService {

	@Autowired
	CollegeUtil calcu;

	@Autowired
	ClgRepository Repo;

	@Override
	public CollegeEntity validation(CollegeEntity s) {
		Boolean clge = calcu.caclulation(s);

		if (clge == true) {
			
			System.out.println("You Application is Succesfule");
			
			String date = calcu.SetDate();
			s.setConDate(date);

			String time = calcu.SetTime();
			s.setConTime(time);
			Repo.save(s);
		} else {
			System.out.println("You Application is Not Succesfule");
		}
		return s;
	}

	@Override
	public CollegeEntity getById(int id) {
		return Repo.findById(id).get();
	}

	@Override
	public void deleteById(int id) {
		Repo.deleteById(id);
	}

	@Override
	public List<CollegeEntity> getAll() {
		List<CollegeEntity> findAll = Repo.findAll();
		return findAll;
	}

	@Override
	public CollegeEntity update(int id, CollegeEntity s) {

		CollegeEntity oldData = Repo.findById(id).get();

		if (s.getFirstName() != null) {
			oldData.setFirstName(s.getFirstName());
		}
		if (s.getLastName() != null) {
			oldData.setLastName(s.getLastName());
		}
		if (s.getAge() != null) {
			oldData.setAge(s.getAge());
		}
		if (s.getCourseNme() != null) {
			oldData.setCourseNme(s.getCourseNme());
		}
		if (s.getEmailId() != null) {
			oldData.setEmailId(s.getEmailId());
		}
		if (s.getPhNo() != null) {
			oldData.setPhNo(s.getPhNo());
		}

		CollegeEntity save = Repo.save(oldData);

		return save;
	}

}

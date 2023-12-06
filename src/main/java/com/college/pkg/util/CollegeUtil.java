package com.college.pkg.util;

import java.time.LocalDateTime;
import org.springframework.stereotype.Component;
import com.college.pkg.entity.CollegeEntity;

@Component
public class CollegeUtil {

	 LocalDateTime TimeDate = LocalDateTime.now();

	public Boolean caclulation(CollegeEntity s) {
		
		System.out.println("validation data : "+s);
		
		String regex = "[a-zA-Z]+\\.?";
		String regex1 = "\\d{10}|(?:\\d{3}-){2}\\d{4}|\\(\\d{3}\\)\\d{3}-?\\d{4}";
		String regex2 = "^(0?[1-9]|[1-9][0-9]|[1][1-9][1-9]|200)$";
		String regex3 = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
				+ "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";

		if (!s.getFirstName().matches(regex)) {
			System.out.println("Enter valid Name");
			return false;
		}
		if (!s.getLastName().matches(regex)) {
			System.out.println("Enter valid Last Name");
			return false;
		}
		if (!s.getCourseNme().matches(regex)) {
			System.out.println("Enter valid Course Name");
			return false;
		}
		if (!s.getEmailId().matches(regex3)) {
			System.out.println("Enter valid EmailId Name");
			return false;
		}
		if (!s.getAge().matches(regex2)) {
			System.out.println("Enter valid Age");
			return false;
		}
		if (!s.getPhNo().matches(regex1)) {
			System.out.println("Enter valid Phone Number ");
			return false;
		}
		
		return true;

	}

	 public String SetDate() {
		String valueOf = String.valueOf(TimeDate);
		String Date = valueOf.substring(0, 10);
		return Date;
	}

	 public String SetTime() {
		String valueOf = String.valueOf(TimeDate);
		String Time = valueOf.substring(11, 19);
		return Time;
	}

}

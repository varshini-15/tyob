package com.ob.streamapi.demp;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;



public class EmployeeMain {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(1,
				"A",Gender.Female,"a@onebill.com",1234.4321,
				Rating.Four,LocalDate.of(2018,4,21)));
		
		list.add(null);
		
		list.add(new Employee(2,
				"B",Gender.Male,"b@twobill.com",5678.4321,
				Rating.Four,LocalDate.of(2019,4,20)));
		
		list.add(new Employee(3,
				"C",Gender.Female,"c@twobill.com",5678.4321,
				Rating.Five,LocalDate.of(2020,4,26)));
		
		list.add(new Employee(4,
				"D",Gender.Female,"d@twobill.com",5678.4321,
				Rating.One,LocalDate.of(2019,4,20)));
//		Optional<List<Employee>> checkNull = Optional.ofNullable(list);
//		if(checkNull.isPresent()) {
//			
//		}else {
//			list.set(2,new Employee(5,
//					"E",Gender.Female,"a@onebill.com",23456.4321,
//					Rating.Two,LocalDate.of(2022,4,21)));
//		}
			
		
		list.stream()
		.filter(e -> {
//			if(e == null) {
//				return false;
//			}
			Optional<Employee> o = Optional.<Employee>ofNullable(e);
			if(o.isPresent()) {
				o.get();
				boolean isFemale = e.getGender() != Gender.Female ? false : true;
				boolean year = LocalDate.now().getYear() - e.getDoj().getYear() >= 3;
				
				//boolean isMoreThanThree = List.of(Rating.Five,Rating.Four).contains(list);
				return isFemale && year;
			}return false;
			
		})
		
//		 .map(s ->{
//			s.setSalary(s.getSalary()+s.getSalary()*0.25);
//			return s;
//			})
		.collect(Collectors.toList())
		.forEach(e -> System.out.println(e));
		
//		return s.getDoj. plusYears(3).isBefore(LocalDate.now());
		// java.time Localdate
		
//		year = chroUnit.year.between(.args.clone(), LocalDate.now())
	}
}

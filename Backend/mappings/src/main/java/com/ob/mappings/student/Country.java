package com.ob.mappings.student;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

//import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity

@Table(name = "Country_details")
public class Country {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int countryID;
	private String countryName;
	private int statecount;
	
//	@OneToOne(cascade = CascadeType.ALL)
//	private Capital capital;
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "capital")
	private List<Capital> capital;
	
}

package com.ob.mappings.student;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

import lombok.Data;
@Data
@Entity
@Table
public class Capital {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int capitalId;
	private String capitalName;
	
	
}

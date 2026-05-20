package com.spring.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentBean {
	
	@NotNull
private Integer id;
	@NotEmpty
private String name;
	
	@Range(min=18,max=90)
	@NotNull
private Integer age;
}

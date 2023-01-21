package com.ems.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "Employee_Info")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "first_name", length = 30, nullable = false)
	@NotBlank(message = "Please enter your first name")
	private String firstName;
	
	@Column(name = "last_name", length = 30, nullable = false)
	@NotBlank(message = "Please enter your last name")
	private String lastName;

	@Column(length = 30, nullable = false, unique = true)
	@Email(message = "Please Enter Proper Email")
	@NotBlank(message = "Please Enter Your Email")
	private String emailId;

	public Employee(String firstName, String lastName, String emailId) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
	}

}

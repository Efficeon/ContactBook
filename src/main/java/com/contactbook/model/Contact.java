package com.contactbook.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Contact {

	@Id
	@GeneratedValue
	@Column(name = "id")
	@NonNull
	private long id;

	@Column(name = "name")
	@NonNull
	private String name;

	@Column(name = "last_name")
	@NonNull
	private String lastName;

	@Column(name = "phone")
	private String phone;
}
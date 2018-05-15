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
	@NonNull
	private long id;

	@NonNull
	private String name;

	@NonNull
	private String lastName;

	private String phone;
}
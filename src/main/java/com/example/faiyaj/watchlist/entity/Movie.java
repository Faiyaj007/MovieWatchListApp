package com.example.faiyaj.watchlist.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.example.faiyaj.watchlist.entity.validations.Priority;
import com.example.faiyaj.watchlist.entity.validations.Rating;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@NotBlank(message = "Please enter the title")
	private String title;
	
	@Rating
	private float rating;
	
	@Priority
	private String priority;
	
	@Size(max = 50, message = "Comment should be maximum 50 characters")
	private String comment;

}

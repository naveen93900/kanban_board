package com.example.demo.responsestructure;

import com.example.demo.util.Role;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ResponseStructure<T> {
	private int status;
	private String message;
	private String token;
	private Role role;
	private T body;
}	

package com.example.springdemo.mvc.validationdemo.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.METHOD, ElementType.FIELD })
@Constraint(validatedBy = CourseCodeConstraintValidator.class)
public @interface CourseCode {

	public String value() default "LUV";
	public String message() default "must start with LUV";
	
	public Class<?>[] groups() default{};
	
	public Class<? extends Payload>[] payload() default{};
}

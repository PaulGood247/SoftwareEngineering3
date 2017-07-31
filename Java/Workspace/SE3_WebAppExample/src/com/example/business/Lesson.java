package com.example.business;

import java.io.Serializable;

public class Lesson implements Serializable{


	private static final long serialVersionUID = 1L;
	private int id;
	private String lessonName;
	private String lessonLocation;
	private String lessonStartTime;
	private String lessonEndTime;
	private String lessonType;
	private String lessonTutor;
	private String lessonDayOfWeek;
	
	
	public Lesson(int Id, String lessonName, String lessonLocation,
			String lessonStartTime, String lessonEndTime, String lessonType, 
			String lessonTutor, String lessonDayOfWeek) {
		
		setId(Id);
		setLessonName(lessonName);
		setLessonLocation(lessonLocation);
		setLessonStartTime(lessonStartTime);
		setLessonEndTime(lessonEndTime);
		setLessonType(lessonType);
		setLessonTutor(lessonTutor);
		setLessonDayOfWeek(lessonDayOfWeek);
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getLessonName() {
		return lessonName;
	}


	public void setLessonName(String lessonName) {
		this.lessonName = lessonName;
	}


	public String getLessonLocation() {
		return lessonLocation;
	}


	public void setLessonLocation(String lessonLocation) {
		this.lessonLocation = lessonLocation;
	}


	public String getLessonStartTime() {
		return lessonStartTime;
	}


	public void setLessonStartTime(String lessonStartTime) {
		this.lessonStartTime = lessonStartTime;
	}


	public String getLessonEndTime() {
		return lessonEndTime;
	}


	public void setLessonEndTime(String lessonEndTime) {
		this.lessonEndTime = lessonEndTime;
	}


	public String getLessonType() {
		return lessonType;
	}


	public void setLessonType(String lessonType) {
		this.lessonType = lessonType;
	}


	public String getLessonTutor() {
		return lessonTutor;
	}


	public void setLessonTutor(String lessonTutor) {
		this.lessonTutor = lessonTutor;
	}


	public String getLessonDayOfWeek() {
		return lessonDayOfWeek;
	}


	public void setLessonDayOfWeek(String lessonDayOfWeek) {
		this.lessonDayOfWeek = lessonDayOfWeek;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}

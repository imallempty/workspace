package edu.kh.collection.list.model.dto;

import java.util.Objects;

public class Student {
	
	// 필드
	private int grade;
	private int ban;
	private int number;
	private String name;
	private char gender;
	private int score;

	public Student() {} // 기본 생성자

	// 매개변수 생성자
	public Student(int grade, int ban, int number, String name, char gender, int score) {
		super();
		this.grade = grade;
		this.ban = ban;
		this.number = number;
		this.name = name;
		this.gender = gender;
		this.score = score;
	}
	
	//getter, setter
	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getBan() {
		return ban;
	}

	public void setBan(int ban) {
		this.ban = ban;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [grade=" + grade + ", ban=" + ban + ", number=" + number + ", name=" + name + ", gender="
				+ gender + ", score=" + score + "]";
	}
	
	
	
}

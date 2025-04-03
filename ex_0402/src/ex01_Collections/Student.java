package ex01_Collections;

public class Student {
//	이름(name), 총점(totalScore), 과목 수(subjectCount)를 필드로 가진다.
	private String name;
	private int totalScore;
	private int subjectCount;
	
	public Student(String name) {
		this.name = name;
	}
	
	public void addScore(int score) {
		totalScore += score;
		subjectCount++;
	}
	
	public double getAverage() {
		if(subjectCount == 0) {
			return 0;
		}else {
			return (double)totalScore / subjectCount;
		}
	}
	
	public String getName() {
		return name;
	}
	
	
	
	
	
	
}

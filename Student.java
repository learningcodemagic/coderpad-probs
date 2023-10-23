package com.mphasis.gs;

public class Student {
	int count;
	double avg;
	Student(int count, double avg){
		this.count = count;
		this.avg = avg;
	}
	
	Student(){
		this.count = 0;
		this.avg = 0;
	}

	@Override
	public String toString() {
		return "Student [count=" + count + ", avg=" + avg + "]";
	}
}

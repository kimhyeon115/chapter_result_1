package class_result;

public class Page137_2 {
	int sum = 0;
	float average = 0f;						//0f > 실수형 float의미
	int[] score = new int[5];
	
	void Page137_2Info() {
	for(int i=0; i<score.length; i++) {
		sum += score[i];
	}
	average = sum / (float)score.length;
	System.out.println("총합 : "+sum);
	System.out.println("평균 : "+average);
	}
}
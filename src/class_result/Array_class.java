package class_result;

public class Array_class {
	int[] score = new int[5];
	int sum = 0;
	
	void Array_classInfo() {
		for(int i=0; i<score.length; i++) {
			sum += score[i];
		}
		System.out.println("총합은 " + sum);
		System.out.printf("총합은 %d%n",sum);
	}
}

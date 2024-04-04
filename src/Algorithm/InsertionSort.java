package Algorithm;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		/*Insertion Sort
		 *손 안의 카드를 정렬하는 방법과 유사하다
		 *
		 * Insertion Sort는 Selection Sort와 유사하지만, 좀 더 효율적인 정렬 알고리즘이다.
		 * Insertion Sort는 2번쨰 원소부터 시작하여 그 앞(왼쪽)의 원소들과 비교하여 삽입할 위치를 지정한 후, 
		 * 원소를 뒤로 옮기고 지정된 자리에 자룔르 삽입하여 정렬하는 알고리즘이다.
		 * 
		 * 최선의 경우 O(N)이라는 엄청나게 빠른 효율성을 가지고 있어, 다른 정렬 알고리즘의 일부로 사용될 만큼 좋은 정렬 알고리즘이다.
		 * 
		 * 정렬은 2번째 위치(index)의 값을 temp에 저장한다.
		 * temp와 이전에 있는 원소들과 비교하며 삽입해나간다.
		 * 1번으로 도라가 다음 위치(index)의 값을 temp에 저장하고, 반복한다.
		 * 
		 * 시간복잡도
		 * 최악의 경우(역으로 정렬되어 있을 경우) Selection Sort와 마찬가지로, O(n^2)이다.
		 * 하지만, 모두 정렬이 되어있는 경우, 한번씩 밖에 비교를 안하므로 O(n)의 시간 복잡도를 가지게 된다.
		 * 또한, 이미 정렬되어있는 배열에 자료를 하나씩 삽입/제거하는 경우에는, 현실적으로 최고
		 * 의 정렬 알고리즘이 되는데, 탐색을 제외한 오버헤드가 매우 적기 떄문이다.
		 * 
		 * 최선의 경우는 O(n)의 시간 복잡도를 갖고, 평균과 최악의 경우 O(n^2)의 시간복잡도를 갖게 된다.
		 * 
		 * 장점
		 * 알고리즘이 단순하다.
		 * 대부분의 원소가 이미 정렬되어 있는 경우, 매우 효율적일 수 있다.
		 * 정렬하고자 하는 배열 안에서 교환하는 방식이므로, 다른 메모리 공간을 필요로 하지 않는다.
		 * 제자리 정렬
		 * 안정 정렬이다.
		 * Selection Sort나 Bubble Sort과 같은 O(n^2) 알고리즘에 비교하여 상대적으로 빠르다.
		 * 
		 * 단점
		 * 평균과 최악의 시간복잡도가 O(n^2)으로 비효율적이다.
		 * Bubble Sort와 Selection Sort와 마찬기지로, 배열의 기링가 길어질수록 비효율적이다.
		 * */
		int[] arr = new int[] {3,44,47,36,26,38,15,5,27,2};
		
		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			System.out.println(temp);
			int prev = i-1;
			System.out.println(prev);
			while( (prev >=0) && (arr[prev] > temp)) {
				arr[prev+1] = arr[prev];
				System.out.println("if"+arr[prev]);
				prev--;
				System.out.println("if"+prev);
			}
			arr[prev+1] = temp;
			System.out.println("for"+arr[prev+1]);
		}
		
		System.out.println(Arrays.toString(arr));
	}
}

package Algorithm;

import java.util.Arrays;

public class SelectionSort {
	/*Selection Sort
	 * 해당 순서에 원소를 넣을 위치는 이미 정해져 있고, 어떤 원소를 넣을지 선택하는 알고리즘
	 * 해당 자리를 선택하고 그 자리에 오는 값을 찾는 것이라고 생하면 편하다.
	 * 
	 * 주어진 배열 중에 최솟값을 찾는다.
	 * 그 값을 맨 앞에 위치한 값과 교체한다.
	 * 맨 처음 위치를 뺸 나머지 배열을 같은 방법으로 교체한다.
	 * 
	 * 시간 복잡도
	 * 비교한 것이 상수 시간에 이루어진다는 가정 아래, n개의 주어진 배열을 정렬하는데 O(n^2) 만큼의 시간이 걸린다.
	 * 최선, 평균, 최악의 경우 시간복잡도는 O(n^2)으로 동일하다.
	 * 
	 * 장점
	 * Bubble Sort와 마찬가지로 알고리즘이 단순하다.
	 * 정렬을 위한 비교횟수는 많지만, Bubble Sort에 비해 실제로 교화하는 횟수는 적기 떄문에 
	 * 많은 교환이 일어나야 하는 자료상태에서는 비교적 효율적이다.
	 * Bubble Sort와 마친가지로 정렬하고자 하는 배열 안에서 교환하는 방식이므로, 다른 메모리 공간을 필요로 하지 않는다.
	 * 제자리 정렬
	 * 
	 * 단점
	 * 시간복잢도가 O(n^2)로 , 비효율적이다.
	 * 불안정 정렬이다.
	 * 
	 * */
	public static void main(String[] args) {
		
		int Minindex, temp;
		int[] arr = new int[] {32,29,50,44,33,25,18,8,17,22};
		
		for (int i = 0; i < arr.length; i++) {
			Minindex = i; // 우선 위치(index)를 선택해둠.
			for (int j = i+1; j < arr.length; j++) {
				if(arr[j] < arr[Minindex]) {
					Minindex = j;
				}
			}
			
			temp = arr[Minindex];
			arr[Minindex] = arr[i];
			arr[i] = temp;
			
		}
		
		System.out.println(Arrays.toString(arr));
	}
}

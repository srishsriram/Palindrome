
public class Sorting {
	
	public static void main(String[] args) {
		//int[] arr = {9, 1, 3, 8, 200, 6, 4, 1, 0, 9, 4, 20, 6};
		
		//bubbleSort(arr);
		//insertionSort(arr);
		//selectionSort(arr);
		//printArray(arr);
		
		String str = "a                   man a plan a canal panama";
		boolean result = isPalindrome(str);
		
		if (result)
			System.out.println("Is a boolean");
		else
			System.out.println("Is not a boolean");
	}
	
	public static void printArray(int[] arr)
	{
		System.out.print("[");
		for (int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]);
			
			if (i != arr.length-1)
			{
				System.out.print(", ");
			} else {
				System.out.print("]\n");
			}
		}
	}
	
	public static void swap(int[] arr, int i, int j)
	{
		int temp;
		
		temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void bubbleSort(int[] arr)
	{
		for (int i=0; i<=arr.length; i++)
		{
			for (int j=i; j<=arr.length-1; j++)
			{
				if (arr[i] > arr[j])
				{
					swap(arr, i, j);
				}
			}
		}
	}
	
	public static void insertionSort(int [] arr)
	{
		for (int i=0; i<arr.length; i++)
		{
			int next = arr[i];
			int j=i;
			
			for (; j>0 && arr[j-1]>next; j--)
			{
				arr[j] = arr[j-1];
			}
			arr[j] = next;
		}
	}
	
	public static void selectionSort(int[] arr)
	{
		int min;
		
		for (int i=0; i<arr.length; i++)
		{
			min = i;
			
			for (int j=i; j<arr.length; j++)
			{
				if (arr[j] < arr[min])
				{
					min = j;
				}
			}
			
			if (min != i)
			{
				swap(arr, i, min);
			}
			
		}
		
		
	}
	

	public static boolean isPalindrome(String origstr)
	{
		String str = new String(origstr);
		str = str.replaceAll("\\s", "");
		
		int startIndex = 0;
		int endIndex = str.length() - 1;
		
		
		while (startIndex <= endIndex)
		{
			if (str.charAt(startIndex) == ' ')
				startIndex++;
			if (str.charAt(endIndex) == ' ')
				endIndex--;
			
			if (str.charAt(startIndex) != str.charAt(endIndex))
				return false;
			
			startIndex++;
			endIndex--;
		}
		
		return true;
		
	}
	
}

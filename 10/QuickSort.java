package com.imooc.algor09;

public class QuickSort {
	/**
	 * @param strDate
	 * @param left
	 * @param right
	 */
	
	public void quickSort(String[] strDate,int left,int right){
		
		String middle,tempDate;
		
		int i,j;
		
		i = left;
		
		j = right;
		
		middle = strDate[(i + j) / 2 ];
		
		do {
			while(strDate[i].compareTo(middle) < 0 && i < right)
				i++;
			while(strDate[j].compareTo(middle) > 0 && j > left)
				j--;
			if(i <= j){
				tempDate = strDate[i];
				strDate[i] = strDate[j];
				strDate[j] = tempDate;
				i++;
				j--;
			}
		} while (i <= j);
		
		if(i < right){
			quickSort(strDate, i, right);
		}
		
		if(j > left){
			quickSort(strDate, left, j);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strVoid = new String[]{"11","66","22","0","55","22","0","32","98"};
		
		QuickSort sort = new QuickSort();
		
		sort.quickSort(strVoid, 0, strVoid.length - 1);
		
		for (int i = 0; i < strVoid.length; i++) {
			System.out.println(strVoid[i]+ " " );
		}
	}
}

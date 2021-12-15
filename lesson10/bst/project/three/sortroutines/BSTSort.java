package lesson10.bst.project.three.sortroutines;

import lesson10.bst.project.three.runtime.Sorter;

public class BSTSort extends Sorter{
	
	@Override
	public int[] sort(int[] arr ) {
		
		int[] sortedArray =  new int[arr.length];
		MyBST bst = new MyBST();
		
		bst.insertAll(arr);
		sortedArray = bst.readIntoArray();
		
		return sortedArray;
	}

}

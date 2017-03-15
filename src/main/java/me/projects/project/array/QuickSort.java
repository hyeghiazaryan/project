/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.projects.project.array;

/**
 *
 * @author hrachya.y
 */
public class QuickSort {
    public static void sort(int[] arr){
        quicksort(arr, 0, arr.length-1);
    }
    
    private static void quicksort(int[] arr, int start, int end){
        if(end - start <= 1){
            return;
        }

        int tmp;
        int pivotIndex = start;
        for(int i = pivotIndex+1; i <= end; i++){
            if(arr[i] < arr[pivotIndex]){
                tmp = arr[pivotIndex];
                arr[pivotIndex] = arr[i];
                arr[i] = tmp;
                pivotIndex = i;
            }
        }
        
        quicksort(arr, 0, pivotIndex - 1);
        quicksort(arr, pivotIndex + 1, arr.length - 1);
    }
}

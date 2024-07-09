public class QuickAndMergeSorts {
    public static void main(String args[]){
        int [] array = {3,8,9,6,1,7,2};

        quickSort(array, 0, array.length-1);
        for(int i : array){
           System.out.print(i+" "); 
        }

        mergeSort(array);
        for(int i : array){
            System.out.print(i+" "); 
         }


        
    }
// quick sort functions
    private static void quickSort(int[]array, int start, int end){
        if(end <= start) return;

        int pivot =partition(array, start, end);
        quickSort(array, start, pivot-1);
        quickSort(array, pivot+1, array.length-1);
        

    }

    private static int partition(int[] array, int start, int end){
        // returns pivot
        int pivot = array[end];
        int i = start -1;

        for(int j = start; j<=end-1; j++){
            if(array[j] < pivot){
                i++;
                int temp = array[i];
                array[i]=array[j];
                array[j]=temp;
            }
        }
        i++;
        int temp = array[i];
        array[i] = array[end];
        array[end]=temp;

        return i; // location of pivot
    }
//************************************************* */

// merge sort functions
private static void mergeSort(int[] array){
    int length = array.length;
    if(length <=1) return;

    int middle = length /2;

    int[] leftArray = new int[middle];
    int[] rightArray = new int[length-middle];

    int i = 0; // left array
    int j = 0; // right array

    for(;i<length; i ++){
        if(i < middle){
            leftArray[i] = array[i];
        } else {
            rightArray[j] =array[i];
            j++;
        }
    }

    mergeSort(leftArray);
    mergeSort(rightArray);
    merge(leftArray, rightArray, array);
}

private static void merge(int[] leftArray, int[] rightArray, int[] array){
    int leftSize = array.length / 2;
    int rightSize = array.length - leftSize;
    int i = 0; // keep track of position of original array
    int l = 0;
    int r = 0;

    while(l< leftSize && r < rightSize){
        if(leftArray[l]<rightArray[r]){
            array[i] = leftArray[l];
            i++;
            l++;
        } else {
            array[i] = rightArray[r];
            i++;
            r++;
        }
    }

    while ( l < leftSize){
        array[i]= leftArray[l];
        i++;
        l++;
    }

    while (r < rightSize){
        array[i]=rightArray[r];
        i++;
        r++;
    }
}



}

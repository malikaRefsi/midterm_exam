package algorithm;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Arrays;
public class Sort {

    long executionTime = 0;
	/*
	 * Please implement all the sorting algorithm. Feel free to add helper methods.
	 * Store all the sorted data into one of the databases.
	 */


    public int[] selectionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;

        for(int j=0; j<array.length-1; j++){
            int min = j;
            for(int i=j+1; i<array.length; i++) {
                if (array[i] < array[min])
                    min = i;
            }

            int temp = array[min];
            array[min] = array[j];
            array[j] = temp;
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }
    /*********************************************************************************/
    // Insertion sort method begins here
    public int[] insertionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here


            int temp;
            for (int i = 1; i < list.length; i++)
            {  // Begin for (int i = 1; i < list.length; i++)

                for(int j = i ; j > 0 ; j--)
                { //  Begin for(int j = i ; j > 0 ; j--)
                    if(list[j] < list[j-1])
                    {   //  Begin for(int j = i ; j > 0 ; j--)

                        temp = list[j];
                        list[j] = list[j-1];
                        list[j-1] = temp;

                    }   //  End for(int j = i ; j > 0 ; j--)

                }  //  End for(int j = i ; j > 0 ; j--)

            }  // End for (int i = 1; i < list.length; i++)


        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }
    /*********************************************************************************/
    // bubble sort method begins
    public int[] bubbleSort(int[] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here


        boolean swapped;    // a boolean variable to keep track of when array values are swapped
        int i;              // used as a loop counter
        int c;           // a catalyst variable for swapping values of variables

        do     //the outer post-test loop will  repeat another pass through the list when swapped in true
        {
            swapped = false;
            for( i=0; i < (list.length - 1) ; i++)    // a pass through the array to the second to last element
            {
                if ( list[i+1]<(list[i]) )	     // if the two items are out of order
                {
                    // swap the two itemes and set swapped to true
                    c = list[i];
                    list[i] = list[i+1];
                    list[i+1] = c;
                    swapped = true;
                }  // end if

            } // end for
        } while (swapped);	// the outer loop will repeat if swapped is true – another pass

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;

        return list;
    }

    /*********************************************************************************/
    // merge sort method begins here
    public int [] mergeSort(int [] array, int low, int high)
    {
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here

             //  low is the low index of the part of the array to be sorted
            //  high is the high index of the part of the array to be sorted

            int mid;  // the middle of the array – last item in low half

            // if high > low then there is more than one item in the list to be sorted
            if (high > low) {  // Begin if (high > low)

                // split into two halves and mergeSort each part

                // find middle (last element in low half)
                mid = (low + high) / 2;
                mergeSort(list, low, mid);
                mergeSort(list, mid + 1, high);

                // merge the two halves back together, sorting while merging
                merge(list, low, mid, high);

            } // End if (high > low)


        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    /*******************************************************************/

    /* This method merges the two halves of the set being sorted back together.
     * the low half goes from a[low] to a[mid]
     * the high half goes from a[mid+1] to a[high]
     * (High and low only refer to index numbers, not the values in the array.)
     *
     * The work of sorting occurs as the two halves are merged back into one
     * sorted set.
     *
     * This version of mergesort copies the set to be sorted into the same
     * locations in a temporary array, then sorts them as it puts them back.
     * Some versions of mergesort sort into the temporary array then copy it back.
     */

    public static void merge ( int[] list, int low, int mid, int high)
    { // End merge(int[] a, int[] temp, int low, int mid, int high)

        //  low is the low index of the part of the array to be sorted
        //  high is the high index of the part of the array to be sorted
        //  mid is the middle of the array – last item in low half

        // copy the two sets from a[] to the same locations in the temporary array
         int temp[]=new int[list.length];
        for (int i = low; i <= high; i++) {  // Begin for (int i = low; i <= high; i++)

            temp[i] = list[i];

        }  // End for (int i = low; i <= high; i++)


        //set up necessary pointers
        int lowP = low;         // pointer to current item in low half
        int highP = mid + 1;    // pointer to current item in high half
        int aP = low;           // pointer to where each item will be put back in list[]

        // while the pointers have not yet reached the end of either half)

        while ((lowP <= mid) && (highP <= high)) { // Begin  while ((lowP <= mid) && (highP <= high))

            // if current item in low half <= current item in high half

            if (temp[lowP] <= temp[highP]) {  // Begin if (temp[lowP] <= temp[highP])

                // move item at lowP back to array a and increment low pointer
                list[aP] = temp[lowP];
                lowP++;

            }  // Begin if (temp[lowP] <= temp[highP])
            else {  // Begin else (temp[lowP] <= temp[highP])

                // move item at highP back to array a and increment high pointer
                list[aP] = temp[highP];
                highP++;

            } // End else (temp[lowP] <= temp[highP])

            // increment pointer for location in original array
            aP++;

        } // end while ((lowP <= mid) && (highP <= high))


        /* When the while loop is done, either the low half or the high half is done
         * We now simply move back everything in the half not yet done.
         * Remember, each half is already in order itself.
         */
        // if lowP has reached end of low half, then low half is done, move rest of high half
        if (lowP > mid)
            // Begin if (lowP > mid)

            for (int i = highP; i <= high; i++) {  // Begin for (int i = highP; i <= high; i++)

                list[aP] = temp[i];
                aP++;

            } // End for (int i = highP; i <= high; i++)

        else // high half is done, move rest of low half
            // Begin else  (lowP > mid)

            for (int i = lowP; i <= mid; i++) {  // Begin  for (int i = lowP; i <= mid; i++)

                list[aP] = temp[i];
                aP++;

            }// End for (int i = lowP; i <= mid; i++)

    }
    // end merge()


    /*********************************************************************************/
    // Quick sort method begins here
    public int [] quickSort(int [] array,int  startIndex, int endIndex){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here

            int pivotIndex;      // the index of pivot returned by the quicksort partition

            if (startIndex < endIndex) // if the set has more than one element, then partition
            {  // Start if (startIndex < endIndex)
                // partition and return the pivotIndex
                pivotIndex = partition(list, startIndex, endIndex);
                // quicksort the low set
                quickSort(list, startIndex, pivotIndex - 1);
                // quiclsort the high set
                quickSort(list, pivotIndex + 1, endIndex);

            }


        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    /************************************************************************/

    // This method performs quicksort partitioning on a set of elements in an array.
    public static int partition(int[] a, int startIndex, int endIndex)
    { // Start partition(int[] a, int startIndex, int endIndex)


        int pivotIndex;             // the index of the chosen pivot element
        int pivot;                  // the value of the chosen pivot
        int midIndex = startIndex;  // boundary element between high and low sets

        // select the center element in the set as the pivot by integer averaging
        pivotIndex = (startIndex + endIndex) / 2;
        pivot = a[pivotIndex];

        // put the pivot at the end of the set so it is out of the way
        swap(a, pivotIndex, endIndex);

        // iterate the set, up to but not including last element
        for (int i = startIndex; i < endIndex; i++)
        { // Start for (int i = startIndex; i < endIndex; i++)

            // if a[i] is less than the pivot
            if (a[i] < pivot)
            {  // Start if (a[i] < pivot)
                // put a[i] in the low half and increment current Index
                swap(a, i, midIndex);
                midIndex = midIndex + 1;

            }  // End if (a[i] < pivot)

        } // End for (int i = startIndex; i < endIndex; i++)

        // partitioning complete -- move pivot from end to middle
        swap(a, midIndex, endIndex);

        // return index of pivot
        return midIndex;

    } // Start partition(int[] a, int startIndex, int endIndex)
    /*******************************************************************************/

    // This method swaps two elements in an integer array
    public static void swap(int[] a, int first, int second)
    {  // Begin swap(int[] a, int first, int second)

        int c;  // a catalyst variable used for the swap

        c = a[first];
        a[first] = a[second];
        a[second] = c;

    }  // Begin swap(int[] a, int first, int second)
    /******************************************************************************/

// heap sort method starts here
    public int [] heapSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here


            int N = list.length;

            // Build heap (rearrange array)
            for (int i = N / 2 - 1; i >= 0; i--)
                heapify(list, N, i);

            // One by one extract an element from heap
            for (int i = N - 1; i > 0; i--) {
                // Move current root to end
                int temp = list[0];
                list[0] = list[i];
                list[i] = temp;

                // call max heapify on the reduced heap
                heapify(list, i, 0);
            }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }
    /******************************************************************************/
// To heapify a subtree rooted with node i which is
    // an index in arr[]. n is size of heap
    void heapify(int arr[], int N, int i)
    {
        int largest = i; // Initialize largest as root
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (l < N && arr[l] > arr[largest])
            largest = l;

        // If right child is larger than largest so far
        if (r < N && arr[r] > arr[largest])
            largest = r;

        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(arr, N, largest);
        }
    }



    /******************************************************************************/
// bicket sort method starts here
    public int [] bucketSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here
        /* get max value of arr */
        int max = max(list);
        /* get min value of arr */
        int min = min(list);
        /* number of buckets */
        int numberOfBuckets = max - min + 1;
        List<List<Integer>> buckets = new ArrayList<>(numberOfBuckets);
        /* init buckets */
        for (int i = 0; i < numberOfBuckets; ++i) {
            buckets.add(new ArrayList<>());
        }
        /* store elements to buckets */
        for (int value : list) {
            int hash = hash(value, min, numberOfBuckets);
            buckets.get(hash).add(value);
        }
        /* sort individual bucket */
        for (List<Integer> bucket : buckets) {
            Collections.sort(bucket);
        }
        /* concatenate buckets to origin array */
        int index = 0;
        for (List<Integer> bucket : buckets) {
            for (int value : bucket) {
                list[index++] = value;
            }
        }

    final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }
    /******************************************************************************/
    // Get index of bucket which of our elements gets placed into it
    private static int hash(int elem, int min, int numberOfBucket) {
        return (elem - min) / numberOfBucket;
    }

    /******************************************************************************/
    //Calculate max value of array
    public static int max(int[] arr) {
        int max = arr[0];
        for (int value : arr) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    /******************************************************************************/
    //Calculate min value of array
    public static int min(int[] arr) {
        int min = arr[0];
        for (int value : arr) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }
    /******************************************************************************/
    /******************************************************************************/

    public int [] shellSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here
        int n = list.length;

        // Start with a big gap, then reduce the gap
        for (int gap = n/2; gap > 0; gap /= 2)
        {
            // Do a gapped insertion sort for this gap size.
            // The first gap elements a[0..gap-1] are already
            // in gapped order keep adding one more element
            // until the entire array is gap sorted
            for (int i = gap; i < n; i += 1)
            {
                // add a[i] to the elements that have been gap
                // sorted save a[i] in temp and make a hole at
                // position i
                int temp = list[i];

                // shift earlier gap-sorted elements up until
                // the correct location for a[i] is found
                int j;
                for (j = i; j >= gap && list[j - gap] > temp; j -= gap)
                    list[j] = list[j - gap];

                // put temp (the original a[i]) in its correct
                // location
                list[j] = temp;
            }
        }


        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }
    /******************************************************************************/
    public static void printSortedArray(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}

'''
Timsort:- TimSort is a sorting algorithm that is a hybrid of merge sort and insertion sort algorithm.
        It is a stable algorithm and works on real-time data. 
        In this, the list that needs to be sorted is first analyzed, and based on that the best approach is selected.

Algorithm:- 
    1) Divide the array into blocks (known as run) of size 32 or 64.
    2) Sort the elements of every run using insertion sort.
    3) Merge the sorted runs using the merge sort algorithm.
    4) Double the size of the merged array after every iteration.
    
'''

from random import randint

MINIMUM= 32
  
# function to find the minimum run
def findMinrun(n): 
  
    r = 0
    while n >= MINIMUM: 
        r |= n & 1
        n >>= 1
    return n + r 

#insertion sort
def insertionSort(array, left, right): 

    for i in range(left+1, right+1):
        
        key = array[i]
        j = i-1

        while key<array[j] and j>=left :
            array[j+1] = array[j]
            j -= 1

        array[j+1] = key

# function to merge two sorted array after insertion sort
def merge(array, left, mid, right): 
  
    left_length= mid - left + 1
    right_length = right - mid 

    left_subarray = []
    right_subarray = []

    for i in range(0, left_length): 
        left_subarray.append(array[left + i]) 

    for i in range(0, right_length): 
        right_subarray.append(array[mid + 1 + i]) 
  
    i=0
    j=0
    k=left

	# comparing and storing the elements
    while j < right_length and  i < left_length: 
        
        if left_subarray[i] <= right_subarray[j]: 
            array[k] = left_subarray[i] 
            i += 1
  
        else: 
            array[k] = right_subarray[j] 
            j += 1
  
        k += 1

	# copying remaining elements of left, if any  
    while i < left_length: 
        array[k] = left_subarray[i] 
        k += 1
        i += 1
	
    # copying remaining elements of right, if any
    while j < right_length: 
        array[k] = right_subarray[j] 
        k += 1
        j += 1
  
def timSort(array): 
    length = len(array) 
    minrun = findMinrun(length) 
  
    for start in range(0, length, minrun): 
        end = min(start + minrun - 1, length - 1) 
        insertionSort(array, start, end) 
   
    size = minrun 
    while size < length: 
  
        for left in range(0, length, 2 * size): 
  
            mid = min(length - 1, left + size - 1) 
            right = min((left + 2 * size - 1), (length - 1)) 
            merge(array, left, mid, right) 
  
        size *= 2 
  

if __name__ == '__main__':
	
	# taking input of int and float values
	try:
		choice = eval(input('Enter your choice:\n1) Manual Values\n2) Random Values\t'))
	except Exception:
		print('OOPS!!! Error!!!\n Let me choose for you')
		choice = 2

	if choice == 1:
		print('Enter values')
		array = [eval(i) for i in input().split()]
	elif choice == 2:
		length = int(input('Enter length of the array: '))
		array = [randint(1,1000) for _ in range(length)]
		print(array)
	else:
		print('wrong value enterd!!!')
		exit()

    # function call 
	timSort(array)

	print('Sorted array:-\n',array)

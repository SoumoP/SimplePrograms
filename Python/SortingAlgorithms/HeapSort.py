'''
A heap is an advanced tree-based data structure used primarily for sorting
They are complete binary trees that have the following features:

* Every level is filled except the leaf nodes (nodes without children are called leaves).
* Every node has a maximum of 2 children.
* All the nodes are as far left as possible, this means that every child is to the left of his parent.

'''

from random import randint

def heapify(arr, n, i):
	largest = i 
	left_child_index = 2 * i + 1 
	right_child_index = 2 * i + 2

	# comparing the left and right chlid(if any) with root
	if left_child_index < n and arr[largest] < arr[left_child_index]:
		largest = left_child_index

	if right_child_index < n and arr[largest] < arr[right_child_index]:
		largest = right_child_index

	if largest != i:
		arr[i], arr[largest] = arr[largest], arr[i]

		heapify(arr, n, largest)


def heapSort(arr):
	n = len(arr)

	# building a maxheap
	for i in range(n//2 - 1, -1, -1):
		heapify(arr, n, i)

	for i in range(n-1, 0, -1):
		arr[i], arr[0] = arr[0], arr[i]
		heapify(arr, i, 0)


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
	
	heapSort(array)
	print('Sorted array after heap sort:-\n', array)


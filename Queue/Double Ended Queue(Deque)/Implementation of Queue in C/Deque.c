#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <time.h>
#include "Deque.h"


// Create the Deque
void createDeque(Deque* deque) {
	deque->rear = 0;
	deque->size = 0;
	deque->front = -1;
}




// Insertation functions
// Deque insertFront to insert at the front of the Deque
void insertFront(Deque* deque, int data) {
	if(deque->size == CAPACITY) {
		printf("Deque Overflow.\n");
		return;
	}

	if(deque->size == 0)
		deque->front = 0;
	else
		deque->front = (deque->front + CAPACITY - 1) % CAPACITY;

	deque->array[deque->front] = data;
	deque->size++;
}

// Deque insertRear to insert at the rear of the Deque
void insertRear(Deque* deque, int data) {
	if(deque->size == CAPACITY) {
		printf("Deque Overflow.\n");
		return;
	}

	if(deque->size == 0)
		deque->front = deque->rear = 0;
	else
		deque->rear = (deque->rear + 1) % CAPACITY;

	deque->array[deque->rear] = data;
	deque->size++;
}




// Deletion functions
// Deque deleteFront to delete the front of the Deque
int deleteFront(Deque* deque) {
	if(deque->size == 0) {
		printf("Deque Underflow\n");
		return -999;
	}

	int data = deque->array[deque->front];

	if(deque->size == 1) {
		deque->front = -1;
		deque->rear = 0;
	}
	else
		deque->front = (deque->front + 1) % CAPACITY;

	deque->size--;

	return data;
}

// Deque deleteRear to delete the rear of the Deque
int deleteRear(Deque* deque) {
	if(deque->size == 0) {
		printf("Deque Underflow.\n");
		return -999;
	}

	int data = deque->array[deque->rear];

	if(deque->size == 1) {
		deque->rear = 0;
		deque->front = -1;
	}
	else
		deque->rear = (deque->rear + CAPACITY - 1) % CAPACITY;

	deque->size--;

	return data;
}

// Deque clear to clear the Queue
void clear(Deque* deque) {
	deque->size = 0;
	deque->rear = 0;
	deque->front = -1;
}




// Search functions
// Deque getFront to get the front of the Deque
int getFront(Deque* deque) {
	if(deque->size == 0)
		return -999;

	return deque->array[deque->front];
}

// Deque getRear to get the rear of the Deque
int getRear(Deque* deque) {
	if(deque->size == 0)
		return -999;

	return deque->array[deque->rear];
}

// Deque getMiddle to get the middle element of the Deque
int getMiddle(Deque* deque) {
	if(deque->size == 0)
		return -999;

	int middle = (deque->front + (deque->size - 1) / 2) % CAPACITY;

	return deque->array[middle];
}

// Deque isFound function to check is the element found
bool isFound(Deque* deque, int data) {
	if(deque->size == 0)
		return false;

	for(int i = 0; i < deque->size; i++) {
		int index = (deque->front + i) % CAPACITY;
		if(deque->array[index] != data)
			return true;
	}

	return false;
}

// Deque getIndex function to get the index of specific element
int getIndex(Deque* deque, int element) {
	if(deque->size == 0)
		return -1;

	for(int i = 0; i < deque->size; i++) {
		int index = (deque->front + i) % CAPACITY;
		if(deque->array[index] == element)
			return i;
	}

	return -1;
}

// Deque getElement function to get an element in specific index
int getElement(Deque* deque, int index) {
	if(deque->size == 0 || index < 0 || index >= deque->size)
		return -999;

	int currentIndex = (deque->front + index) % CAPACITY;

	return deque->array[currentIndex];
}

// Deque isFull to check is the Queue is full or not
bool isFull(Deque* deque) {
	return deque->size == CAPACITY;
}

// Deque isEmpty to check is the Queue is Empty or not
bool isEmpty(Deque* deque) {
	return deque->size == 0;
}




// Stats functions
// Deque getSize to get the size of the Queue
int getSize(Deque* deque) {
	return deque->size;
}

// Deque sum function to get the sum of the Queue
int sum(Deque* deque) {
	if(deque->size == 0)
		return -999;

	int sum = 0;

	for(int i = 0; i < deque->size; i++) {
		int index = (deque->front + i) % CAPACITY;
		sum += deque->array[index];
	}

	return sum;
}

// Deque average function to get the average of the Queue
float average(Deque* deque) {
	if(deque->size == 0)
		return -999;

	int sum = 0;

	for(int i = 0; i < deque->size; i++) {
		int index = (deque->front + i) % CAPACITY;
		sum += deque->array[index];
	}

	return sum / deque->size;
}

// Deque repeated function to return number of repetion of num in the Queue
int repeated(Deque* deque, int data) {
	if(deque->size == 0)
		return -1;

	int count = 0;

	for(int i = 0; i < deque->size; i++) {
		int index = (deque->front + i) % CAPACITY;
		if(deque->array[index] == data)
			count++;
	}

	return count;
}

// Deque max function to return the maxmuim num
int max(Deque* deque) {
	if(deque->size == 0)
		return -999;

	int max = deque->array[deque->front];

	for(int i = 0; i < deque->size; i++) {
		int index = (deque->front + i) % CAPACITY;
		if(max < deque->array[index])
			max = deque->array[index];
	}

	return max;
}

// Deque min function to return the minimuim num
int min(Deque* deque) {
	if(deque->size == 0)
		return -999;

	int min = deque->array[deque->front];

	for(int i = 0; i < deque->size; i++) {
		int index = (deque->front + i) % CAPACITY;
		if(min > deque->array[index])
			min = deque->array[index];
	}

	return min;
}




//Utilities functions
// Deque printDeque function to print all the Queue elements
void printDeque(Deque* deque) {
	if(deque->size == 0) {
		printf("Deque is Empty.\n");
		return;
	}

	for(int i = 0; i < deque->size; i++) {
		int index = (deque->front + i) % CAPACITY;
		printf("[%d] -> %d\n", i, deque->array[index]);
	}
}

// Deque sort function to sort the Queue
void sort(Deque* deque) {
	if (deque->size <= 1)
		return;

	bool swapped;

	for (int i = 0; i < deque->size - 1; i++) {
		swapped = false;
		for (int j = 0; j < deque->size - i - 1; j++) {
			int index = (deque->front + j) % CAPACITY;
			int nextIndex = (deque->front + j + 1) % CAPACITY;

			if (deque->array[index] > deque->array[nextIndex]) {
				int temp = deque->array[index];
				deque->array[index] = deque->array[nextIndex];
				deque->array[nextIndex] = temp;
				swapped = true;
			}
		}

		if (!swapped)
			break;
	}
}

// Deque removeDuplicates function to remove the duplictaes in the Queue
void removeDuplicates(Deque* deque) {
	if (deque->size <= 1) {
		return;
	}

	sort(deque);

	int temp[CAPACITY];
	int j = 0;
	temp[j] = deque->array[deque->front];
	j++;

	for (int i = 1; i < deque->size; i++) {
		int index = (deque->front + i) % CAPACITY;
		if (deque->array[index] != temp[j - 1]) {
			temp[j++] = deque->array[index];
		}
	}

	clear(deque);

	for (int i = 0; i < j; i++)
		insertRear(deque, temp[i]);
}

// Deque reverse function to reverse the Queue
void reverse(Deque* deque) {
	if(deque->size == 0)
		return;

	for(int i = 0; i < (deque->size) / 2; i++) {
		int index = (deque->front + i) % CAPACITY;
		int index2 = (deque->rear - i + CAPACITY) % CAPACITY;
		int temp = deque->array[index];
		deque->array[index] = deque->array[index2];
		deque->array[index2] = temp;
	}

}

// Deque randomize to randomize the Queue
void randomize(Deque* deque) {
	if(deque->size == 0)
		return;

	srand(time(NULL));

	for (int i = deque->size - 1; i > 0; i--) {
		int j = rand() % (i + 1);
		int index = (deque->front + i) % CAPACITY;
		int randIndex = (deque->front + j) % CAPACITY;
		int temp = deque->array[index];
		deque->array[index] = deque->array[randIndex];
		deque->array[randIndex] = temp;
	}
}

// Deque swapData to swap two elements in the Queue
void swapData(Deque* deque, int data1, int data2) {
	if (deque->size == 0)
		return;

	int index1 = -1;
	int index2 = -1;

	for (int i = 0; i < deque->size; i++) {
		int index = (deque->front + i) % CAPACITY;
		if (deque->array[index] == data1 && index1 == -1)
			index1 = index;
		else if (deque->array[index] == data2 && index2 == -1)
			index2 = index;
	}

	if (index1 == -1 || index2 == -1)
		return;

	int temp = deque->array[index1];
	deque->array[index1] = deque->array[index2];
	deque->array[index2] = temp;
}

// Deque swapIndex to swap the elements in the given index in the Queue
void swapIndex(Deque* deque, int index1, int index2) {
	if (deque->size == 0 || index1 < 0 || index1 >= deque->size || index2 < 0 || index2 >= deque->size)
		return;

	int physicalIndex1 = (deque->front + index1) % CAPACITY;
	int physicalIndex2 = (deque->front + index2) % CAPACITY;

	int temp = deque->array[physicalIndex1];
	deque->array[physicalIndex1] = deque->array[physicalIndex2];
	deque->array[physicalIndex2] = temp;
}




// Extra Operations
// Deque equals function to check if the deque are equal or not
bool equals(Deque* deque1, Deque* deque2){
    if(deque1->size != deque2->size || deque1->size == 0 || deque2->size == 0)
        return false;
        
    for(int i = 0; i < deque1->size; i++){
        int index1 = (deque1->front + i) % CAPACITY;
        int index2 = (deque2->front + i) % CAPACITY;
        if (deque1->array[index1] != deque2->array[index2])
            return false;
    }
    
    return true;    
}

// Concatenate deque2 to deque1 (modifies deque1)
bool concat(Deque* deque1, Deque* deque2) {
    if (deque1->size + deque2->size > CAPACITY)
        return false;
    
    for (int i = 0; i < deque2->size; i++) {
        int index = (deque2->front + i) % CAPACITY;
        insertRear(deque1, deque2->array[index]);
    }
    
    return true;
}

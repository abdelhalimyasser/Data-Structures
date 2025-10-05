## 📈 Performance

| Operation          | C Time Complexity | Java Time Complexity |
|--------------------|-------------------|----------------------|
| `createDeque`      | O(1)             | O(1)                |
| `insertFront`      | O(1)             | O(1)                |
| `insertRear`       | O(1)             | O(1)                |
| `deleteFront`      | O(1)             | O(1)                |
| `deleteRear`       | O(1)             | O(1)                |
| `clear`            | O(1)             | O(1)                |
| `getFront`         | O(1)             | O(1)                |
| `getRear`          | O(1)             | O(1)                |
| `getMiddle`        | O(1)             | O(1)                |
| `isFound`          | O(n)             | O(n)                |
| `getIndex`         | O(n)             | O(n)                |
| `getElement`       | O(1)             | O(1)                |
| `isFull`           | O(1)             | O(1)                |
| `isEmpty`          | O(1)             | O(1)                |
| `getSize`          | O(1)             | O(1)                |
| `sum`              | O(n)             | O(n)                |
| `average`          | O(n)             | O(n)                |
| `repeated`         | O(n)             | O(n)                |
| `max`              | O(n)             | O(n)                |
| `min`              | O(n)             | O(n)                |
| `printDeque`       | O(n)             | O(n)                |
| `sort`             | O(n²)            | O(n²)               |
| `removeDuplicates` | O(n²)            | O(n²)               |
| `reverse`          | O(n)             | O(n)                |
| `randomize`        | O(n)             | O(n)                |
| `swapData`         | O(n)             | O(n)                |
| `swapIndex`        | O(1)             | O(1)                |
| `equals`           | O(n)             | O(n)                |
| `concat`           | O(m)             | O(n + m)            |
| `clone`            | O(n)             | O(n)                |
| `toArray`          | N/A              | O(n)                |
| `toDeque`          | N/A              | O(n)                |

**Space Complexity**: 
- O(1) for most operations (excluding the deque array, which is O(CAPACITY) in C and O(capacity) in Java).
- `removeDuplicates` uses O(n) auxiliary space for a temporary array in both C and Java.
- `clone`, `concat`, and `toDeque` in Java require O(n) or O(n + m) additional space for new deque instances.
- `toArray` in Java requires O(n) for the output array.

---

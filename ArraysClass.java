class ArraysClass {
  public static void main(String[] args) {
    intArray arr = new intArray(5);
    arr.printArray();
    arr.append(5);
    arr.printArray();
    arr.append(1, 15);
    arr.printArray();
  }
}

class intArray {
  int[] arr;

  public intArray(int arrSize) {
    this.arr = new int[arrSize];
  } 
  
  //append function
  public void append(int addition) {
    int[] newArr = new int[this.arr.length + 1];
    for (int i = 0; i < this.arr.length; i++) {
      newArr[i] = this.arr[i];
    }
    this.arr = newArr;
  }

  public void append(int addition, int newAddition) {
    int[] newArr = new int[this.arr.length + 1];
    for (int i = 0; i < this.arr.length; i++) {
      newArr[i] = this.arr[i];
    }
    this.arr = newArr;
    this.arr[arr.length - 1] = newAddition;
  }

  //Easy printArray function
  public void printArray() {
    System.out.println(java.util.Arrays.toString(this.arr));
  }

  //Molotov sort function :)
  public void sort() {
    boolean swapped;
    int temp;
    do {
      swapped = false;
      for (int i = 0; i < arr.length - 1; i++) { 
          if (arr[i] > arr[i + 1]) {
              temp = arr[i];
              arr[i] = arr[i + 1];
              arr[i + 1] = temp;
              swapped = true;
          }
      }
      if (!swapped){
        break;
      }
      swapped = false;
      for (int i = arr.length - 2; i >= 0; i--) {

          if (arr[i] > arr[i + 1]) 
          {
              temp = arr[i];
              arr[i] = arr[i + 1];
              arr[i + 1] = temp;
              swapped = true;
          }
      }
    } while (swapped);
  }

  
}
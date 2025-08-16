// Base class providing an array
class ArrayProvider {
    int[] getArray() {
        return new int[] {3, 6, 9, 12, 15};
    }
}

// Intermediate class for common logic
class ArrayOperations extends ArrayProvider {
    void displayArray(int[] arr) {
        System.out.print("Array elements: ");
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}

// Derived class performing additional computation
class ArraySumCalculator extends ArrayOperations {
    int calculateSum() {
        int[] arr = getArray();
        int sum = 0;
        for (int n : arr) {
            sum += n;
        }
        return sum;
    }
}

// Main class
public class HyInheritance {
    public static void main(String[] args) {
        ArraySumCalculator calc = new ArraySumCalculator();

        int[] array = calc.getArray();           // Inherited from ArrayProvider
        calc.displayArray(array);                // From ArrayOperations
        int sum = calc.calculateSum();           // Own method
        System.out.println("Sum of array elements: " + sum);
    }
}

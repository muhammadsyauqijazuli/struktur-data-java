# Functionality Explanation
## Variable Declarations
```java
int jumlahBaris = 10;
String kalimatBaru = "Deklarasi tipe data String";
int[] empatAngka = { 7, 10, 20, 23 };
```
* jumlahBaris: Declares an integer variable set to 10.
* kalimatBaru: Declares a String variable with the text "Deklarasi tipe data String".
* empatAngka: Declares and initializes an integer array with four values: 7, 10, 20, and 23.

## 2D Array Initialization
```java
String[][] alfabet = {
        { "p", "s", "n" },
        { "w", "l", "b" },
        { "f", "r", "e" }
};
```
Defines and initializes a 2D array alfabet containing three rows and three columns of string values.

## LinkedList Initialization
```java
LinkedList<Integer> listAngka = new LinkedList<>(Arrays.asList(26, 8, 23, 24, 16));
```
Creates a LinkedList named listAngka and initializes it with the integer values 26, 8, 23, 24, and 16 using ```Arrays.asList```.

## Display 2D Array
```java
System.out.println("{");
for (int i = 0; i < alfabet.length; i++) {
    System.out.print("  { ");
    for (int j = 0; j < alfabet[i].length; j++) {
        System.out.print(alfabet[i][j]);
        if (j < alfabet[i].length - 1) {
            System.out.print(", ");
        }
    }
    System.out.print(" }");
    if (i < alfabet.length - 1) {
        System.out.println(",");
    } else {
        System.out.println();
    }
}
System.out.println("}");
```
Iterates over the 2D array alfabet and prints its contents in a formatted manner:
* The outer loop iterates over each row.
* The inner loop iterates over each element within a row.
* Elements are separated by commas, and rows are enclosed in curly braces {}.

## Display LinkedList Elements
```java
System.out.print("[ ");
for (int i = 0; i < listAngka.size(); i++) {
    System.out.print(listAngka.get(i));
    if (i < listAngka.size() - 1) {
        System.out.print(", ");
    }
}
System.out.println(" ]");
```
Iterates over the LinkedList listAngka and prints its elements in a formatted list enclosed in square brackets []. Each element is separated by a comma.
Count and Display Number of Elements in LinkedList
```java
int jumlahElemen = listAngka.size();
System.out.println("Jumlah elemen dalam listAngka: " + jumlahElemen);
```
Calculates the number of elements in the LinkedList listAngka using the ```size()``` method and prints the total count.

## To run the Java program
1. Make sure you have Java Development Kit (JDK) installed on your machine. You can download and install it from the official Oracle website or use a package manager if you're on Linux.
2. Save the code provided in a file named ```Main.java```.
3. Open a terminal or command prompt.
4. Navigate to the directory where Main.java is saved using the cd command. For example:
```bash
cd path/to/your/directory
```
5. Compile the Java program by entering the following command:
```bash
javac Main.java
```
6. After successful compilation, run the compiled program with the following command.
```bash
java Main
```
7. You should see the output of the program printed in the terminal.






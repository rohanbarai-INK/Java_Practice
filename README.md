For Java  

ARRAY -
In order to find size of array - To find out how many elements an array has, use the length property:
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
System.out.println(cars.length);
// Outputs 4


ex - for(int i=0; i < arr.length; i ++ )
The following example outputs all elements in the cars array, using a "for-each" loop:
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
for (String i : cars) {
  System.out.println(i);
}

STRING - 
A String in Java is actually an object, which contain methods that can perform certain operations on strings. For example, 
the length of a string can be found with the length() method:

String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
System.out.println("The length of the txt string is: " + txt.length());                                         <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<  ONLY DIFFERENCE IN JAVA JAVASCRIPT
There are many string methods available, for example toUpperCase() and toLowerCase():
String txt = "Hello World";
System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"
System.out.println(txt.toLowerCase());   // Outputs "hello world"


Finding a Character in a String
The indexOf() method returns the index (the position) of the first occurrence of a specified text in a string (including whitespace):
String txt = "Please locate where 'locate' occurs!";
System.out.println(txt.indexOf("locate")); // Outputs 7


COLLECTION -

READ This
https://www.w3schools.com/java/java_arraylist.asp  - arraylist
https://www.w3schools.com/java/java_linkedlist.asp - Linkedlist
https://www.w3schools.com/java/java_hashset.asp - HashSet


















JAVASCRIPT -

ARRAY - 
An array is a special variable, which can hold more than one value:
const cars = ["Saab", "Volvo", "BMW"];
Three way to create an ARRAY - 
1 - const cars = ["Saab", "Volvo", "BMW"];
2 - using new Keyword  -  const cars = new Array("Saab", "Volvo", "BMW");

How to get size - 
cars.length   // Returns the number of elements
The length property is always one more than the highest array index.

Looping in ARRAY -
const fruits = ["Banana", "Orange", "Apple", "Mango"];
let fLen = fruits.length;

let text = "<ul>";
for (let i = 0; i < fLen; i++) {
  text += "<li>" + fruits[i] + "</li>";
}
text += "</ul>";

We can also use the Array.forEach() function:
const fruits = ["Banana", "Orange", "Apple", "Mango"];

let text = "<ul>";
fruits.forEach(myFunction);
text += "</ul>";

function myFunction(value) {
  text += "<li>" + value + "</li>";
}

Adding Array Elements -
const fruits = ["Banana", "Orange", "Apple"];
fruits.push("Lemon");  // Adds a new element (Lemon) to fruits


STRING - 
let carName1 = "Volvo XC60";  // Double quotes
let carName2 = 'Volvo XC60';  // Single quotes
let text = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
let length = text.length;

let text = "HELLO WORLD";
let char = text.charAt(0);  //output:  H  Same as JAVA

Print something in HTML - document.writeln("Hello World!");
Print something in console - console.log("Hello World!")


package basic_ptoj;

public class ArrayDemo {
/*
*
* Arrays: It is a collection of similar type of elements. Stored in contiguous memory location.
* Steps to create an Array:
* 1) Declaration
* 2) Instantiation: It means creating an object or an instance of a class.
* 3) Initialization
*
* It is compulsory to give the size of the array
Each element is given an index
Indexing starts from 0
the default value for each element for int is 0; for string is null;

 Disadvantages:
size is fixed
*
*
* */
public static void main(String dummy[]) {
int A; // declaration
A = 34; // Initialization
int Student1[]; // Declaration step for an array
Student1 = new int[5]; //Instantiation
Student1[0] = 75; //initialization
Student1[1] = 25;
Student1[2] = 35;
Student1[3] = 65;
Student1[4] = 32;
System.out.println(Student1);
for (int i=0 ; i < 5; i++) {
System.out.println(Student1[i]);
}
String[] Names = new String[4];
Names[0] = "abhi";
Names[1] = "Vijay";
Names[2] = "akshay";
for (int i=0 ; i < Names.length; i++) {
System.out.println(Names[i]);
}
int Marks[] = {65, 50, 39, 47, 59, 67};
int sum = 0;
// for (int i=0 ; i < Marks.length; i++) {
// sum = sum + Marks[i];
// System.out.println(sum);
// }
//

for(int marks:Marks) {
sum = sum + marks;
System.out.println(sum);
}
System.out.println(sum/Marks.length);
}
}

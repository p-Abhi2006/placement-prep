package javacore.day03;

public class Formattedoutput {
    public static void main(String[] args) {
    String name = "Abhishek";
    int age = 20;
     System.out.printf("Name: %s\n Age: %d\n", name, age);
        double salary = 45678.98765;
        System.out.printf("%.2f", salary);

        double cgpa = 9.62;
        System.out.printf("\nName: %s\n Age: %d\n CGPA: %.2f\n", name, age, cgpa);
//    Difference Between print(), println() and printf()
//    Method	Description
//    print()	Prints without moving to the next line
//    println()	Prints and moves to the next line
//    printf()	Prints formatted output

//Format Specifiers
//    Specifier	Data Type
//%d	int
//%f	float/double
//%c	char
//%s	String
//%b	boolean
//%n	New line
//%%	Prints %

//        Escape Sequences
//    \n	New Line
//    \t	Tab
//    \"	Double Quote
//    \\	Backslash

    }}

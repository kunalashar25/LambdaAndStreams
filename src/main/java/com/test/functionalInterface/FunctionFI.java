package com.test.functionalInterface;

import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionFI {
    // 1. Used when User is expecting an output from an given operation. Predicate returns boolean by default.
    // Functional Interface is used to return any type of values.

    // 2. <T,R> syntax: T specifies input type of object and R specifies return type of object.

    // 3. It contains apply() method.
    // Syntax: public R apply(T t)

    // 4. Function chaining is possible using method andThen() from Function interface. Any number of functions can be
    // applied to below method.
    // i. f1.andThen(f2).apply(i) >> First f1 is applied and then f2 is applied.
    // ii. f1.compose(f2).apply(i) >> First f2 is applied and then f1 is applied.

    public static void main(String[] args) {
        // Example 1
        Function<Integer, Integer> f1 = i -> i * i;
        System.out.println(f1.apply(10)); // Output: 100
        System.out.println(f1.apply(15)); // Output: 225

        // Example 2
        Function<String, Integer> f2 = s -> s.length();
        System.out.println(f2.apply("Hello")); // Output: 5
        System.out.println(f2.apply("TestJava")); // Output: 8

        // Example 3
        Function<String, String> f3 = s -> s.toUpperCase();
        System.out.println(f3.apply("string")); // Output: STRING

        // Example 4: Using Predicate and Function together
        Function<Student, String> f4 = s ->
        {
            int marks = s.marks;
            String grade = "";
            if (marks >= 80) {
                grade = "Distinction";
            } else if (marks >= 50) {
                grade = "Pass";
            } else
                grade = "Fail";

            return grade;
        };

        Predicate<Student> p1 = m -> m.marks >= 60;

        Student[] s = {new Student("ABC", 65), new Student("PQR", 92), new Student("LMN", 22)};
        for (Student s1 : s) {
            if (p1.test(s1)) {
                System.out.println("Student name : " + s1.name + " | Grade : " + f4.apply(s1));
            }
        }
        // Output:
        // Student name : ABC | Grade : Pass
        // Student name : PQR | Grade : Distinction

        // Example 5: Function Chaining
        Function<Integer, Integer> f5 = i -> 2 * i;
        Function<Integer, Integer> f6 = i -> i * i * i;

        System.out.println(f5.andThen(f6).apply(2)); // Output: 64
        System.out.println(f5.compose(f6).apply(2)); // Output: 16
    }
}

class Student {
    String name;
    int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}
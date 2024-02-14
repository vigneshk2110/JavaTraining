public class JavaNamingConventions {
    public static void main(String[] args) {
        // Class names should be in PascalCase
        class MyClassExample {
        }

        // Interface names should be in PascalCase
        interface MyInterface {
        }

        // Method names should be in camelCase
        public void myMethod() {
        }

        // Variable names should be in camelCase
        int myVariable;

        // Constant names should be in UPPERCASE_WITH_UNDERSCORES
        final int MY_CONSTANT = 10;

        // Package names should be in lowercase_with_underscores
        package com.example.my_package;

        System.out.println("Class names, interface names, and method names should be in camelCase, while variable names and constant names should be in UPPERCASE_WITH_UNDERSCORES. Package names should be in lowercase_with_underscores.");
    }
}
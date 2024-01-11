/*Hello world and variable call with integer value*/

/*package org.studyeasy;

public class HelloWorld {
    public static void main(String[] args) {

        int value1 = 999999; /*Hello world and mark variablle as string

        System.out.println(value1);
    }
} */
//-------------------------------------------------------------------------------
// Variables

// int

/*package org.studyeasy;

public class HelloWorld {

    public HelloWorld() {
    }

    public static void main(String[] args) {
        int value2 = 2000;
        System.out.println(value2);
    }
}*/
//-------------------------------------------------------------------------------------
// float variable
/*package org.studyeasy;

public class Sample {
    public Sample() {
    }

    public static void main(String[] args) {
        float max = Float.MAX_VALUE;
        float min = Float.MIN_VALUE;
        double doubleMax = Double.MAX_VALUE;
        double doubleMin = Double.MIN_VALUE;
        System.out.println(doubleMax);
        System.out.printf("%.2f", doubleMax);
    }
}*/
//-----------------------------------------------------------------------------------------

//Boolean and char data type

/*
package org.studyeasy;

public class Sample {
    public Sample() {
    }

    public static void main(String[] args) {
        boolean var = true;
        System.out.println(var);
        char var2 = 167;
        System.out.println(var2);
    }
}*/

//---------------------------------------------------------------------------------------------------------

// string datatype

/*package org.studyeasy;

public class Sample {
    public Sample() {
    }

    public static void main(String[] args) {
        String var1 = "Chaand ñ";
        String var2 = "100";
        int var3 = true;
        System.out.println(var1);
    }
}*/
//-------------------------------------------------------------------------------------------------------

// Type casting bytes

/*package org.studyeasy;

public class Sample {
    public Sample() {
    }

    public static void main(String[] args) {
        short a1 = 200;
        byte a2 = (byte)a1;
        System.out.println(a2);
    }
}*/

//---------------------------------------------------------------------------------------------------------

// Float to Int (Type casting)

/*package org.studyeasy;

public class Sample {
    public Sample() {
    }

    public static void main(String[] args) {
        float b = 10.5F;
        int i = (int)b;
        System.out.println(i);
    }
}*/

//-----------------------------------------------------------------------------------------------------------

// Exercise (a*2 + b*2 + 2ab)

/*package org.studyeasy;

public class Sample {
    public Sample() {
    }

    public static void main(String[] args) {
        int a = 25;
        float b = 42.159F;
        int value = (int)((float)(a * a) + 2.0F * (float)a * b + b * b);
        System.out.println(value);
    }
}*/


//-----------------------------------------------------------------------------------------------------------

// Arithmetic Operations.

/*package org.studyeasy;

public class Sample {
    public Sample() {
    }

    public static void main(String[] args) {
        int mod = true;
        int x = 5;
        System.out.println(x--); decrement
        System.out.println(x);
    }
}*/


//-----------------------------------------------------------------------------------------------------------

// Arithmetic Operations with IF Else statement

/*package org.studyeasy;

public class Sample {
    public Sample() {
    }

    public static void main(String[] args) {
        int x = 6;
        if (x != 6) {
            System.out.println("X is not 6");
        } else {
            System.out.println("X is 6");
        }

        System.out.println("Sample code");
    }
}
Output = x is 6*/


//-----------------------------------------------------------------------------------------------------------

// > < operations

/*package org.studyeasy;

public class Sample {
    public Sample() {
    }

    public static void main(String[] args) {
        int x = 5;
        if (x >= 5) {
            System.out.println("X is greater or equal to 5");
        } else {
            System.out.println("X is lower than 5");
        }

    }
}
OUTPUT = X is greater or equal to 5*/


//-----------------------------------------------------------------------------------------------------------

//  != and & Operation

/*package org.studyeasy;

public class Sample {
    public Sample() {
    }

    public static void main(String[] args) {
        boolean x = true;
        boolean y = false;
        if (!y && !x) {
            System.out.println("Condition is FALSE");
        } else {
            System.out.println("Condition is TRUE");
        }

    }
}
OutPut = else statement*/

//-----------------------------------------------------------------------------------------------------------

// Mulitple operation

/*package org.studyeasy;

public class Sample {
    public Sample() {
    }

    public static void main(String[] args) {
        int ageOfBoy = 20;
        int ageOfGirl = 28;
        if (ageOfBoy >= 21 && ageOfGirl >= 18) {
            System.out.println("Eligible for marriage");
        } else {
            System.out.println("Wait for it kiddo!");
        }

    }
}
OutPut = else statement*/

//-----------------------------------------------------------------------------------------------------------

// Assigment Operator

/*
package org.studyeasy;

public class Sample {
    public Sample() {
    }

    public static void main(String[] args) {
        int x = 17;
        x %= 5;
        System.out.println(x);
    }
}
output = 3.*/

//-----------------------------------------------------------------------------------------------------------

// Decision with if,else if or else using operations

/*
package org.studyeasy;

public class Sample {
    public Sample() {
    }

    public static void main(String[] args) {
        int x = 4;
        int y = 10;
        if (x == 5) {
            System.out.println("X is 5");
        } else if (x > 5) {
            System.out.println("X is greater 5");
        } else {
            System.out.println("X is smaller 5");
            if (y == 10) {
                System.out.println("y is 10");
            }
        }

    }
}
OUTPUT = ELSe statement*/

//-----------------------------------------------------------------------------------------------------------

//

/**/

//-----------------------------------------------------------------------------------------------------------
// FLOW CONTROL
// For loop

/*package org.studyeasy;

public class Sample {
    public Sample() {
    }

    public static void main(String[] args) {
        for(int i = 10; i > 1; i -= 2) {
            System.out.println(i);
        }

    }
}
Output = 10 8 6 4 2*/

//-----------------------------------------------------------------------------------------------------------

// Switch Case

/*
package org.studyeasy;

public class Sample {
    public Sample() {
    }

    public static void main(String[] args) {
        String name = "Editor";
        switch (name.toLowerCase()) {
            case "author":
                System.out.println("Chaand");
                break;
            case "team":
                System.out.println("Team StudyEasy");
                break;
            case "editor":
                System.out.println("Shabaz & Salim");
                break;
            default:
                System.out.println("Invalid entry");
        }

    }
}
OUTPUT = Case 3 = Shabaz & Salim*/

//-----------------------------------------------------------------------------------------------------------

// For loops

/*package org.studyeasy;

public class Sample {
    public Sample() {
    }

    public static void main(String[] args) {
        int i;
        for(i = 0; i <= 10; ++i) {
            System.out.println(i);
        }

        System.out.println(i);
    }
}
OUtPUT = 0,1,2,3,4,5,6,7,8,9,10,11*/

//-----------------------------------------------------------------------------------------------------------

//DO While Loops
// EVen While statement fails the do statement will execute

/*package org.studyeasy;

public class Sample {
    public Sample() {
    }

    public static void main(String[] args) {
        int i = 0;

        do {
            System.out.println(i);
            ++i;
        } while(i > 10);

    }
}
outpot = 0 Here only do is working while condition fails*/

//-----------------------------------------------------------------------------------------------------------

// The number is 5 on iteration it will not print the number but print before continue string
//eg: Before continue 1, for 5 th iterration it only print Before Continye not 5

/*
package org.studyeasy;

public class Sample {
    public Sample() {
    }

    public static void main(String[] args) {
        for(int i = 0; i < 10; ++i) {
            System.out.println("Before continue");
            if (i != 5) {
                System.out.println(i);
            }
        }

    }
}
Output in the above sentences*/

//-----------------------------------------------------------------------------------------------------------

//for each to iterrate arry

/*package org.studyeasy;

public class Sample {
    public Sample() {
    }

    public static void main(String[] args) {
        int[] x = {1, 2, 3, 4};

        for (int temp = x){
            System.out.println(temp);
        }

    }
}
output = 1,2,3,4  (and temp[0] is 1 , temp[2] is 2*)/

//-----------------------------------------------------------------------------------------------------------

//Nested loops

/*package org.studyeasy;

public class Sample {
    public Sample() {
    }

    public static void main(String[] args) {
        for(int i = 0; i < 10; ++i) {
            for(int j = 0; j < 10; ++j) {
                System.out.println("Value of i: " + i + " and value of j: " + j);
            }

            System.out.println("****************");
        }

    }
} */


//-----------------------------------------------------------------------------------------------------------

// SUM of Digits

/*package org.studyeasy;

public class Sample {
    public Sample() {
    }

    public static void main(String[] args) {
        int x = 234;
        int sumOfDigits = 0;

        do {
            sumOfDigits += x % 10; #getting the remainder
            x /= 10; # eleminating the remainder from original
        } while(x >= 1); # while is true statement if the postive int is given 1 or more

        System.out.println("Sum of digits is " + sumOfDigits);
    }
}
Output = 9*/

//-----------------------------------------------------------------------------------------------------------

//Methods

/*package org.studyeasy;

public class Sample {
    public Sample() {
    }

    public static void main(String[] args) {
        loop(1, 10);                            //with same variable name we can assess dif method
        System.out.println("***********");
        loop(20, 40);
        System.out.println("***********");
        loop(-10, 0);
    }

    public static void loop(int start, int stop) {
        while(start <= stop) {
            System.out.println(start);
            ++start;
        }

    }
}*/

//-----------------------------------------------------------------------------------------------------------

//method overloading

// same variable with diff data types

/*package org.studyeasy;

public class Sample {
    public Sample() {
    }

    public static void main(String[] args) {
        System.out.println("Area of the square " + area(5.0)); now we are using double the last one
    }

    public static int area(int height, int width) {  # if you need to this u have to give 2 values
        return height * width;
    }

    public static int area(int side) {    # if you need to this u have to give one interger values
        return side * side;
    }

    public static double area(double side_d) { # if you need to this u have to give value in double eg 5.0 values
        return side_d * side_d;
    }
}*/

//-----------------------------------------------------------------------------------------------------------

// samae as above
// whatever the data type and parameters need for same value as creaated we need to give excact values to it!

/*package org.studyeasy;

public class Sample {
    public Sample() {
    }

    public static void main(String[] args) {
        sum(1, 2);
        sum(2.1F, 2.2F);
        sum(1.2, 20);
        sum(1, 2.0);
    }

    public static void sum(int x, int y) {
        System.out.println("Addition of 2 int's");
    }

    public static void sum(float x, float y) {
        System.out.println("Addition of 2 floats");
    }

    public static void sum(double x, int y) {
        System.out.println("Addition of 1 double and 1 int");
    }

    public static void sum(int x, double y) {
        System.out.println("Addition of 1 int and 1 double");
    }
}*/

//-----------------------------------------------------------------------------------------------------------

//

/**/

//-----------------------------------------------------------------------------------------------------------

//

/**/

//-----------------------------------------------------------------------------------------------------------

//

/**/

//-----------------------------------------------------------------------------------------------------------

//

/**/

//-----------------------------------------------------------------------------------------------------------

//

/**/

//-----------------------------------------------------------------------------------------------------------

//

/**/

//-----------------------------------------------------------------------------------------------------------

//

/**/

//-----------------------------------------------------------------------------------------------------------

//

/**/

//-----------------------------------------------------------------------------------------------------------

//

/**/

//-----------------------------------------------------------------------------------------------------------

//

/**/

//-----------------------------------------------------------------------------------------------------------

//

/**/

//-----------------------------------------------------------------------------------------------------------

//

/**/

//-----------------------------------------------------------------------------------------------------------

//

/**/

//-----------------------------------------------------------------------------------------------------------

//

/**/

//-----------------------------------------------------------------------------------------------------------

//

/**/

//-----------------------------------------------------------------------------------------------------------

//

/**/

//-----------------------------------------------------------------------------------------------------------

//

/**/

//-----------------------------------------------------------------------------------------------------------

//

/**/

//-----------------------------------------------------------------------------------------------------------

//

/**/
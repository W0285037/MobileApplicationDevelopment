package com.example.w0285037.assignment1;

class Math {

    double multiplication(double n1, double n2){

        return n1 * n2;
    }

    double division(double n1, double n2) throws IllegalArgumentException{

        if(n2 == 0)
            throw new IllegalArgumentException("Argument 'divisor' is 0");
        else
            return n1 / n2;
    }

    double addition(double n1, double n2){

        return n1 + n2;
    }

    double subtraction(double n1, double n2){

        return n1 - n2;
    }

    double makePosNeg(double n){

        return n* -1;
    }
}

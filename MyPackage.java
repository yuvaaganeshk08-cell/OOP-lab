package MyPackage;
public class Arithmetic{

int num1, num2;
Arithmetic(int num1, int num2){

this.num1 = num1;
this.num2 = num2;}


public double sum(){
return num1+num2;}

public double sub(){
return num1-num2;}

public double prod(){
return num1*num2;}

public double div(int a, int b) {
     try {
          return a / b;
       } 
catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
            return 0;
        }
    }
}
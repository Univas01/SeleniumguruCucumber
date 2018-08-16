package sourcecode;

public class ArithmeticOperation {

    //variables
    int num1;
    int num2;
    double sum;
    double multiply;

    public ArithmeticOperation(int a, int b){
        this.num1 = a;
        this.num2 = b;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public double getMultiply(){
        return multiply;
    }

    public void setMultiply(double multiply){
        this.multiply = multiply;
    }
}

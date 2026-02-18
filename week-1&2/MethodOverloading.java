class MethodOverloadingDemo{
    float sum(float a, float b){
        return a + b;
		}
    double sum(double a, double b, double c)
		{
        return a + b + c;
		}
    public static void main(String[] args)
		{
        MethodOverloadingDemo obj = new MethodOverloadingDemo();
        System.out.println("Sum of two numbers: " + obj.sum(10, 20));
        System.out.println("Sum of three numbers: " + obj.sum(5, 15, 25));
		}
	}
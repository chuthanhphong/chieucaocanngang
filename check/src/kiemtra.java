import java.util.Scanner;

public class kiemtra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight,height,Bmi;
        System.out.println("nhập cân nặng");
        weight = sc.nextDouble();
        System.out.println("nhập chiều cao");
        height = sc.nextDouble();
        Bmi = weight/Math.pow(height,2);
        if(Bmi<18.5){
            System.out.println("Underweight");
        } else if(Bmi < 25.0){
            System.out.println("Normal");
        } else if(Bmi <30.0){
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}

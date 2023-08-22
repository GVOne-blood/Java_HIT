package classes;
import java.util.Scanner;
public class hcn {
    private double D;
    private double R;
    public void nhap(){
        Scanner input = new Scanner(System.in);
        System.out.println("nhap gia tri chieu dai va rong ");
        D = input.nextDouble();
        R = input.nextDouble();
    }
    public hcn(){};
    public hcn(double d, double r)
    {
        D = d;
        R = r;
    }
    public void setD(double D)
    {
        this.D= D;
    }
    public double getD()
    {
        return this.D;
    }
    public void setR(double R)
    {
        this.R = R;
    }
    public double getR(){
        return this.R;
    }
    public void veHCN(){
      for(int i=1;i<=D;i++){
        for(int j=1;j<=R;j++){ System.out.print("*  ");}
        System.out.println();}
    }
    public double dienTich(){
        return D*R;
    }
    public double chuVi(){
        return (D+R)*2;
    }
    
}

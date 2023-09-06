package classes;

import java.util.Scanner;

public class Address {
    private String city, district;
    public Address(){};
    public Address(String City, String District)
    {
        city = City;
        district = District;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getDistrict() {
        return district;
    }
    public void setDistrict(String district) {
        this.district = district;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        city = sc.nextLine();
        district = sc.nextLine();
    }
    public void output(){
        System.out.println("city : " + city);
        System.out.println("district : " + district);
    }
}

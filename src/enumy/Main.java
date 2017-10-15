package enumy;

public class Main {

     static  SampleEnum sex;
    public static void main(String[] args) {
SampleEnum poniedzialek = SampleEnum.WT;
        System.out.println(poniedzialek.getDayOfWeek());
        sex= SampleEnum.CZW;
        System.out.println(sex+ " to: " + sex.getDayOfWeek() + " dzien tygodnia ");
    }
}

import java.util.Scanner ;
public class Atividade2 {
    public static void main ( String[]args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("digite a temperatura em celsius");
        double celsius =scanner.nextDouble();
        double farenheit=(celsius*9/5);
        double kelvin = (celsius + 273.15);
        System.out.println("temperatura em celcius:" +celsius);
        System.out.println("temperatura em Farenheit:"+farenheit);
        System.out.println("temperatura em kelvin:"+kelvin);
    }
}

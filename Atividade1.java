import java.util.Scanner;
public class Atividade1 {
    public static void main ( String [] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("digite a primeira nota");
        double notaUm=scanner.nextDouble();
        System.out.println("digite a segunda nota");
        double notaDois=scanner.nextDouble() ;
        System.out.println("digite a terceira nota") ;
        double notaTres=scanner.nextDouble() ;
        System.out.println("digite a quarta nota");
        double notaQuatro=scanner.nextDouble() ;
        System.out.println("digite a quinta nota");
        double notaCinco= scanner.nextDouble();
        System.out.println("digite a sexta nota") ;
        double notaSeis=scanner.nextDouble() ;
        System.out.println("digite a setima nota");
        double notaSete=scanner.nextDouble() ;
        System.out.println("digite a oitava nota");
        double notaOito= scanner.nextDouble();
        double mediaBi1=(notaUm+notaDois)/2;
        double mediaBi2=(notaTres+notaQuatro)/2;
        double mediaBi3=(notaCinco+notaSeis)/2;
        double mediaBi4=(notaSete+notaOito)/2;
        double mediaSemestre1=(mediaBi1+mediaBi2)/2;
        double mediaSemestre2=(mediaBi3+mediaBi4)/2;
        double mediaFinal=(mediaSemestre1+mediaSemestre2)/2;
        System.out.println("1ºBimestre:"+mediaBi1);
        System.out.println("2ºBimestre:"+mediaBi2);
        System.out.println("1ºSemestre:"+mediaSemestre1);
        System.out.println("----------------------");
        System.out.println("3ºBimestre:"+mediaBi1);
        System.out.println("4ºBimestre:"+mediaBi2);
        System.out.println("2ºSemestre:"+mediaSemestre1);
        System.out.println("Média Final:"+mediaFinal);

    }

}
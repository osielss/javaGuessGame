package pkg2610ex01;
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random sort = new Random();
        int rand = sort.nextInt(11), input=-1;//0--->n-1(10) ou (1, 21)[D20]
        System.out.println("Tente acertar o número(0-10)");
        while(input!=rand){
            input = in.nextInt();
            if(input!=rand){
                System.out.println("[Faustão]: ERROU!!!!");
            }
        }
        System.out.println("[Silvio Santos]: Certa resposta");
        in.close();
    }
}
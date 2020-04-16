import java.util.Scanner;

class ex2{
public static void main(String[] args) {

    int pontos;
    var input = new Scanner(System.in);
    int distancia = input.nextInt();
    System.out.println("Digite a distância do Aremesso: ");
    do{
        input.nextLine();
    }while (distancia < 0 || distancia >2000);
    
    if (distancia <= 800)
        pontos = 1;
    else if (distancia <= 1400)
        pontos = 2;
    else 
        pontos = 3;
    System.out.println(pontos);         
    
    }
}
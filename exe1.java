import java.util.Scanner;

class ex1{
public static void main(String[] args) {

    var input = new Scanner(System.in);
    System.out.println("Digite a quantidade de alunos: ");
    int alunos = input.nextInt();
    input.nextLine();
    System.out.println("Digite a quantidade de monitores: ");
    int monitores = input.nextInt();
    input.nextLine();
    input.close();
    if ((alunos + monitores) <= 50)
        System.out.println("S");
    else
        System.out.println("N");         
    
    }
}
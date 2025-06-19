import java.util.HashMap;
import java.util.Scanner;

public class Gestaoescolar_Hashmap{
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        System.out.print("Quantidade de alunos: ");
        int numAlunos = leia.nextInt();
        System.out.print("Quantidade de notas por aluno: ");
        int numNotas = leia.nextInt();
        HashMap<String, double[]> boletim = new HashMap<>();
        for(int i = 1; i <= numAlunos; i++){
            System.out.print("\nNome do aluno " + i + ": ");
            String nome = leia.next();
            double[] notas = new double[numNotas];
            for(int n = 0; n < numNotas; n++){
                System.out.print("Nota " + (n + 1) + ": ");
                notas[n] = leia.nextDouble();
            }
            boletim.put(nome, notas);
        }
        System.out.println(" ");
        for(String aluno : boletim.keySet()){
            double[] notas = boletim.get(aluno);
            double total = 0;
            for(double nota : notas){
                total += nota;
            }
            double media = total / notas.length;
            String situacao;
            if(media >= 6.0){
                situacao = "Aprovado";
            }else{
                situacao = "Reprovado";
            }
            System.out.println(aluno + " - Média: " + media + ", " + situacao);
        }
    }
}

import java.util.Scanner;
import java.lang.Integer;

public class OperacoesInteiros{
  public static void main(String[] args) {

    int vetor[],i,numero,par,impar,maior,menor,soma;
    float media;
    boolean continua;

    Scanner entrada = new Scanner(System.in);

/*  Quantidade de elementos
    Quantos são pares
    Quantos são ímpares
    Soma total
    Média (duas casas decimais)
    Maior
    Menor*/
    continua = true;

    while(continua){

      numero = entrada.nextInt();

      if(numero != -1){
        vetor = new int[100];
        i = 0;
        maior = Integer.MIN_VALUE;
        menor = Integer.MAX_VALUE;
        soma = 0;
        par = 0;
        impar = 0;

        while(numero != -1){

          vetor[i] = numero;

          if(numero%2 == 0){
            par++;
          } else {
            impar++;
          }

          soma = soma + numero;

          if(numero < menor){
            menor = numero;
          }

          if(numero > maior){
            maior = numero;
          }

          i++;

          numero = entrada.nextInt();

        }

        System.out.println(i);
        System.out.println(par);
        System.out.println(impar);
        System.out.println(soma);
        media = (float) soma/i;
        //System.out.println(media);
        String resultado = String.format("%.2f", media);
        System.out.println(resultado);
        System.out.println(maior);
        System.out.println(menor);

      } else {
        continua = false;
      }

   }

  }
}

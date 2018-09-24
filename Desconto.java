import java.util.Scanner;

public class Desconto{
  public static void main(String[] args) {

    double preco;
    Scanner entrada = new Scanner(System.in);

    preco = entrada.nextFloat();

    if(preco >= 200){
      preco = preco*(0.95);
    }

    System.out.printf("%.2f\n",preco);


  }
}

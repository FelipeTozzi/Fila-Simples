import Filas.FilaSimples;
import java.util.Scanner;


public class Main extends FilaSimples {
    public static void main(String[] args) {

        FilaSimples fila = new FilaSimples();

        Scanner escolha = new Scanner(System.in);
        int dec;
        int numbers;
        int capac = 0;
        int cont = 1;

        System.out.println("Insira o tamanho inicial da fila");
        while (capac <= 0) {
            capac = escolha.nextInt();
            if (capac <= 0) {
                System.out.println("Valor inválido");
                System.out.println("tente novamente.");
            } else {
                fila.AlteraMax(capac);
            }
        }

            while (cont == 1) {

                System.out.println("///////////////////////////////////////////");
                System.out.println();
                System.out.println("[1] - Inserir elemento no final");
                System.out.println("[2] - Remover o elemento no começo");
                System.out.println("[3] - Remover todos os elementos");
                System.out.println("[4] - Visualizar todos os elementos");
                System.out.println("[5] - Verificar a existência de um elemento");
                System.out.println("[6] - Visualizar maior elemento");
                System.out.println("[7] - Visualizar menor elemento");
                System.out.println("[8] - Calcular média");
                System.out.println("[9] - Visualizar quantidade de elementos");
                System.out.println("[10] - Alterar capacidade");
                System.out.println("[11] - Sair");
                System.out.println();
                System.out.println("///////////////////////////////////////////");

                dec = escolha.nextInt();

                switch (dec) {
                    case 1:
                        System.out.println("Insira o número:");
                        numbers = escolha.nextInt();
                        fila.FinalFila(numbers);
                        break;

                    case 2:
                        fila.ComecoFila();
                        break;

                    case 3:
                        fila.MassDelete();
                        break;

                    case 4:
                        fila.VisuFila();
                        break;

                    case 5:
                        System.out.println("Insira o elemento que você deseja buscar");
                        numbers = escolha.nextInt();
                        fila.Buscar(numbers);

                        if (fila.Buscar(numbers)) {
                            System.out.println(STR."\{numbers} Está na lista");
                        } else {
                            System.out.println(STR."\{numbers} Não está na lista");
                        }

                        break;

                    case 6:
                        fila.Maior();
                        break;

                    case 7:
                        fila.Menor();
                        break;

                    case 8:
                        fila.Media();
                        break;

                    case 9:
                        fila.VisuTamAtu();
                        break;

                    case 10:
                        System.out.println("Insira o tamanho da fila");
                        capac = escolha.nextInt();
                        if (capac <= 0) {
                            while (capac <= 0) {
                                System.out.println("Valor inválido");
                                System.out.println("tente novamente.");
                                capac = escolha.nextInt();
                            }
                            fila.AlteraMax(capac);
                        }
                        break;

                    case 11:
                        System.out.println("Encerrando");
                        cont = 0;

                    default:
                        System.out.println("Valor inválido");


                }
            }


        }
    }

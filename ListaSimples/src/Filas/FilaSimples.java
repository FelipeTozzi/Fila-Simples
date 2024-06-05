package Filas;
public class FilaSimples {
    private No com;
    private No fim;
    private int tamanhoatual;
    private int tamanhomax;

    public FilaSimples() {

        this.com = null;
        this.fim = null;
        this.tamanhoatual = 0;
        this.tamanhomax = 0;

    }

    public void AlteraMax(int elemento) {
        if (elemento <= 0) {
            System.out.println("Valor inválido");
        } else {
            this.tamanhomax = elemento;
            System.out.println("Tamanho máximo alterado");
        }
    }

    //coloca elementos no fim
    public void FinalFila(int elemento) {

        if (tamanhoatual > tamanhomax) {
            System.out.println("Criação ultrapassa limite");
        } else {
            No CriaNo = new No(elemento);
            if (fim != null) {
                fim.prox = CriaNo;
            }
            fim = CriaNo;

            if (com == null) {
                com = CriaNo;
            }
            tamanhoatual++;
        }
    }

    //remove elementos do começo
    public void ComecoFila() {

        if (tamanhoatual == 0) {
            System.out.print("Adicione elementos primeiro");
        } else {
            com = com.prox;
            if (com == null) {
                fim = null;
            }
            tamanhoatual--;
            System.out.println("número removido");
        }
    }

    public boolean Buscar(int elemento) {
        No buscar = com;
        while (buscar != null) {
            if (buscar.elementos == elemento) {
                return true;
            }
            buscar = buscar.prox;
        }
        return false;
    }

    public void MassDelete(){
        No buscar = com;
        while (buscar != null){
           ComecoFila();
           buscar = buscar.prox;
        }
        System.out.println("Todos elementos removidos");
    }

    public void VisuFila(){
        if (tamanhoatual == 0) {
            System.out.println("Adicione elementos primeiro");

        } else {
            No buscar = com;
            while (buscar != null) {
                System.out.println(buscar.elementos);
                buscar = buscar.prox;
            }
        }
    }

    public void Maior() {
        if (tamanhoatual == 0) {
            System.out.println("Adicione elementos primeiro");

        } else {
            No buscar = com;
            int Maior = buscar.elementos;
            buscar = buscar.prox;

            while (buscar != null) {
                if (buscar.elementos > Maior)
                    Maior = buscar.elementos;
                buscar = buscar.prox;
            }
            System.out.println(STR."O maior elemento é \{Maior}");
        }
    }

    public void DeletarTodosOsElementosSoQueNaoJaQueNaVerdadeSaoTodasAsInstanciasDeUmElementoNaFila(int elemento){
        if (tamanhoatual == 0) {
            System.out.println("Adicione elementos primeiro");

        } else {
            No buscar = com;
            No ante = null;

            while (com != null && com.elementos == elemento){
                com = com.prox;
                tamanhoatual--;
            }

            while (buscar != null) {
                if (buscar.elementos == elemento) {
                    if (ante != null) {
                        ante.prox = buscar.prox;
                    }
                    if (buscar == fim) {
                        fim = ante;
                    }
                    tamanhoatual--;
                } else {
                    ante = buscar;
                }
                    buscar = buscar.prox;
            }
        }
    }

    public void Menor() {
        if (tamanhoatual == 0) {
            System.out.println("Adicione elementos primeiro");

        } else {
            No buscar = com;
            int Maior = buscar.elementos;
            buscar = buscar.prox;

            while (buscar != null) {
                if (buscar.elementos < Maior)
                    Maior = buscar.elementos;
                buscar = buscar.prox;
            }
            System.out.println(STR."O menor elemento é \{Maior}");
        }
    }

    public void Media() {
        if (tamanhoatual == 0) {
            System.out.println("Adicione elementos primeiro");

        } else {
            No buscar = com;
            int soma = 0;
            int quantidate = 0;

            while (buscar != null) {

                soma += buscar.elementos;
                quantidate++;
                buscar = buscar.prox;
            }
            float media = (float) soma /quantidate;
            System.out.println(STR."A média dos elemento é \{media}");
        }
    }


        public void VisuTamAtu(){

            System.out.println(STR."O tamanho da fila atualmente é \{tamanhoatual}");
        }
}


//questao4 AV1
package classes;

public class Prova {
    private String nome;
    private int matricula;
    private char[] respostas;

    public Prova(String nome, int matricula){
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getMatricula(){
        return this.matricula;
    }

    public void respostaAluno(char[] resposta){
        this.respostas = resposta;
    }

    public int acertos(char[] gabarito){
        int total = 0;
        for(int i = 0; i < respostas.length;i++){
            if(respostas[i] == gabarito[i]){
                total++;
            }
        }
        return total;
    }

    public double nota(char[] gabarito){
        double notaFinal = 0;
        for(int i = 0; i < respostas.length;i++){
            if(respostas[i] == gabarito[i]){
                if(i<3){
                    notaFinal += 1;
                }
                else{
                    notaFinal += 2;
                }
            }
        }
        return notaFinal;
    }
}

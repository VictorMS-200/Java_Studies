package Orientação_a_Objeto.Exemplo02;

public class Exemplo02 {
    public static void main(String[] args) {
        Candidato cand = new Candidato();

        String[] Victor = {"Nome", "Victor", "Idade", "18", "Numero", "46"};
        cand.setCandidato(Victor);

        cand.getCandidato();
    }
}



public class Candidato {
    private String[] candidato;

    public void setCandidato(String[] InformaçõesCandidato) {
        this.candidato = InformaçõesCandidato;
    }
    public void getCandidato() {
        for (int i = 0; i < candidato.length; i++) {
            if (i % 2 == 0) {
                System.out.print(candidato[i] + ": ");
            } else {
                System.out.println(candidato[i]);
            }
        }
    }
}

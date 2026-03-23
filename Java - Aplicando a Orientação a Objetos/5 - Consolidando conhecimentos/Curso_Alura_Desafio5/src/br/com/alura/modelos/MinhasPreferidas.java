package br.com.alura.modelos;

public class MinhasPreferidas extends Audio{
    public void inlcui(Audio audio){
        if (audio.getClassificacao() >= 7){
            System.out.println(audio.getTitulo() + " É um sucesso!");
        } else {
            System.out.println(audio.getTitulo() + " Não fez muito sucesso!");
        }
    }
}

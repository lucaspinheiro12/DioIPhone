package br.com.iphoneDIO.aula.maven.contratos;

public interface AparelhoTelefonico {
    void fazerChamada(String numero);
    void receberChamada(String numero);
    void desligarChamada();
}

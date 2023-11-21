package br.com.iphoneDIO.aula.maven.contratos;

public interface NavegadorInternet {
    void abrirPagina(String url);
    void fecharPagina();
    void navegarParaFrente();
    void navegarParaTras();
}

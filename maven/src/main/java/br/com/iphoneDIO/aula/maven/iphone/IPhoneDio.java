package br.com.iphoneDIO.aula.maven.iphone;

import br.com.iphoneDIO.aula.maven.contratos.AparelhoTelefonico;
import br.com.iphoneDIO.aula.maven.contratos.NavegadorInternet;
import br.com.iphoneDIO.aula.maven.contratos.ReprodutorMusical;

public class IPhoneDio implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    // Implementação dos métodos da interface ReprodutorMusical
    @Override
    public void tocarMusica() {
       System.out.println("tocar musica");
    }

    @Override
    public void pausarMusica() {
       System.out.println("Pausar musica");
    }

    @Override
    public void avancarMusica() {
        System.out.println("proxima musica");
    }

    @Override
    public void retrocederMusica() {
        System.out.println("voltar anterior");
    }

	@Override
	public void abrirPagina(String url) {
		System.out.println("abrir navegador web: " + url);
		
	}

	@Override
	public void fecharPagina() {
		System.out.println("fechar navegadro web");
		
	}

	@Override
	public void navegarParaFrente() {
		System.out.println("Navagador fechado");
		
	}

	@Override
	public void navegarParaTras() {
		System.out.println("voltar pagina");
		
	}

	@Override
	public void fazerChamada(String numero) {
		System.out.println("ligando para o numero: " + numero);
		
	}

	@Override
	public void receberChamada(String numero) {
		System.out.println("fazendo chamada para: " + numero);
		
	}

	@Override
	public void desligarChamada() {
		System.out.println("desligar chamada");
		
	}
}

# DioIPhone

##Diagrama de classes

```mermaid
classDiagram

class IPhone {
        +tocarMusica()
        +pausarMusica()
        +avancarMusica()
        +retrocederMusica()
        +fazerChamada(numero)
        +receberChamada(numero)
        +desligarChamada()
        +abrirPagina(url)
        +fecharPagina()
        +navegarParaFrente()
        +navegarParaTras()
    }
    interface ReprodutorMusical {
        +tocarMusica()
        +pausarMusica()
        +avancarMusica()
        +retrocederMusica()
    }

    interface AparelhoTelefonico {
        +fazerChamada(numero)
        +receberChamada(numero)
        +desligarChamada()
    }

    interface NavegadorInternet {
        +abrirPagina(url)
        +fecharPagina()
        +navegarParaFrente()
        +navegarParaTras()
    }

        IPhone --> ReprodutorMusical
        IPhone --> AparelhoTelefonico
        IPhone --> NavegadorInternet
```

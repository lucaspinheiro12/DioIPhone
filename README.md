# DioIPhone

classDiagram
    class ReprodutorMusical {
        +tocarMusica()
        +pausarMusica()
        +avancarMusica()
        +retrocederMusica()
    }

    class AparelhoTelefonico {
        +fazerChamada(numero)
        +receberChamada(numero)
        +desligarChamada()
    }

    class NavegadorInternet {
        +abrirPagina(url)
        +fecharPagina()
        +navegarParaFrente()
        +navegarParaTras()
    }

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

    ReprodutorMusical <|-- IPhone
    AparelhoTelefonico <|-- IPhone
    NavegadorInternet <|-- IPhone

package com.spotufy.open.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class PaginaDeReproduccionSpotifyUI {
    public static Target TXT_TITULO =Target.the("texto de pagina despues del logeo")
            .locatedBy("//h2[contains(text(),'Escuchado recientemente')]");
}

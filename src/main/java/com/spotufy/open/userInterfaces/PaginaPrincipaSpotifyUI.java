package com.spotufy.open.userInterfaces;


import net.serenitybdd.screenplay.targets.Target;

public class PaginaPrincipaSpotifyUI {
    public static Target BTN_INICIAR_SESION =Target.the("boton de inicio de sesion en spotify")
            .locatedBy("//span[contains(text(),'Iniciar sesión')]");
}

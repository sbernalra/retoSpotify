package com.spotufy.open.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class PaginaDeInicioDeSesionSpotifyUI {
    public static Target TXT_USUARIO =Target.the("Caja de texto para ingresar usuario")
            .locatedBy("//input[@id='login-username']");
    public static Target TXT_CLAVE = Target.the("caja de texto de ingresar clave")
            .locatedBy("//input[@id='login-password']");
    public static Target BTN_INICIAR_SESION = Target.the("boton de iniciar sesion")
            .locatedBy("//button[@id='login-button']");
}

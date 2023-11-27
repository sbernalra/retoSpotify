package com.spotufy.open.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class PaginaDeBusquedaSpotifyUI {
    public static Target BTN_BUSCAR =Target.the("boton de busqueda")
            .locatedBy("//span[contains(text(),'Buscar')]");
    public static Target TXT_BUSQUEDA =Target.the("caja de testo de busqueda")
            .locatedBy("//input[@class='Type__TypeElement-sc-goli3j-0 ieTwfQ QO9loc33XC50mMRUCIvf']");
    public static Target LBL_NOMBRECANCION =Target.the("Lista de la cancion")
            .locatedBy("//div[@role='presentation']//div[contains(text(),'Gasolina')]");
    public static Target BTN_PLAY =Target.the("boton de reproduccion")
            .locatedBy("//span[@class='ButtonInner-sc-14ud5tc-0 fGgTkO encore-bright-accent-set']");
   }

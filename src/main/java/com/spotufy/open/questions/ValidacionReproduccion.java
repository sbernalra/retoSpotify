package com.spotufy.open.questions;

import com.spotufy.open.interactions.Esperas;
import com.spotufy.open.userInterfaces.PaginaDeReproduccionSpotifyUI;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.spotufy.open.userInterfaces.PaginaDeReproduccionSpotifyUI.TXT_ARTISTA;
import static com.spotufy.open.userInterfaces.PaginaDeReproduccionSpotifyUI.TXT_TITULO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;


public class ValidacionReproduccion implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        WebElementFacade cancion = TXT_ARTISTA.resolveFor(actor);
        System.out.println(cancion.getText());
        return cancion.isDisplayed();
    }
    public static Question<Boolean>from(){
        return new ValidacionReproduccion();
    }
}
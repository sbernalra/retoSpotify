package com.spotufy.open.questions;

import com.spotufy.open.userInterfaces.PaginaDeReproduccionSpotifyUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;



public class ValidacionLogin implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return PaginaDeReproduccionSpotifyUI.TXT_TITULO.resolveFor(actor).getText();
          }

    public static Question<String> onTheSite() {
        return new ValidacionLogin();
    }}
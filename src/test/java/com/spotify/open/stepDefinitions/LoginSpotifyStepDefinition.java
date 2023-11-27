package com.spotify.open.stepDefinitions;


import com.spotufy.open.questions.ValidacionLogin;
import com.spotufy.open.task.PaginaDeInicioDeSesionSpotifay;
import com.spotufy.open.task.PaginaPrincipalSpotify;
import io.cucumber.java.Before;
import io.cucumber.java.es.*;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static org.hamcrest.core.IsEqual.equalTo;


public class LoginSpotifyStepDefinition {
    @Before
    public void setStage(){

        setTheStage(new OnlineCast());
    }
    @Dado("que el usuario abre el navegador en Spotify")
    public void queElUsuarioAbreElNavegadorEnSpotify() {
        theActorCalled("user").wasAbleTo(
                Open.url("https://open.spotify.com/intl-es")
        );

    }
    @Cuando("el usuario ingresa las credenciales correctas")
    public void elUsuarioIngresaLasCredencialesCorrectas() {
        OnStage.theActorInTheSpotlight().attemptsTo(PaginaPrincipalSpotify.on());
        OnStage.theActorInTheSpotlight().attemptsTo(PaginaDeInicioDeSesionSpotifay.on());

    }
    @Entonces("el usuario podra ver la lista de canciones")
    public void elUsuarioPodraVerLaListaDeCanciones() {
        OnStage.theActorInTheSpotlight().should(seeThat(ValidacionLogin.onTheSite(),equalTo("Escuchado recientemente")));

    }


}

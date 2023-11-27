package com.spotify.open.stepDefinitions;

import com.spotufy.open.questions.ValidacionReproduccion;
import com.spotufy.open.task.PaginaDeBusquedaSpotify;
import com.spotufy.open.task.PaginaDeBusquedayReproduccionSpotify;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ReproducirCancionSpotifyStepDefinition {
    @Cuando("el usuario escriba el nombre de la cancion")
    public void elUsuarioEscribaElNombreDeLaCancion() {
        theActorInTheSpotlight().attemptsTo(PaginaDeBusquedaSpotify.on());

    }
    @Cuando("seleccionar la cancion elegida")
    public void seleccionarLaCancionElegida() {
        theActorInTheSpotlight().attemptsTo(PaginaDeBusquedayReproduccionSpotify.on());

    }
    @Entonces("se reproduce la cancion")
    public void seReproduceLaCancion() {
        theActorInTheSpotlight().should(
                seeThat(
                        ValidacionReproduccion.from(), Matchers.equalTo(true)
                )
        );

    }
}

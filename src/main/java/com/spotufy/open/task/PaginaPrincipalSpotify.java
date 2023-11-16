package com.spotufy.open.task;

import com.spotufy.open.userInterfaces.PaginaPrincipaSpotifyUI;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.spotufy.open.userInterfaces.PaginaPrincipaSpotifyUI.BTN_INICIAR_SESION;

public class PaginaPrincipalSpotify implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_INICIAR_SESION));
    }
    public static Performable on(){return Instrumented.instanceOf(PaginaPrincipalSpotify.class).withProperties();
    }
}

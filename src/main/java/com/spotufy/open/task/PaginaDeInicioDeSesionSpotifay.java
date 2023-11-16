package com.spotufy.open.task;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.spotufy.open.userInterfaces.PaginaDeInicioDeSesionSpotifyUI.*;

public class PaginaDeInicioDeSesionSpotifay implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.keyValues("sebastian.bernal.ramirez@gmail.com").into(TXT_USUARIO),
                Enter.keyValues("Sber_1raz$").into(TXT_CLAVE),
                Click.on(BTN_INICIAR_SESION));
    }
    public static Performable on(){return Instrumented.instanceOf(PaginaDeInicioDeSesionSpotifay.class).withProperties();
    }
}

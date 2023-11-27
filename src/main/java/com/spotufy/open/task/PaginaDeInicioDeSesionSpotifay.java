package com.spotufy.open.task;

import com.spotufy.open.interactions.Esperas;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.spotufy.open.userInterfaces.PaginaDeInicioDeSesionSpotifyUI.*;
import static com.spotufy.open.userInterfaces.PaginaDeReproduccionSpotifyUI.TXT_TITULO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;

public class PaginaDeInicioDeSesionSpotifay implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.keyValues("sebastian.bernal.ramirez@gmail.com").into(TXT_USUARIO),
                Enter.keyValues("Sber_1raz$").into(TXT_CLAVE),
                Click.on(BTN_INICIAR_SESION),
                WaitUntil.the(TXT_TITULO,isNotVisible()).forNoMoreThan(Esperas.ALTA_EN_SEGUNDOS).seconds());
    }
    public static Performable on(){return Instrumented.instanceOf(PaginaDeInicioDeSesionSpotifay.class).withProperties();
    }
}

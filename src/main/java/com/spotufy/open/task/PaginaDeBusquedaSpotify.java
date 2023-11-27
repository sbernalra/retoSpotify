package com.spotufy.open.task;

import com.spotufy.open.interactions.SeleccionYReproduccion;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.spotufy.open.userInterfaces.PaginaDeBusquedaSpotifyUI.*;

public class PaginaDeBusquedaSpotify implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BTN_BUSCAR),
                Enter.keyValues("gasolina").into(TXT_BUSQUEDA));
              }
    public static Performable on(){return Instrumented.instanceOf(PaginaDeBusquedaSpotify.class).withProperties();
    }
}

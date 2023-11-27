package com.spotufy.open.interactions;

import com.spotufy.open.task.PaginaDeBusquedaSpotify;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

import static com.spotufy.open.userInterfaces.PaginaDeBusquedaSpotifyUI.LBL_NOMBRECANCION;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionYReproduccion implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> ListaCanciones = LBL_NOMBRECANCION.resolveAllFor(actor);
        Random random = new Random();
        int index = random.nextInt(ListaCanciones.size());
        WebElementFacade cancion = ListaCanciones.get(index);
        cancion.click();

    }

    public static Performable clic() {
        return instrumented(SeleccionYReproduccion.class);
    }
}

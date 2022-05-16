package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.StartSharpPage;
import java.util.concurrent.TimeUnit;

public class NewBussinesUnit implements Task {
    private StartSharpPage startSharpPage;
    private String nombreBu;
    private String unidadNegocio;

    public NewBussinesUnit(String nombreBu, String unidadNegocio) {
        this.nombreBu = nombreBu;
        this.unidadNegocio = unidadNegocio;
    }

    public static NewBussinesUnit createBU(String unidadNegocio, String nombreBu) {
        return Tasks.instrumented(NewBussinesUnit.class, nombreBu, unidadNegocio);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(StartSharpPage.CREATE_BU_BUTTON),

                //BU unidad
                Click.on(StartSharpPage.INPUT_UNIT),
                Enter.theValue(unidadNegocio).into(StartSharpPage.INPUT_NAME_UNIT),
                Click.on(StartSharpPage.INPUT_SELECT_UNIT),

                //BU name
                Enter.theValue(nombreBu).into(StartSharpPage.INPUT_NAME),
                Click.on(StartSharpPage.SAVE_BUTTON),
                Click.on(StartSharpPage.SEARCH_BUTTON),

                //BU search
                Enter.theValue(nombreBu).into(StartSharpPage.INPUT_SEARCH)


        );

        try{
            TimeUnit.SECONDS.sleep(2);}
        catch(InterruptedException e){
            e.printStackTrace();
        }


    }



}
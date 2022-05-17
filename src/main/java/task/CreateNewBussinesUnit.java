package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.BussinesUnit;

public class NewBussinesUnit implements Task {
    private BussinesUnit bussinesUnit;
    private String nombreBu;
    private String unidadNegocio;

    public NewBussinesUnit(String nombreBu, String unidadNegocio) {
        this.nombreBu = nombreBu;
        this.unidadNegocio = unidadNegocio;
    }

    public static NewBussinesUnit createBU() {
        return Tasks.instrumented(NewBussinesUnit.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(BussinesUnit.ORGANIZATION_BUTTON),
                Click.on(BussinesUnit.BU_BUTTOM),
                Click.on(BussinesUnit.CREATE_BU_BUTTON),
                Click.on(BussinesUnit.INPUT_UNIT),
                Enter.theValue(unidadNegocio).into(BussinesUnit.INPUT_NAME_UNIT),
                Click.on(BussinesUnit.INPUT_SELECT_UNIT),
                Enter.theValue(nombreBu).into(BussinesUnit.INPUT_NAME),
                Click.on(BussinesUnit.SAVE_BUTTON),
                Click.on(BussinesUnit.SEARCH_BUTTON),
                Enter.theValue(nombreBu).into(BussinesUnit.INPUT_SEARCH)
        );
    }



}
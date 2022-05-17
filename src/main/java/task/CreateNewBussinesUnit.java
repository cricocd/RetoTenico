package task;

import model.StartSharpData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.BussinesUnitSection;
import java.util.List;

import static userinterface.BussinesUnitSection.*;

public class CreateNewBussinesUnit implements Task {
    private BussinesUnitSection bussinesUnitSection;
    private List<StartSharpData> startSharpDataList;


    public CreateNewBussinesUnit(List<StartSharpData > information) {
        this.startSharpDataList = information;
    }

    public static CreateNewBussinesUnit withThe(List<StartSharpData> information) {
        return Tasks.instrumented(CreateNewBussinesUnit.class, information);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(ORGANIZATION_BUTTON),
                Click.on(BU_BUTTOM),
                Click.on(CREATE_BU_BUTTON),
                Click.on(INPUT_UNIT),
                Enter.theValue(startSharpDataList.get(0).getUnidadNegocio()).into(INPUT_NAME_UNIT),
                Click.on(INPUT_SELECT_UNIT),
                Enter.theValue(startSharpDataList.get(0).getNombreBu()).into(INPUT_NAME),
                Click.on(SAVE_BUTTON),
                Click.on(SEARCH_BUTTON),
                Enter.theValue(startSharpDataList.get(0).getNombreBu()).into(INPUT_SEARCH)
        );
    }



}
package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userinterface.StartSharpPage;

public class OpenBussinesUnit implements Task {
    private StartSharpPage startSharpPage;

    public static OpenBussinesUnit openUp() {
        return Tasks.instrumented(OpenBussinesUnit.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(StartSharpPage.BU_BUTTOM)

        );

    }
}

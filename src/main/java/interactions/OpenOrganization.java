package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userinterface.StartSharpPage;

public class OpenOrganization implements Task {
    private StartSharpPage startSharpPage;

    public static OpenOrganization openUp() {
        return Tasks.instrumented(OpenOrganization.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(StartSharpPage.ORGANIZATION_BUTTON)
        );

    }
}

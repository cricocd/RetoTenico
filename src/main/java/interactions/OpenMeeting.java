package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userinterface.StartSharpPage;

public class OpenMeeting implements Task {
    private StartSharpPage startSharpPage;

    public static OpenMeeting openUp() {
        return Tasks.instrumented(OpenMeeting.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(StartSharpPage.MEETING_BUTTON)

        );

    }
}

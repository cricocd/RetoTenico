package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.targets.EnsureFieldVisible;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.serenitybdd.screenplay.waits.WaitUntilTargetIsReady;
import userinterface.StartSharpPage;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;


public class Login implements Task {
    private StartSharpPage startSharpPage;

    public static Login inThePage() {
        return Tasks.instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(startSharpPage),
                Click.on(StartSharpPage.SIGN_IN_BUTTON)
                /*Click.on(StartSharpPage.ORGANIZATION_BUTTON),
                Click.on(StartSharpPage.BU_BUTTOM),
                Click.on(StartSharpPage.CREATE_BU_BUTTON),
                WaitUntil.the(StartSharpPage.INPUT_NAME, isCurrentlyVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue("test").into(StartSharpPage.INPUT_NAME)*/

        );

    }
}

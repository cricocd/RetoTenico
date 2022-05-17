package task;

import model.StartSharpData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import userinterface.MeetingSection;
import java.util.List;
import static userinterface.MeetingSection.*;

public class CreateNewMeeting implements Task {

    private MeetingSection meetingSection;
    private List<StartSharpData> startSharpDataList;

    public CreateNewMeeting(List<StartSharpData> startSharpDataList) {
        this.startSharpDataList = startSharpDataList;
    }

    public static CreateNewMeeting withThe(List<StartSharpData> data) {
        return Tasks.instrumented(CreateNewMeeting.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Click.on(MEETING_BUTTON),
                Click.on(MEETINGS_BUTTON),
                Click.on(CREATE_MEETING_BUTTON),
                Enter.theValue(startSharpDataList.get(0).getNombreMeet()).into(INPUT_MEETING_NAME),
                Click.on(SELECT_MEETING_TYPE),
                Enter.theValue(startSharpDataList.get(0).getTipo()).into(INPUT_NAME_MEETING_TYPE),
                Click.on(INPUT_SELECT_MEETING_TYPE),
                Enter.theValue(startSharpDataList.get(0).getNumeroMeet()).into(INPUT_MEETING_NUMBER),
                Click.on(START_CALENDAR_BUTTON),
                SelectFromOptions.byVisibleText(startSharpDataList.get(0).getMesInicio()).from(START_MONTH_LIST),
                Click.on(SELECT_START_DAY_BUTTON),
                SelectFromOptions.byVisibleText(startSharpDataList.get(0).getHoraInicio()).from(START_TIME_LIST),
                Click.on(FINAL_CALENDAR_BUTTON),
                SelectFromOptions.byVisibleText(startSharpDataList.get(0).getMesFin()).from(FINAL_MONTH_LIST),
                Click.on(SELECT_FINAL_DAY_BUTTON),
                SelectFromOptions.byVisibleText(startSharpDataList.get(0).getHoraFin()).from(FINAL_TIME_LIST),
                Click.on(SELECT_MEETING_LOCATION),
                Enter.theValue(startSharpDataList.get(0).getLocalizacionMeet()).into(INPUT_NAME_MEETING_LOCATION),
                Click.on(INPUT_SELECT_MEETING_LOCATION),
                Click.on(SELECT_MEETING_UNIT),
                Enter.theValue(startSharpDataList.get(0).getUnidadNegocio()).into(INPUT_NAME_MEETING_UNIT),
                Click.on(INPUT_SELECT_MEETING_UNIT),
                Click.on(SELECT_MEETING_OWNER),
                Enter.theValue(startSharpDataList.get(0).getAnfitrionMeet()).into(INPUT_NAME_MEETING_OWNER),
                Click.on(INPUT_SELECT_MEETING_OWNER),
                Click.on(SELECT_MEETING_REPORTED),
                Enter.theValue(startSharpDataList.get(0).getReporteroMeet()).into(INPUT_NAME_MEETING_REPORTED),
                Click.on(INPUT_SELECT_MEETING_REPORTED),
                Click.on(SELECT_MEETING_ATTENDEE),
                Enter.theValue(startSharpDataList.get(0).getInvitadosMeet()).into(INPUT_NAME_MEETING_ATTENDEE),
                Click.on(INPUT_SELECT_MEETING_ATTENDEE),
                Click.on(SELECT_MEETING_ATTENDEE_TYPE),
                Click.on(INPUT_SELECT_MEETING_ATTENDEE_TYPE),
                Click.on(SELECT_MEETING_ATTENDEE_STATUS),
                Click.on(INPUT_SELECT_MEETING_ATTENDEE_STATUS),
                Click.on(SAVE_BUTTON),
                Click.on(SEARCH_BUTTON),
                Enter.theValue(startSharpDataList.get(0).getNombreMeet()).into(SEARCH_BUTTON)
        );
    }
}
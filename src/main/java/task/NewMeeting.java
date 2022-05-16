package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import userinterface.CreateMeeting;
import userinterface.StartSharpPage;

public class NewMeeting implements Task {
    private StartSharpPage startSharpPage;
    private CreateMeeting createMeeting;

    private String unidadNegocio;
    private String nombreMeet;
    private String tipo;
    private String numeroMeet;
    private String localizacionMeet;
    private String anfitrionMeet;
    private String reporteroMeet;
    private String invitadosMeet;
    private String tipoInvitado;
    private String estadoInvitado;
    private String horaInicio;
    private String horaFin;
    private String mesInicio;
    private String mesFin;
    private String diaInicio;
    private String diaFin;



    public NewMeeting(String unidadNegocio, String nombreMeet, String tipo, String numeroMeet, String localizacionMeet, String anfitrionMeet, String reporteroMeet, String invitadosMeet, String tipoInvitado, String estadoInvitado, String horaInicio, String horaFin, String mesInicio, String mesFin, String diaInicio, String diaFin) {
        this.unidadNegocio = unidadNegocio;
        this.nombreMeet = nombreMeet;
        this.tipo = tipo;
        this.numeroMeet = numeroMeet;
        this.localizacionMeet = localizacionMeet;
        this.anfitrionMeet = anfitrionMeet;
        this.reporteroMeet = reporteroMeet;
        this.invitadosMeet = invitadosMeet;
        this.tipoInvitado = tipoInvitado;
        this.estadoInvitado = estadoInvitado;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.mesInicio = mesInicio;
        this.mesFin = mesFin;
        this.diaInicio = diaInicio;
        this.diaFin = diaFin;
    }



    public static NewMeeting createMeet(String nombreMeet, String unidadNegocio, String tipo, String numeroMeet, String localizacionMeet, String anfitrionMeet, String reporteroMeet, String invitadosMeet, String tipoInvitado, String estadoInvitado, String horaInicio, String horaFin, String mesInicio, String mesFin, String diaInicio, String diaFin) {
        return Tasks.instrumented(NewMeeting.class, nombreMeet, unidadNegocio, tipo, numeroMeet, localizacionMeet, anfitrionMeet, reporteroMeet, invitadosMeet, tipoInvitado, estadoInvitado, horaInicio, horaFin, mesInicio, mesFin, diaInicio, diaFin);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CreateMeeting.CREATE_MEETING_BUTTON),
                //meeting name
                Enter.theValue(nombreMeet).into(CreateMeeting.INPUT_MEETING_NAME),

                //meeting type
                Click.on(CreateMeeting.SELECT_MEETING_TYPE),
                Enter.theValue(tipo).into(CreateMeeting.INPUT_NAME_MEETING_TYPE),
                Click.on(CreateMeeting.INPUT_SELECT_MEETING_TYPE),

                //meeting number
                Enter.theValue(numeroMeet).into(CreateMeeting.INPUT_MEETING_NUMBER),

                //meeting start date
                Click.on(CreateMeeting.START_CALENDAR_BUTTON),
                SelectFromOptions.byVisibleText(mesInicio).from(CreateMeeting.START_MONTH_LIST),
                Click.on(CreateMeeting.SELECT_START_DAY_BUTTON),
                SelectFromOptions.byVisibleText(horaInicio).from(CreateMeeting.START_TIME_LIST),

                //meeting final date
                Click.on(CreateMeeting.FINAL_CALENDAR_BUTTON),
                SelectFromOptions.byVisibleText(mesFin).from(CreateMeeting.FINAL_MONTH_LIST),
                Click.on(CreateMeeting.SELECT_FINAL_DAY_BUTTON),
                SelectFromOptions.byVisibleText(horaFin).from(CreateMeeting.FINAL_TIME_LIST),

                //meeting localization
                Click.on(CreateMeeting.SELECT_MEETING_LOCATION),
                Enter.theValue(localizacionMeet).into(CreateMeeting.INPUT_NAME_MEETING_LOCATION),
                Click.on(CreateMeeting.INPUT_SELECT_MEETING_LOCATION),

                //meeting unit
                Click.on(CreateMeeting.SELECT_MEETING_UNIT),
                Enter.theValue(unidadNegocio).into(CreateMeeting.INPUT_NAME_MEETING_UNIT),
                Click.on(CreateMeeting.INPUT_SELECT_MEETING_UNIT),

                //meeting owner
                Click.on(CreateMeeting.SELECT_MEETING_OWNER),
                Enter.theValue(anfitrionMeet).into(CreateMeeting.INPUT_NAME_MEETING_OWNER),
                Click.on(CreateMeeting.INPUT_SELECT_MEETING_OWNER),

                //meeting reporter
                Click.on(CreateMeeting.SELECT_MEETING_REPORTED),
                Enter.theValue(reporteroMeet).into(CreateMeeting.INPUT_NAME_MEETING_REPORTED),
                Click.on(CreateMeeting.INPUT_SELECT_MEETING_REPORTED),

                //meeting attendee
                Click.on(CreateMeeting.SELECT_MEETING_ATTENDEE),
                Enter.theValue(invitadosMeet).into(CreateMeeting.INPUT_NAME_MEETING_ATTENDEE),
                Click.on(CreateMeeting.INPUT_SELECT_MEETING_ATTENDEE),

                //meeting attendee type
                Click.on(CreateMeeting.SELECT_MEETING_ATTENDEE_TYPE),
                Click.on(CreateMeeting.INPUT_SELECT_MEETING_ATTENDEE_TYPE),

                //meeting attendee status
                Click.on(CreateMeeting.SELECT_MEETING_ATTENDEE_STATUS),
                Click.on(CreateMeeting.INPUT_SELECT_MEETING_ATTENDEE_STATUS),

                //meeting save
                Click.on(CreateMeeting.SAVE_BUTTON),

                //meeting search
                Click.on(CreateMeeting.SEARCH_BUTTON),
                Enter.theValue(nombreMeet).into(CreateMeeting.SEARCH_BUTTON)









                );



    }
}
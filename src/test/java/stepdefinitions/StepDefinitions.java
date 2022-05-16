package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import interactions.OpenBussinesUnit;
import interactions.OpenMeeting;
import interactions.OpenMeetings;
import interactions.OpenOrganization;
import model.StartSharpData;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.Answer;
import questions.AnswerMeeting;
import task.Login;
import task.NewBussinesUnit;
import task.NewMeeting;

import java.util.List;


public class StepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que Chris tiene una cuenta activa en la aplicacion$")
    public void queChrisTieneUnaCuentaActivaEnLaAplicacion()  {
    }

    @Cuando("^Chris se loguea correctamente en la pagina$")
    public void chrisSeLogueaCorrectamenteEnLaPagina()  {
        OnStage.theActorCalled("Chris").attemptsTo(
                Login.inThePage());

    }

    @Cuando("^da clic en organizaciones$")
    public void daClicEnOrganizaciones()  {
        OnStage.theActorCalled("Chris").attemptsTo(
                OpenOrganization.openUp());
    }

    @Cuando("^da clic en unidades de negocio$")
    public void daClicEnUnidadesDeNegocio()  {
        OnStage.theActorCalled("Chris").attemptsTo(
                OpenBussinesUnit.openUp());

    }

    @Cuando("^da clic crear nueva unidad de negocio$")
    public void daClicCrearNuevaUnidadDeNegocio(List<StartSharpData> startSharpData) {
        OnStage.theActorCalled("Chris").attemptsTo(
                NewBussinesUnit.createBU(
                        startSharpData.get(0).getUnidadNegocio(),
                        startSharpData.get(0).getNombreBu()
                ));

    }


    @Entonces("^la unidad de negocio se crea correctamente (.*)$")
    public void laUnidadDeNegocioSeCreaCorrectamente(String question) {
        OnStage.theActorCalled("Chris").should(GivenWhenThen.seeThat(Answer.toThe(question)));
    }

    @Cuando("^da clic en reunion$")
    public void daClicEnReunion() {
        OnStage.theActorCalled("Chris").attemptsTo(
                OpenMeeting.openUp());
    }

    @Cuando("^da clic en reuniones$")
    public void daClicEnReuniones()  {
        OnStage.theActorCalled("Chris").attemptsTo(
                OpenMeetings.openUp());


    }

    @Cuando("^da clic en nueva reunion para crearla$")
    public void daClicEnNuevaReunionParaCrearla(List<StartSharpData> startSharpData)  {
        OnStage.theActorCalled("Chris").attemptsTo(
                NewMeeting.createMeet(
                        startSharpData.get(0).getUnidadNegocio(),
                        startSharpData.get(0).getNombreMeet(),
                        startSharpData.get(0).getTipo(),
                        startSharpData.get(0).getNumeroMeet(),
                        startSharpData.get(0).getLocalizacionMeet(),
                        startSharpData.get(0).getAnfitrionMeet(),
                        startSharpData.get(0).getReporteroMeet(),
                        startSharpData.get(0).getInvitadosMeet(),
                        startSharpData.get(0).getTipoInvitado(),
                        startSharpData.get(0).getEstadoInvitado(),
                        startSharpData.get(0).getHoraInicio(),
                        startSharpData.get(0).getHoraFin(),
                        startSharpData.get(0).getMesInicio(),
                        startSharpData.get(0).getMesFin(),
                        startSharpData.get(0).getDiaInicio(),
                        startSharpData.get(0).getDiaFin()

                        ));

    }

    @Entonces("^se programa correctamente la nueva reunion (.*)$")
    public void seProgramaCorrectamenteLaNuevaReunion(String question)  {
        OnStage.theActorCalled("Chris").should(GivenWhenThen.seeThat(AnswerMeeting.toThe(question)));
    }

}

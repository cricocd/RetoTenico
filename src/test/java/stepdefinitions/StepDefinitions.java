package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import model.StartSharpData;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.NameBussinesUnit;
import questions.NameMeeting;
import task.Login;
import task.CreateNewBussinesUnit;
import task.CreateNewMeeting;
import java.util.List;


public class StepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^Chris tiene una cuenta activa en la aplicacion$")
    public void chrisTieneUnaCuentaActivaEnLaAplicacion()  {
    }

    @Dado("^se loguea correctamente en la pagina con sus credenciales$")
    public void seLogueaCorrectamenteEnLaPaginaConSusCredenciales(List<StartSharpData> credentials)  {
        OnStage.theActorCalled("Chris").wasAbleTo(Login.inThePageWithThe(credentials));
    }

    @Cuando("^el se dirige a la seccion de unidades de negocio para crear una nueva unidad ingresando la informacion requerida$")
    public void elSeDirigeALaSeccionDeUnidadesDeNegocioParaCrearUnaNuevaUnidadIngresandoLaInformacionRequerida(List<StartSharpData> information) {
        OnStage.theActorInTheSpotlight().attemptsTo(CreateNewBussinesUnit.withThe(information));
    }

    @Entonces("^la unidad de negocio (.*) se crea correctamente$")
    public void laUnidadDeNegocioTestingSeCreaCorrectamente(String created) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(NameBussinesUnit.isEqualToThe(created)));
    }

    @Cuando("^el se dirige a la seccion de reuniones para agendar una nueva ingresando los parametros solicitados$")
    public void elSeDirigeALaSeccionDeReunionesParaAgendarUnaNuevaIngresandoLosParametrosSolicitados(List<StartSharpData> parameters)  {
        OnStage.theActorInTheSpotlight().attemptsTo(CreateNewMeeting.withThe(parameters));
    }

    @Entonces("^se agenda correctamente la nueva reunion (.*)$")
    public void seAgendaCorrectamenteLaNuevaReunionPlanning(String scheduled)  {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(NameMeeting.isEqualToThe(scheduled)));
    }

}

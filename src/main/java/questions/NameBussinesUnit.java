package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import static userinterface.BussinesUnitSection.BU_LIST;
public class NameBussinesUnit implements Question<Boolean> {

    private String created;

    public NameBussinesUnit(String created) {
        this.created = created;
    }

    public static NameBussinesUnit isEqualToThe(String created) {
        return new NameBussinesUnit(created);
    }

    @Override
    public Boolean answeredBy(Actor actor){
        boolean result;
        String unitName = Text.of(BU_LIST).viewedBy(actor).asString();
        if(created.equals(unitName)){
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}

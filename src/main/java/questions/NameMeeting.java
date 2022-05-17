package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import static userinterface.MeetingSection.MEETING_LIST;

public class NameMeeting implements Question<Boolean> {

    private String scheduled;

    public NameMeeting(String scheduled) {
        this.scheduled = scheduled;
    }

    public static NameMeeting isEqualToThe(String question) {
        return new NameMeeting(question);
    }


    @Override
    public Boolean answeredBy(Actor actor){
        boolean result;
        String meetingName = Text.of(MEETING_LIST).viewedBy(actor).asString();
        if(scheduled.equals(meetingName)){
            result = true;
        } else {
            result = false;
        }
        return result;

    }
}


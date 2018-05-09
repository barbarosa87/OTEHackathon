package hackathon.ote.gr.otehackathon.objects;

import java.io.Serializable;
import java.util.List;

/**
 * Created by elias on 5/9/2018.
 */

public class SessionStateObj implements Serializable {
    private String caseId;
    private List<ProcessStatesObj> processStates;
    private String token;
}

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


    public String getCaseId() {
        return caseId;
    }

    public void setCaseId(String caseId) {
        this.caseId = caseId;
    }

    public List<ProcessStatesObj> getProcessStates() {
        return processStates;
    }

    public void setProcessStates(List<ProcessStatesObj> processStates) {
        this.processStates = processStates;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}

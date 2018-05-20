package hackathon.ote.gr.otehackathon.objects;

import java.io.Serializable;
import java.util.List;

/**
 * Created by elias on 5/9/2018.
 */

public class ProcessStatesObj implements Serializable {
    private String numberOfEvents;
    private String processDefinitionId;
    private String processId;
    private StatesObj state;

    public String getNumberOfEvents() {
        return numberOfEvents;
    }

    public void setNumberOfEvents(String numberOfEvents) {
        this.numberOfEvents = numberOfEvents;
    }

    public String getProcessDefinitionId() {
        return processDefinitionId;
    }

    public void setProcessDefinitionId(String processDefinitionId) {
        this.processDefinitionId = processDefinitionId;
    }

    public String getProcessId() {
        return processId;
    }

    public void setProcessId(String processId) {
        this.processId = processId;
    }

    public StatesObj getState() {
        return state;
    }

    public void setState(StatesObj state) {
        this.state = state;
    }
}

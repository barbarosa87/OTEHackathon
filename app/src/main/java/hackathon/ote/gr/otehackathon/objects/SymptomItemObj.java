package hackathon.ote.gr.otehackathon.objects;

import java.io.Serializable;
import java.util.List;

/**
 * Created by elias on 5/9/2018.
 */

public class SymptomItemObj implements Serializable{
    private String caption;
    private String description;
    private Boolean enabled;
    private Boolean visible;
    private List<SymptomItemObj> items = null;
    private String processDefinitionId;
    private String icon;

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Boolean getVisible() {
        return visible;
    }

    public void setVisible(Boolean visible) {
        this.visible = visible;
    }

    public List<SymptomItemObj> getItems() {
        return items;
    }

    public void setItems(List<SymptomItemObj> items) {
        this.items = items;
    }

    public String getProcessDefinitionId() {
        return processDefinitionId;
    }

    public void setProcessDefinitionId(String processDefinitionId) {
        this.processDefinitionId = processDefinitionId;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}

package s4.model;

public class Pet implements HavingName {
    private String name;
    private String proprio;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getProprio() {
        return proprio;
    }
    public void setProprio(String proprio) {
        this.proprio = proprio;
    }

    @Override
    public String name() {
        return name + " appartenant à: " + proprio;
    }

    
}

package project1;

import java.util.HashMap;
import java.util.List;

public class App {
    String appName;
    double[] appRequirements;
    List<String> instances;
    HashMap<String, Integer> interferences;
    
    public App() {
        super();
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppRequirements(double[] appRequirements) {
        this.appRequirements = appRequirements;
    }

    public double[] getAppRequirements() {
        return appRequirements;
    }

    public void setInstances(List<String> instances) {
        this.instances = instances;
    }

    public List<String> getInstances() {
        return instances;
    }

    public void setInterferences(HashMap<String, Integer> interferences) {
        this.interferences = interferences;
    }

    public HashMap<String, Integer> getInterferences() {
        return interferences;
    }
}

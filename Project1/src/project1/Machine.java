package project1;

import java.util.List;

public class Machine {
    String machineName;
    double[] machineSpecs;
    double[] currentUsage;
    List<String> instancesAssigned;
    
    public Machine() {
        super();
    }

    public void setMachineName(String machineName) {
        this.machineName = machineName;
    }

    public String getMachineName() {
        return machineName;
    }

    public void setMachineSpecs(double[] machineSpecs) {
        this.machineSpecs = machineSpecs;
    }

    public double[] getMachineSpecs() {
        return machineSpecs;
    }

    public void setCurrentUsage(double[] currentUsage) {
        this.currentUsage = currentUsage;
    }

    public double[] getCurrentUsage() {
        return currentUsage;
    }

    public void setInstancesAssigned(List<String> instancesAssigned) {
        this.instancesAssigned = instancesAssigned;
    }

    public List<String> getInstancesAssigned() {
        return instancesAssigned;
    }
}

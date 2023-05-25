public class Notebook {
    private int ram;
    private int hdd;
    private String operationSystem;
    private String color;
    private String company;
    public Notebook(int ram, int hdd, String operationSystem, String color, String company) {
        this.ram = ram;
        this.hdd = hdd;
        this.operationSystem = operationSystem;
        this.color = color;
        this.company = company;
    }
    public int getRam() {
        return ram;
    }
    public void setRam(int ram) {
        this.ram = ram;
    }
    public int getHdd() {
        return hdd;
    }
    public void setHdd(int hdd) {
        this.hdd = hdd;
    }
    public String getOperationSystem() {
        return operationSystem;
    }
    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }
    @Override
    public String toString() {
        return "Notebook [ram=" + ram + ", hdd=" + hdd + ", operationSystem=" + operationSystem + ", color=" + color
                + ", company=" + company + "]";
    }
    
}

public abstract class Transport {

    private String type;

    private String modelName;
    private int wheelsCount;

    public Transport(String type, String modelName, int wheelsCount) {
        this.type = type;
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public void updateTyre() {
    }

    public void printInfo() {
        System.out.println("type = " + getType());
        System.out.println("model = " + getModelName());
        System.out.println("wheels = " + getWheelsCount());
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    public void tyresService() {
        System.out.println("Обслуживаем " + getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
    }
}

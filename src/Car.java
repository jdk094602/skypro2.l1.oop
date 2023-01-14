public class Car {
    private String brand;
    private String model;
    private float engineVolume;
    private String color;
    private int year;
    private String country;

    public Car(String brand, String model, float engineVolume, String color, int year, String country) {
        this.setBrand(brand);
        this.setModel(model);
        this.setEngineVolume(engineVolume);
        this.setColor(color);
        this.setYear(year);
        this.setCountry(country);
    }

    private static String fillString(String checkString, String defaultString) {
        return checkString == null || checkString == "" || checkString.isBlank() ? defaultString : checkString;
    }


    public String getBrand() {
        return fillString (brand,"default");
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return fillString (model,"default");
    }

    public void setModel(String model) {
        this.model = model;
    }

    public float getEngineVolume() {
        return engineVolume <= 0 ? 1.5F : engineVolume ;
    }

    public void setEngineVolume(float engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return fillString (color,"белый");
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year <=0 ? 2000 : year;
    }

    public void setYear(int year) {
            this.year = year;
    }

    public String getCountry() {
        return fillString (country,"default");
    }

    public void setCountry(String country) {
        this.country = country ;
    }

    @Override
    public String toString() {
        return "Автомобиль " +
                getBrand() + ' ' + getModel() +
                ": объём двигателя - " + getEngineVolume() +
                ", цвет '" + getColor() + '\'' +
                ", год выпуска - " + getYear() +
                ", страна производства - '" + getCountry() + '\'' + "\n"
                ;
    }
}


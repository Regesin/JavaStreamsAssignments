package StreamsApp;

public class Employee {
    int empolyeeId=0;
    String name, city;

    public Employee(int empolyeeId, String name, String city) {
        this.empolyeeId = empolyeeId;
        this.name = name;
        this.city = city;
    }

    public int getEmpolyeeId() {
        return empolyeeId;
    }

    public void setEmpolyeeId(int empolyeeId) {
        this.empolyeeId = empolyeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empolyeeId=" + empolyeeId +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}

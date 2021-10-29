package StreamsApp;
/*
 *@created 29-10-2021/10/2021 - 10:03 AM
 *@project IntelliJ IDEA
 *@author  ArunSaiSurapaneni
 */
/**
 * The type Employee.
 */
public class Employee {
    /**
     * The Empolyee id.
     */
    int empolyeeId=0;
    /**
     * The Name.
     */
    String name, /**
     * The City.
     */
    city;

    /**
     * Instantiates a new Employee.
     *
     * @param empolyeeId the empolyee id
     * @param name       the name
     * @param city       the city
     */
    public Employee(int empolyeeId, String name, String city) {
        this.empolyeeId = empolyeeId;
        this.name = name;
        this.city = city;
    }

    /**
     * Gets empolyee id.
     *
     * @return the empolyee id
     */
    public int getEmpolyeeId() {
        return empolyeeId;
    }

    /**
     * Sets empolyee id.
     *
     * @param empolyeeId the empolyee id
     */
    public void setEmpolyeeId(int empolyeeId) {
        this.empolyeeId = empolyeeId;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets city.
     *
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets city.
     *
     * @param city the city
     */
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

package MunicipalAid;

public class MunicipalAid {
    private String gender;
    private int age;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int calculateAid() {
        if ("female".equalsIgnoreCase(gender) && age > 50) {
            return 120000;
        } else if ("female".equalsIgnoreCase(gender) && age >= 30 && age <= 50) {
            return 100000;
        } else if ("male".equalsIgnoreCase(gender)) {
            return 40000;
        } else {
            return 0;
        }
    }
}

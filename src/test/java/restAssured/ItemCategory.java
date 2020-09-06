package restAssured;

import java.util.List;

public class ItemCategory {


    private String name;
    private Boolean active;
    private String schoolId;
    private List<String> roles;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(String schoolId) {
        this.schoolId = schoolId;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {

        this.roles = roles;
    }


}

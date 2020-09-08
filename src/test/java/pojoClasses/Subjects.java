package pojoClasses;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Subjects {

    private Boolean active;

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Map<String, String> getCss() {
        return css;
    }

    public void setCss(Map<String, String> css) {
        this.css = css;
    }

    public Map<String, String> getSubjectCategory() {
        return subjectCategory;
    }

    public void setSubjectCategory(Map<String, String> subjectCategory) {
        this.subjectCategory = subjectCategory;
    }

    private String name;
    private String code;
    private Map<String, String> css=new HashMap<>();
    private Map<String, String> subjectCategory=new HashMap<>();


}

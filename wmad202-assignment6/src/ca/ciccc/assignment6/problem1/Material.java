package ca.ciccc.assignment6.problem1;

public class Material {

    private Integer code;
    private String name;

    public Material() {
    }

    public Material(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}

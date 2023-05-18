public class Number {
    private String name;
    private Integer num;

    public Number(String name, Integer num) {
        this.name = name;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Player(" +
                "name='" + name + '\'' +
                ", num=" + num +
                ')';
    }
}

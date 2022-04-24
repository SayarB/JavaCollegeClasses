package Database;

public class Staff {
    private int code;
    private String name;

    public Staff(int code, String name)
    {
        this.code = code;
        this.name = name;
    }
    public int getCode()
    {
        return code;
    }
    public String getName()
    {
        return name;
    }
    public String toString() {
        return String.format("Code : %d,\nName : %s,\n", code, name);
    }
}

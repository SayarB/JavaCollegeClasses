package Lab8;

public abstract class Exercise {
    public int pub_var = 20;
    private int pri_var = 30;
    protected int pro_var = 40;
    int def_var = 50;
    static int stat_var = 400;
    static final int final_var = 500;

    public abstract void change();

    public void display()
    {
        System.out.println("Public Variable = "+pub_var+"Private Variable = "+pri_var+"Protected Variable = "+pro_var+"Static Variable = "+stat_var+"Final Variable = "+final_var);
    }


}


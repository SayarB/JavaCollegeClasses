package myCalc;

public class Min {
    int arr[];
    int result;
    public void operate() {
        this.result = min();
    }
    public int min()
    {
        int min = arr[0];
        for(int a: arr)
        {
            min = Math.min(min, a);
        }
        return min;
    }
    public void getInput()
    {
        
    }
}

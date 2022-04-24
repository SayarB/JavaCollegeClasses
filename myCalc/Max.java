package myCalc;

public class Max {
    int arr[];
    int result;
    public void operate() {
        this.result = max();
    }
    public int max()
    {
        int max = arr[0];
        for(int a: arr)
        {
            max = Math.max(max, a);
        }
        return max;
    }
    public void getInput()
    {
        System.out.println("Enter number of numbers");
        int n
    }

}

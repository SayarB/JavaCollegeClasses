package Database;

import java.util.Arrays;

public class Database {

    private Staff[] database;
    int end = 0;
    public Database(int n)
    {
        this.database = new Staff[n];
        for(int i=0;i<n;i++)
        {
            database[i]=null;
        }
    }

    public Staff[] getDatabase() {
        return database;
    }
    public void displayDatabase()
    {
        for (Staff data:database){
            if(data==null)
                break;
            System.out.println(data.toString());
        }
    }
    public void put(Staff newStaff)
    {
        if(end<0 || end>=database.length)
        {
            System.out.println("Database Overflow");
            return;
        }
        database[end++]=newStaff;
    }
    public Staff remove(int code)
    {
        int index = -1;
        Staff[] updatedStaffs = new Staff[database.length];
        Arrays.fill(updatedStaffs, null);
        int c = 0;
        Staff removed = null;
        for(int i=0;i<database.length && database[i]!=null;i++)       
        {
            Staff data = database[i];

            if(data.getCode()==code)
            {
                index=i;
                removed = data;
                continue;
            }   
            updatedStaffs[c++]=data;

        }
        this.end=c;
        if(index==-1)
        {
            System.out.println("Staff not found");            
        }
        database=updatedStaffs.clone();
        return removed;
    }

    public Staff findByCode(int code)
    {
        for(int i=0;i<database.length && database[i]!=null;i++)
        {
            if(database[i].getCode()==code)
                return database[i];
        }
        return null;
    }  
}

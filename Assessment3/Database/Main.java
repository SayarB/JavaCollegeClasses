package Database;

public class Main {
    public static void main(String[] args) {

        Database db = new Database(5);
        Staff staff1 = new Teacher(0, "adsgadhadgha", "chemistry", new String[]{"abcd", "efgh"});
        Staff staff2 = new Officer(1, "asadshadhadhasgag",5);
        Staff staff3 = new RegularTypist(2, "aasgag",72.5);
        Staff staff4 = new CasualTypist(3, "fhfjsfsfj", 75.3, 250.0);
        db.put(staff1);
        db.put(staff2);
        db.put(staff3);
        db.put(staff4);
        db.displayDatabase();
        Staff removed = db.remove(2);
        System.out.println("Removed=> \n"+removed.toString());  
        Staff staff5 = new CasualTypist(4, "sagasgas", 76.3, 2240.0);
        db.put(staff5);      
        System.out.println("Updated DB =>");        
        
        db.displayDatabase();
    }
}

package Database;

import java.util.Arrays;

public class Teacher extends Staff{
    private String subject;
    private String[] publications;
    public Teacher(int code, String name,String subject, String[] publications) {
        super(code, name);
        this.subject = subject;
        this.publications = publications.clone();
    }
    public String getSubject()
    {
        return subject;
    }
    public String[] getPublications()
    {
        return publications;
    }
    
    public String toString() {

        String pubsString = Arrays.toString(this.publications);

     return (super.toString()+String.format("Subject : %s\nPublications : %s\n",this.subject, pubsString));
    }
}

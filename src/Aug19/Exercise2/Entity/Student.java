package Aug19.Exercise2.Entity;

public class Student {
    private  Long id;
    private  String name;
    private String email;
    private String program;



    /*Student(Long id, String nm, String ml, String prg){
        this.id = id;
        this.name = nm;
        this.email - ml
    }*/
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }
}

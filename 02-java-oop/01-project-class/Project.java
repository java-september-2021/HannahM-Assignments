public class Project{
    private String name;
    private String description;
    private static String defName = "Default Name";
    private static String defDesc = "Default description";

    public String getName() {return name;}
    public void setName(String name) {this.name = name ;}

    public String getDescription() {return description; }
    public void setDescription(String description) { this.description = description; }

    public String ElevatorPitch() {
        System.out.println(String.format(name + " ; " + description ));
        return String.format(name + " ; " + description );
        
    }
    public Project(){
        name = defName;
        description = defDesc;
    }

    public Project(String name){
        this.name = name;
        this.description = defDesc;
    }

    public Project(String name, String description){
        this.name = name;
        this.description = description; 
    }
}
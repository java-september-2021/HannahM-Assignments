public class ProjectTester{
    public static void main(String[] args){
        Project p = new Project();
        p.ElevatorPitch();

        Project a = new Project("Project name");
        a.ElevatorPitch();

        Project b = new Project("Project name", "Project Desc");
        b.ElevatorPitch();
    }
}
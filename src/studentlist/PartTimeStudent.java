package studentlist;

/**
 * This class +++ Insert class description here +++
 *
 * @author Vlad
 */
//some extra textdfsgdsfgsdfgkjdfggnfdjklangkldfnalgkdlfgdlkgkljdaf
public class PartTimeStudent extends Student {
    private int numCourses;
    
    public PartTimeStudent(String name, int numCourses) {
        this.numCourses = numCourses;
    }
    
    public int getNumCourses() {
        return numCourses;
    }
    
public void setNumCourses(int numCourses) {
    this.numCourses = numCourses;
}
}
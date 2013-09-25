/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package schedulegeneratorclass;

/**
 *
 * @author Carlos
 */
public class Professor extends Person {
        private MySchedule mySchedule=null;
	private Schedule schedule=null;
	private Department department=null;
	private int idProfesor;

	public Professor(String name, String firstLastname, String secondLastName, 
                int id, String password,int idProfessor) {
            super(name,firstLastname,secondLastName,id,password);
            this.idProfesor = idProfessor;
	}

	public MySchedule getMySchedule() {
		return this.mySchedule;
	}

	public void setMySchedule(MySchedule mySchedule) {
		this.mySchedule = mySchedule;
	}

	public Schedule getSchedule() {
		return this.schedule;
	}

	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}

	public Department getDepartment() {
		return this.department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public int getIdProfessor() {
		return this.idProfesor;
	}

	public void setIdProfessor(int idProfessor) {
		this.idProfesor = idProfessor;
	}    
}

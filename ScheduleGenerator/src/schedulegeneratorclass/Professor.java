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
        private MySchedule mySchedule;
	private Schedule schedule;
	private Department department;
	private int idProfesor;

	public Professor(String name, String firstLastname, String secondLastName, 
                int id, String password, MySchedule mySchedule, Schedule schedule, 
                Department departmen, int idProfessor) {
            super(name,firstLastname,secondLastName,id,password);
            throw new UnsupportedOperationException("The method is not implemented yet.");
	}

	public MySchedule getMySchedule() {
		throw new UnsupportedOperationException("The method is not implemented yet.");
	}

	public void setMySchedule(MySchedule mySchedule) {
		throw new UnsupportedOperationException("The method is not implemented yet.");
	}

	public Schedule getSchedule() {
		throw new UnsupportedOperationException("The method is not implemented yet.");
	}

	public void setSchedule(Schedule schedule) {
		throw new UnsupportedOperationException("The method is not implemented yet.");
	}

	public Department getDepartment() {
		throw new UnsupportedOperationException("The method is not implemented yet.");
	}

	public void setDepartment(Department department) {
		throw new UnsupportedOperationException("The method is not implemented yet.");
	}

	public int getIdProfessor() {
		throw new UnsupportedOperationException("The method is not implemented yet.");
	}

	public void setIdProfessor(int idProfessor) {
		throw new UnsupportedOperationException("The method is not implemented yet.");
	}    
}

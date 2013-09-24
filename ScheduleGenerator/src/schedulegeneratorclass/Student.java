/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package schedulegeneratorclass;

/**
 *
 * @author Carlos
 */
public class Student extends Person{
    private int carnet;
	public Student(String name, String firstLastname, String secondLastName, int id, String password, int carnet) {
            super(name,firstLastname,secondLastName,id,password);
            throw new UnsupportedOperationException("The method is not implemented yet.");
	}

	public int getCarnet() {
		throw new UnsupportedOperationException("The method is not implemented yet.");
	}

	public void setCarnet(int carnet) {
		throw new UnsupportedOperationException("The method is not implemented yet.");
	}
}

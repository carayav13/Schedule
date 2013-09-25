/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package schedulegeneratorclass;

/**
 *
 * @author Carlos
 */
public abstract  class Person {
        private String name;
	private String firstLastName;
	private String secondLastName;
	private int id;
	private String password;

	protected Person(String name, String firstLastname, String secondLastName, int id, String password) {
		
            this.name = name;
            this.firstLastName = firstLastname;
            this.secondLastName = secondLastName;
            this.id = id;
            this.password = password;
                
	}

	public String getName() {
            return this.name;
            
	}

	public void setName(String name) {
            this.name = name;
            
	}

	public String getFirstLastName() {
            return this.firstLastName;
	}

	public void setFirstLastName(String firstLastName) {
            this.firstLastName = firstLastName;
            
	}

	public String getSecondLastName() {
            return this.secondLastName;
            
	}

	public void setSecondLastName(String secondLastName) {
		this.secondLastName = secondLastName;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id =id;
	}

	public String getPassword() {
            return this.password;
            
	}

	public void setPassword(String password) {
            this.password = password;
	}
    
}

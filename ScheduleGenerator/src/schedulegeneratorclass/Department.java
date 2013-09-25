/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package schedulegeneratorclass;

/**
 *
 * @author Carlos
 */
public class Department {
        private String name;

        /**
         * Constructor of Deparment class
         * @param name is a String.
         */
	public Department(String name) {
            this.name = name;
            
	}
        
        /**
         * Get the name of a department
         * @return a data of type String
         */
	public String getName() {
            return this.name;
	}
        
        /**
         * Set a name of Department class
         * @param name is String
         */
	public void setName(String name) {
		this.name = name;
	}    
}

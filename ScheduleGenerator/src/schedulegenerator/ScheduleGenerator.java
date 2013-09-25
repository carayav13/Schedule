/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package schedulegenerator;

import java.util.ArrayList;
import schedulegeneratorclass.Department;
import schedulegeneratorclass.Professor;
import schedulegeneratorgraphicinterface.*;

/**
 *
 * @author Carlos
 */
public class ScheduleGenerator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Professor professor;
        Department department = new Department("Computacion");
        ArrayList<Professor> professorArray = new ArrayList<Professor>();
        
        professor = new Professor("Abel", "Mendez", "Porras", 208880222, "123abc"
                ,1);
        professor.setDepartment(department);
        professorArray.add(professor);
        
        professor = new Professor("Leonardo", "Viquez", "Porras", 208880333, "123cbc"
                ,2);
          professor.setDepartment(department);
        professorArray.add(professor);
       
        professor = new Professor("Oscar", "Viquez", "Porras", 203330222, "321abc"
                ,3);
        professor.setDepartment(department);
        professorArray.add(professor);
        
        professor = new Professor("Lorena", "Valerio", "Porras", 201110222, "143abc"
                ,4);
        professor.setDepartment(department);
        professorArray.add(professor);
        
        
        
        ProfessorEdit professorEdit = new ProfessorEdit();
        professorEdit.professor = professor;
        professorEdit.setFields();
        professorEdit.show();
        
        
    }
}

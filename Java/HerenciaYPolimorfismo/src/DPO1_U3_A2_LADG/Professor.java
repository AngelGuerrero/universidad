/*
 * Nombre del programa:
 * Autor: Luis Ángel De Santiago Guerrero
 * Última fecha de modificación: 26 de Mayo de 2017
 */
package DPO1_U3_A2_LADG;

/**
 * Un profesor también es un empleado,
 * así es por tanto que hereda los métodos
 * de una clase Empleado, pero como no es
 * posible la herencia múltiple en Java
 * se utiliza una interfaz
 * @author Angel
 */
public class Professor extends Person implements Employee{
    
    // Constructor
    public Professor(String name)
    {
        super(name);
    }

    // Methods
    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public void setName(String name)
    {
        this.name = name;
    }
    
    @Override
    public String getOccupation()
    {
        return "Professor";
    }
    
    @Override
    public void setOccupation(String occupation)
    {
        this.occupation = occupation;
    }

    @Override
    public double getSalary() {
        return Professor.salary;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.inventario.controlador;

import co.edu.inventario.entidades.Empleados;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Estefa Muñoz Diaz
 */
@Stateless
public class EmpleadosFacade extends AbstractFacade<Empleados> {

    @PersistenceContext(unitName = "proyectoangularPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EmpleadosFacade() {
        super(Empleados.class);
    }
    
}

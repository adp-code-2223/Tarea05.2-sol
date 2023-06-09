/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package modelo.dao.departamento;


import java.util.List;

import modelo.Departamento;
import modelo.dao.IGenericDao;

/**
 *
 * @author mfernandez
 */
public interface IDepartamentoDao extends IGenericDao<Departamento>{
    

	
	public boolean exists(Integer dept);
	
	public List<Departamento> search(String search);
	
	
}

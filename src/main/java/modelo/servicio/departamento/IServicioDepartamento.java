package modelo.servicio.departamento;


import java.util.List;

import modelo.Departamento;
import modelo.exceptions.InstanceNotFoundException;

public interface IServicioDepartamento {


	public Departamento read(long deptno) throws InstanceNotFoundException;
	public List<Departamento> search(String term);
	
}



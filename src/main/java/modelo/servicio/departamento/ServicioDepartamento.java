package modelo.servicio.departamento;

import java.util.List;

import modelo.Departamento;
import modelo.dao.departamento.DepartamentoNeoDatisDao;
import modelo.dao.departamento.IDepartamentoDao;
import modelo.exceptions.DuplicateInstanceException;

public class ServicioDepartamento implements IServicioDepartamento {

	private IDepartamentoDao departamentoDao;

	public ServicioDepartamento() {
		departamentoDao = new DepartamentoNeoDatisDao();
	}

	@Override
	public long create(Departamento dept) throws DuplicateInstanceException {
		if(departamentoDao.exists(dept.getDeptno()))
			throw new DuplicateInstanceException("Hay un departamento ya con ese id", dept.getDeptno(), Departamento.class.getName());
		return departamentoDao.create(dept);
	}

	@Override
	public boolean delete(Departamento dept) {
		return departamentoDao.delete(dept);
	}

	@Override
	public boolean update(Departamento dept) {
		return departamentoDao.update(dept);
	}

	@Override
	public List<Departamento> findAll() {
		return departamentoDao.findAll();
	}

	@Override
	public boolean exists(Integer deptno) {
		return departamentoDao.exists(deptno);
	}

}

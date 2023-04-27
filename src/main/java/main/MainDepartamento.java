package main;

import java.util.ArrayList;
import java.util.List;

import modelo.Departamento;
import modelo.exceptions.DuplicateInstanceException;
import modelo.servicio.departamento.IServicioDepartamento;
import modelo.servicio.departamento.ServicioDepartamento;

public class MainDepartamento {
	private static IServicioDepartamento departamentoServicio = new ServicioDepartamento();

	public static void main(String[] args) {
		createDepartamentos();

	}

	private static <E> void mostrarListado(List<E> lista) {
		for (E e : lista) {
			System.out.println("El objeto " + e.getClass() + "es recuperado: " + e);
		}
	}

	private static void createDepartamentos() {

		List<Departamento> departamentos = new ArrayList<>();

		Departamento contabilidadVigo = createDepartamento(1, "Contabilidad", "Vigo");
		Departamento rrHH = createDepartamento(2, "RRHH", "Vigo");

		departamentos.add(contabilidadVigo);
		departamentos.add(rrHH);

		for (Departamento departamento : departamentos) {
			try {
				departamentoServicio.create(departamento);
			} catch (DuplicateInstanceException e) {
				System.err.println("Ya existe un departamento con ese id: " + e.getMessage());
				
			}
		}

	}

	private static Departamento createDepartamento(Integer deptno, String dnam, String location) {
		Departamento dept = new Departamento();
		dept.setDeptno(deptno);
		dept.setDname(dnam);
		dept.setLoc(location);

		return dept;
	}

}

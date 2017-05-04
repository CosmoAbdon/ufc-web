package br.ufc.crateus.web.aula7;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.ufc.crateus.web.aula7.model.Aluno;
import br.ufc.crateus.web.aula7.model.Disciplina;
import br.ufc.crateus.web.aula7.model.MatriculaDisciplina;

public class App {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("escola");

//		adicionarAluno(entityManager);
//		consultarAluno(entityManagerFactory);
//		adicionarDisciplina(entityManagerFactory);
//		adicionarMatricula(entityManagerFactory);
		
		EntityManager em = entityManagerFactory.createEntityManager();

		em.getTransaction().begin();
		List<Aluno> as = em.createQuery("select t.alunos from Turma t where t.id = 1", Aluno.class)
				.getResultList();

		em.getTransaction().commit();
		
		em.close();

		System.out.println(as);
		
		entityManagerFactory.close();
		
	}

	private static void adicionarMatricula(EntityManagerFactory entityManagerFactory) {
		EntityManager em = entityManagerFactory.createEntityManager();
		
		em.getTransaction().begin();
		
		Aluno a = em.createQuery("select a from Aluno a where email = 'ze@gmail.com'", Aluno.class)
				.getSingleResult();

		Disciplina d = em.createQuery("select d from Disciplina d where id = 2", Disciplina.class)
				.getSingleResult();
		
		System.out.println(a);
		System.out.println(d);
		
		MatriculaDisciplina md = new MatriculaDisciplina();
		
		md.setAluno(a);
		md.setDisciplina(d);
		md.setAno(2016);
		
		em.persist(md);
		
		em.getTransaction().commit();
		
		em.close();
		System.out.println(md);
	}

	private static void adicionarDisciplina(EntityManagerFactory entityManagerFactory) {
		Disciplina d = new Disciplina();
		d.setNome("POO");
		d.setCargahoraria(64);

		EntityManager em = entityManagerFactory.createEntityManager();
		
		em.getTransaction().begin();

		em.persist(d);

		em.getTransaction().commit();

		em.close();
		
		System.out.println(d);
	}

	private static void consultarAluno(EntityManagerFactory entityManagerFactory) {
		EntityManager em = entityManagerFactory.createEntityManager();

		em.getTransaction().begin();
		Aluno a = em.createQuery("select a from Aluno a where email = 'ze@gmail.com'", Aluno.class)
				.getSingleResult();

		em.getTransaction().commit();
		
		em.close();

		System.out.println(a);
	}

	private static void adicionarAluno(EntityManagerFactory emf) {
		EntityManager em = emf.createEntityManager();
		
		Aluno a = new Aluno();
		a.setEmail("maria@gmail.com");
		a.setNome("Maria");

		em.getTransaction().begin();

		em.persist(a);

		em.getTransaction().commit();
		
		System.out.println(a);
		
		em.close();
	}
}

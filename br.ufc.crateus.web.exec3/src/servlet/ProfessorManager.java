package servlet;

import entidades.Aluno;
import entidades.Professor;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/app/professores")
public class ProfessorManager extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ProfessorManager() {
        super();
    }

    @Override
    protected void service(HttpServletRequest request,HttpServletResponse response) 
    					throws ServletException, IOException {
    	
    	List<Professor> pfx = new ArrayList<Professor>();
		pfx.add(new Professor("Antonio","Matemática"));
		pfx.add(new Professor("Joao","Desenvolvimento Web"));
		pfx.add(new Professor("Robervaldo","Desenvolvimento de Mouses"));
		pfx.add(new Professor("Jose Fagundes","Sabe contar"));
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
	    out.println("<head>");
	    out.println("<title>Lista de Professores</title>");
	    out.println("</head>");
	    out.println("<body>");
	    out.println("<table border='1'>");
	    out.println("<tr>");
	    out.println("<td>Nome Professor </td>");
	    out.println("<td>Disciplina professor </td>");
	    out.println("</tr>");
	    
		for (Professor professor : pfx) {

		    out.println("<tr>");
		    out.println("<td>"+professor.getNome()+"</td>");
		    out.println("<td>"+professor.getDisciplina()+"</td>");
		    out.println("</tr>");
		}
		
		out.println("</table>");
		out.println("</body>");
	    out.println("</html>");
                            
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    response.getWriter().append("Served at: ").append(request.getContextPath());
	    
		
	}

	
}

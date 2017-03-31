package servlet;

import entidades.Aluno;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/app/alunos")
public class AlunoManager extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AlunoManager() {
        super();
    }

    @Override
    protected void service(HttpServletRequest request,
                        HttpServletResponse response) 
                        throws ServletException, IOException {
    	
    	List<Aluno> alx = new ArrayList<Aluno>();
		alx.add(new Aluno("Cosmo",19));
		alx.add(new Aluno("Roberto",20));
		alx.add(new Aluno("Waffles",17));
		alx.add(new Aluno("Lucas",15));
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
	    out.println("<head>");
	    out.println("<title>Alunos List</title>");
	    out.println("</head>");
	    out.println("<body>");
	    out.println("<table border='1'>");
	    out.println("<tr>");
	    out.println("<td>Nome Aluno </td>");
	    out.println("<td>Idade Aluno </td>");
	    out.println("</tr>");
	    
		for (Aluno aluno : alx) {

		    out.println("<tr>");
		    out.println("<td>"+aluno.getNome()+"</td>");
		    out.println("<td>"+aluno.getIdade()+"</td>");
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

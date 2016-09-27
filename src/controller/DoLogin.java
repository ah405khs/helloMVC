package controller;



import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Customer;
import service.CustomerService;

/**
 * Servlet implementation class DoLogin
 */
@WebServlet("/doLogin")
public class DoLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DoLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//perform business logic. return a bean as a result
		String customerID = request.getParameter("customerID");
		CustomerService service = new CustomerService();
		Customer customer = service.findCustomer(customerID);
		request.setAttribute("customer", customer);
		
		//we can iterate over lists using foreach ing JSTL
		List<Customer> customers =new ArrayList<>();
		customers.add(new Customer("id006", "kim", "ah405khs@naver.com"));
		customers.add(new Customer("id007", "kim", "ah405khs@naver.com"));
		customers.add(new Customer("id008", "kim", "ah405khs@naver.com"));
		request.setAttribute("customerList", customers);
		
		
		
		String page = null;
		
		if(customer == null)
			page = "/view/error.jsp";
		else
			page ="/view/success.jsp";
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(page);
		dispatcher.forward(request, response);
		
	}

}

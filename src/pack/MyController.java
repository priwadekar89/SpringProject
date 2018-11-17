package pack;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
public class MyController implements Controller{
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) {
		
		System.out.println("test1");
		ModelAndView mv = new ModelAndView("page1");
		System.out.println("test1");
		mv.addObject("name","Rahul");
		mv.addObject("address","Pune");
		System.out.println("test3");
		return mv;
		
	}
	
	
	
}

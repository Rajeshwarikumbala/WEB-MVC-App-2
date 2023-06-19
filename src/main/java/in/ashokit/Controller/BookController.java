package in.ashokit.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import in.ashokit.entity.Book;
import in.ashokit.repo.BookRepository;


@Controller
public class BookController {
	@Autowired
	private BookRepository repo;
	
	@GetMapping("/Book")
	public ModelAndView getBookById (@RequestParam("id")Integer id) {
		 ModelAndView mav = new ModelAndView();
		java.util.Optional<Book> findById = repo.findById(id);
		
		if (findById .isPresent()){
			Book Bookobj = findById.get();
		mav.addObject("book",Bookobj);
		
		}
		mav.setViewName("index");
		return mav;
		
	}

}


package peekaf.work.springstudy.chap05;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController {
	private static final Logger logger = LoggerFactory.getLogger(SampleController.class);
	
	@RequestMapping("chap05/doC")
	public String doC(@ModelAttribute("msg") String msg) {
		logger.info("doC called...");
		return "chap05/result";
	}
}

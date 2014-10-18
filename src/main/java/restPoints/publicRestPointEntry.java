package restPoints;

import domain.Question;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Nivek on 18/10/2014.
 */

@Controller
@RequestMapping("/hello-world")
public class publicRestPointEntry {
    public static final String  publicRestApi = "/something";

    @RequestMapping(method= RequestMethod.GET)
    public @ResponseBody
    String submitQuestion(@RequestParam(value="name", required=true) int questionId) {

        Question question = new Question(questionId);
        question.submit();

        return new  Greeting(counter.incrementAndGet(), String.format(template, name));
    }

}

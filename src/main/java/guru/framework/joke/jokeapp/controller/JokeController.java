package guru.framework.joke.jokeapp.controller;

import guru.framework.joke.jokeapp.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JokeController {
    private final JokeService service;

    @Autowired
    public JokeController(JokeService service) {
        this.service = service;
    }

    @GetMapping({"/", ""}) //map context root to Jokes view
    public String showJoke(Model model) {
        //add joke text to 'joke' property of Model
        model.addAttribute("joke", service.getJoke());
        //return the view name
        return "chucknorris";
    }
}

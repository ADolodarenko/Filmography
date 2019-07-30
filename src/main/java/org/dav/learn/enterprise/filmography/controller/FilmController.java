package org.dav.learn.enterprise.filmography.controller;

import org.dav.learn.enterprise.filmography.model.Film;
import org.dav.learn.enterprise.filmography.service.FilmService;
import org.dav.learn.enterprise.filmography.service.FilmServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class FilmController {
    private FilmService filmService = new FilmServiceImpl();

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView allFilms()
    {
        List<Film> films = filmService.allFilms();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("films");
        modelAndView.addObject("filmsList", films);
        return modelAndView;
    }

    @RequestMapping(value = "/edit", method = RequestMethod.GET)
    public ModelAndView editPage()
    {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("editPage");
        return modelAndView;
    }
}

package com.example.demo.controller;

import com.example.demo.model.Person;
import com.example.demo.repository.CityRepository;
import com.example.demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class PersonController {
    @Autowired
    PersonRepository personRepository;
    @Autowired
    CityRepository cityRepository;

    @GetMapping("/people")
    public String findAll(Model model) {
        List<Person> people = personRepository.findAll();
        model.addAttribute("people", people);
        return "people";
    }

    @GetMapping("/delete-person")
    public String delete(@RequestParam int id) {
        personRepository.deleteById(id);
        return "redirect:people";
    }

    @GetMapping("/add-person")
    public String add(Model model) {
        model.addAttribute("cities", cityRepository.findAll());
        return "add-person";
    }

    @PostMapping("/add-person")
    public String add(@ModelAttribute Person person) {
        personRepository.save(person);
        return "redirect:people";
    }

    @GetMapping("/update-person")
    public String update(@RequestParam int id, Model model) {
        Person person = personRepository.findById(id).get();
        model.addAttribute("cities", cityRepository.findAll());
        model.addAttribute("person", person);
        return "update-person";
    }

    @PostMapping("/update-person")
    public String update(@ModelAttribute Person person) {
        personRepository.save(person);
        return "redirect:people";
    }
}

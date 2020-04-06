package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class DictionaryController
{
    @GetMapping("/dictionary")
    public String getForm()
    {
        return "dictionary";
    }

    @PostMapping("/dictionary")
    public String displayResult(@RequestParam String search, Model model)
    {
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("one", "1");
        dictionary.put("two", "2");
        dictionary.put("ten", "10");
        dictionary.put("seven", "7");
        dictionary.put("five", "5");
        dictionary.put("four", "4");

        String result = dictionary.get(search);
        if (result != null) model.addAttribute("result", result);
        else model.addAttribute("result", "404-Not found");

        return "dictionary";
    }
}
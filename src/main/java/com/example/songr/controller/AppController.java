package com.example.songr.controller;


import com.example.songr.Repository.AlbumRepo;
import com.example.songr.model.Album;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;
import java.util.Properties;

@Controller
public class AppController {


    @Autowired
    public AlbumRepo albumRepo;


    @GetMapping("/hello")
    public String helloWorld(@RequestParam(name = "name", required = false, defaultValue = "World")
                                         String name, Model model){
        model.addAttribute("name", name);

        return "hello";

    }


    @GetMapping("/capitalize/{name}")
        public String capitalizing(@PathVariable("name") String name, Model model){
        name.toUpperCase();
        model.addAttribute("name", name.toUpperCase());
        return "capitalize";

        }


    @GetMapping("/")
    public String welcomeroute(String name, Model model){
       model.addAttribute("Welcome", name);
       return "welcome";
}


    @GetMapping("/albums")
    public String album(Model model){
    ArrayList<Album> album = new ArrayList<>();
    Album album1 = new Album("Migrant Birds","TootArd",12,43,"https://f4.bcbits.com/img/a1117732318_16.jpg");
        Album album2= new Album("SONATE PACIFIQUE","L'Impératrice",12,43,"https://m.media-amazon.com/images/I/914DakDnDmL._SS500_.jpg");
    Album album3 = new Album("Sea at Nigh","Glue Trip",12,43,"https://f4.bcbits.com/img/a2267633279_10.jpg");


    album.add(album1);
    album.add(album2);
    album.add(album3);
    model.addAttribute("album",album);
    return "album";

}

@GetMapping("/addalbums")
public String getAlbum(Model model){
        model.addAttribute("addalbums", albumRepo.findAll() );
        return "album";
}


    @PostMapping("/addalbums")
    public RedirectView addNewAlbum(@ModelAttribute Album album){


        albumRepo.save(album);
     return new RedirectView("addalbums");
//
    }
}

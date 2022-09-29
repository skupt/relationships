package com.example.relationships;

import com.example.relationships.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RelationshipsApplication implements CommandLineRunner {

    @Autowired
    private MyGroupRepo myGroupRepo;

    @Autowired
    private MyUserRepo myUserRepo;

    @Autowired
    private TourRatingRepo tourRatingRepo;

    @Autowired
    private TabRowRepo tabRowRepo;

    @Autowired
    private PackingListRepo packingListRepo;

    @Autowired
    private UserImplRepo userImplRepo;

    @Autowired
    private SearchTaskRepo searchTaskRepo;

    @Autowired
    private TaskRepo taskRepo;

    public static void main(String[] args) {
        SpringApplication.run(RelationshipsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Command LIne Runner");
        System.out.println("*** Group Repo - FetchType.EAGER");
        myGroupRepo.findAll().forEach(g -> System.out.println(
                g.getName()
                        + g.getMyUsers()
                        .stream()
                        .map(u -> u.getName())
                        .reduce(": ", (a, b) -> a + b + "; ")
        ));

        System.out.println("*** User Repo - FetchType.LAZY");
        myUserRepo.findAll().forEach(System.out::println);

        System.out.println("*** TourRating Repo");
        tourRatingRepo.findAll().forEach(System.out::println);

        System.out.println("*** TabRow Repo");
        tabRowRepo.findAll().forEach(System.out::println);

        System.out.println("*** PackingList Repo");
        packingListRepo.findAll().forEach(System.out::println);

        System.out.println("*** UserImpl Repo");
        userImplRepo.findAll().forEach(System.out::println);

        System.out.println("*** SearchTask Repo");
        searchTaskRepo.findAll().forEach(System.out::println);

        System.out.println("*** Abstract (!) Task Repo ");
        taskRepo.findAll().forEach(System.out::println);


    }
}

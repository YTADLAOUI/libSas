package Services;

import Controllers.AuthorController;
import modules.Author;

import java.util.Scanner;

public class AuthorService {
    Author author =new Author();
    AuthorController authorControlle = new AuthorController();
    Scanner input = new Scanner(System.in);

    public void afficherAuthor(){
        authorControlle.index();
    }
    public void storeAuthor(){
        System.out.println("insert un author");
        do {
            author.setNom(input.nextLine());
        } while (!author.getNom().matches("\\S+"));
        authorControlle.store(author);
    }
    public void deleteAuthor(){

        do{
            System.out.println("Delete un author entre id:");
            author.setId(input.nextInt());
        }
        while (authorControlle.checkId(author));
        authorControlle.delete(author);
    }
}

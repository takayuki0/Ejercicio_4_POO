import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Persona autorLibro1 = new Persona("Sun", "Tzu");
        Libro libro1 = new Libro(autorLibro1, "El arte de la guerra", 25);

        Persona autorLibro2 = new Persona("Robert", "Kiyosaki");
        Libro libro2 = new Libro(autorLibro2, "Padre Rico Padre Pobre", 30);

        Persona autorLibro3 = new Persona("Robin", "S. Sharma");
        Libro libro3 = new Libro(autorLibro2, "El Club de las 5 de la Mañana", 40);

        Persona protagonistaPeli1 = new Persona("Timothy", "Balme");
        Persona directorPeli1 = new Persona("Peter", "Jackson");
        Pelicula pelicula1 = new Pelicula("Braindead", protagonistaPeli1, directorPeli1, 45);

        Persona protagonistaPeli2 = new Persona("Elijah", "Wood");
        Persona directorPeli2 = new Persona("Peter", "Jackson");
        Pelicula pelicula2 = new Pelicula("The Lord of the Ring", protagonistaPeli2, directorPeli2, 60);

        Persona protagonistaPeli3 = new Persona("Tom", "Hanks");
        Persona directorPeli3 = new Persona("Robert", "Zemeckis");
        Pelicula pelicula3 = new Pelicula("Forrest Gump", protagonistaPeli3, directorPeli3, 65);


        System.out.println(libro1);
        System.out.println(libro2);
        System.out.println(libro3);

        System.out.println(pelicula1);
        System.out.println(pelicula2);
        System.out.println(pelicula3);

        System.out.println(protagonistaPeli2.esIgual(autorLibro3));
        System.out.println(directorPeli1.esIgual(directorPeli2));

        System.out.println(pelicula3.getDirectorPelicula().getApellido());


    }
}
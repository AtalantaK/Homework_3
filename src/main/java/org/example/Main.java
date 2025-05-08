package org.example;


public class Main {
    public static void main(String[] args) {

        //Task 1
        String[] todoList = new String[5];
        todoList[0] = "Приготовить ужин";
        todoList[1] = "Купить продукты";
        todoList[2] = "Покормить кота";
        todoList[3] = "Убрать квартиру";
        todoList[4] = "Сходить на работу";


        //Task 2
        double[] arrayDouble = new double[3];
        arrayDouble[0] = Math.round(Math.PI * 100_000.0) / 100_000.0;
        arrayDouble[1] = Math.round(Math.E * 100_000.0) / 100_000.0;
        arrayDouble[2] = 1.0;

        //Task 3
        Movie[] films = new Movie[3];
        films[0] = new Movie("Фильм 1", 7.0, "Ужасы", "США", false, "1998");
        films[1] = new Movie("Фильм 2", 2.5, "Комедия", "Россия", false, "2015");
        films[2] = new Movie("Фильм 3", 5.8, "Фантастика", "Великобритания", true, "2001");

        //Task 4
        for (int i = 1; i <= 1_000_000_000; i++) {
            System.out.println(i);
        }

        //Task 5
        for (Movie film : films) {
            System.out.println(film.getYearMovie() + " - "
                    + film.getNameMovie() + " - "
                    + film.getGenreMovie() + " - "
                    + film.getRateMovie());
        }

        //Task 6
        String[] arrayString = {"Михаил", "Сергей", "Юрий", "Рустам", "Андрей", "Владимир", "Амир", "Олег", "Евгений", "Павел"};
        for (int i = 0; i < 3; i++) {
            System.out.println(arrayString[i]);
        }
    }
}
package ru.netology;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Рина";
        post.surname = "Заценина";
        post.patronymic = "Алексеевна";
        post.passport = "4444 № 44444444";
        post.phone = "+7 (999)-999-99-99";
        post.subscription = true;

        post.birthday = new FormDate();
        post.birthday.day = "14";
        post.birthday.month = "04";
        post.birthday.year = "1993";

    }
}
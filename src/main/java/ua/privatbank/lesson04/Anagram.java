package ua.privatbank.lesson04;

import ua.privatbank.lesson02.calculator.EnterFromConsole;

import java.util.Arrays;

/**
 * Используя IntelliJ IDEA, создайте класс Anagram.
 * Напишите программу, которая определяет, является ли одна строка анаграммой другой строки.
 * Анаграмма - это слово или фраза, сделанная путем переноса букв другого слова или фразы.
 * Программа должна игнорировать пробелы и знаки препинания.
 * Пример анаграмм:
 * Аз есмь строка, живу я, мерой остр.
 * За семь морей ростка я вижу рост.
 * Я в мире — сирота.
 * Я в Риме — Ариост.
 *
 * @author vfrundin
 * @version 1.0
 * @since 16.10.2018
 */
public class Anagram {
    public static void main(String[] args) {

        // Просим пользователя ввести 2 строки для сравнения.
        String phrase1 = EnterFromConsole.enterStringFromConsole("Enter a phrase, 1st please: ");
        String phrase2 = EnterFromConsole.enterStringFromConsole("Enter a phrase, 2nd please: ");

        // Переводим строки в верхний регистр и переводим в массивы символов.
        char[] letters1 = phrase1.toUpperCase().toCharArray();
        char[] letters2 = phrase2.toUpperCase().toCharArray();

        // Сортируем полученные массивы.
        Arrays.sort(letters1);
        Arrays.sort(letters2);

        // Создаем 2 экземпляра класса StringBuilder.
        StringBuilder builder1 = new StringBuilder();
        StringBuilder builder2 = new StringBuilder();

        // Выбираем из полученных массивов только буквы.
        for (int i = 0; i < letters1.length; i++) {
            if (Character.isLetter(letters1[i])) {
                builder1.append(letters1[i]);
            }
        }
        for (int j = 0; j < letters2.length; j++) {
            if (Character.isLetter(letters2[j])) {
                builder2.append(letters2[j]);
            }
        }

        // Сравниваем полученные строки
        System.out.println(builder1.toString().equals(builder2.toString()) ? "Your phrases are anagrams!" :
                "Your phrases aren't anagrams!");
    }
}

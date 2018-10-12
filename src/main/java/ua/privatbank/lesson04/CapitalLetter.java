package ua.privatbank.lesson04;

import ua.privatbank.lesson02.calculator.EnterFromConsole;

/**
 * Используя IntelliJ IDEA, создайте класс CapitalLetter.
 * Напишите программу, которая принимает строку и переводит первую букву слова в верхний регистр.
 * Пример работы:
 * Истина — это то, что выдерживает проверку опытом. Эйнштейн А.
 * Истина — Это То, Что Выдерживает Проверку Опытом. Эйнштейн А.
 *
 * @author vfrundin
 * @version 1.0
 * @since 13.10.2018
 */
public class CapitalLetter {
    public static void main(String[] args) {

        // Инициализируем счетчик позиций.
        int symbolNumber = 0;

        // Просим пользователя ввести строку.
        String phrase = EnterFromConsole.enterStringFromConsole("Enter a phrase, please: ");

        // Создаем экземпляр класса StringBuilder для хранения строки после преобразования.
        StringBuilder resultPhrase = new StringBuilder();

        // Преобразуем строку в массив символов.
        char[] letters = phrase.toCharArray();

        // Формируем результирующую строку.
        for (int i = 0; i < letters.length; i++) {
            String letter = ((Character)letters[i]).toString();
            if (Character.isLetter(letters[i])) {
                if (symbolNumber == 0) {
                    letter = letter.toUpperCase();
                    symbolNumber++;
                }
            } else {
                symbolNumber = 0;
            }
            resultPhrase.append(letter);
        }

        System.out.println("Result phrase is:");
        System.out.println(resultPhrase.toString());
    }
}

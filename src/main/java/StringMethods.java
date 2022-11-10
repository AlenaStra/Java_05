import project_utils.Utils;

import java.sql.SQLOutput;
import java.util.Locale;

import static project_utils.Utils.isStringNotNullAndNotEmpty;

public class StringMethods {

    /* Task 1. Написать метод removeSpaces(), который принимает на вход строку.
        Если строка не пустая (проверить методом класса String), то примените метод по удалению пробелов в начале и в
         конце строки.
        Догадаться, каким методом из видео можно проверить, были ли пробелы в строке.
        Если пробелы были, то метод должен удалить их и вернуть сообщение: “Лишние пробелы удалены”.
        Если пробелов не было, вернуть сообщение “Пробелов не было”.
        Если строка пустая (проверить методом класса String), вернуть сообщение “Строка пустая”.
        Test Data:
        “    Red Rover School   “ → “Лишние пробелы удалены”
        “Red Rover School“ → “Пробелов не было”
        “” → “Строка пустая”
     */

    public String removeSpaces(String a) {
        if (a.length() != 0) {
            String trimmedA = a.trim();
            if (a.length() > trimmedA.length()) {
                return "Лишние пробелы удалены";
            } else {
                return "Пробелов не было";
            }
        } else {
            return "Строка пустая";
        }
    }

    /* Task 2. Написать алгоритм removeAllAs().
        С помощью методов из видео1,  написать алгоритм, который принимает на вход строку. Если строка валидная, то
        метод удаляет все буквы a из строки, если таковые имеются. Метод возвращает обработанную строку.
        Test Data:
         “    Red Rover School   “ →  “Red Rover School“
        “panda   “ → “pnd”
        “taramasalata” → “trmslt”
     */

    public String removeAllAs(String a) {
        if (a.length() != 0) {
            a = a.replace("a", "");
            a = a.trim();
            return a;
        }
        return "Empty string";
    }

    /* Task 3. Написать алгоритм removeAllZeros().
        С помощью методов из видео1,  написать алгоритм, который принимает на вход строку, состоящую из цифр. Если
        строка валидная, то метод удаляет все пробелы из строки, если таковые имеются. Метод возвращает обработанную
        строку, в которой нет нулей. Если в строке не было нулей, метод возвращает сообщение “This is a valid string”.
           Test Data:
         “3504209706040000 “ →  “35429764“
        “0000000111“ → “111”
     */

    public String removeAllZeroes(String numbers) {
        String numbers1;
        if (numbers.length() != 0) {
            numbers = numbers.trim();
            numbers = numbers.replace(" ", "");
        }
        numbers1 = numbers.replace("0", "");
        if (numbers.length() == numbers1.length()) {
            return "This is a valid string.";
        }

            return numbers1;
    }

    /*Task 4. Написать алгоритм removeAllSpaces.
        С помощью методов из видео1,  написать алгоритм, который принимает на вход строку. Если строка валидная, то
        метод удаляет все пробелы из строки, если таковые имеются. Метод возвращает обработанную строку.
        Test Data:
         “    R e d     Ro ve    r Sc   h ool   “ →  “RedRoverSchool“
            “p a     n   d a   “ → “panda”
     */

    public String removeAllSpaces(String a) {
        if (a.length() != 0) {
            a = a.trim();
            a = a.replace(" ", "");
        }

        return a;
    }

    /*Task 5. Напишите метод countAs(), который принимает на вход строку и считает, сколько букв а или А содержится в
    строке. Метод возвращает количество букв a/A,  и количество букв/знаков в слове без букв a/A. Итоговый результат
    должен строится с помощью метода из видео 2.
    Test Data:
            “Abracadabra” → “5, 6”
            “Homenum Revelio” → “0, 15”
            “3 tarAmasAlatA” → “6, 8”
     */

    public String countAs(String phrase) {
        if(isStringNotNullAndNotEmpty(phrase)) {
            int letterA = 0;
            int length = phrase.length();
            if (phrase.length() > 0) {
                if (phrase.toLowerCase().contains("a")) {
                    for (int i = 0; i < phrase.length(); i++) {
                        if ((phrase.toLowerCase().charAt(i)) == 'a') {
                            letterA++;
                            length--;
                        }
                    }

                    return letterA + ", " + length;
                } else {

                    return "0, " + length;
                }
            }
        }
        return "enter a valid string";
    }

    /*Task 6. Напишите метод countJava(), который принимает на вход текст и проверяет, содержится ли в тексте хотя
    бы одно слово Java.
        Test Data:
        “As of March 2022, Java 18 is the latest version, while Java 17, 11 and 8 are the current long-term support
        (LTS) versions. Oracle released the last zero-cost public update for the legacy version Java 8 LTS in January
        2019 for commercial use, although it will otherwise still support Java 8 with public updates for personal use
        indefinitely. Other vendors have begun to offer zero-cost builds of OpenJDK 8 and 11 that are still receiving
        security and other upgrades.” → true
        “99 little bugs in a code.
        99 little bugs in a code.
        Take one down, and patch it around.
        235 critical bugs in the code.” → false
     */

    public boolean countJava(String text) {
        String java = "Java";
        if(text.length() > 0) {
            return text.contains(java);
        }
        return false;
    }

    /* Task 7. Напишите метод insertQuotes(), который принимает слово и возвращает строку, в которой это слово
     “обернуто” в кавычки:
        Test Data:
        “Abracadabra” →  ““Abracadabra””
     */

    public String insertQuotes(String word) {
        if(word.length() > 0) {
            return "“" + word + "”";
        }
        return "enter a valid string";
    }

    /* Task 9. Напишите метод, кторый принимает на вход название города и исправляет написание:
        Test Data:
        “ташкент” → “Ташкент”
        “ЧикаГО” → “Чикаго”
     */

    public String correctCityName(String city) {
        if(city.length() > 0) {
            if(city.equals(city.toLowerCase())) {
                String cityCapital = city.toUpperCase();
                city = cityCapital.charAt(0) + city.substring(1);
            } else if (city.equals(city.toUpperCase())) {
                String cityLower = city.toLowerCase();
                city = city.charAt(0) + cityLower.substring(1);
            } else {
                String cityCapital = city.toUpperCase();
                String cityLower = city.toLowerCase();
                city = cityCapital.charAt(0) + cityLower.substring(1);
            }
            return city;
        }

        return "enter a valid string";
    }

    /* Task 10. Напишите метод, который принимает на вход строку и букву-параметр, и возвращает все, что находится
    между первой и последней буквой-параметром:
            Test Data:
            “Abracadabra”, “b” → “bracadab”
            “Whippersnapper”, “p” → “ppersnapp”
     */

    public String partOfString(String text, String letter) {
        String partial = "";
        if (text.length() > 0 && letter.length() > 0) {
            if(text.contains(letter)) {
                partial = text.substring(text.indexOf(letter), text.lastIndexOf(letter) + 1);
                return partial;
            }
            return "no letter found";
        }
        return "enter valid data";
    }

    /*Task 11. Напишите метод, который принимает на вход слово, и возвращает true, если слово начинается и
    заканчивается на одинаковую букву, и false иначе
    Test Data:
	“Abracadabra” → true
	“Whippersnapper” → false
     */
//        Option 1
    public boolean sameStartAndEnd(String word) {
        if(isStringNotNullAndNotEmpty(word)) {
            if (word.length() > 0) {
                word = word.trim().toLowerCase();
                return word.charAt(0) == (word.charAt(word.length() - 1));
            }
        }
        return false;
    }

//    Option 2

    public boolean sameStartAndEndIndexOf(String word) {
        if(isStringNotNullAndNotEmpty(word) && !word.trim().contains(" ")) {
            word = word.trim().toLowerCase();
            return word.lastIndexOf(word.charAt(0)) == (word.length() - 1);
        }
        return false;
    }

    /* Task 12. Напишите метод, который принимает на вход строку из двух слов, разделенных пробелом, и возвращает
    последнее слово
        Test Data:
	“Red Rover” → “Rover”
     */

    public String twoWordsIntoOne(String s) {
        if(s.length() > 0) {
            return s.substring(s.indexOf(" ") + 1);
        }
        return "enter a valid string";
    }

    /* Task 13. Написать метод, который принимает строку, и 2 индекса. Метод удаляет все, что находится между двумя
    индексами включительно
    Test Data:
	“Red rover”, 1, 4 → “Rover”
     */

    public String deleteBetweenIndices(String s, int start, int end) {
        if(s.length() > 0) {
            return s.substring(0, start) + s.substring(end + 1);
        }
        return "enter a valid string";
    }

    /* Task 14. Напишите метод, который принимает на вход предложение и возвращает слова из этого предложения в
    виде массива слов
        Test Data:
        “QA for Everyone” → {“QA”, “for”, “Everyone”}
        “Александр Сергеевич Пушкин” → {“Александр”, “Сергеевич”, “Пушкин”}
     */

    public String[] stringToArray(String sentence) {
        if (sentence.length() > 0) {
            String[] array = sentence.split(" ");
            return array;
        }
        return new String[]{"enter valid data"};
    }

    /* Task. 15. Написать метод, который принимает на вход предложение, которое состоит из имени, фамилии, отчества
    и возвращает текст:
        Test Data:
        “Александр Сергеевич Пушкин” →
        “Имя: Александр
        Отчество: Сергеевич
        Фамилия: Пушкин”
     */

    public String[] nameBreakdown(String name) {    //Method returns array with just actual names split from string
        String[] newName = new String[3];
        if(name.isEmpty() == false) {
            for(int i = 0; i < 3; i++) {
                newName = name.split(" ");
                if(i == 0) {
                    System.out.println("Имя: " + newName[i]);
                }
                if(i == 1) {
                    System.out.println("Отчество: " + newName[i]);
                }
                if(i == 2) {
                    System.out.println("Фамилия: " + newName[i]);
                }
            }
        }
        return newName;
    }

    public String nameBreakdown1(String name) {
        String firstName = "Имя:" + name.substring(0, name.indexOf(" "));
        String midName = "Отчество:" + name.substring(name.indexOf(" "), name.lastIndexOf(" "));
        String lastName = "Фамилия:" + name.substring(name.lastIndexOf(" "));

        return firstName + "\n" + midName + "\n" + lastName;
    }

    /* Task 16. Написать метод, который принимает на вход слово и число n,  и возвращает строку, где слово повторяется n раз.
        Test Data:
        “one”, 5 → “oneoneoneoneone”
     */

    public String repeatString(String word, int n) {
        if(word.length() > 0 && n > 0) {
            word = word.repeat(n);
            return word;
        }
        return "enter a valid string";
    }

    /* Task 17.Напишите метод, который принимает строку и index, и возвращает численное значение буквы, которая
    находится на позиции index (использовать только один метод класса String)
     */

    public int stringIndexIntoInt(String text, int index) {
        int numOfChar;
        if(text.length() > 0 && index >= 0 && index <= text.length()) {
            numOfChar = text.charAt(index);
            return numOfChar;
        }
        return -1;
    }

    /* Task 18. Написать метод, который принимает 3 слова, и сравнивает их методом, который считает, что прописные и
    заглавные буквы - это одни и те же буквы. Метод возвращает true, если все слова одинаковы, и метод возвращает
    false, если слова не одинаковы:
     Test Data:
    “one”, “One”, “ONE”  → true
    “one”, “Один”, “ONE” → false
     */

    public boolean compareStrings(String word1, String word2, String word3) {
        if(!word1.isEmpty() && !word2.isEmpty() && !word3.isEmpty()) {
            word1 = word1.toLowerCase();
            word2 = word2.toLowerCase();
            word3 = word3.toLowerCase();
            if(word1.equals(word2)) {
                return word1.equals(word3);
            }
        }
        return false;
    }
















}

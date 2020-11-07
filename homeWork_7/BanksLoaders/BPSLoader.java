package homeWork_7.BanksLoaders;

import homeWork_7.SiteLoader.SiteLoader;
import homeWork_7.utilts.SaveMethod;

import java.io.File;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BPSLoader extends SiteLoader {


    /**
     * Метод для запуска загрузки курса валют
     * @param currencyName валюта которую мы ищем
     * @return курс который мы нашли
     */
    @Override
    public double load(Currency currencyName) {
        return load("https://www.bps-sberbank.by/page/currency-exchange-cards", currencyName);
    }

    /**
     * Обработка результата загрузки с сайта банка
     * @param content то что получилось загрузить
     * @param currencyName валюта которую мы ищем
     * @return курс который мы нашли
     */
    @Override
    protected double handle(String content, Currency currencyName) {
        String answerDafault = "да";
        System.out.println("Вы хотите сами выбрать куда сохранять файл? маленьнкимии буквами ответ пожалуйста");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        if (answer.hashCode() == answerDafault.hashCode()) {
            System.out.println("Введите путь к файлу");
            String wayToFile = scanner.nextLine();
            String lookingFor = "[\\w\\/\\>\\<\\s=\\\"]+(\\d,\\d{3,5})";
            Pattern pattern;
            switch (currencyName) {
                case USD:
                    pattern = Pattern.compile(currencyName.USD.toString().concat(lookingFor));
                    break;
                case EUR:
                    pattern = Pattern.compile(currencyName.EUR.toString().concat(lookingFor));
                    break;
                case RUB:
                    pattern = Pattern.compile(currencyName.RUB.toString().concat(lookingFor));
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + currencyName);
            }
            Matcher matcher = pattern.matcher(content);
            matcher.find();
            String result = content.substring(matcher.start(),
                    matcher.end()).replaceAll("[^\\d,\\d{3,5}]", "")
                    .replace(',', '.');

            SaveMethod.forSave(new File(wayToFile), result);
            return Double.parseDouble(result);
        } else {
            String lookingFor = "[\\w\\/\\>\\<\\s=\\\"]+(\\d,\\d{3,5})";
            Pattern pattern;
            switch (currencyName) {
                case USD:
                    pattern = Pattern.compile(currencyName.USD.toString().concat(lookingFor));
                    break;
                case EUR:
                    pattern = Pattern.compile(currencyName.EUR.toString().concat(lookingFor));
                    break;
                case RUB:
                    pattern = Pattern.compile(currencyName.RUB.toString().concat(lookingFor));
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + currencyName);
            }
            Matcher matcher = pattern.matcher(content);
            matcher.find();
            String result = content.substring(matcher.start(),
                    matcher.end()).replaceAll("[^\\d,\\d{3,5}]", "")
                    .replace(',', '.');

            SaveMethod.forSave(new File("FileBPS.txt"), result);

            return Double.parseDouble(result);
        }
    }
}
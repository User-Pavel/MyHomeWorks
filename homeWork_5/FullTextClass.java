package homeWork_5;

public class FullTextClass {
    public static String filePath = ("D:\\Programming\\FirstStepInJava\\Homework\\src\\HomeWork_5\\Война и мир_книга.txt");
    static SearchEngine searchEngine = new SearchEngine();
    public static String text = searchEngine.readAllBytesJava7(filePath);
}

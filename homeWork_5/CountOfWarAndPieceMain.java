package homeWork_5;

public class CountOfWarAndPieceMain implements ISearchEngine {
    public static String filePath = ("D:\\Programming\\FirstStepInJava\\Homework\\src\\HomeWork_5\\Война и мир_книга.txt");
    public static void main(String[] args) {
        SearchEngine searchEngine = new SearchEngine();
        BasisForWarAndPiece newBasis = new BasisForWarAndPiece();
        System.out.println(searchEngine.search(searchEngine.readAllBytesJava7(filePath),"Война"));
        System.out.println(searchEngine.search(searchEngine.readAllBytesJava7(filePath),"и"));
        System.out.println(searchEngine.search(searchEngine.readAllBytesJava7(filePath),"мир"));
    }

    @Override
    public long search(String text, String word) {
        return 0;
    }

    @Override
    public String readAllBytesJava7(String filePath) {
        return null;
    }


}

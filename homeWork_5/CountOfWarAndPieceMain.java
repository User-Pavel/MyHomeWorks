package homeWork_5;

public class CountOfWarAndPieceMain extends FullTextClass  {
    public static void main(String[] args) {
        SearchEngine searchEngine = new SearchEngine();
        BasisForWarAndPiece newBasis = new BasisForWarAndPiece();
        System.out.println(searchEngine.search(text,"Война"));
        System.out.println(searchEngine.search(text,"и"));
        System.out.println(searchEngine.search(text,"мир"));
    }
}

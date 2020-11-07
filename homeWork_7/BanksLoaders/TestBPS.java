package homeWork_7.BanksLoaders;

import homeWork_7.SiteLoader.SiteLoader;

public class TestBPS {
    public static void main(String[] args) {
        printRates(new BPSLoader());
    }

    public static void printRates(SiteLoader loader){
        System.out.println(loader.load(SiteLoader.Currency.EUR));
        System.out.println(loader.load(SiteLoader.Currency.RUB));
        System.out.println(loader.load(SiteLoader.Currency.USD));
    }
}

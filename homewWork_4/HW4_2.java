package homewWork_4;
//2. Написать метод String toString(double number).
//	2.1 В данном методе произвести конвертацию переданного числа в число прописью. Выводить до сотых, без округления.
//	2.2 Пример передали: 223.1599999. Получили "Двести двадцать три целых пятнадцать сотых".
public class HW4_2 extends HW4_1_FirstNumbers{
    public static String finish;
    public static String toString(double number){
        if(number * 100 % 100 == 0 ){
        finish =  zero +" " + fiveOten;
        }
        if(number * 100 % 100 == 1 ){
            finish = oneVS +" " + oneOten;}
        if(number * 100 % 100 == 2 ){
            finish = twoVS +" " + twoOten;}
        if(number * 100 % 100 == 3 ){
            finish = three +" " + twoOten;}
        if(number * 100 % 100 == 4 ){
            finish = four + " " + twoOten;}
        if(number * 100 % 100 == 5 ){
            finish = five +" " + fiveOten;}
        if(number * 100 % 100 == 6 ){
            finish = six +" " + fiveOten;}
        if(number * 100 % 100 == 7 ){
            finish = seven +" " + fiveOten;}
        if(number * 100 % 100 == 8 ){
            finish = eight +" " + fiveOten;}
        if(number * 100 % 100 == 9 ){
            finish = nine +" " + fiveOten;}
        if(number * 100 % 100 == 10 ){
            finish = ten +" " + fiveOHundred;}
        if(number * 100 % 100 == 11 ){
            finish = eleven +" " + fiveOHundred;}
        if(number * 100 % 100 == 12 ){
            finish = twelve +" " + fiveOHundred;}
        if(number * 100 % 100 == 13 ){
            finish = thirteen +" " + fiveOHundred;}
        if(number * 100 % 100 == 14 ){
            finish = fourteen +" " + fiveOHundred;}
        if(number * 100 % 100 == 15 ){
            finish = fifteen +" " + fiveOHundred;}
        if(number * 100 % 100 == 16 ){
            finish = sixteen +" " + fiveOHundred;}
        if(number * 100 % 100 == 17 ){
            finish = seventeen +" " + fiveOHundred;}
        if(number * 100 % 100 == 18 ){
            finish = eighteen +" " + fiveOHundred;}
        if(number * 100 % 100 == 19 ){
            finish = nineteen +" " + fiveOHundred;}
        if(number * 100 % 100 == 20 ){
            finish = twenty +" " + fiveOHundred;}
        if(number * 100 % 100 == 21 ){
            finish = twenty + oneVS +" " + oneOHundred;}
        if(number * 100 % 100 == 22 ){
            finish = twenty + two +" " + twoOHundred;}
        if(number * 100 % 100 == 23 ){
            finish = twenty + three +" " + twoOHundred;}
        if(number * 100 % 100 == 24 ){
            finish = twenty + four +" " + twoOHundred;}
        if(number * 100 % 100 == 25 ){
            finish = twenty + five +" " + fiveOHundred;}
        if(number * 100 % 100 == 26 ){
            finish = twenty + six +" " + fiveOHundred;}
        if(number * 100 % 100 == 27 ){
            finish = twenty + seven +" " + fiveOHundred;}
        if(number * 100 % 100 == 28 ){
            finish = twenty + eight +" " + fiveOHundred;}
        if(number * 100 % 100 == 29 ){
            finish = twenty + nine +" " + fiveOHundred;}
        if(number * 100 % 100 == 30 ){
            finish = thirty +" " + fiveOHundred;}
        if(number * 100 % 100 == 31 ){
            finish = thirty + oneVS +" " + oneOHundred;}
        if(number * 100 % 100 == 32 ){
            finish = thirty + twoVS +" " + twoOHundred;}
        if(number * 100 % 100 == 33 ){
            finish = thirty +three +" " + twoOHundred;}
        if(number * 100 % 100 == 34 ){
            finish = thirty + four +" " + twoOHundred;}
        if(number * 100 % 100 == 35 ){
            finish = thirty + five +" " + fiveOHundred;}
        if(number * 100 % 100 == 36 ){
            finish = thirty + six  +" " + fiveOHundred;}
        if(number * 100 % 100 == 37 ){
            finish = thirty + seven +" " + fiveOHundred;}
        if(number * 100 % 100 == 38 ){
            finish = thirty + eight +" " + fiveOHundred;}
        if(number * 100 % 100 == 39 ){
            finish = thirty + nine +" " + fiveOHundred;}
        if(number * 100 % 100 == 40 ){
            finish = forty +" " + fiveOHundred;}
        if(number * 100 % 100 == 41 ){
            finish = forty +oneVS +" " + oneOHundred;}
        if(number * 100 % 100 == 42 ){
            finish = forty +twoVS +" " + twoOHundred;}
        if(number * 100 % 100 == 43 ){
            finish = forty +three +" " + twoOHundred;}
        if(number * 100 % 100 == 44 ){
            finish = forty + five +" " + twoOHundred;}
        if(number * 100 % 100 == 45 ){
            finish = forty + five +" " + fiveOHundred;}
        if(number * 100 % 100 == 46 ){
            finish = forty +six +" " + fiveOHundred;}
        if(number * 100 % 100 == 47 ){
            finish = forty +seven +" " + fiveOHundred;}
        if(number * 100 % 100 == 48 ){
            finish = forty + eight +" " + fiveOHundred;}
        if(number * 100 % 100 == 49 ){
            finish = forty + nine +" " + fiveOHundred;}
        if(number * 100 % 100 == 50 ){
            finish = fifty +" " + fiveOHundred;}
        if(number * 100 % 100 == 51 ){
            finish = fifty + oneVS +" " + oneOHundred;}
        if(number * 100 % 100 == 52 ){
            finish = fifty + twoVS +" " + twoOHundred;}
        if(number * 100 % 100 == 53 ){
            finish = fifty + three +" " + twoOHundred;}
        if(number * 100 % 100 == 54 ){
            finish = fifty + four +" " + twoOHundred;}
        if(number * 100 % 100 == 55 ){
            finish = fifty + five +" " + fiveOHundred;}
        if(number * 100 % 100 == 56 ){
            finish = fifty + six +" " + fiveOHundred;}
        if(number * 100 % 100 == 58 ){
            finish = fifty + seven +" " + fiveOHundred;}
        if(number * 100 % 100 == 59 ){
            finish = fifty + nine +" " + fiveOHundred;}
        if(number * 100 % 100 == 60 ){
            finish = sixty +" " + fiveOHundred;}
        if(number * 100 % 100 == 61 ){
            finish = sixty + oneVS +" " + oneOHundred;}
        if(number * 100 % 100 == 62 ){
            finish = sixty + twoVS +" " + twoOHundred;}
        if(number * 100 % 100 == 63 ){
            finish = sixty + three +" " + twoOHundred;}
        if(number * 100 % 100 == 64 ){
            finish = sixty + four +" " + twoOHundred;}
        if(number * 100 % 100 == 65 ){
            finish = sixty + five +" " + fiveOHundred;}
        if(number * 100 % 100 == 66 ){
            finish = sixty + six +" " + fiveOHundred;}
        if(number * 100 % 100 == 67 ){
            finish = sixty + seven +" " + fiveOHundred;}
        if(number * 100 % 100 == 68 ){
            finish = sixty + eight +" " + fiveOHundred;}
        if(number * 100 % 100 == 69 ){
            finish = sixty + nine +" " + fiveOHundred;}
        if(number * 100 % 100 == 70 ){
            finish = seventy +" " + fiveOHundred;}
        if(number * 100 % 100 == 71 ){
            finish = seventy + oneVS +" " + oneOHundred;}
        if(number * 100 % 100 == 72 ){
            finish = seventy +twoVS +" " + twoOHundred;}
        if(number * 100 % 100 == 73 ){
            finish = seventy + three +" " + twoOHundred;}
        if(number * 100 % 100 == 74 ){
            finish = seventy + four +" " + twoOHundred;}
        if(number * 100 % 100 == 75 ){
            finish = seventy + five +" " + fiveOHundred;}
        if(number * 100 % 100 == 76 ){
            finish = seventy + six +" " + fiveOHundred;}
        if(number * 100 % 100 == 77 ){
            finish = seventy + seven +" " + fiveOHundred;}
        if(number * 100 % 100 == 78 ){
            finish = seventy + eight +" " + fiveOHundred;}
        if(number * 100 % 100 == 79 ){
            finish = seventy + nine +" " + fiveOHundred;}
        if(number * 100 % 100 == 80 ){
            finish = eighty +" " + fiveOHundred;}
        if(number * 100 % 100 == 81 ){
            finish = eighty + oneVS +" " + oneOHundred;}
        if(number * 100 % 100 == 82 ){
            finish = eighty + twoVS +" " + twoOHundred;}
        if(number * 100 % 100 == 83 ){
            finish = eighty + three +" " + twoOHundred;}
        if(number * 100 % 100 == 84 ){
            finish = eighty + four +" " + twoOHundred;}
        if(number * 100 % 100 == 85 ){
            finish = eighty + five +" " + fiveOHundred;}
        if(number * 100 % 100 == 86 ){
            finish = eighty + six +" " + fiveOHundred;}
        if(number * 100 % 100 == 87 ){
            finish = eighty + seven +" " + fiveOHundred;}
        if(number * 100 % 100 == 88 ){
            finish = eighty + eight +" " + fiveOHundred;}
        if(number * 100 % 100 == 89 ){
            finish = eighty + nine +" " + fiveOHundred;}
        if(number * 100 % 100 == 90 ){
            finish = ninety +" " + fiveOHundred;}
        if(number * 100 % 100 == 91 ){
            finish = ninety + oneVS +" " + oneOHundred;}
        if(number * 100 % 100 == 92 ){
            finish = ninety + twoVS +" " + twoOHundred;}
        if(number * 100 % 100 == 93 ){
            finish = ninety + three +" " + twoOHundred;}
        if(number * 100 % 100 == 94 ){
            finish = ninety + four +" " + twoOHundred;}
        if(number * 100 % 100 == 95 ){
            finish = ninety + five +" " + fiveOHundred;}
        if(number * 100 % 100 == 96 ){
            finish = ninety + six +" " + fiveOHundred;}
        if(number * 100 % 100 == 97 ){
            finish = ninety + seven +" " + fiveOHundred;}
        if(number * 100 % 100 == 98 ){
            finish = ninety + eight +" " + fiveOHundred;}
        if(number * 100 % 100 == 99 ){
            finish = ninety + nine +" " + fiveOHundred;}
        number = number - number*100%100/100;
            if(number == 0){
                return "ноль" + cel + finish;
            }
            if(number > 0) {
                if (number % 20 == 0 && number / 20 == 1) {
                    return twenty + " " +cel + finish;
                }
                if (number % 30 == 0 && number / 30 == 1) {
                    return thirty + " " + cel + finish;
                }
                if (number % 40 == 0 && number / 40 == 1) {
                    return forty + " " + cel + finish;
                }
                if (number % 50 == 0 && number / 50 == 1) {
                    return fifty + cel + finish;
                }
                if (number % 60 == 0 && number / 60 == 1) {
                    return sixty + cel + finish;
                }
                if (number % 70 == 0 && number / 70 == 1) {
                    return seventy + cel + finish;
                }
                if (number % 80 == 0 && number / 80 == 1) {
                    return eighty + cel + finish;
                }
                if (number % 90 == 0 && number / 90 == 1) {
                    return ninety + cel + finish;
                }
                if (number % 100 == 0 && number / 100 == 1) {
                    return oneHundred + cel + finish;
                }
                if (number % 200 == 0 && number / 200 == 1) {
                    return twoHundred + cel + finish;
                }
                if (number % 300 == 0 && number / 300 == 1) {
                    return threeHundred + cel + finish;
                }
                if (number % 400 == 0 && number / 400 == 1) {
                    return fourHundred + cel + finish;
                }
                if (number % 500 == 0 && number / 500 == 1) {
                    return fiveHundred + cel + finish;
                }
                if (number % 600 == 0 && number / 600 == 1) {
                    return sixHundred + cel + finish;
                }
                if (number % 700 == 0 && number / 700 == 1) {
                    return sevenHundred + cel + finish;
                }
                if (number % 800 == 0 && number / 800 == 1) {
                    return eightHundred + cel + finish;
                }
                if (number % 900 == 0 && number / 900 == 1) {
                    return nineHundred + cel + finish;
                }
                if (number % 1000 == 0 && number / 1000 == 1) {
                    return thousand + cel + finish;
                }
                if (number % 10000 == 0 && number / 10000 == 1) {
                    return ten + " " + polyThousand + cel + finish;
                }
                if (number % 100000 == 0 && number / 100000 == 1) {
                    return oneHundred + " " + polyThousand + cel + finish;
                }
                if (number % 1000000 == 0 && number / 1000000 == 1) {
                    return million + cel + finish;
                }
                if (number % 10000000 == 0 && number / 10000000 == 1) {
                    return ten + " " + polyMillion + cel + finish;
                }
                if (number % 100000000 == 0 && number / 100000000 == 1) {
                    return oneHundred + " " + polyMillion + cel + finish;
                }
                /**
                 * перебор числел от 1 до 19
                 */
                if (number > 0 && number < 20) {
                    if (number / 1 == 1) {
                        return one + cel + finish;
                    }
                    if (number % 2 == 0 && number / 2 == 1) {
                        return two + cel + finish;
                    }
                    if (number % 3 == 0 && number / 3 == 1) {
                        return three + cel + finish;
                    }
                    if (number % 4 == 0 && number / 4 == 1) {
                        return four + cel + finish;
                    }
                    if (number % 5 == 0 && number / 5 == 1) {
                        return five + cel + finish;
                    }
                    if (number % 6 == 0 && number / 6 == 1) {
                        return six + cel + finish;
                    }
                    if (number % 7 == 0 && number / 7 == 1) {
                        return seven + cel + finish;
                    }
                    if (number % 8 == 0 && number / 8 == 1) {
                        return eight + cel + finish;
                    }
                    if (number % 9 == 0 && number / 9 == 1) {
                        return nine + cel + finish;
                    }
                    if (number % 10 == 0 && number / 10 == 1) {
                        return ten + cel + finish;
                    }
                    if (number % 11 == 0 && number / 11 == 1) {
                        return eleven + cel + finish;
                    }
                    if (number % 12 == 0 && number / 12 == 1) {
                        return twelve + cel + finish;
                    }
                    if (number % 13 == 0 && number / 13 == 1) {
                        return thirteen + cel + finish;
                    }
                    if (number % 14 == 0 && number / 14 == 1) {
                        return fifteen + cel + finish;
                    }
                    if (number % 15 == 0 && number / 15 == 1) {
                        return fifteen + cel + finish;
                    }
                    if (number % 16 == 0 && number / 16 == 1) {
                        return sixteen + cel + finish;
                    }
                    if (number % 17 == 0 && number / 17 == 1) {
                        return one + cel + finish;
                    }
                    if (number % 18 == 0 && number / 18 == 1) {
                        return eighteen + cel + finish;
                    }
                    if (number % 19 == 0 && number / 19 == 1) {
                        return nineteen + cel + finish;
                    }
                }
                if (number > 20 && number < 100) {
                    if (number / 10 == 2) {
                        result1 = twenty;
                    }
                    if (number / 10 == 3) {
                        result1 = thirty;
                    }
                    if (number / 10 == 4) {
                        result1 = forty;
                    }
                    if (number / 10 == 5) {
                        result1 = fifty;
                    }
                    if (number / 10 == 6) {
                        result1 = sixty;
                    }
                    if (number / 10 == 7) {
                        result1 = seventy;
                    }
                    if (number / 10 == 8) {
                        result1 = eighty;
                    }
                    if (number / 10 == 9) {
                        result1 = ninety;
                    }
                    if (number % 10 == 1) {
                        result3 = one;
                    }
                    if (number % 10 == 2) {
                        result3 = two;
                    }
                    if (number % 10 == 3) {
                        result3 = three;
                    }
                    if (number % 10 == 4) {
                        result3 = four;
                    }
                    if (number % 10 == 5) {
                        result3 = five;
                    }
                    if (number % 10 == 6) {
                        result3 = six;
                    }
                    if (number % 10 == 7) {
                        result3 = seven;
                    }
                    if (number % 10 == 8) {
                        result3 = eight;
                    }
                    if (number % 10 == 9) {
                        result3 = nine;
                    }
                    return result1 + " " + result3  + cel + finish;
                }
                if (number > 100 && number < 1000) {
                    if (number / 100 == 1) {
                        result1 = oneHundred;
                    }
                    if (number / 100 == 2) {
                        result1 = twoHundred;
                    }
                    if (number / 100 == 3) {
                        result1 = threeHundred;
                    }
                    if (number / 100 == 4) {
                        result1 = fourHundred;
                    }
                    if (number / 100 == 5) {
                        result1 = fiveHundred;
                    }
                    if (number / 100 == 6) {
                        result1 = sixHundred;
                    }
                    if (number / 100 == 7) {
                        result1 = sevenHundred;
                    }
                    if (number / 100 == 8) {
                        result1 = eightHundred;
                    }
                    if (number / 100 == 9) {
                        result1 = nineHundred;
                    }
                    if (number / 10 % 10 == 1) {
                        result2 = ten;
                    }
                    if (number / 10 % 10 == 2) {
                        result2 = twenty;
                    }
                    if (number / 10 % 10 == 3) {
                        result2 = thirty;
                    }
                    if (number / 10 % 10 == 4) {
                        result2 = forty;
                    }
                    if (number / 10 % 10 == 5) {
                        result2 = fifty;
                    }
                    if (number / 10 % 10 == 6) {
                        result2 = sixty;
                    }
                    if (number / 10 % 10 == 7) {
                        result2 = seventy;
                    }
                    if (number / 10 % 10 == 8) {
                        result2 = eighty;
                    }
                    if (number / 10 % 10 == 9) {
                        result2 = ninety;
                    }
                    if (number % 10 == 0) {
                        result3 = "";
                    }
                    if (number % 10 == 1) {
                        result3 = one;
                    }
                    if (number % 10 == 2) {
                        result3 = two;
                    }
                    if (number % 10 == 3) {
                        result3 = three;
                    }
                    if (number % 10 == 4) {
                        result3 = four;
                    }
                    if (number % 10 == 5) {
                        result3 = five;
                    }
                    if (number % 10 == 6) {
                        result3 = six;
                    }
                    if (number % 10 == 7) {
                        result3 = seven;
                    }
                    if (number % 10 == 8) {
                        result3 = eight;
                    }
                    if (number % 10 == 9) {
                        result3 = nine;
                    }
                    if (number % 100 == 11) {
                        result2 = eleven;
                        result3 = "";
                    }
                    if (number % 100 == 12) {
                        result2 = twelve;
                        result3 = "";
                    }
                    if (number % 100 == 13) {
                        result2 = thirteen;
                        result3 = "";
                    }
                    if (number % 100 == 14) {
                        result2 = fourteen;
                        result3 = "";
                    }
                    if (number % 100 == 15) {
                        result2 = fifteen;
                        result3 = "";
                    }
                    if (number % 100 == 16) {
                        result2 = sixteen;
                        result3 = "";
                    }
                    if (number % 100 == 17) {
                        result2 = seventeen;
                        result3 = "";
                    }
                    if (number % 100 == 18) {
                        result2 = eighteen;
                        result3 = "";
                    }
                    if (number % 100 == 19) {
                        result2 = nineteen;
                        result3 = "";
                    }
                    return result1 + " " + result2 + " " + result3 + cel + finish;
                }
                if (number > 1000 && number < 10000) {
                    if (number / 1000 == 1) {
                        result4 = thousand;
                    }
                    if (number / 1000 == 2) {
                        result4 = twoVS + " " + oligoThousand;
                    }
                    if (number / 1000 == 3) {
                        result4 = three + " " + oligoThousand;
                    }
                    if (number / 1000 == 4) {
                        result4 = four + " " + oligoThousand;
                    }
                    if (number / 1000 == 5) {
                        result4 = five + " " + polyThousand;
                    }
                    if (number / 1000 == 6) {
                        result4 = six + " " + polyThousand;
                    }
                    if (number / 1000 == 7) {
                        result4 = seven + " " + polyThousand;
                    }
                    if (number / 1000 == 8) {
                        result4 = eight + " " + polyThousand;
                    }
                    if (number / 1000 == 9) {
                        result4 = nine + " " + polyThousand;
                    }
                    if (number / 100 % 10 == 1) {
                        result1 = oneHundred;
                    }
                    if (number / 100 % 10 == 2) {
                        result1 = twoHundred;
                    }
                    if (number / 100 % 10 == 3) {
                        result1 = threeHundred;
                    }
                    if (number / 100 % 10 == 4) {
                        result1 = fourHundred;
                    }
                    if (number / 100 % 10 == 5) {
                        result1 = fiveHundred;
                    }
                    if (number / 100 % 10 == 6) {
                        result1 = sixHundred;
                    }
                    if (number / 100 % 10 == 7) {
                        result1 = sevenHundred;
                    }
                    if (number / 100 % 10 == 8) {
                        result1 = eightHundred;
                    }
                    if (number / 100 % 10 == 9) {
                        result1 = nineHundred;
                    }
                    if (number / 10 % 10 == 1) {
                        result2 = ten;
                    }
                    if (number / 10 % 10 == 2) {
                        result2 = twenty;
                    }
                    if (number / 10 % 10 == 3) {
                        result2 = thirty;
                    }
                    if (number / 10 % 10 == 4) {
                        result2 = forty;
                    }
                    if (number / 10 % 10 == 5) {
                        result2 = fifty;
                    }
                    if (number / 10 % 10 == 6) {
                        result2 = sixty;
                    }
                    if (number / 10 % 10 == 7) {
                        result2 = seventy;
                    }
                    if (number / 10 % 10 == 8) {
                        result2 = eighty;
                    }
                    if (number / 10 % 10 == 9) {
                        result2 = ninety;
                    }
                    if (number % 10 == 0) {
                        result3 = "";
                    }
                    if (number % 10 == 1) {
                        result3 = one;
                    }
                    if (number % 10 == 2) {
                        result3 = two;
                    }
                    if (number % 10 == 3) {
                        result3 = three;
                    }
                    if (number % 10 == 4) {
                        result3 = four;
                    }
                    if (number % 10 == 5) {
                        result3 = five;
                    }
                    if (number % 10 == 6) {
                        result3 = six;
                    }
                    if (number % 10 == 7) {
                        result3 = seven;
                    }
                    if (number % 10 == 8) {
                        result3 = eight;
                    }
                    if (number % 10 == 9) {
                        result3 = nine;
                    }
                    if (number % 100 == 11) {
                        result2 = eleven;
                        result3 = "";
                    }
                    if (number % 100 == 12) {
                        result2 = twelve;
                        result3 = "";
                    }
                    if (number % 100 == 13) {
                        result2 = thirteen;
                        result3 = "";
                    }
                    if (number % 100 == 14) {
                        result2 = fourteen;
                        result3 = "";
                    }
                    if (number % 100 == 15) {
                        result2 = fifteen;
                        result3 = "";
                    }
                    if (number % 100 == 16) {
                        result2 = sixteen;
                        result3 = "";
                    }
                    if (number % 100 == 17) {
                        result2 = seventeen;
                        result3 = "";
                    }
                    if (number % 100 == 18) {
                        result2 = eighteen;
                        result3 = "";
                    }
                    if (number % 100 == 19) {
                        result2 = nineteen;
                        result3 = "";
                    }
                    return result4 + " " + result1 + " " + result2 + " " + result3 + cel + finish;

                }
                if (number > 10000 && number < 100000) {
                    if (number / 10000 == 1) {
                        result5 = ten;
                    }
                    if (number / 10000 == 2) {
                        result5 = twenty;
                    }
                    if (number / 10000 == 3) {
                        result5 = thirty;
                    }
                    if (number / 10000 == 4) {
                        result5 = forty;
                    }
                    if (number / 10000 == 5) {
                        result5 = fifty;
                    }
                    if (number / 10000 == 6) {
                        result5 = sixty;
                    }
                    if (number / 10000 == 7) {
                        result5 = seventy;
                    }
                    if (number / 10000 == 8) {
                        result5 = eighty;
                    }
                    if (number / 10000 == 9) {
                        result5 = ninety;
                    }
                    if (number / 1000 % 10 == 0) {
                        result4 = polyThousand;
                    }
                    if (number / 1000 % 10 == 1) {
                        result4 = oneVS + thousand;
                    }
                    if (number / 1000 % 10 == 2) {
                        result4 = twoVS + " " + oligoThousand;
                    }
                    if (number / 1000 % 10 == 3) {
                        result4 = three + " " + oligoThousand;
                    }
                    if (number / 1000 % 10 == 4) {
                        result4 = four + " " + oligoThousand;
                    }
                    if (number / 1000 % 10 == 5) {
                        result4 = five + " " + polyThousand;
                    }
                    if (number / 1000 % 10 == 6) {
                        result4 = six + " " + polyThousand;
                    }
                    if (number / 1000 % 10 == 7) {
                        result4 = seven + " " + polyThousand;
                    }
                    if (number / 1000 % 10 == 8) {
                        result4 = eight + " " + polyThousand;
                    }
                    if (number / 1000 % 10 == 9) {
                        result4 = nine + " " + polyThousand;
                    }
                    if (number / 100 % 10 == 1) {
                        result1 = oneHundred;
                    }
                    if (number / 100 % 10 == 2) {
                        result1 = twoHundred;
                    }
                    if (number / 100 % 10 == 3) {
                        result1 = threeHundred;
                    }
                    if (number / 100 % 10 == 4) {
                        result1 = fourHundred;
                    }
                    if (number / 100 % 10 == 5) {
                        result1 = fiveHundred;
                    }
                    if (number / 100 % 10 == 6) {
                        result1 = sixHundred;
                    }
                    if (number / 100 % 10 == 7) {
                        result1 = sevenHundred;
                    }
                    if (number / 100 % 10 == 8) {
                        result1 = eightHundred;
                    }
                    if (number / 100 % 10 == 9) {
                        result1 = nineHundred;
                    }
                    if (number / 10 % 10 == 1) {
                        result2 = ten;
                    }
                    if (number / 10 % 10 == 2) {
                        result2 = twenty;
                    }
                    if (number / 10 % 10 == 3) {
                        result2 = thirty;
                    }
                    if (number / 10 % 10 == 4) {
                        result2 = forty;
                    }
                    if (number / 10 % 10 == 5) {
                        result2 = fifty;
                    }
                    if (number / 10 % 10 == 6) {
                        result2 = sixty;
                    }
                    if (number / 10 % 10 == 7) {
                        result2 = seventy;
                    }
                    if (number / 10 % 10 == 8) {
                        result2 = eighty;
                    }
                    if (number / 10 % 10 == 9) {
                        result2 = ninety;
                    }
                    if (number % 10 == 0) {
                        result3 = "";
                    }
                    if (number % 10 == 1) {
                        result3 = one;
                    }
                    if (number % 10 == 2) {
                        result3 = two;
                    }
                    if (number % 10 == 3) {
                        result3 = three;
                    }
                    if (number % 10 == 4) {
                        result3 = four;
                    }
                    if (number % 10 == 5) {
                        result3 = five;
                    }
                    if (number % 10 == 6) {
                        result3 = six;
                    }
                    if (number % 10 == 7) {
                        result3 = seven;
                    }
                    if (number % 10 == 8) {
                        result3 = eight;
                    }
                    if (number % 10 == 9) {
                        result3 = nine;
                    }
                    if (number % 100 == 11) {
                        result2 = eleven;
                        result3 = "";
                    }
                    if (number % 100 == 12) {
                        result2 = twelve;
                        result3 = "";
                    }
                    if (number % 100 == 13) {
                        result2 = thirteen;
                        result3 = "";
                    }
                    if (number % 100 == 14) {
                        result2 = fourteen;
                        result3 = "";
                    }
                    if (number % 100 == 15) {
                        result2 = fifteen;
                        result3 = "";
                    }
                    if (number % 100 == 16) {
                        result2 = sixteen;
                        result3 = "";
                    }
                    if (number % 100 == 17) {
                        result2 = seventeen;
                        result3 = "";
                    }
                    if (number % 100 == 18) {
                        result2 = eighteen;
                        result4 = "";
                    }
                    if (number % 100 == 19) {
                        result2 = nineteen;
                        result4 = "";
                    }
                    if (number / 1000 % 100 == 1) {
                        result5 = eleven + " " + polyThousand;
                        result4 = "";
                    }
                    if (number / 1000 % 100 == 12) {
                        result5 = twelve + " " + polyThousand;
                        result4 = "";
                    }
                    if (number / 1000 % 100 == 13) {
                        result5 = thirteen + " " + polyThousand;
                        result4 = "";
                    }
                    if (number / 1000 % 100 == 14) {
                        result5 = fourteen + " " + polyThousand;
                        result4 = "";
                    }
                    if (number / 1000 % 100 == 15) {
                        result5 = fifteen + " " + polyThousand;
                        result4 = "";
                    }
                    if (number / 1000 % 100 == 16) {
                        result5 = sixteen + " " + polyThousand;
                        result3 = "";
                    }
                    if (number / 1000 % 100 == 17) {
                        result5 = seventeen + " " + polyThousand;
                        result4 = "";
                    }
                    if (number / 1000 % 100 == 18) {
                        result5 = eighteen + " " + polyThousand;
                        result4 = "";
                    }
                    if (number / 1000 % 100 == 19) {
                        result5 = nineteen + " " + polyThousand;
                        result4 = "";
                    }
                    return result5 + " " + result4 + " " + result1 + " " + result2 + " " + result3 + cel + finish;
                }
                if (number > 100000 && number < 1000000) {
                    if (number / 100000 == 1) {
                        result6 = oneHundred;
                    }
                    if (number / 100000 == 2) {
                        result6 = twoHundred;
                    }
                    if (number / 100000 == 3) {
                        result6 = threeHundred;
                    }
                    if (number / 100000 == 4) {
                        result6 = fourHundred;
                    }
                    if (number / 100000 == 5) {
                        result6 = fiveHundred;
                    }
                    if (number / 100000 == 6) {
                        result6 = sixHundred;
                    }
                    if (number / 100000 == 7) {
                        result6 = sevenHundred;
                    }
                    if (number / 100000 == 8) {
                        result6 = eightHundred;
                    }
                    if (number / 100000 == 9) {
                        result6 = nineHundred;
                    }
                    if (number / 10000 % 10 == 1) {
                        result5 = ten;
                    }
                    if (number / 10000 % 10 == 2) {
                        result5 = twenty;
                    }
                    if (number / 10000 % 10 == 3) {
                        result5 = thirty;
                    }
                    if (number / 10000 % 10 == 4) {
                        result5 = forty;
                    }
                    if (number / 10000 % 10 == 5) {
                        result5 = fifty;
                    }
                    if (number / 10000 % 10 == 6) {
                        result5 = sixty;
                    }
                    if (number / 10000 % 10 == 7) {
                        result5 = seventy;
                    }
                    if (number / 10000 % 10 == 8) {
                        result5 = eighty;
                    }
                    if (number / 10000 % 10 == 9) {
                        result5 = ninety;
                    }
                    if (number / 1000 % 10 == 0) {
                        result4 = polyThousand;
                    }
                    if (number / 1000 % 10 == 1) {
                        result4 = oneVS + thousand;
                    }
                    if (number / 1000 % 10 == 2) {
                        result4 = twoVS + " " + oligoThousand;
                    }
                    if (number / 1000 % 10 == 3) {
                        result4 = three + " " + oligoThousand;
                    }
                    if (number / 1000 % 10 == 4) {
                        result4 = four + " " + oligoThousand;
                    }
                    if (number / 1000 % 10 == 5) {
                        result4 = five + " " + polyThousand;
                    }
                    if (number / 1000 % 10 == 6) {
                        result4 = six + " " + polyThousand;
                    }
                    if (number / 1000 % 10 == 7) {
                        result4 = seven + " " + polyThousand;
                    }
                    if (number / 1000 % 10 == 8) {
                        result4 = eight + " " + polyThousand;
                    }
                    if (number / 1000 % 10 == 9) {
                        result4 = nine + " " + polyThousand;
                    }
                    if (number / 100 % 10 == 1) {
                        result1 = oneHundred;
                    }
                    if (number / 100 % 10 == 2) {
                        result1 = twoHundred;
                    }
                    if (number / 100 % 10 == 3) {
                        result1 = threeHundred;
                    }
                    if (number / 100 % 10 == 4) {
                        result1 = fourHundred;
                    }
                    if (number / 100 % 10 == 5) {
                        result1 = fiveHundred;
                    }
                    if (number / 100 % 10 == 6) {
                        result1 = sixHundred;
                    }
                    if (number / 100 % 10 == 7) {
                        result1 = sevenHundred;
                    }
                    if (number / 100 % 10 == 8) {
                        result1 = eightHundred;
                    }
                    if (number / 100 % 10 == 9) {
                        result1 = nineHundred;
                    }
                    if (number / 10 % 10 == 1) {
                        result2 = ten;
                    }
                    if (number / 10 % 10 == 2) {
                        result2 = twenty;
                    }
                    if (number / 10 % 10 == 3) {
                        result2 = thirty;
                    }
                    if (number / 10 % 10 == 4) {
                        result2 = forty;
                    }
                    if (number / 10 % 10 == 5) {
                        result2 = fifty;
                    }
                    if (number / 10 % 10 == 6) {
                        result2 = sixty;
                    }
                    if (number / 10 % 10 == 7) {
                        result2 = seventy;
                    }
                    if (number / 10 % 10 == 8) {
                        result2 = eighty;
                    }
                    if (number / 10 % 10 == 9) {
                        result2 = ninety;
                    }
                    if (number % 10 == 0) {
                        result3 = "";
                    }
                    if (number % 10 == 1) {
                        result3 = one;
                    }
                    if (number % 10 == 2) {
                        result3 = two;
                    }
                    if (number % 10 == 3) {
                        result3 = three;
                    }
                    if (number % 10 == 4) {
                        result3 = four;
                    }
                    if (number % 10 == 5) {
                        result3 = five;
                    }
                    if (number % 10 == 6) {
                        result3 = six;
                    }
                    if (number % 10 == 7) {
                        result3 = seven;
                    }
                    if (number % 10 == 8) {
                        result3 = eight;
                    }
                    if (number % 10 == 9) {
                        result3 = nine;
                    }
                    if (number % 100 == 11) {
                        result2 = eleven;
                        result3 = "";
                    }
                    if (number % 100 == 12) {
                        result2 = twelve;
                        result3 = "";
                    }
                    if (number % 100 == 13) {
                        result2 = thirteen;
                        result3 = "";
                    }
                    if (number % 100 == 14) {
                        result2 = fourteen;
                        result3 = "";
                    }
                    if (number % 100 == 15) {
                        result2 = fifteen;
                        result3 = "";
                    }
                    if (number % 100 == 16) {
                        result2 = sixteen;
                        result3 = "";
                    }
                    if (number % 100 == 17) {
                        result2 = seventeen;
                        result3 = "";
                    }
                    if (number % 100 == 18) {
                        result2 = eighteen;
                        result4 = "";
                    }
                    if (number % 100 == 19) {
                        result2 = nineteen;
                        result4 = "";
                    }
                    if (number / 1000 % 100 == 1) {
                        result5 = eleven + " " + polyThousand;
                        result4 = "";
                    }
                    if (number / 1000 % 100 == 12) {
                        result5 = twelve + " " + polyThousand;
                        result4 = "";
                    }
                    if (number / 1000 % 100 == 13) {
                        result5 = thirteen + " " + polyThousand;
                        result4 = "";
                    }
                    if (number / 1000 % 100 == 14) {
                        result5 = fourteen + " " + polyThousand;
                        result4 = "";
                    }
                    if (number / 1000 % 100 == 15) {
                        result5 = fifteen + " " + polyThousand;
                        result4 = "";
                    }
                    if (number / 1000 % 100 == 16) {
                        result5 = sixteen + " " + polyThousand;
                        result3 = "";
                    }
                    if (number / 1000 % 100 == 17) {
                        result5 = seventeen + " " + polyThousand;
                        result4 = "";
                    }
                    if (number / 1000 % 100 == 18) {
                        result5 = eighteen + " " + polyThousand;
                        result4 = "";
                    }
                    if (number / 1000 % 100 == 19) {
                        result5 = nineteen + " " + polyThousand;
                        result4 = "";
                    }
                    return result6 + " " + result5 + " " + result4 + " " + result1 + " " + result2 + " " + result3 + cel + finish;
                }
                if (number > 1000000 && number < 10000000) {
                    if (number / 1000000 == 1) {
                        result7 = one + " " + million;
                    }
                    if (number / 1000000 == 2) {
                        result7 = two + " " + oligoMillion;
                    }
                    if (number / 1000000 == 3) {
                        result7 = three + " " + oligoMillion;
                    }
                    if (number / 1000000 == 4) {
                        result7 = four + " " + oligoMillion;
                    }
                    if (number / 1000000 == 5) {
                        result7 = five + " " + oligoMillion;
                    }
                    if (number / 1000000 == 6) {
                        result7 = six + " " + oligoMillion;
                    }
                    if (number / 1000000 == 7) {
                        result7 = seven + " " + oligoMillion;
                    }
                    if (number / 1000000 == 8) {
                        result7 = eight + " " + oligoMillion;
                    }
                    if (number / 1000000 == 9) {
                        result7 = nine + " " + oligoMillion;
                    }
                    if (number / 100000 % 10 == 1) {
                        result6 = oneHundred;
                    }
                    if (number / 100000 % 10 == 2) {
                        result6 = twoHundred;
                    }
                    if (number / 100000 % 10 == 3) {
                        result6 = threeHundred;
                    }
                    if (number / 100000 % 10 == 4) {
                        result6 = fourHundred;
                    }
                    if (number / 100000 % 10 == 5) {
                        result6 = fiveHundred;
                    }
                    if (number / 100000 % 10 == 6) {
                        result6 = sixHundred;
                    }
                    if (number / 100000 % 10 == 7) {
                        result6 = sevenHundred;
                    }
                    if (number / 100000 % 10 == 8) {
                        result6 = eightHundred;
                    }
                    if (number / 100000 % 10 == 9) {
                        result6 = nineHundred;
                    }
                    if (number / 10000 % 10 == 1) {
                        result5 = ten;
                    }
                    if (number / 10000 % 10 == 2) {
                        result5 = twenty;
                    }
                    if (number / 10000 % 10 == 3) {
                        result5 = thirty;
                    }
                    if (number / 10000 % 10 == 4) {
                        result5 = forty;
                    }
                    if (number / 10000 % 10 == 5) {
                        result5 = fifty;
                    }
                    if (number / 10000 % 10 == 6) {
                        result5 = sixty;
                    }
                    if (number / 10000 % 10 == 7) {
                        result5 = seventy;
                    }
                    if (number / 10000 % 10 == 8) {
                        result5 = eighty;
                    }
                    if (number / 10000 % 10 == 9) {
                        result5 = ninety;
                    }
                    if (number / 1000 % 10 == 0) {
                        result4 = polyThousand;
                    }
                    if (number / 1000 % 10 == 1) {
                        result4 = oneVS + thousand;
                    }
                    if (number / 1000 % 10 == 2) {
                        result4 = twoVS + " " + oligoThousand;
                    }
                    if (number / 1000 % 10 == 3) {
                        result4 = three + " " + oligoThousand;
                    }
                    if (number / 1000 % 10 == 4) {
                        result4 = four + " " + oligoThousand;
                    }
                    if (number / 1000 % 10 == 5) {
                        result4 = five + " " + polyThousand;
                    }
                    if (number / 1000 % 10 == 6) {
                        result4 = six + " " + polyThousand;
                    }
                    if (number / 1000 % 10 == 7) {
                        result4 = seven + " " + polyThousand;
                    }
                    if (number / 1000 % 10 == 8) {
                        result4 = eight + " " + polyThousand;
                    }
                    if (number / 1000 % 10 == 9) {
                        result4 = nine + " " + polyThousand;
                    }
                    if (number / 100 % 10 == 1) {
                        result1 = oneHundred;
                    }
                    if (number / 100 % 10 == 2) {
                        result1 = twoHundred;
                    }
                    if (number / 100 % 10 == 3) {
                        result1 = threeHundred;
                    }
                    if (number / 100 % 10 == 4) {
                        result1 = fourHundred;
                    }
                    if (number / 100 % 10 == 5) {
                        result1 = fiveHundred;
                    }
                    if (number / 100 % 10 == 6) {
                        result1 = sixHundred;
                    }
                    if (number / 100 % 10 == 7) {
                        result1 = sevenHundred;
                    }
                    if (number / 100 % 10 == 8) {
                        result1 = eightHundred;
                    }
                    if (number / 100 % 10 == 9) {
                        result1 = nineHundred;
                    }
                    if (number / 10 % 10 == 1) {
                        result2 = ten;
                    }
                    if (number / 10 % 10 == 2) {
                        result2 = twenty;
                    }
                    if (number / 10 % 10 == 3) {
                        result2 = thirty;
                    }
                    if (number / 10 % 10 == 4) {
                        result2 = forty;
                    }
                    if (number / 10 % 10 == 5) {
                        result2 = fifty;
                    }
                    if (number / 10 % 10 == 6) {
                        result2 = sixty;
                    }
                    if (number / 10 % 10 == 7) {
                        result2 = seventy;
                    }
                    if (number / 10 % 10 == 8) {
                        result2 = eighty;
                    }
                    if (number / 10 % 10 == 9) {
                        result2 = ninety;
                    }
                    if (number % 10 == 0) {
                        result3 = "";
                    }
                    if (number % 10 == 1) {
                        result3 = one;
                    }
                    if (number % 10 == 2) {
                        result3 = two;
                    }
                    if (number % 10 == 3) {
                        result3 = three;
                    }
                    if (number % 10 == 4) {
                        result3 = four;
                    }
                    if (number % 10 == 5) {
                        result3 = five;
                    }
                    if (number % 10 == 6) {
                        result3 = six;
                    }
                    if (number % 10 == 7) {
                        result3 = seven;
                    }
                    if (number % 10 == 8) {
                        result3 = eight;
                    }
                    if (number % 10 == 9) {
                        result3 = nine;
                    }
                    if (number % 100 == 11) {
                        result2 = eleven;
                        result3 = "";
                    }
                    if (number % 100 == 12) {
                        result2 = twelve;
                        result3 = "";
                    }
                    if (number % 100 == 13) {
                        result2 = thirteen;
                        result3 = "";
                    }
                    if (number % 100 == 14) {
                        result2 = fourteen;
                        result3 = "";
                    }
                    if (number % 100 == 15) {
                        result2 = fifteen;
                        result3 = "";
                    }
                    if (number % 100 == 16) {
                        result2 = sixteen;
                        result3 = "";
                    }
                    if (number % 100 == 17) {
                        result2 = seventeen;
                        result3 = "";
                    }
                    if (number % 100 == 18) {
                        result2 = eighteen;
                        result4 = "";
                    }
                    if (number % 100 == 19) {
                        result2 = nineteen;
                        result4 = "";
                    }
                    if (number / 1000 % 100 == 1) {
                        result5 = eleven + " " + polyThousand;
                        result4 = "";
                    }
                    if (number / 1000 % 100 == 12) {
                        result5 = twelve + " " + polyThousand;
                        result4 = "";
                    }
                    if (number / 1000 % 100 == 13) {
                        result5 = thirteen + " " + polyThousand;
                        result4 = "";
                    }
                    if (number / 1000 % 100 == 14) {
                        result5 = fourteen + " " + polyThousand;
                        result4 = "";
                    }
                    if (number / 1000 % 100 == 15) {
                        result5 = fifteen + " " + polyThousand;
                        result4 = "";
                    }
                    if (number / 1000 % 100 == 16) {
                        result5 = sixteen + " " + polyThousand;
                        result3 = "";
                    }
                    if (number / 1000 % 100 == 17) {
                        result5 = seventeen + " " + polyThousand;
                        result4 = "";
                    }
                    if (number / 1000 % 100 == 18) {
                        result5 = eighteen + " " + polyThousand;
                        result4 = "";
                    }
                    if (number / 1000 % 100 == 19) {
                        result5 = nineteen + " " + polyThousand;
                        result4 = "";
                    }
                    return result7 + " " + result6 + " " + result5 + " " + result4
                            + " " + result1 + " " + result2 + " " + result3 + cel + finish;
                }
                if (number > 10000000 && number < 100000000) {
                    if (number / 10000000 == 2) {
                        result8 = twenty + " " + polyMillion;
                    }
                    if (number / 10000000 == 3) {
                        result8 = thirty + " " + polyMillion;
                    }
                    if (number / 10000000 == 4) {
                        result8 = forty + " " + polyMillion;
                    }
                    if (number / 10000000 == 5) {
                        result8 = fifty + " " + polyMillion;
                    }
                    if (number / 10000000 == 6) {
                        result8 = sixty + " " + polyMillion;
                    }
                    if (number / 10000000 == 7) {
                        result8 = seventy + " " + polyMillion;
                    }
                    if (number / 10000000 == 8) {
                        result8 = eighty + " " + polyMillion;
                    }
                    if (number / 10000000 == 9) {
                        result8 = ninety + " " + polyMillion;
                    }
                    if (number / 1000000 % 10 == 0) {
                        result7 = polyMillion;
                    }
                    if (number / 1000000 % 10 == 1) {
                        result7 = one + " " + million;
                    }
                    if (number / 1000000 % 10 == 2) {
                        result7 = two + " " + oligoMillion;
                    }
                    if (number / 1000000 % 10 == 1) {
                        result7 = three + " " + oligoMillion;
                    }
                    if (number / 1000000 % 10 == 1) {
                        result7 = four + " " + oligoMillion;
                    }
                    if (number / 1000000 % 10 == 1) {
                        result7 = five + " " + oligoMillion;
                    }
                    if (number / 1000000 % 10 == 1) {
                        result7 = six + " " + oligoMillion;
                    }
                    if (number / 1000000 % 10 == 1) {
                        result7 = seven + " " + oligoMillion;
                    }
                    if (number / 1000000 % 10 == 1) {
                        result7 = eight + " " + oligoMillion;
                    }
                    if (number / 1000000 % 10 == 1) {
                        result7 = nine + " " + oligoMillion;
                    }
                    if (number / 100000 % 10 == 1) {
                        result6 = oneHundred;
                    }
                    if (number / 100000 % 10 == 2) {
                        result6 = twoHundred;
                    }
                    if (number / 100000 % 10 == 3) {
                        result6 = threeHundred;
                    }
                    if (number / 100000 % 10 == 4) {
                        result6 = fourHundred;
                    }
                    if (number / 100000 % 10 == 5) {
                        result6 = fiveHundred;
                    }
                    if (number / 100000 % 10 == 6) {
                        result6 = sixHundred;
                    }
                    if (number / 100000 % 10 == 7) {
                        result6 = sevenHundred;
                    }
                    if (number / 100000 % 10 == 8) {
                        result6 = eightHundred;
                    }
                    if (number / 100000 % 10 == 9) {
                        result6 = nineHundred;
                    }
                    if (number / 10000 % 10 == 1) {
                        result5 = ten;
                    }
                    if (number / 10000 % 10 == 2) {
                        result5 = twenty;
                    }
                    if (number / 10000 % 10 == 3) {
                        result5 = thirty;
                    }
                    if (number / 10000 % 10 == 4) {
                        result5 = forty;
                    }
                    if (number / 10000 % 10 == 5) {
                        result5 = fifty;
                    }
                    if (number / 10000 % 10 == 6) {
                        result5 = sixty;
                    }
                    if (number / 10000 % 10 == 7) {
                        result5 = seventy;
                    }
                    if (number / 10000 % 10 == 8) {
                        result5 = eighty;
                    }
                    if (number / 10000 % 10 == 9) {
                        result5 = ninety;
                    }
                    if (number / 1000 % 10 == 0) {
                        result4 = polyThousand;
                    }
                    if (number / 1000 % 10 == 1) {
                        result4 = oneVS + thousand;
                    }
                    if (number / 1000 % 10 == 2) {
                        result4 = twoVS + " " + oligoThousand;
                    }
                    if (number / 1000 % 10 == 3) {
                        result4 = three + " " + oligoThousand;
                    }
                    if (number / 1000 % 10 == 4) {
                        result4 = four + " " + oligoThousand;
                    }
                    if (number / 1000 % 10 == 5) {
                        result4 = five + " " + polyThousand;
                    }
                    if (number / 1000 % 10 == 6) {
                        result4 = six + " " + polyThousand;
                    }
                    if (number / 1000 % 10 == 7) {
                        result4 = seven + " " + polyThousand;
                    }
                    if (number / 1000 % 10 == 8) {
                        result4 = eight + " " + polyThousand;
                    }
                    if (number / 1000 % 10 == 9) {
                        result4 = nine + " " + polyThousand;
                    }
                    if (number / 100 % 10 == 1) {
                        result1 = oneHundred;
                    }
                    if (number / 100 % 10 == 2) {
                        result1 = twoHundred;
                    }
                    if (number / 100 % 10 == 3) {
                        result1 = threeHundred;
                    }
                    if (number / 100 % 10 == 4) {
                        result1 = fourHundred;
                    }
                    if (number / 100 % 10 == 5) {
                        result1 = fiveHundred;
                    }
                    if (number / 100 % 10 == 6) {
                        result1 = sixHundred;
                    }
                    if (number / 100 % 10 == 7) {
                        result1 = sevenHundred;
                    }
                    if (number / 100 % 10 == 8) {
                        result1 = eightHundred;
                    }
                    if (number / 100 % 10 == 9) {
                        result1 = nineHundred;
                    }
                    if (number / 10 % 10 == 1) {
                        result2 = ten;
                    }
                    if (number / 10 % 10 == 2) {
                        result2 = twenty;
                    }
                    if (number / 10 % 10 == 3) {
                        result2 = thirty;
                    }
                    if (number / 10 % 10 == 4) {
                        result2 = forty;
                    }
                    if (number / 10 % 10 == 5) {
                        result2 = fifty;
                    }
                    if (number / 10 % 10 == 6) {
                        result2 = sixty;
                    }
                    if (number / 10 % 10 == 7) {
                        result2 = seventy;
                    }
                    if (number / 10 % 10 == 8) {
                        result2 = eighty;
                    }
                    if (number / 10 % 10 == 9) {
                        result2 = ninety;
                    }
                    if (number % 10 == 0) {
                        result3 = "";
                    }
                    if (number % 10 == 1) {
                        result3 = one;
                    }
                    if (number % 10 == 2) {
                        result3 = two;
                    }
                    if (number % 10 == 3) {
                        result3 = three;
                    }
                    if (number % 10 == 4) {
                        result3 = four;
                    }
                    if (number % 10 == 5) {
                        result3 = five;
                    }
                    if (number % 10 == 6) {
                        result3 = six;
                    }
                    if (number % 10 == 7) {
                        result3 = seven;
                    }
                    if (number % 10 == 8) {
                        result3 = eight;
                    }
                    if (number % 10 == 9) {
                        result3 = nine;
                    }
                    if (number % 100 == 11) {
                        result2 = eleven;
                        result3 = "";
                    }
                    if (number % 100 == 12) {
                        result2 = twelve;
                        result3 = "";
                    }
                    if (number % 100 == 13) {
                        result2 = thirteen;
                        result3 = "";
                    }
                    if (number % 100 == 14) {
                        result2 = fourteen;
                        result3 = "";
                    }
                    if (number % 100 == 15) {
                        result2 = fifteen;
                        result3 = "";
                    }
                    if (number % 100 == 16) {
                        result2 = sixteen;
                        result3 = "";
                    }
                    if (number % 100 == 17) {
                        result2 = seventeen;
                        result3 = "";
                    }
                    if (number % 100 == 18) {
                        result2 = eighteen;
                        result4 = "";
                    }
                    if (number % 100 == 19) {
                        result2 = nineteen;
                        result4 = "";
                    }
                    if (number / 1000 % 100 == 1) {
                        result5 = eleven + " " + polyThousand;
                        result4 = "";
                    }
                    if (number / 1000 % 100 == 12) {
                        result5 = twelve + " " + polyThousand;
                        result4 = "";
                    }
                    if (number / 1000 % 100 == 13) {
                        result5 = thirteen + " " + polyThousand;
                        result4 = "";
                    }
                    if (number / 1000 % 100 == 14) {
                        result5 = fourteen + " " + polyThousand;
                        result4 = "";
                    }
                    if (number / 1000 % 100 == 15) {
                        result5 = fifteen + " " + polyThousand;
                        result4 = "";
                    }
                    if (number / 1000 % 100 == 16) {
                        result5 = sixteen + " " + polyThousand;
                        result3 = "";
                    }
                    if (number / 1000 % 100 == 17) {
                        result5 = seventeen + " " + polyThousand;
                        result4 = "";
                    }
                    if (number / 1000 % 100 == 18) {
                        result5 = eighteen + " " + polyThousand;
                        result4 = "";
                    }
                    if (number / 1000 % 100 == 19) {
                        result5 = nineteen + " " + polyThousand;
                        result4 = "";
                    }
                    if (number / 1000000 % 100 == 11) {
                        result8 = eleven + " " + polyMillion;
                        result7 = "";
                    }
                    if (number / 1000000 % 100 == 12) {
                        result8 = twelve + " " + polyMillion;
                        result7 = "";
                    }
                    if (number / 1000000 % 100 == 13) {
                        result8 = thirteen + " " + polyMillion;
                        result7 = "";
                    }
                    if (number / 1000000 % 100 == 14) {
                        result8 = fourteen + " " + polyMillion;
                        result7 = "";
                    }
                    if (number / 1000000 % 100 == 15) {
                        result8 = fifteen + " " + polyMillion;
                        result7 = "";
                    }
                    if (number / 1000000 % 100 == 16) {
                        result8 = sixteen + " " + polyMillion;
                        result7 = "";
                    }
                    if (number / 1000000 % 100 == 17) {
                        result8 = seventeen + " " + polyMillion;
                        result7 = "";
                    }
                    if (number / 1000000 % 100 == 18) {
                        result8 = eighteen + " " + polyMillion;
                        result7 = "";
                    }
                    if (number / 1000000 % 100 == 19) {
                        result8 = nineteen + " " + polyMillion;
                        result7 = "";
                    }
                    return result8 + " " + result7 + " " + result6 + " " + result5 + " "
                            + result4 + " " + result1 + " " + result2 + " " + result3 + cel + finish;
                }
                if (number > 100000000 && number < 1000000000) {
                    if (number / 100000000 == 1) {
                        result9 = oneHundred;
                    }
                    if (number / 100000000 == 2) {
                        result9 = twoHundred;
                    }
                    if (number / 100000000 == 3) {
                        result9 = threeHundred;
                    }
                    if (number / 100000000 == 4) {
                        result9 = fourHundred;
                    }
                    if (number / 100000000 == 5) {
                        result9 = fiveHundred;
                    }
                    if (number / 100000000 == 6) {
                        result9 = sixHundred;
                    }
                    if (number / 100000000 == 7) {
                        result9 = sevenHundred;
                    }
                    if (number / 100000000 == 8) {
                        result9 = eightHundred;
                    }
                    if (number / 100000000 == 9) {
                        result9 = nineHundred;
                    }
                    if (number / 10000000 % 10 == 2) {
                        result8 = twenty;
                    }
                    if (number / 10000000 % 10 == 3) {
                        result8 = thirty;
                    }
                    if (number / 10000000 % 10 == 4) {
                        result8 = forty;
                    }
                    if (number / 10000000 % 10 == 5) {
                        result8 = fifty;
                    }
                    if (number / 10000000 % 10 == 6) {
                        result8 = sixty;
                    }
                    if (number / 10000000 % 10 == 7) {
                        result8 = seventy;
                    }
                    if (number / 10000000 % 10 == 8) {
                        result8 = eighty;
                    }
                    if (number / 10000000 % 10 == 9) {
                        result8 = ninety;
                    }
                    if (number / 1000000 % 10 == 0) {
                        result7 = polyMillion;
                    }
                    if (number / 1000000 % 10 == 1) {
                        result7 = one + " " + million;
                    }
                    if (number / 1000000 % 10 == 2) {
                        result7 = two + " " + oligoMillion;
                    }
                    if (number / 1000000 % 10 == 3) {
                        result7 = three + " " + oligoMillion;
                    }
                    if (number / 1000000 % 10 == 4) {
                        result7 = four + " " + oligoMillion;
                    }
                    if (number / 1000000 % 10 == 5) {
                        result7 = five + " " + polyMillion;
                    }
                    if (number / 1000000 % 10 == 6) {
                        result7 = six + " " + polyMillion;
                    }
                    if (number / 1000000 % 10 == 7) {
                        result7 = seven + " " + polyMillion;
                    }
                    if (number / 1000000 % 10 == 8) {
                        result7 = eight + " " + polyMillion;
                    }
                    if (number / 1000000 % 10 == 9) {
                        result7 = nine + " " + polyMillion;
                    }
                    if (number / 100000 % 10 == 1) {
                        result6 = oneHundred;
                    }
                    if (number / 100000 % 10 == 2) {
                        result6 = twoHundred;
                    }
                    if (number / 100000 % 10 == 3) {
                        result6 = threeHundred;
                    }
                    if (number / 100000 % 10 == 4) {
                        result6 = fourHundred;
                    }
                    if (number / 100000 % 10 == 5) {
                        result6 = fiveHundred;
                    }
                    if (number / 100000 % 10 == 6) {
                        result6 = sixHundred;
                    }
                    if (number / 100000 % 10 == 7) {
                        result6 = sevenHundred;
                    }
                    if (number / 100000 % 10 == 8) {
                        result6 = eightHundred;
                    }
                    if (number / 100000 % 10 == 9) {
                        result6 = nineHundred;
                    }
                    if (number / 10000 % 10 == 1) {
                        result5 = ten;
                    }
                    if (number / 10000 % 10 == 2) {
                        result5 = twenty;
                    }
                    if (number / 10000 % 10 == 3) {
                        result5 = thirty;
                    }
                    if (number / 10000 % 10 == 4) {
                        result5 = forty;
                    }
                    if (number / 10000 % 10 == 5) {
                        result5 = fifty;
                    }
                    if (number / 10000 % 10 == 6) {
                        result5 = sixty;
                    }
                    if (number / 10000 % 10 == 7) {
                        result5 = seventy;
                    }
                    if (number / 10000 % 10 == 8) {
                        result5 = eighty;
                    }
                    if (number / 10000 % 10 == 9) {
                        result5 = ninety;
                    }
                    if (number / 1000 % 10 == 0) {
                        result4 = polyThousand;
                    }
                    if (number / 1000 % 10 == 1) {
                        result4 = oneVS + thousand;
                    }
                    if (number / 1000 % 10 == 2) {
                        result4 = twoVS + " " + oligoThousand;
                    }
                    if (number / 1000 % 10 == 3) {
                        result4 = three + " " + oligoThousand;
                    }
                    if (number / 1000 % 10 == 4) {
                        result4 = four + " " + oligoThousand;
                    }
                    if (number / 1000 % 10 == 5) {
                        result4 = five + " " + polyThousand;
                    }
                    if (number / 1000 % 10 == 6) {
                        result4 = six + " " + polyThousand;
                    }
                    if (number / 1000 % 10 == 7) {
                        result4 = seven + " " + polyThousand;
                    }
                    if (number / 1000 % 10 == 8) {
                        result4 = eight + " " + polyThousand;
                    }
                    if (number / 1000 % 10 == 9) {
                        result4 = nine + " " + polyThousand;
                    }
                    if (number / 100 % 10 == 1) {
                        result1 = oneHundred;
                    }
                    if (number / 100 % 10 == 2) {
                        result1 = twoHundred;
                    }
                    if (number / 100 % 10 == 3) {
                        result1 = threeHundred;
                    }
                    if (number / 100 % 10 == 4) {
                        result1 = fourHundred;
                    }
                    if (number / 100 % 10 == 5) {
                        result1 = fiveHundred;
                    }
                    if (number / 100 % 10 == 6) {
                        result1 = sixHundred;
                    }
                    if (number / 100 % 10 == 7) {
                        result1 = sevenHundred;
                    }
                    if (number / 100 % 10 == 8) {
                        result1 = eightHundred;
                    }
                    if (number / 100 % 10 == 9) {
                        result1 = nineHundred;
                    }
                    if (number / 10 % 10 == 1) {
                        result2 = ten;
                    }
                    if (number / 10 % 10 == 2) {
                        result2 = twenty;
                    }
                    if (number / 10 % 10 == 3) {
                        result2 = thirty;
                    }
                    if (number / 10 % 10 == 4) {
                        result2 = forty;
                    }
                    if (number / 10 % 10 == 5) {
                        result2 = fifty;
                    }
                    if (number / 10 % 10 == 6) {
                        result2 = sixty;
                    }
                    if (number / 10 % 10 == 7) {
                        result2 = seventy;
                    }
                    if (number / 10 % 10 == 8) {
                        result2 = eighty;
                    }
                    if (number / 10 % 10 == 9) {
                        result2 = ninety;
                    }
                    if (number % 10 == 0) {
                        result3 = "";
                    }
                    if (number % 10 == 1) {
                        result3 = one;
                    }
                    if (number % 10 == 2) {
                        result3 = two;
                    }
                    if (number % 10 == 3) {
                        result3 = three;
                    }
                    if (number % 10 == 4) {
                        result3 = four;
                    }
                    if (number % 10 == 5) {
                        result3 = five;
                    }
                    if (number % 10 == 6) {
                        result3 = six;
                    }
                    if (number % 10 == 7) {
                        result3 = seven;
                    }
                    if (number % 10 == 8) {
                        result3 = eight;
                    }
                    if (number % 10 == 9) {
                        result3 = nine;
                    }
                    if (number % 100 == 11) {
                        result2 = eleven;
                        result3 = "";
                    }
                    if (number % 100 == 12) {
                        result2 = twelve;
                        result3 = "";
                    }
                    if (number % 100 == 13) {
                        result2 = thirteen;
                        result3 = "";
                    }
                    if (number % 100 == 14) {
                        result2 = fourteen;
                        result3 = "";
                    }
                    if (number % 100 == 15) {
                        result2 = fifteen;
                        result3 = "";
                    }
                    if (number % 100 == 16) {
                        result2 = sixteen;
                        result3 = "";
                    }
                    if (number % 100 == 17) {
                        result2 = seventeen;
                        result3 = "";
                    }
                    if (number % 100 == 18) {
                        result2 = eighteen;
                        result4 = "";
                    }
                    if (number % 100 == 19) {
                        result2 = nineteen;
                        result4 = "";
                    }
                    if (number / 1000 % 100 == 1) {
                        result5 = eleven + " " + polyThousand;
                        result4 = "";
                    }
                    if (number / 1000 % 100 == 12) {
                        result5 = twelve + " " + polyThousand;
                        result4 = "";
                    }
                    if (number / 1000 % 100 == 13) {
                        result5 = thirteen + " " + polyThousand;
                        result4 = "";
                    }
                    if (number / 1000 % 100 == 14) {
                        result5 = fourteen + " " + polyThousand;
                        result4 = "";
                    }
                    if (number / 1000 % 100 == 15) {
                        result5 = fifteen + " " + polyThousand;
                        result4 = "";
                    }
                    if (number / 1000 % 100 == 16) {
                        result5 = sixteen + " " + polyThousand;
                        result3 = "";
                    }
                    if (number / 1000 % 100 == 17) {
                        result5 = seventeen + " " + polyThousand;
                        result4 = "";
                    }
                    if (number / 1000 % 100 == 18) {
                        result5 = eighteen + " " + polyThousand;
                        result4 = "";
                    }
                    if (number / 1000 % 100 == 19) {
                        result5 = nineteen + " " + polyThousand;
                        result4 = "";
                    }
                    if (number / 1000000 % 100 == 11) {
                        result8 = eleven + " " + polyMillion;
                        result7 = "";
                    }
                    if (number / 1000000 % 100 == 12) {
                        result8 = twelve + " " + polyMillion;
                        result7 = "";
                    }
                    if (number / 1000000 % 100 == 13) {
                        result8 = thirteen + " " + polyMillion;
                        result7 = "";
                    }
                    if (number / 1000000 % 100 == 14) {
                        result8 = fourteen + " " + polyMillion;
                        result7 = "";
                    }
                    if (number / 1000000 % 100 == 15) {
                        result8 = fifteen + " " + polyMillion;
                        result7 = "";
                    }
                    if (number / 1000000 % 100 == 16) {
                        result8 = sixteen + " " + polyMillion;
                        result7 = "";
                    }
                    if (number / 1000000 % 100 == 17) {
                        result8 = seventeen + " " + polyMillion;
                        result7 = "";
                    }
                    if (number / 1000000 % 100 == 18) {
                        result8 = eighteen + " " + polyMillion;
                        result7 = "";
                    }
                    if (number / 1000000 % 100 == 19) {
                        result8 = nineteen + " " + polyMillion;
                        result7 = "";
                    }
                    return result9 + " " + result8 + " " + result7 + " " + result6 + " " + result5 + " "
                            + result4 + " " + result1 + " " + result2 + " " + result3 + cel + finish;
                }
            }
            if(number < 0) {
                number = number * (-1);
                System.out.print("минус ");
                if (number % 20 == 0 && number / 20 == 1) {
                    return twenty + cel + finish;
                }
                if (number % 30 == 0 && number / 30 == 1) {
                    return thirty + cel + finish;
                }
                if (number % 40 == 0 && number / 40 == 1) {
                    return forty + cel + finish;
                }
                if (number % 50 == 0 && number / 50 == 1) {
                    return fifty + cel + finish;
                }
                if (number % 60 == 0 && number / 60 == 1) {
                    return sixty + cel + finish;
                }
                if (number % 70 == 0 && number / 70 == 1) {
                    return seventy + cel + finish;
                }
                if (number % 80 == 0 && number / 80 == 1) {
                    return eighty + cel + finish;
                }
                if (number % 90 == 0 && number / 90 == 1) {
                    return ninety + cel + finish;
                }
                if (number % 100 == 0 && number / 100 == 1) {
                    return oneHundred + cel + finish;
                }
                if (number % 200 == 0 && number / 200 == 1) {
                    return twoHundred + cel + finish;
                }
                if (number % 300 == 0 && number / 300 == 1) {
                    return threeHundred + cel + finish;
                }
                if (number % 400 == 0 && number / 400 == 1) {
                    return fourHundred + cel + finish;
                }
                if (number % 500 == 0 && number / 500 == 1) {
                    return fiveHundred + cel + finish;
                }
                if (number % 600 == 0 && number / 600 == 1) {
                    return sixHundred + cel + finish;
                }
                if (number % 700 == 0 && number / 700 == 1) {
                    return sevenHundred + cel + finish;
                }
                if (number % 800 == 0 && number / 800 == 1) {
                    return eightHundred + cel + finish;
                }
                if (number % 900 == 0 && number / 900 == 1) {
                    return nineHundred + cel + finish;
                }
                if (number % 1000 == 0 && number / 1000 == 1) {
                    return thousand + cel + finish;
                }
                if (number % 10000 == 0 && number / 10000 == 1) {
                    return ten + " " + polyThousand + cel + finish;
                }
                if (number % 100000 == 0 && number / 100000 == 1) {
                    return oneHundred + " " + polyThousand + cel + finish;
                }
                if (number % 1000000 == 0 && number / 1000000 == 1) {
                    return million + cel + finish;
                }
                if (number % 10000000 == 0 && number / 10000000 == 1) {
                    return ten + " " + polyMillion + cel + finish;
                }
                if (number % 100000000 == 0 && number / 100000000 == 1) {
                    return oneHundred + " " + polyMillion + cel + finish;
                }
                /**
                 * перебор числел от 1 до 19
                 */
                if (number > 0 && number < 20) {
                    if (number / 1 == 1) {
                        return one + cel1 + finish;
                    }
                    if (number % 2 == 0 && number / 2 == 1) {
                        return two + cel + finish;
                    }
                    if (number % 3 == 0 && number / 3 == 1) {
                        return three + cel + finish;
                    }
                    if (number % 4 == 0 && number / 4 == 1) {
                        return four + cel + finish;
                    }
                    if (number % 5 == 0 && number / 5 == 1) {
                        return five + cel + finish;
                    }
                    if (number % 6 == 0 && number / 6 == 1) {
                        return six + cel + finish;
                    }
                    if (number % 7 == 0 && number / 7 == 1) {
                        return seven + cel + finish;
                    }
                    if (number % 8 == 0 && number / 8 == 1) {
                        return eight + cel + finish;
                    }
                    if (number % 9 == 0 && number / 9 == 1) {
                        return nine + cel + finish;
                    }
                    if (number % 10 == 0 && number / 10 == 1) {
                        return ten + cel + finish;
                    }
                    if (number % 11 == 0 && number / 11 == 1) {
                        return eleven + cel + finish;
                    }
                    if (number % 12 == 0 && number / 12 == 1) {
                        return twelve + cel + finish;
                    }
                    if (number % 13 == 0 && number / 13 == 1) {
                        return thirteen + cel + finish;
                    }
                    if (number % 14 == 0 && number / 14 == 1) {
                        return fifteen + cel + finish;
                    }
                    if (number % 15 == 0 && number / 15 == 1) {
                        return fifteen + cel + finish;
                    }
                    if (number % 16 == 0 && number / 16 == 1) {
                        return sixteen + cel + finish;
                    }
                    if (number % 17 == 0 && number / 17 == 1) {
                        return seventeen + cel + finish;
                    }
                    if (number % 18 == 0 && number / 18 == 1) {
                        return eighteen + cel + finish;
                    }
                    if (number % 19 == 0 && number / 19 == 1) {
                        return nineteen + cel + finish;
                    }
                }
                if (number > 20 && number < 100) {
                    if (number / 10 == 2) {
                        result1 = twenty;
                    }
                    if (number / 10 == 3) {
                        result1 = thirty;
                    }
                    if (number / 10 == 4) {
                        result1 = forty;
                    }
                    if (number / 10 == 5) {
                        result1 = fifty;
                    }
                    if (number / 10 == 6) {
                        result1 = sixty;
                    }
                    if (number / 10 == 7) {
                        result1 = seventy;
                    }
                    if (number / 10 == 8) {
                        result1 = eighty;
                    }
                    if (number / 10 == 9) {
                        result1 = ninety;
                    }
                    if (number % 10 == 1) {
                        result3 = one;
                    }
                    if (number % 10 == 2) {
                        result3 = two;
                    }
                    if (number % 10 == 3) {
                        result3 = three;
                    }
                    if (number % 10 == 4) {
                        result3 = four;
                    }
                    if (number % 10 == 5) {
                        result3 = five;
                    }
                    if (number % 10 == 6) {
                        result3 = six;
                    }
                    if (number % 10 == 7) {
                        result3 = seven;
                    }
                    if (number % 10 == 8) {
                        result3 = eight;
                    }
                    if (number % 10 == 9) {
                        result3 = nine;
                    }
                    return result1 + " " + result3 + cel + finish;
                }
                if (number > 100 && number < 1000) {
                    if (number / 100 == 1) {
                        result1 = oneHundred;
                    }
                    if (number / 100 == 2) {
                        result1 = twoHundred;
                    }
                    if (number / 100 == 3) {
                        result1 = threeHundred;
                    }
                    if (number / 100 == 4) {
                        result1 = fourHundred;
                    }
                    if (number / 100 == 5) {
                        result1 = fiveHundred;
                    }
                    if (number / 100 == 6) {
                        result1 = sixHundred;
                    }
                    if (number / 100 == 7) {
                        result1 = sevenHundred;
                    }
                    if (number / 100 == 8) {
                        result1 = eightHundred;
                    }
                    if (number / 100 == 9) {
                        result1 = nineHundred;
                    }
                    if (number / 10 % 10 == 1) {
                        result2 = ten;
                    }
                    if (number / 10 % 10 == 2) {
                        result2 = twenty;
                    }
                    if (number / 10 % 10 == 3) {
                        result2 = thirty;
                    }
                    if (number / 10 % 10 == 4) {
                        result2 = forty;
                    }
                    if (number / 10 % 10 == 5) {
                        result2 = fifty;
                    }
                    if (number / 10 % 10 == 6) {
                        result2 = sixty;
                    }
                    if (number / 10 % 10 == 7) {
                        result2 = seventy;
                    }
                    if (number / 10 % 10 == 8) {
                        result2 = eighty;
                    }
                    if (number / 10 % 10 == 9) {
                        result2 = ninety;
                    }
                    if (number % 10 == 0) {
                        result3 = "";
                    }
                    if (number % 10 == 1) {
                        result3 = one;
                    }
                    if (number % 10 == 2) {
                        result3 = two;
                    }
                    if (number % 10 == 3) {
                        result3 = three;
                    }
                    if (number % 10 == 4) {
                        result3 = four;
                    }
                    if (number % 10 == 5) {
                        result3 = five;
                    }
                    if (number % 10 == 6) {
                        result3 = six;
                    }
                    if (number % 10 == 7) {
                        result3 = seven;
                    }
                    if (number % 10 == 8) {
                        result3 = eight;
                    }
                    if (number % 10 == 9) {
                        result3 = nine;
                    }
                    if (number % 100 == 11) {
                        result2 = eleven;
                        result3 = "";
                    }
                    if (number % 100 == 12) {
                        result2 = twelve;
                        result3 = "";
                    }
                    if (number % 100 == 13) {
                        result2 = thirteen;
                        result3 = "";
                    }
                    if (number % 100 == 14) {
                        result2 = fourteen;
                        result3 = "";
                    }
                    if (number % 100 == 15) {
                        result2 = fifteen;
                        result3 = "";
                    }
                    if (number % 100 == 16) {
                        result2 = sixteen;
                        result3 = "";
                    }
                    if (number % 100 == 17) {
                        result2 = seventeen;
                        result3 = "";
                    }
                    if (number % 100 == 18) {
                        result2 = eighteen;
                        result3 = "";
                    }
                    if (number % 100 == 19) {
                        result2 = nineteen;
                        result3 = "";
                    }
                    return result1 + " " + result2 + " " + result3 + cel + finish;
                }
                if (number > 1000 && number < 10000) {
                    if (number / 1000 == 1) {
                        result4 = thousand;
                    }
                    if (number / 1000 == 2) {
                        result4 = twoVS + " " + oligoThousand;
                    }
                    if (number / 1000 == 3) {
                        result4 = three + " " + oligoThousand;
                    }
                    if (number / 1000 == 4) {
                        result4 = four + " " + oligoThousand;
                    }
                    if (number / 1000 == 5) {
                        result4 = five + " " + polyThousand;
                    }
                    if (number / 1000 == 6) {
                        result4 = six + " " + polyThousand;
                    }
                    if (number / 1000 == 7) {
                        result4 = seven + " " + polyThousand;
                    }
                    if (number / 1000 == 8) {
                        result4 = eight + " " + polyThousand;
                    }
                    if (number / 1000 == 9) {
                        result4 = nine + " " + polyThousand;
                    }
                    if (number / 100 % 10 == 1) {
                        result1 = oneHundred;
                    }
                    if (number / 100 % 10 == 2) {
                        result1 = twoHundred;
                    }
                    if (number / 100 % 10 == 3) {
                        result1 = threeHundred;
                    }
                    if (number / 100 % 10 == 4) {
                        result1 = fourHundred;
                    }
                    if (number / 100 % 10 == 5) {
                        result1 = fiveHundred;
                    }
                    if (number / 100 % 10 == 6) {
                        result1 = sixHundred;
                    }
                    if (number / 100 % 10 == 7) {
                        result1 = sevenHundred;
                    }
                    if (number / 100 % 10 == 8) {
                        result1 = eightHundred;
                    }
                    if (number / 100 % 10 == 9) {
                        result1 = nineHundred;
                    }
                    if (number / 10 % 10 == 1) {
                        result2 = ten;
                    }
                    if (number / 10 % 10 == 2) {
                        result2 = twenty;
                    }
                    if (number / 10 % 10 == 3) {
                        result2 = thirty;
                    }
                    if (number / 10 % 10 == 4) {
                        result2 = forty;
                    }
                    if (number / 10 % 10 == 5) {
                        result2 = fifty;
                    }
                    if (number / 10 % 10 == 6) {
                        result2 = sixty;
                    }
                    if (number / 10 % 10 == 7) {
                        result2 = seventy;
                    }
                    if (number / 10 % 10 == 8) {
                        result2 = eighty;
                    }
                    if (number / 10 % 10 == 9) {
                        result2 = ninety;
                    }
                    if (number % 10 == 0) {
                        result3 = "";
                    }
                    if (number % 10 == 1) {
                        result3 = one;
                    }
                    if (number % 10 == 2) {
                        result3 = two;
                    }
                    if (number % 10 == 3) {
                        result3 = three;
                    }
                    if (number % 10 == 4) {
                        result3 = four;
                    }
                    if (number % 10 == 5) {
                        result3 = five;
                    }
                    if (number % 10 == 6) {
                        result3 = six;
                    }
                    if (number % 10 == 7) {
                        result3 = seven;
                    }
                    if (number % 10 == 8) {
                        result3 = eight;
                    }
                    if (number % 10 == 9) {
                        result3 = nine;
                    }
                    if (number % 100 == 11) {
                        result2 = eleven;
                        result3 = "";
                    }
                    if (number % 100 == 12) {
                        result2 = twelve;
                        result3 = "";
                    }
                    if (number % 100 == 13) {
                        result2 = thirteen;
                        result3 = "";
                    }
                    if (number % 100 == 14) {
                        result2 = fourteen;
                        result3 = "";
                    }
                    if (number % 100 == 15) {
                        result2 = fifteen;
                        result3 = "";
                    }
                    if (number % 100 == 16) {
                        result2 = sixteen;
                        result3 = "";
                    }
                    if (number % 100 == 17) {
                        result2 = seventeen;
                        result3 = "";
                    }
                    if (number % 100 == 18) {
                        result2 = eighteen;
                        result3 = "";
                    }
                    if (number % 100 == 19) {
                        result2 = nineteen;
                        result3 = "";
                    }
                    return result4 + " " + result1 + " " + result2 + " " + result3 + cel + finish;

                }
                if (number > 10000 && number < 100000) {
                    if (number / 10000 == 1) {
                        result5 = ten;
                    }
                    if (number / 10000 == 2) {
                        result5 = twenty;
                    }
                    if (number / 10000 == 3) {
                        result5 = thirty;
                    }
                    if (number / 10000 == 4) {
                        result5 = forty;
                    }
                    if (number / 10000 == 5) {
                        result5 = fifty;
                    }
                    if (number / 10000 == 6) {
                        result5 = sixty;
                    }
                    if (number / 10000 == 7) {
                        result5 = seventy;
                    }
                    if (number / 10000 == 8) {
                        result5 = eighty;
                    }
                    if (number / 10000 == 9) {
                        result5 = ninety;
                    }
                    if (number / 1000 % 10 == 0) {
                        result4 = polyThousand;
                    }
                    if (number / 1000 % 10 == 1) {
                        result4 = oneVS + thousand;
                    }
                    if (number / 1000 % 10 == 2) {
                        result4 = twoVS + " " + oligoThousand;
                    }
                    if (number / 1000 % 10 == 3) {
                        result4 = three + " " + oligoThousand;
                    }
                    if (number / 1000 % 10 == 4) {
                        result4 = four + " " + oligoThousand;
                    }
                    if (number / 1000 % 10 == 5) {
                        result4 = five + " " + polyThousand;
                    }
                    if (number / 1000 % 10 == 6) {
                        result4 = six + " " + polyThousand;
                    }
                    if (number / 1000 % 10 == 7) {
                        result4 = seven + " " + polyThousand;
                    }
                    if (number / 1000 % 10 == 8) {
                        result4 = eight + " " + polyThousand;
                    }
                    if (number / 1000 % 10 == 9) {
                        result4 = nine + " " + polyThousand;
                    }
                    if (number / 100 % 10 == 1) {
                        result1 = oneHundred;
                    }
                    if (number / 100 % 10 == 2) {
                        result1 = twoHundred;
                    }
                    if (number / 100 % 10 == 3) {
                        result1 = threeHundred;
                    }
                    if (number / 100 % 10 == 4) {
                        result1 = fourHundred;
                    }
                    if (number / 100 % 10 == 5) {
                        result1 = fiveHundred;
                    }
                    if (number / 100 % 10 == 6) {
                        result1 = sixHundred;
                    }
                    if (number / 100 % 10 == 7) {
                        result1 = sevenHundred;
                    }
                    if (number / 100 % 10 == 8) {
                        result1 = eightHundred;
                    }
                    if (number / 100 % 10 == 9) {
                        result1 = nineHundred;
                    }
                    if (number / 10 % 10 == 1) {
                        result2 = ten;
                    }
                    if (number / 10 % 10 == 2) {
                        result2 = twenty;
                    }
                    if (number / 10 % 10 == 3) {
                        result2 = thirty;
                    }
                    if (number / 10 % 10 == 4) {
                        result2 = forty;
                    }
                    if (number / 10 % 10 == 5) {
                        result2 = fifty;
                    }
                    if (number / 10 % 10 == 6) {
                        result2 = sixty;
                    }
                    if (number / 10 % 10 == 7) {
                        result2 = seventy;
                    }
                    if (number / 10 % 10 == 8) {
                        result2 = eighty;
                    }
                    if (number / 10 % 10 == 9) {
                        result2 = ninety;
                    }
                    if (number % 10 == 0) {
                        result3 = "";
                    }
                    if (number % 10 == 1) {
                        result3 = one;
                    }
                    if (number % 10 == 2) {
                        result3 = two;
                    }
                    if (number % 10 == 3) {
                        result3 = three;
                    }
                    if (number % 10 == 4) {
                        result3 = four;
                    }
                    if (number % 10 == 5) {
                        result3 = five;
                    }
                    if (number % 10 == 6) {
                        result3 = six;
                    }
                    if (number % 10 == 7) {
                        result3 = seven;
                    }
                    if (number % 10 == 8) {
                        result3 = eight;
                    }
                    if (number % 10 == 9) {
                        result3 = nine;
                    }
                    if (number % 100 == 11) {
                        result2 = eleven;
                        result3 = "";
                    }
                    if (number % 100 == 12) {
                        result2 = twelve;
                        result3 = "";
                    }
                    if (number % 100 == 13) {
                        result2 = thirteen;
                        result3 = "";
                    }
                    if (number % 100 == 14) {
                        result2 = fourteen;
                        result3 = "";
                    }
                    if (number % 100 == 15) {
                        result2 = fifteen;
                        result3 = "";
                    }
                    if (number % 100 == 16) {
                        result2 = sixteen;
                        result3 = "";
                    }
                    if (number % 100 == 17) {
                        result2 = seventeen;
                        result3 = "";
                    }
                    if (number % 100 == 18) {
                        result2 = eighteen;
                        result4 = "";
                    }
                    if (number % 100 == 19) {
                        result2 = nineteen;
                        result4 = "";
                    }
                    if (number / 1000 % 100 == 1) {
                        result5 = eleven + " " + polyThousand;
                        result4 = "";
                    }
                    if (number / 1000 % 100 == 12) {
                        result5 = twelve + " " + polyThousand;
                        result4 = "";
                    }
                    if (number / 1000 % 100 == 13) {
                        result5 = thirteen + " " + polyThousand;
                        result4 = "";
                    }
                    if (number / 1000 % 100 == 14) {
                        result5 = fourteen + " " + polyThousand;
                        result4 = "";
                    }
                    if (number / 1000 % 100 == 15) {
                        result5 = fifteen + " " + polyThousand;
                        result4 = "";
                    }
                    if (number / 1000 % 100 == 16) {
                        result5 = sixteen + " " + polyThousand;
                        result3 = "";
                    }
                    if (number / 1000 % 100 == 17) {
                        result5 = seventeen + " " + polyThousand;
                        result4 = "";
                    }
                    if (number / 1000 % 100 == 18) {
                        result5 = eighteen + " " + polyThousand;
                        result4 = "";
                    }
                    if (number / 1000 % 100 == 19) {
                        result5 = nineteen + " " + polyThousand;
                        result4 = "";
                    }
                    return result5 + " " + result4 + " " + result1 + " " + result2 + " " + result3 + cel + finish;
                }
                if (number > 100000 && number < 1000000) {
                    if (number / 100000 == 1) {
                        result6 = oneHundred;
                    }
                    if (number / 100000 == 2) {
                        result6 = twoHundred;
                    }
                    if (number / 100000 == 3) {
                        result6 = threeHundred;
                    }
                    if (number / 100000 == 4) {
                        result6 = fourHundred;
                    }
                    if (number / 100000 == 5) {
                        result6 = fiveHundred;
                    }
                    if (number / 100000 == 6) {
                        result6 = sixHundred;
                    }
                    if (number / 100000 == 7) {
                        result6 = sevenHundred;
                    }
                    if (number / 100000 == 8) {
                        result6 = eightHundred;
                    }
                    if (number / 100000 == 9) {
                        result6 = nineHundred;
                    }
                    if (number / 10000 % 10 == 1) {
                        result5 = ten;
                    }
                    if (number / 10000 % 10 == 2) {
                        result5 = twenty;
                    }
                    if (number / 10000 % 10 == 3) {
                        result5 = thirty;
                    }
                    if (number / 10000 % 10 == 4) {
                        result5 = forty;
                    }
                    if (number / 10000 % 10 == 5) {
                        result5 = fifty;
                    }
                    if (number / 10000 % 10 == 6) {
                        result5 = sixty;
                    }
                    if (number / 10000 % 10 == 7) {
                        result5 = seventy;
                    }
                    if (number / 10000 % 10 == 8) {
                        result5 = eighty;
                    }
                    if (number / 10000 % 10 == 9) {
                        result5 = ninety;
                    }
                    if (number / 1000 % 10 == 0) {
                        result4 = polyThousand;
                    }
                    if (number / 1000 % 10 == 1) {
                        result4 = oneVS + thousand;
                    }
                    if (number / 1000 % 10 == 2) {
                        result4 = twoVS + " " + oligoThousand;
                    }
                    if (number / 1000 % 10 == 3) {
                        result4 = three + " " + oligoThousand;
                    }
                    if (number / 1000 % 10 == 4) {
                        result4 = four + " " + oligoThousand;
                    }
                    if (number / 1000 % 10 == 5) {
                        result4 = five + " " + polyThousand;
                    }
                    if (number / 1000 % 10 == 6) {
                        result4 = six + " " + polyThousand;
                    }
                    if (number / 1000 % 10 == 7) {
                        result4 = seven + " " + polyThousand;
                    }
                    if (number / 1000 % 10 == 8) {
                        result4 = eight + " " + polyThousand;
                    }
                    if (number / 1000 % 10 == 9) {
                        result4 = nine + " " + polyThousand;
                    }
                    if (number / 100 % 10 == 1) {
                        result1 = oneHundred;
                    }
                    if (number / 100 % 10 == 2) {
                        result1 = twoHundred;
                    }
                    if (number / 100 % 10 == 3) {
                        result1 = threeHundred;
                    }
                    if (number / 100 % 10 == 4) {
                        result1 = fourHundred;
                    }
                    if (number / 100 % 10 == 5) {
                        result1 = fiveHundred;
                    }
                    if (number / 100 % 10 == 6) {
                        result1 = sixHundred;
                    }
                    if (number / 100 % 10 == 7) {
                        result1 = sevenHundred;
                    }
                    if (number / 100 % 10 == 8) {
                        result1 = eightHundred;
                    }
                    if (number / 100 % 10 == 9) {
                        result1 = nineHundred;
                    }
                    if (number / 10 % 10 == 1) {
                        result2 = ten;
                    }
                    if (number / 10 % 10 == 2) {
                        result2 = twenty;
                    }
                    if (number / 10 % 10 == 3) {
                        result2 = thirty;
                    }
                    if (number / 10 % 10 == 4) {
                        result2 = forty;
                    }
                    if (number / 10 % 10 == 5) {
                        result2 = fifty;
                    }
                    if (number / 10 % 10 == 6) {
                        result2 = sixty;
                    }
                    if (number / 10 % 10 == 7) {
                        result2 = seventy;
                    }
                    if (number / 10 % 10 == 8) {
                        result2 = eighty;
                    }
                    if (number / 10 % 10 == 9) {
                        result2 = ninety;
                    }
                    if (number % 10 == 0) {
                        result3 = "";
                    }
                    if (number % 10 == 1) {
                        result3 = one;
                    }
                    if (number % 10 == 2) {
                        result3 = two;
                    }
                    if (number % 10 == 3) {
                        result3 = three;
                    }
                    if (number % 10 == 4) {
                        result3 = four;
                    }
                    if (number % 10 == 5) {
                        result3 = five;
                    }
                    if (number % 10 == 6) {
                        result3 = six;
                    }
                    if (number % 10 == 7) {
                        result3 = seven;
                    }
                    if (number % 10 == 8) {
                        result3 = eight;
                    }
                    if (number % 10 == 9) {
                        result3 = nine;
                    }
                    if (number % 100 == 11) {
                        result2 = eleven;
                        result3 = "";
                    }
                    if (number % 100 == 12) {
                        result2 = twelve;
                        result3 = "";
                    }
                    if (number % 100 == 13) {
                        result2 = thirteen;
                        result3 = "";
                    }
                    if (number % 100 == 14) {
                        result2 = fourteen;
                        result3 = "";
                    }
                    if (number % 100 == 15) {
                        result2 = fifteen;
                        result3 = "";
                    }
                    if (number % 100 == 16) {
                        result2 = sixteen;
                        result3 = "";
                    }
                    if (number % 100 == 17) {
                        result2 = seventeen;
                        result3 = "";
                    }
                    if (number % 100 == 18) {
                        result2 = eighteen;
                        result4 = "";
                    }
                    if (number % 100 == 19) {
                        result2 = nineteen;
                        result4 = "";
                    }
                    if (number / 1000 % 100 == 1) {
                        result5 = eleven + " " + polyThousand;
                        result4 = "";
                    }
                    if (number / 1000 % 100 == 12) {
                        result5 = twelve + " " + polyThousand;
                        result4 = "";
                    }
                    if (number / 1000 % 100 == 13) {
                        result5 = thirteen + " " + polyThousand;
                        result4 = "";
                    }
                    if (number / 1000 % 100 == 14) {
                        result5 = fourteen + " " + polyThousand;
                        result4 = "";
                    }
                    if (number / 1000 % 100 == 15) {
                        result5 = fifteen + " " + polyThousand;
                        result4 = "";
                    }
                    if (number / 1000 % 100 == 16) {
                        result5 = sixteen + " " + polyThousand;
                        result3 = "";
                    }
                    if (number / 1000 % 100 == 17) {
                        result5 = seventeen + " " + polyThousand;
                        result4 = "";
                    }
                    if (number / 1000 % 100 == 18) {
                        result5 = eighteen + " " + polyThousand;
                        result4 = "";
                    }
                    if (number / 1000 % 100 == 19) {
                        result5 = nineteen + " " + polyThousand;
                        result4 = "";
                    }
                    return result6 + " " + result5 + " " + result4 + " " + result1 + " "
                            + result2 + " " + result3 + cel + finish;
                }
                if (number > 1000000 && number < 10000000) {
                    if (number / 1000000 == 1) {
                        result7 = one + " " + million;
                    }
                    if (number / 1000000 == 2) {
                        result7 = two + " " + oligoMillion;
                    }
                    if (number / 1000000 == 3) {
                        result7 = three + " " + oligoMillion;
                    }
                    if (number / 1000000 == 4) {
                        result7 = four + " " + oligoMillion;
                    }
                    if (number / 1000000 == 5) {
                        result7 = five + " " + oligoMillion;
                    }
                    if (number / 1000000 == 6) {
                        result7 = six + " " + oligoMillion;
                    }
                    if (number / 1000000 == 7) {
                        result7 = seven + " " + oligoMillion;
                    }
                    if (number / 1000000 == 8) {
                        result7 = eight + " " + oligoMillion;
                    }
                    if (number / 1000000 == 9) {
                        result7 = nine + " " + oligoMillion;
                    }
                    if (number / 100000 % 10 == 1) {
                        result6 = oneHundred;
                    }
                    if (number / 100000 % 10 == 2) {
                        result6 = twoHundred;
                    }
                    if (number / 100000 % 10 == 3) {
                        result6 = threeHundred;
                    }
                    if (number / 100000 % 10 == 4) {
                        result6 = fourHundred;
                    }
                    if (number / 100000 % 10 == 5) {
                        result6 = fiveHundred;
                    }
                    if (number / 100000 % 10 == 6) {
                        result6 = sixHundred;
                    }
                    if (number / 100000 % 10 == 7) {
                        result6 = sevenHundred;
                    }
                    if (number / 100000 % 10 == 8) {
                        result6 = eightHundred;
                    }
                    if (number / 100000 % 10 == 9) {
                        result6 = nineHundred;
                    }
                    if (number / 10000 % 10 == 1) {
                        result5 = ten;
                    }
                    if (number / 10000 % 10 == 2) {
                        result5 = twenty;
                    }
                    if (number / 10000 % 10 == 3) {
                        result5 = thirty;
                    }
                    if (number / 10000 % 10 == 4) {
                        result5 = forty;
                    }
                    if (number / 10000 % 10 == 5) {
                        result5 = fifty;
                    }
                    if (number / 10000 % 10 == 6) {
                        result5 = sixty;
                    }
                    if (number / 10000 % 10 == 7) {
                        result5 = seventy;
                    }
                    if (number / 10000 % 10 == 8) {
                        result5 = eighty;
                    }
                    if (number / 10000 % 10 == 9) {
                        result5 = ninety;
                    }
                    if (number / 1000 % 10 == 0) {
                        result4 = polyThousand;
                    }
                    if (number / 1000 % 10 == 1) {
                        result4 = oneVS + thousand;
                    }
                    if (number / 1000 % 10 == 2) {
                        result4 = twoVS + " " + oligoThousand;
                    }
                    if (number / 1000 % 10 == 3) {
                        result4 = three + " " + oligoThousand;
                    }
                    if (number / 1000 % 10 == 4) {
                        result4 = four + " " + oligoThousand;
                    }
                    if (number / 1000 % 10 == 5) {
                        result4 = five + " " + polyThousand;
                    }
                    if (number / 1000 % 10 == 6) {
                        result4 = six + " " + polyThousand;
                    }
                    if (number / 1000 % 10 == 7) {
                        result4 = seven + " " + polyThousand;
                    }
                    if (number / 1000 % 10 == 8) {
                        result4 = eight + " " + polyThousand;
                    }
                    if (number / 1000 % 10 == 9) {
                        result4 = nine + " " + polyThousand;
                    }
                    if (number / 100 % 10 == 1) {
                        result1 = oneHundred;
                    }
                    if (number / 100 % 10 == 2) {
                        result1 = twoHundred;
                    }
                    if (number / 100 % 10 == 3) {
                        result1 = threeHundred;
                    }
                    if (number / 100 % 10 == 4) {
                        result1 = fourHundred;
                    }
                    if (number / 100 % 10 == 5) {
                        result1 = fiveHundred;
                    }
                    if (number / 100 % 10 == 6) {
                        result1 = sixHundred;
                    }
                    if (number / 100 % 10 == 7) {
                        result1 = sevenHundred;
                    }
                    if (number / 100 % 10 == 8) {
                        result1 = eightHundred;
                    }
                    if (number / 100 % 10 == 9) {
                        result1 = nineHundred;
                    }
                    if (number / 10 % 10 == 1) {
                        result2 = ten;
                    }
                    if (number / 10 % 10 == 2) {
                        result2 = twenty;
                    }
                    if (number / 10 % 10 == 3) {
                        result2 = thirty;
                    }
                    if (number / 10 % 10 == 4) {
                        result2 = forty;
                    }
                    if (number / 10 % 10 == 5) {
                        result2 = fifty;
                    }
                    if (number / 10 % 10 == 6) {
                        result2 = sixty;
                    }
                    if (number / 10 % 10 == 7) {
                        result2 = seventy;
                    }
                    if (number / 10 % 10 == 8) {
                        result2 = eighty;
                    }
                    if (number / 10 % 10 == 9) {
                        result2 = ninety;
                    }
                    if (number % 10 == 0) {
                        result3 = "";
                    }
                    if (number % 10 == 1) {
                        result3 = one;
                    }
                    if (number % 10 == 2) {
                        result3 = two;
                    }
                    if (number % 10 == 3) {
                        result3 = three;
                    }
                    if (number % 10 == 4) {
                        result3 = four;
                    }
                    if (number % 10 == 5) {
                        result3 = five;
                    }
                    if (number % 10 == 6) {
                        result3 = six;
                    }
                    if (number % 10 == 7) {
                        result3 = seven;
                    }
                    if (number % 10 == 8) {
                        result3 = eight;
                    }
                    if (number % 10 == 9) {
                        result3 = nine;
                    }
                    if (number % 100 == 11) {
                        result2 = eleven;
                        result3 = "";
                    }
                    if (number % 100 == 12) {
                        result2 = twelve;
                        result3 = "";
                    }
                    if (number % 100 == 13) {
                        result2 = thirteen;
                        result3 = "";
                    }
                    if (number % 100 == 14) {
                        result2 = fourteen;
                        result3 = "";
                    }
                    if (number % 100 == 15) {
                        result2 = fifteen;
                        result3 = "";
                    }
                    if (number % 100 == 16) {
                        result2 = sixteen;
                        result3 = "";
                    }
                    if (number % 100 == 17) {
                        result2 = seventeen;
                        result3 = "";
                    }
                    if (number % 100 == 18) {
                        result2 = eighteen;
                        result4 = "";
                    }
                    if (number % 100 == 19) {
                        result2 = nineteen;
                        result4 = "";
                    }
                    if (number / 1000 % 100 == 1) {
                        result5 = eleven + " " + polyThousand;
                        result4 = "";
                    }
                    if (number / 1000 % 100 == 12) {
                        result5 = twelve + " " + polyThousand;
                        result4 = "";
                    }
                    if (number / 1000 % 100 == 13) {
                        result5 = thirteen + " " + polyThousand;
                        result4 = "";
                    }
                    if (number / 1000 % 100 == 14) {
                        result5 = fourteen + " " + polyThousand;
                        result4 = "";
                    }
                    if (number / 1000 % 100 == 15) {
                        result5 = fifteen + " " + polyThousand;
                        result4 = "";
                    }
                    if (number / 1000 % 100 == 16) {
                        result5 = sixteen + " " + polyThousand;
                        result3 = "";
                    }
                    if (number / 1000 % 100 == 17) {
                        result5 = seventeen + " " + polyThousand;
                        result4 = "";
                    }
                    if (number / 1000 % 100 == 18) {
                        result5 = eighteen + " " + polyThousand;
                        result4 = "";
                    }
                    if (number / 1000 % 100 == 19) {
                        result5 = nineteen + " " + polyThousand;
                        result4 = "";
                    }
                    return result7 + " " + result6 + " " + result5 + " " + result4
                            + " " + result1 + " " + result2 + " " + result3 + cel + finish;
                }
                if (number > 10000000 && number < 100000000) {
                    if (number / 10000000 == 2) {
                        result8 = twenty + " " + polyMillion;
                    }
                    if (number / 10000000 == 3) {
                        result8 = thirty + " " + polyMillion;
                    }
                    if (number / 10000000 == 4) {
                        result8 = forty + " " + polyMillion;
                    }
                    if (number / 10000000 == 5) {
                        result8 = fifty + " " + polyMillion;
                    }
                    if (number / 10000000 == 6) {
                        result8 = sixty + " " + polyMillion;
                    }
                    if (number / 10000000 == 7) {
                        result8 = seventy + " " + polyMillion;
                    }
                    if (number / 10000000 == 8) {
                        result8 = eighty + " " + polyMillion;
                    }
                    if (number / 10000000 == 9) {
                        result8 = ninety + " " + polyMillion;
                    }
                    if (number / 1000000 % 10 == 0) {
                        result7 = polyMillion;
                    }
                    if (number / 1000000 % 10 == 1) {
                        result7 = one + " " + million;
                    }
                    if (number / 1000000 % 10 == 2) {
                        result7 = two + " " + oligoMillion;
                    }
                    if (number / 1000000 % 10 == 1) {
                        result7 = three + " " + oligoMillion;
                    }
                    if (number / 1000000 % 10 == 1) {
                        result7 = four + " " + oligoMillion;
                    }
                    if (number / 1000000 % 10 == 1) {
                        result7 = five + " " + oligoMillion;
                    }
                    if (number / 1000000 % 10 == 1) {
                        result7 = six + " " + oligoMillion;
                    }
                    if (number / 1000000 % 10 == 1) {
                        result7 = seven + " " + oligoMillion;
                    }
                    if (number / 1000000 % 10 == 1) {
                        result7 = eight + " " + oligoMillion;
                    }
                    if (number / 1000000 % 10 == 1) {
                        result7 = nine + " " + oligoMillion;
                    }
                    if (number / 100000 % 10 == 1) {
                        result6 = oneHundred;
                    }
                    if (number / 100000 % 10 == 2) {
                        result6 = twoHundred;
                    }
                    if (number / 100000 % 10 == 3) {
                        result6 = threeHundred;
                    }
                    if (number / 100000 % 10 == 4) {
                        result6 = fourHundred;
                    }
                    if (number / 100000 % 10 == 5) {
                        result6 = fiveHundred;
                    }
                    if (number / 100000 % 10 == 6) {
                        result6 = sixHundred;
                    }
                    if (number / 100000 % 10 == 7) {
                        result6 = sevenHundred;
                    }
                    if (number / 100000 % 10 == 8) {
                        result6 = eightHundred;
                    }
                    if (number / 100000 % 10 == 9) {
                        result6 = nineHundred;
                    }
                    if (number / 10000 % 10 == 1) {
                        result5 = ten;
                    }
                    if (number / 10000 % 10 == 2) {
                        result5 = twenty;
                    }
                    if (number / 10000 % 10 == 3) {
                        result5 = thirty;
                    }
                    if (number / 10000 % 10 == 4) {
                        result5 = forty;
                    }
                    if (number / 10000 % 10 == 5) {
                        result5 = fifty;
                    }
                    if (number / 10000 % 10 == 6) {
                        result5 = sixty;
                    }
                    if (number / 10000 % 10 == 7) {
                        result5 = seventy;
                    }
                    if (number / 10000 % 10 == 8) {
                        result5 = eighty;
                    }
                    if (number / 10000 % 10 == 9) {
                        result5 = ninety;
                    }
                    if (number / 1000 % 10 == 0) {
                        result4 = polyThousand;
                    }
                    if (number / 1000 % 10 == 1) {
                        result4 = oneVS + thousand;
                    }
                    if (number / 1000 % 10 == 2) {
                        result4 = twoVS + " " + oligoThousand;
                    }
                    if (number / 1000 % 10 == 3) {
                        result4 = three + " " + oligoThousand;
                    }
                    if (number / 1000 % 10 == 4) {
                        result4 = four + " " + oligoThousand;
                    }
                    if (number / 1000 % 10 == 5) {
                        result4 = five + " " + polyThousand;
                    }
                    if (number / 1000 % 10 == 6) {
                        result4 = six + " " + polyThousand;
                    }
                    if (number / 1000 % 10 == 7) {
                        result4 = seven + " " + polyThousand;
                    }
                    if (number / 1000 % 10 == 8) {
                        result4 = eight + " " + polyThousand;
                    }
                    if (number / 1000 % 10 == 9) {
                        result4 = nine + " " + polyThousand;
                    }
                    if (number / 100 % 10 == 1) {
                        result1 = oneHundred;
                    }
                    if (number / 100 % 10 == 2) {
                        result1 = twoHundred;
                    }
                    if (number / 100 % 10 == 3) {
                        result1 = threeHundred;
                    }
                    if (number / 100 % 10 == 4) {
                        result1 = fourHundred;
                    }
                    if (number / 100 % 10 == 5) {
                        result1 = fiveHundred;
                    }
                    if (number / 100 % 10 == 6) {
                        result1 = sixHundred;
                    }
                    if (number / 100 % 10 == 7) {
                        result1 = sevenHundred;
                    }
                    if (number / 100 % 10 == 8) {
                        result1 = eightHundred;
                    }
                    if (number / 100 % 10 == 9) {
                        result1 = nineHundred;
                    }
                    if (number / 10 % 10 == 1) {
                        result2 = ten;
                    }
                    if (number / 10 % 10 == 2) {
                        result2 = twenty;
                    }
                    if (number / 10 % 10 == 3) {
                        result2 = thirty;
                    }
                    if (number / 10 % 10 == 4) {
                        result2 = forty;
                    }
                    if (number / 10 % 10 == 5) {
                        result2 = fifty;
                    }
                    if (number / 10 % 10 == 6) {
                        result2 = sixty;
                    }
                    if (number / 10 % 10 == 7) {
                        result2 = seventy;
                    }
                    if (number / 10 % 10 == 8) {
                        result2 = eighty;
                    }
                    if (number / 10 % 10 == 9) {
                        result2 = ninety;
                    }
                    if (number % 10 == 0) {
                        result3 = "";
                    }
                    if (number % 10 == 1) {
                        result3 = one;
                    }
                    if (number % 10 == 2) {
                        result3 = two;
                    }
                    if (number % 10 == 3) {
                        result3 = three;
                    }
                    if (number % 10 == 4) {
                        result3 = four;
                    }
                    if (number % 10 == 5) {
                        result3 = five;
                    }
                    if (number % 10 == 6) {
                        result3 = six;
                    }
                    if (number % 10 == 7) {
                        result3 = seven;
                    }
                    if (number % 10 == 8) {
                        result3 = eight;
                    }
                    if (number % 10 == 9) {
                        result3 = nine;
                    }
                    if (number % 100 == 11) {
                        result2 = eleven;
                        result3 = "";
                    }
                    if (number % 100 == 12) {
                        result2 = twelve;
                        result3 = "";
                    }
                    if (number % 100 == 13) {
                        result2 = thirteen;
                        result3 = "";
                    }
                    if (number % 100 == 14) {
                        result2 = fourteen;
                        result3 = "";
                    }
                    if (number % 100 == 15) {
                        result2 = fifteen;
                        result3 = "";
                    }
                    if (number % 100 == 16) {
                        result2 = sixteen;
                        result3 = "";
                    }
                    if (number % 100 == 17) {
                        result2 = seventeen;
                        result3 = "";
                    }
                    if (number % 100 == 18) {
                        result2 = eighteen;
                        result4 = "";
                    }
                    if (number % 100 == 19) {
                        result2 = nineteen;
                        result4 = "";
                    }
                    if (number / 1000 % 100 == 1) {
                        result5 = eleven + " " + polyThousand;
                        result4 = "";
                    }
                    if (number / 1000 % 100 == 12) {
                        result5 = twelve + " " + polyThousand;
                        result4 = "";
                    }
                    if (number / 1000 % 100 == 13) {
                        result5 = thirteen + " " + polyThousand;
                        result4 = "";
                    }
                    if (number / 1000 % 100 == 14) {
                        result5 = fourteen + " " + polyThousand;
                        result4 = "";
                    }
                    if (number / 1000 % 100 == 15) {
                        result5 = fifteen + " " + polyThousand;
                        result4 = "";
                    }
                    if (number / 1000 % 100 == 16) {
                        result5 = sixteen + " " + polyThousand;
                        result3 = "";
                    }
                    if (number / 1000 % 100 == 17) {
                        result5 = seventeen + " " + polyThousand;
                        result4 = "";
                    }
                    if (number / 1000 % 100 == 18) {
                        result5 = eighteen + " " + polyThousand;
                        result4 = "";
                    }
                    if (number / 1000 % 100 == 19) {
                        result5 = nineteen + " " + polyThousand;
                        result4 = "";
                    }
                    if (number / 1000000 % 100 == 11) {
                        result8 = eleven + " " + polyMillion;
                        result7 = "";
                    }
                    if (number / 1000000 % 100 == 12) {
                        result8 = twelve + " " + polyMillion;
                        result7 = "";
                    }
                    if (number / 1000000 % 100 == 13) {
                        result8 = thirteen + " " + polyMillion;
                        result7 = "";
                    }
                    if (number / 1000000 % 100 == 14) {
                        result8 = fourteen + " " + polyMillion;
                        result7 = "";
                    }
                    if (number / 1000000 % 100 == 15) {
                        result8 = fifteen + " " + polyMillion;
                        result7 = "";
                    }
                    if (number / 1000000 % 100 == 16) {
                        result8 = sixteen + " " + polyMillion;
                        result7 = "";
                    }
                    if (number / 1000000 % 100 == 17) {
                        result8 = seventeen + " " + polyMillion;
                        result7 = "";
                    }
                    if (number / 1000000 % 100 == 18) {
                        result8 = eighteen + " " + polyMillion;
                        result7 = "";
                    }
                    if (number / 1000000 % 100 == 19) {
                        result8 = nineteen + " " + polyMillion;
                        result7 = "";
                    }
                    return result8 + " " + result7 + " " + result6 + " " + result5 + " "
                            + result4 + " " + result1 + " " + result2 + " " + result3 + cel + finish;
                }
                if (number > 100000000 && number < 1000000000) {
                    if (number / 100000000 == 1) {
                        result9 = oneHundred;
                    }
                    if (number / 100000000 == 2) {
                        result9 = twoHundred;
                    }
                    if (number / 100000000 == 3) {
                        result9 = threeHundred;
                    }
                    if (number / 100000000 == 4) {
                        result9 = fourHundred;
                    }
                    if (number / 100000000 == 5) {
                        result9 = fiveHundred;
                    }
                    if (number / 100000000 == 6) {
                        result9 = sixHundred;
                    }
                    if (number / 100000000 == 7) {
                        result9 = sevenHundred;
                    }
                    if (number / 100000000 == 8) {
                        result9 = eightHundred;
                    }
                    if (number / 100000000 == 9) {
                        result9 = nineHundred;
                    }
                    if (number / 10000000 % 10 == 2) {
                        result8 = twenty;
                    }
                    if (number / 10000000 % 10 == 3) {
                        result8 = thirty;
                    }
                    if (number / 10000000 % 10 == 4) {
                        result8 = forty;
                    }
                    if (number / 10000000 % 10 == 5) {
                        result8 = fifty;
                    }
                    if (number / 10000000 % 10 == 6) {
                        result8 = sixty;
                    }
                    if (number / 10000000 % 10 == 7) {
                        result8 = seventy;
                    }
                    if (number / 10000000 % 10 == 8) {
                        result8 = eighty;
                    }
                    if (number / 10000000 % 10 == 9) {
                        result8 = ninety;
                    }
                    if (number / 1000000 % 10 == 0) {
                        result7 = polyMillion;
                    }
                    if (number / 1000000 % 10 == 1) {
                        result7 = one + " " + million;
                    }
                    if (number / 1000000 % 10 == 2) {
                        result7 = two + " " + oligoMillion;
                    }
                    if (number / 1000000 % 10 == 3) {
                        result7 = three + " " + oligoMillion;
                    }
                    if (number / 1000000 % 10 == 4) {
                        result7 = four + " " + oligoMillion;
                    }
                    if (number / 1000000 % 10 == 5) {
                        result7 = five + " " + polyMillion;
                    }
                    if (number / 1000000 % 10 == 6) {
                        result7 = six + " " + polyMillion;
                    }
                    if (number / 1000000 % 10 == 7) {
                        result7 = seven + " " + polyMillion;
                    }
                    if (number / 1000000 % 10 == 8) {
                        result7 = eight + " " + polyMillion;
                    }
                    if (number / 1000000 % 10 == 9) {
                        result7 = nine + " " + polyMillion;
                    }
                    if (number / 100000 % 10 == 1) {
                        result6 = oneHundred;
                    }
                    if (number / 100000 % 10 == 2) {
                        result6 = twoHundred;
                    }
                    if (number / 100000 % 10 == 3) {
                        result6 = threeHundred;
                    }
                    if (number / 100000 % 10 == 4) {
                        result6 = fourHundred;
                    }
                    if (number / 100000 % 10 == 5) {
                        result6 = fiveHundred;
                    }
                    if (number / 100000 % 10 == 6) {
                        result6 = sixHundred;
                    }
                    if (number / 100000 % 10 == 7) {
                        result6 = sevenHundred;
                    }
                    if (number / 100000 % 10 == 8) {
                        result6 = eightHundred;
                    }
                    if (number / 100000 % 10 == 9) {
                        result6 = nineHundred;
                    }
                    if (number / 10000 % 10 == 1) {
                        result5 = ten;
                    }
                    if (number / 10000 % 10 == 2) {
                        result5 = twenty;
                    }
                    if (number / 10000 % 10 == 3) {
                        result5 = thirty;
                    }
                    if (number / 10000 % 10 == 4) {
                        result5 = forty;
                    }
                    if (number / 10000 % 10 == 5) {
                        result5 = fifty;
                    }
                    if (number / 10000 % 10 == 6) {
                        result5 = sixty;
                    }
                    if (number / 10000 % 10 == 7) {
                        result5 = seventy;
                    }
                    if (number / 10000 % 10 == 8) {
                        result5 = eighty;
                    }
                    if (number / 10000 % 10 == 9) {
                        result5 = ninety;
                    }
                    if (number / 1000 % 10 == 0) {
                        result4 = polyThousand;
                    }
                    if (number / 1000 % 10 == 1) {
                        result4 = oneVS + thousand;
                    }
                    if (number / 1000 % 10 == 2) {
                        result4 = twoVS + " " + oligoThousand;
                    }
                    if (number / 1000 % 10 == 3) {
                        result4 = three + " " + oligoThousand;
                    }
                    if (number / 1000 % 10 == 4) {
                        result4 = four + " " + oligoThousand;
                    }
                    if (number / 1000 % 10 == 5) {
                        result4 = five + " " + polyThousand;
                    }
                    if (number / 1000 % 10 == 6) {
                        result4 = six + " " + polyThousand;
                    }
                    if (number / 1000 % 10 == 7) {
                        result4 = seven + " " + polyThousand;
                    }
                    if (number / 1000 % 10 == 8) {
                        result4 = eight + " " + polyThousand;
                    }
                    if (number / 1000 % 10 == 9) {
                        result4 = nine + " " + polyThousand;
                    }
                    if (number / 100 % 10 == 1) {
                        result1 = oneHundred;
                    }
                    if (number / 100 % 10 == 2) {
                        result1 = twoHundred;
                    }
                    if (number / 100 % 10 == 3) {
                        result1 = threeHundred;
                    }
                    if (number / 100 % 10 == 4) {
                        result1 = fourHundred;
                    }
                    if (number / 100 % 10 == 5) {
                        result1 = fiveHundred;
                    }
                    if (number / 100 % 10 == 6) {
                        result1 = sixHundred;
                    }
                    if (number / 100 % 10 == 7) {
                        result1 = sevenHundred;
                    }
                    if (number / 100 % 10 == 8) {
                        result1 = eightHundred;
                    }
                    if (number / 100 % 10 == 9) {
                        result1 = nineHundred;
                    }
                    if (number / 10 % 10 == 1) {
                        result2 = ten;
                    }
                    if (number / 10 % 10 == 2) {
                        result2 = twenty;
                    }
                    if (number / 10 % 10 == 3) {
                        result2 = thirty;
                    }
                    if (number / 10 % 10 == 4) {
                        result2 = forty;
                    }
                    if (number / 10 % 10 == 5) {
                        result2 = fifty;
                    }
                    if (number / 10 % 10 == 6) {
                        result2 = sixty;
                    }
                    if (number / 10 % 10 == 7) {
                        result2 = seventy;
                    }
                    if (number / 10 % 10 == 8) {
                        result2 = eighty;
                    }
                    if (number / 10 % 10 == 9) {
                        result2 = ninety;
                    }
                    if (number % 10 == 0) {
                        result3 = "";
                    }
                    if (number % 10 == 1) {
                        result3 = one;
                    }
                    if (number % 10 == 2) {
                        result3 = two;
                    }
                    if (number % 10 == 3) {
                        result3 = three;
                    }
                    if (number % 10 == 4) {
                        result3 = four;
                    }
                    if (number % 10 == 5) {
                        result3 = five;
                    }
                    if (number % 10 == 6) {
                        result3 = six;
                    }
                    if (number % 10 == 7) {
                        result3 = seven;
                    }
                    if (number % 10 == 8) {
                        result3 = eight;
                    }
                    if (number % 10 == 9) {
                        result3 = nine;
                    }
                    if (number % 100 == 11) {
                        result2 = eleven;
                        result3 = "";
                    }
                    if (number % 100 == 12) {
                        result2 = twelve;
                        result3 = "";
                    }
                    if (number % 100 == 13) {
                        result2 = thirteen;
                        result3 = "";
                    }
                    if (number % 100 == 14) {
                        result2 = fourteen;
                        result3 = "";
                    }
                    if (number % 100 == 15) {
                        result2 = fifteen;
                        result3 = "";
                    }
                    if (number % 100 == 16) {
                        result2 = sixteen;
                        result3 = "";
                    }
                    if (number % 100 == 17) {
                        result2 = seventeen;
                        result3 = "";
                    }
                    if (number % 100 == 18) {
                        result2 = eighteen;
                        result4 = "";
                    }
                    if (number % 100 == 19) {
                        result2 = nineteen;
                        result4 = "";
                    }
                    if (number / 1000 % 100 == 1) {
                        result5 = eleven + " " + polyThousand;
                        result4 = "";
                    }
                    if (number / 1000 % 100 == 12) {
                        result5 = twelve + " " + polyThousand;
                        result4 = "";
                    }
                    if (number / 1000 % 100 == 13) {
                        result5 = thirteen + " " + polyThousand;
                        result4 = "";
                    }
                    if (number / 1000 % 100 == 14) {
                        result5 = fourteen + " " + polyThousand;
                        result4 = "";
                    }
                    if (number / 1000 % 100 == 15) {
                        result5 = fifteen + " " + polyThousand;
                        result4 = "";
                    }
                    if (number / 1000 % 100 == 16) {
                        result5 = sixteen + " " + polyThousand;
                        result3 = "";
                    }
                    if (number / 1000 % 100 == 17) {
                        result5 = seventeen + " " + polyThousand;
                        result4 = "";
                    }
                    if (number / 1000 % 100 == 18) {
                        result5 = eighteen + " " + polyThousand;
                        result4 = "";
                    }
                    if (number / 1000 % 100 == 19) {
                        result5 = nineteen + " " + polyThousand;
                        result4 = "";
                    }
                    if (number / 1000000 % 100 == 11) {
                        result8 = eleven + " " + polyMillion;
                        result7 = "";
                    }
                    if (number / 1000000 % 100 == 12) {
                        result8 = twelve + " " + polyMillion;
                        result7 = "";
                    }
                    if (number / 1000000 % 100 == 13) {
                        result8 = thirteen + " " + polyMillion;
                        result7 = "";
                    }
                    if (number / 1000000 % 100 == 14) {
                        result8 = fourteen + " " + polyMillion;
                        result7 = "";
                    }
                    if (number / 1000000 % 100 == 15) {
                        result8 = fifteen + " " + polyMillion;
                        result7 = "";
                    }
                    if (number / 1000000 % 100 == 16) {
                        result8 = sixteen + " " + polyMillion;
                        result7 = "";
                    }
                    if (number / 1000000 % 100 == 17) {
                        result8 = seventeen + " " + polyMillion;
                        result7 = "";
                    }
                    if (number / 1000000 % 100 == 18) {
                        result8 = eighteen + " " + polyMillion;
                        result7 = "";
                    }
                    if (number / 1000000 % 100 == 19) {
                        result8 = nineteen + " " + polyMillion;
                        result7 = "";
                    }
                    return result9 + " " + result8 + " " + result7 + " " + result6 + " "
                            + result5 + " " + result4 + " " + result1 + " "
                            + result2 + " " + result3 + cel + finish;
                }
            }
            return "fuck";
        }
    }



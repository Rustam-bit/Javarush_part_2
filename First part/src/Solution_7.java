package src;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_7 {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        hen.getCountOfEggsPerMonth();
    }

    static class HenFactory {

        static Hen getHen(String country) {
            Hen hen = null;
            if (country == Country.BELARUS) {
                return new BelarusianHen();
            } else if (country == Country.MOLDOVA) {
                return new MoldovanHen();
            } else if (country == Country.RUSSIA) {
                return new RussianHen();
            } else if (country == Country.UKRAINE) {
                return new UkrainianHen();
            }
            //напишите тут ваш код
            return hen;
        }
    }

    static abstract class Hen {
        abstract int getCountOfEggsPerMonth();

        String getDescription() {
            return "Я - курица.";
        }
    }

    static class RussianHen extends Hen {

        @Override
        int getCountOfEggsPerMonth() {
            return 9;
        }

        @Override
        String getDescription() {
            return super.getDescription() + "Моя страна - " + Country.RUSSIA +
                    ". Я несу " + this.getCountOfEggsPerMonth() + " яиц в месяц.";
        }
    }

    static class UkrainianHen extends Hen {

        @Override
        int getCountOfEggsPerMonth() {
            return 9;
        }

        @Override
        String getDescription() {
            return super.getDescription() + "Моя страна - " + Country.RUSSIA +
                    ". Я несу " + this.getCountOfEggsPerMonth() + " яиц в месяц.";
        }
    }

    static class MoldovanHen extends Hen {

        @Override
        int getCountOfEggsPerMonth() {
            return 10;
        }

        @Override
        String getDescription() {
            return super.getDescription() + "Моя страна - " + Country.RUSSIA +
                    ". Я несу " + this.getCountOfEggsPerMonth() + " яиц в месяц.";
        }
    }

    static class BelarusianHen extends Hen {

        @Override
        int getCountOfEggsPerMonth() {
            return 11;
        }

        @Override
        String getDescription() {
            return super.getDescription() + "Моя страна - " + Country.RUSSIA +
                    ". Я несу " + this.getCountOfEggsPerMonth() + " яиц в месяц.";
        }
    }

}
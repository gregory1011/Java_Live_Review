package week03_ifStmts_switch_ternary;

public class Books {
    public static void main(String[] args) {

        String genre ="Short Story";
        int pageLength= 0, profit= 0, sequels= 0, countries =0;
        boolean isValid = true;

        switch (genre){
            case " Fantasy":
                pageLength = 500;
                profit =1_000_000;
                sequels = 5;
                countries = 50;
                break;
            case"Detective":
                pageLength = 350;
                profit =700_000;
                sequels = 3;
                countries = 45;
                break;
            case"Science Fiction":
                pageLength = 720;
                profit =900_000;
                sequels = 4;
                countries = 30;
                break;
            case"Short Story" :
                pageLength = 150;
                profit =300_000;
                sequels = 4;
                countries = 30;
                break;

            default:
                isValid = false;
            break;

        }
        String message = "Correct";
    }
}

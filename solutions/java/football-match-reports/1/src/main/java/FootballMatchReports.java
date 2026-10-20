public class FootballMatchReports {    
    public static String onField(int shirtNum) {
        if (shirtNum == 1){
            return "golie";
        }
        if (shirtNum == 2){
            return "left back";
        }
        if (shirtNum == 3 || shirtNum == 4){
            return "center back";
        }
        if (shirtNum == 5){
            return "right back";
        }
    }
}

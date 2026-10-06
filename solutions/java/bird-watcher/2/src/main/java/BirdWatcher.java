
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static int[] getLastWeek() {

        return new int[] {0, 2, 5, 3, 7, 8, 4};
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length -1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1]++;
    }

    public boolean hasDayWithoutBirds() {
        for (int birds : birdsPerDay) {
            if (birds == 0) {
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int birds = 0;
        int limite = Math.min(numberOfDays, birdsPerDay.length);
        for(int i = 0; i < limite; i++){
            birds += birdsPerDay[i];
        }
        return birds;
    }

    public int getBusyDays() {
        int diasConcurridos = 0;
        for(int birds : birdsPerDay){
            if(birds >= 5){
                diasConcurridos++;
            }
        }
        return diasConcurridos;
    }
}

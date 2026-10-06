public class SalaryCalculator {
    public double salaryMultiplier(double daysSkipped) {
        return daysSkipped >= 5 ? 0.85 : 1;
    }

    public int bonusMultiplier(int productsSold) {
        return productsSold >= 20 ? 15 : 10;
    }

    public double bonusForProductsSold(int productsSold) {
        int bonus = bonusMultiplier(productsSold);

        return bonus * productsSold;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double salaryMultiplier = salaryMultiplier(daysSkipped);
        double bonus = bonusForProductsSold(daysSkipped);

    }
}

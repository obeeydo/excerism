import java.time.LocalDate;
import java.time.LocalDateTime;

class AppointmentScheduler {
    public LocalDateTime schedule(String appointmentDateDescription) {
        LocalDateTime datetime = LocalDateTime.of(2019, 7, 25, 13, 45, 0);
        return datetime;
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        AppointmentScheduler scheduler = new AppointmentScheduler();
        scheduler.hasPassed(LocalDateTime.of(1999, 12, 31, 9, 0, 0));

    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        throw new UnsupportedOperationException("Please implement the AppointmentScheduler.isAfternoonAppointment() method");
    }

    public String getDescription(LocalDateTime appointmentDate) {
        throw new UnsupportedOperationException("Please implement the AppointmentScheduler.getDescription() method");
    }

    public LocalDate getAnniversaryDate() {
        throw new UnsupportedOperationException("Please implement the AppointmentScheduler.getAnniversaryDate() method");
    }
}

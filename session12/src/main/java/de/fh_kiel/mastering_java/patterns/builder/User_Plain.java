package de.fh_kiel.mastering_java.patterns.builder;

import java.time.LocalDate;
import java.time.LocalDateTime;

class User_Plain {

    private final String lastName;
    private final String firstName;
    private final LocalDate dob;

    private String password;
    private boolean admin;
    private boolean married;
    private boolean active;
    private LocalDateTime registered;

    public User_Plain(String lastName, String firstName, LocalDate dob) {
        this(lastName, firstName, null, false, false, false, dob, null);
    }

    public User_Plain(String lastName, String firstName, String password, boolean admin) {
        this(lastName, firstName, password, admin, false, false, null, null);
    }

    public User_Plain(String lastName, String firstName, String password, boolean admin,
                      boolean married, boolean active, LocalDate dob, LocalDateTime registered) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.password = password;
        this.admin = admin;
        this.married = married;
        this.active = active;
        this.dob = dob;
        this.registered = registered;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public LocalDate getDob() {
        return dob;
    }

    public LocalDateTime getRegistered() {
        return registered;
    }

    public void setRegistered(LocalDateTime registered) {
        this.registered = registered;
    }
}

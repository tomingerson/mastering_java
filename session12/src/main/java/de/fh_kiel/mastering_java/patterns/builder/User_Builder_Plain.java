package de.fh_kiel.mastering_java.patterns.builder;

import java.time.LocalDate;
import java.time.LocalDateTime;

class User_Builder_Plain {

    private final String lastName;
    private final String firstName;
    private final LocalDate dob;

    private String password;
    private boolean admin;
    private boolean married;
    private boolean active;
    private LocalDateTime registered;

    private User_Builder_Plain(final String lastName, final String firstName,
                               final LocalDate dob) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.dob = dob;
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

    interface UserBuilder {
        User_Builder_Plain build();

        UserBuilder setPassword(final String password);

        UserBuilder setAdmin(final boolean admin);

        UserBuilder setMarried(final boolean married);

        UserBuilder setActive(final boolean active);

        UserBuilder setRegistered(final LocalDateTime registered);
    }

    static class UserBuilderImpl implements UserBuilder {

        private final User_Builder_Plain user;

        UserBuilderImpl(final String lastName, final String firstName, final LocalDate dob) {
            verify(lastName, firstName, dob);
            user = new User_Builder_Plain(lastName, firstName, dob);
        }

        private void verify(final String lastName, final String firstName,
                      final LocalDate dob) {
            StringBuilder sb = new StringBuilder();
            if (lastName == null) {
                sb.append(" ! lastname must be set ! ");
            }
            if (firstName == null) {
                sb.append(" ! firstname must be set ! ");
            }
            if (dob == null) {
                sb.append(" ! date of birth must be set ! ");
            }
            if (sb.length() > 0) {
                throw new IllegalArgumentException(sb.toString());
            }
        }

        @Override
        public User_Builder_Plain build() {
            return user;
        }

        @Override
        public UserBuilder setPassword(final String password) {
            user.setPassword(password);
            return this;
        }

        @Override
        public UserBuilder setAdmin(final boolean admin) {
            user.setAdmin(admin);
            return this;
        }

        @Override
        public UserBuilder setMarried(final boolean married) {
            user.setMarried(married);
            return this;
        }

        @Override
        public UserBuilder setActive(final boolean active) {
            user.setActive(active);
            return this;
        }

        @Override
        public UserBuilder setRegistered(final LocalDateTime registered) {
            user.setRegistered(registered);
            return this;
        }
    }
}

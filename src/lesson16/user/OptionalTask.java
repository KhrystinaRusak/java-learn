package lesson16.user;

import lesson16.User;

import java.util.Optional;

public class OptionalTask {
    public static void main(String[] args) {
        printValidNameInUpperCase(new User());
        printValidNameInUpperCase(null);
        // printValidNameInUpperCase('Murph');
    }

    private static void printValidNameInUpperCase(User user) {
        Optional.ofNullable(user)
                //.map(u -> user.getName());
                .map(User::getName)
                .orElseThrow();
    }
}

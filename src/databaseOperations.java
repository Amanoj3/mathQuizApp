public interface databaseOperations { //note to self: prevent SQL-injections

    default boolean isValidInput(String usernameOrPassword) {
        String regex = "^[a-zA-Z0-9]{3,20}$"; // only allows alphanumeric chars (3-20 chars)
        return usernameOrPassword.matches(regex);
    }

    default void createUser(String username, String password, String confirmPassword) {

    }
    default void login(String username, String password) {

    }
}

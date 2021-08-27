public interface databaseOperations { //note to self: prevent SQL-injections
    default void createUser(String username, String password, String confirmPassword) {

    }
    default void login(String username, String password) {

    }
}

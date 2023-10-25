public class LogIn {
    public void log (User user) {
        System.out.println("Has access to the website");
        insertUserInDatabase(user);
        // Logic
    }
    public void insertUserInDatabase(User user){
        // Insert user in database
    }
}

//Liskov substitution: LogInAdmin no implementa insertUserInDatabase de la clase LogIn
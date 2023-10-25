public class LogInAdmin extends LogIn {
    private boolean userIsAdmin;
    @Override
    public void log (User user) {
        this.userIsAdmin = verifyIfTheUserIsAdmin(user);
        if(!userIsAdmin){
            return;
        }
        System.out.println("Has access to the website in admin mode");
        // Logic
    }
    private boolean verifyIfTheUserIsAdmin(User user){
        // Do something
        return true;
    }

    @Override
    public void insertUserInDatabase(User user){
        // Insert user in database
    }
}

//Liskov substitution: LogInAdmin no implementa insertUserInDatabase de la clase LogIn

Solución
public class LogInAdmin2 extends LogIn {
    private boolean userIsAdmin;
    @Override
    public void log (User user) {
        this.userIsAdmin = verifyIfTheUserIsAdmin(user);
        if(!userIsAdmin){
            return;
        }
        System.out.println("Has access to the website in admin mode");
        // Logic
    }
    private boolean verifyIfTheUserIsAdmin(User user){
        // Do something
        return true;
    }

    @Override
    public void insertUserInDatabase(User user){
        // Insert user in database
    }
}
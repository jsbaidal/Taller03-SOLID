public class MySQL {
    public void insert(String statement){}
    public void select(String statement){}
    public void delete(String statement){}
    public void update(String statement){}
    // More Methods
}

// Single Responsibility: La clase se encarga de demasiadas cosas distintas a la vez
// Open-Closed: La clase debe ser modificada para contener más métodos relacionados
// Solución

    public class MySQLinsert {
        public void insert(String statement){}
    }

    public class MySQLselect {
        public void select(String statement){}
    }

    public class MySQLdelete {
        public void delete(String statement){}
    }

    public class MySQLupdate {
        public void update(String statement){}
    }

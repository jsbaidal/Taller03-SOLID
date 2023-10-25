public class CloudServicePlatform {
    private int cloudServicePlatform;
    public void hostingTo (AppWeb app) {
        if (cloudServicePlatform==1) {
            System.out.println("Connect to AWS");
            // Logic
        }if (cloudServicePlatform==2) {
            System.out.println("Connect to Microsoft Azure");
            // Logic
        }else{
            System.out.println("Connect to Google Cloud");
            // Logic
        }
    }
    // More Methods
}

//Open-Closed: La clase CloudServicePlatform necesitaría ser extendida en case de haber más bases de datos relacionales.
//Solución: De esta forma cada vez que se requiera de una nueva base de datos relacional solamente hay que agregar una nueva clase.
public interface hostingTo {
    void hostingTo () {}
}

public class CloudServicePlatform{
    protected hostingTo hostingTo;
    protected Appweb app;

    public CloudServicePlatform (hostingTo hostingTo, Appweb app) {
        this.hostingTo = hostingTo;
        this.app = app;
    }

    public void hosting () {
        this.hostingTo.hostingTo(this.app);
    }
}

public class ConnectToAWS implements hostingTo {
    public void hostingTo (AppWeb app) {
        System.out.println("Connect to AWS");
        // Logic
    }
}

public class ConnectToMicrosoftAzure implements hostingTo {
    public void hostingTo (AppWeb app) {
        System.out.println("Connect to Microsoft Azure");
        // Logic
    }
}

public class ConnectToGoogleCloud implements hostingTo {
    public void hostingTo (AppWeb app) {
        System.out.println("Connect to Google Cloud");
        // Logic
    }
}
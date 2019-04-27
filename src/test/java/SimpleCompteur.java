import java.util.concurrent.atomic.AtomicInteger;

public class SimpleCompteur {

    private  static AtomicInteger compte =  new AtomicInteger(0) ;

    public  static  int getCompte() {
        return compte.intValue() ;
    }

    public  void compte() {
        compte.incrementAndGet() ;
    }
}

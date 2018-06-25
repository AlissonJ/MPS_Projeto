package business.control;

public class SenhaException extends Exception {
    public SenhaException(){
        super("A senha digitada � invalida!");
    }

    public SenhaException(String msg){
        super(msg);
    }
}

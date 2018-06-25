package infra;

public class InfraException extends Exception {

    public InfraException(){
        super("Erro na manipulacao do arquivo");
    }

    public InfraException(String msg){
        super(msg);
    }
}

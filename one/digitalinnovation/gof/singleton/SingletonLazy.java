package one.digitalinnovation.gof.singleton;

public class SingletonLazy {
	public static SingletonLazy instancia;

    private SingletonLazy(){
        super();

}

    public static SingletonLazy getInstance(){
        if(instancia==null){
            instancia =  new SingletonLazy();
        }
        return instancia;

}

}



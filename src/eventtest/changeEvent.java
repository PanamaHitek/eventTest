package eventtest;

import java.util.EventObject;
//Se crea una clase que herede a EventObject

public class changeEvent extends EventObject {

    Empresa empresa;

    public changeEvent(Object source, Empresa _empresa) {
        super(source);
        empresa = _empresa;
    }
}

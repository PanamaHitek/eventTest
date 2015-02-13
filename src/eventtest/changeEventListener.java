package eventtest;

import java.util.EventListener;

/*Se crea una interface que contenga los métodos abstractos que se dispararán cuando 
 suceda algún evento
 */
public interface changeEventListener extends EventListener {

    //Método que se disparará cuando se produzca un cambio en el ID
    public abstract void onIDChange(changeEvent ev);

    //Método que se disparará cuando se produzca un cambio en el Nombre
    public abstract void onNameChange(changeEvent ev);

    //Método que se disparará cuando se produzca un cambio en el Apellido
    public abstract void onLastNameChange(changeEvent ev);

    //Método que se disparará cuando se produzca un cambio en la edad
    public abstract void onAgeChange(changeEvent ev);

    //Método que se disparará cuando se produzca un cambio en la empresa
    public abstract void onBusinessChange(changeEvent ev);

}

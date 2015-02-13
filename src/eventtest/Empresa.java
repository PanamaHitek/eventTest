package eventtest;

import java.util.ArrayList;
import java.util.ListIterator;

public class Empresa {

    //Variables de la clase Empresa
    private String ID;
    private String Nombre;
    private String Apellido;
    private int Edad;
    private String Empresa;

    //Lista de manejadores de eventos
    private static ArrayList listeners;

    public Empresa(String _ID, String _Nombre, String _Apellido, int _Edad, String _Empresa) {
        ID = _ID;
        Nombre = _Nombre;
        Apellido = _Apellido;
        Edad = _Edad;
        Empresa = _Empresa;

        listeners = new ArrayList();
    }

    //Se agregan manejadores de eventos
    public void addEventListener(changeEventListener listener) {
        listeners.add(listener);
    }

    //Método de disparo del evento onNameChange
    private void triggerNameEvent() {

        ListIterator li = listeners.listIterator();
        while (li.hasNext()) {
            changeEventListener listener = (changeEventListener) li.next();
            changeEvent readerEvObj = new changeEvent(this, this);
            (listener).onNameChange(readerEvObj);
        }
    }

    //Método de disparo del evento onLastNameChange
    private void triggerLastNameEvent() {

        ListIterator li = listeners.listIterator();
        while (li.hasNext()) {
            changeEventListener listener = (changeEventListener) li.next();
            changeEvent readerEvObj = new changeEvent(this, this);
            (listener).onLastNameChange(readerEvObj);
        }
    }

    //Método de disparo del evento onIDChange
    private void triggerIDEvent() {

        ListIterator li = listeners.listIterator();
        while (li.hasNext()) {
            changeEventListener listener = (changeEventListener) li.next();
            changeEvent readerEvObj = new changeEvent(this, this);
            (listener).onIDChange(readerEvObj);
        }
    }

    //Método de disparo del evento onAgeChange
    private void triggerAgeEvent() {

        ListIterator li = listeners.listIterator();
        while (li.hasNext()) {
            changeEventListener listener = (changeEventListener) li.next();
            changeEvent readerEvObj = new changeEvent(this, this);
            (listener).onAgeChange(readerEvObj);
        }
    }

    //Método de disparo del evento onBusinessChange
    private void triggerBusinessEvent() {

        ListIterator li = listeners.listIterator();
        while (li.hasNext()) {
            changeEventListener listener = (changeEventListener) li.next();
            changeEvent readerEvObj = new changeEvent(this, this);
            (listener).onBusinessChange(readerEvObj);
        }
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return Nombre;
    }

    public String getLastName() {
        return Apellido;
    }

    public int getAge() {
        return Edad;
    }

    public String getBuiness() {
        return Empresa;
    }

    public void setID(String _ID) {
        ID = _ID;
        //disparo del evento onIDChange
        this.triggerIDEvent();
    }

    public void setName(String _Nombre) {
        Nombre = _Nombre;
        //disparo del evento onNameChange
        this.triggerNameEvent();
    }

    public void setLastName(String _Apellido) {
        Apellido = _Apellido;
        //disparo del evento onLastNameChange
        this.triggerLastNameEvent();
    }

    public void setAge(int _Edad) {
        Edad = _Edad;
        //disparo del evento onAgeChange
        this.triggerAgeEvent();
    }

    public void setBusiness(String _Empresa) {
        Empresa = _Empresa;
        //disparo del evento onBusinessChange
        this.triggerBusinessEvent();
    }

}

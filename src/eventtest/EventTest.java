package eventtest;

public class EventTest {

    //Se crea una instancia de la interfaz events
    static changeEventListener events = new changeEventListener() {

        //Lo que va a suceder cada vez que se produzca un evento determinado
        @Override
        public void onIDChange(changeEvent ev) {
            //Mensaje que se imprime en consola al cambiar el ID
            System.out.println("Se cambió el ID");
        }

        @Override
        public void onNameChange(changeEvent ev) {
            //Mensaje que se imprime en consola al cambiar el Nombre
            System.out.println("Se cambió el nombre");
        }

        @Override
        public void onLastNameChange(changeEvent ev) {
            //Mensaje que se imprime en consola al cambiar el Apellido
            System.out.println("Se cambió el apellido");
        }

        @Override
        public void onAgeChange(changeEvent ev) {
            //Mensaje que se imprime en consola al cambiar la edad
            System.out.println("Se cambió la edad");
        }

        @Override
        public void onBusinessChange(changeEvent ev) {
            //Mensaje que se imprime en consola al cambiar la empresa
            System.out.println("Se cambió el nombre de la empresa");
        }
    };

    public static void main(String[] args) {

        //Se crea un objeto de la clase empresa
        Empresa empresa = new Empresa("1-234-567", "Antony", "García", 22, "Panama Hitek");
        //Se agrega el manejador de eventos
        empresa.addEventListener(events);

        //Cambio los valores iniciales por unos nuevos
        empresa.setID("7-654-321");
        empresa.setName("Kiara");
        empresa.setLastName("Navarro");
        empresa.setAge(24);

    }
}

package Ship
import grails.rest.*

@Resource(uri='api/ships', formats=['json', 'xml'])

class Ship {
String nombre;
String capasidadPasajeros;
String capitan;
        
    static constraints = {
        nombre()
        capasidadPasajeros()
        capitan()
    }
}

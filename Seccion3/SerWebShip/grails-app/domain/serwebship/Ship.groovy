package serwebship
import grails.rest.*

@Resource(uri='/ships')

class Ship {

     String nombre
     String capasidadpasajeros
     String capitan

    static constraints = {
        nombre blank:false
        capasidadpasajeros blank:false
        capitan blank:false
    }
}

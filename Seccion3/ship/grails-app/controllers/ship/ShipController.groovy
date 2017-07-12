package ship

import Ship.Ship

class ShipController {
static scaffold = Ship

    def index() { 
    def shipt = new Ship()//(nombre:"Titanic", capasidadPasajeros:"200", capitan:"Nicolas")
    shipt.nombre = "Canteros"
    shipt.capasidadPasajeros = "200"
    shipt.capitan = "Nicolas"
    //ship.save()
    [shipt:shipt]
    
    }
    def show(){
        def shipt = new Ship()//(nombre:'Titanic', capasidadPasajeros:'200', capitan:'Nicolas')
        shipt.nombre = "Canteros"
    shipt.capasidadPasajeros = "200"
    shipt.capitan = "Nicolas"
    [shipt:shipt]
    }
    
   
//    def index() { 
//        [nombre:"Titanic"]
//    }
//def create = {
//  Ship ship = new Ship()
//  ship.nombre = "Veronica"
//  ship.capitan = "Nicolas"
//}
}

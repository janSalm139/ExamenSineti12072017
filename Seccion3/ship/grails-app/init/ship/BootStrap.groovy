package ship
import Ship.Ship

class BootStrap {

    def init = { servletContext ->
    new Ship(name:"Titanic")
    new Ship(name:"San Kyntin")
}
    def destroy = {
    }
}

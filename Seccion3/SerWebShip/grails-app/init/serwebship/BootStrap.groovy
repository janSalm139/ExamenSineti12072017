package serwebship

class BootStrap {

   def init = { servletContext ->
    new Ship(nombre:"Veronica", capasidadpasajeros:"200",capitan:"Carlos").save()
    new Ship(nombre:"Titanic", capasidadpasajeros:"10000", capitan:"Nicolas").save()
    new Ship(nombre:"San kintin", capasidadpasajeros:"5000", capitan:"Violinchely").save()
}
}

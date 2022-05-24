package courier.management.system;
abstract class TransportFactory {
    public abstract Transport bookTransport();
}
class ShipFactory extends TransportFactory { 
    public Transport bookTransport() { 
        //Creating a Ship
        return new Ship();               
    } 
}  
class TruckFactory extends TransportFactory { 
    public Transport bookTransport(){ 
 	 //Creating a Truck  	 	
        return new Truck(); 
    } 
}              
 class PlaneFactory extends TransportFactory{
    public Transport bookTransport(){ 
 	 //Creating a Plane 	 	
        return new Plane(); 
    } 
 }    


    


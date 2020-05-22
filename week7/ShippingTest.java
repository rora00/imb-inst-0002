public class ShippingTest{ 

	public static void main(String[] args){
		//The Manager of the shipping company receives 3 orders
		//The orders are stored in an array
		Order[] orders = 	{
								new Order("Argos", 10, 0, "London", 10),
								new Order("Seven Seas", 0, 10, "Amsterdam", 15),
								new Order("Amazon", 5, 0, "Anwerp", 20)
							};
		

	    
		//Creating an instance of a CargoShip                           
		CargoShip aCargoShip = new CargoShip(10, 7);
		
		//Print the instantiated CargoShip - given the length
		System.out.println("This is the Cargo Ship: " + aCargoShip.getShipRepresentation() );

		//Creating an instance of a FerryShip                            
		FerryShip aFerryShip = new FerryShip(15, 10);
		
        //Print the instantiated FerryShip - given the length
		//UNCOMMENT the following line, AFTER IMPLEMENTING THE FerryShip Class
		//System.out.println("This is the Ferry: " + aFerryShip.getShipRepresentation() );
		
		//Create an instance of the ShippingManager
		ShippingManager manager = new ShippingManager(orders, aCargoShip, aFerryShip);

		//Call the method for completing the shipment of containers and transfer of passengers.
        manager.completeOrders();
	}
}

class ShippingManager{
	Order[] orders;
	CargoShip aCargoShip;
	FerryShip aFerryShip;
	 
	public ShippingManager(Order[] orders, CargoShip aCargoShip, FerryShip aFerryShip){
		 this.orders = orders;
		 this.aCargoShip = aCargoShip;
		 this.aFerryShip = aFerryShip;
	}
	
	/**
	* COMPLETE the method.
	* Your method should:
	* - loop through the array of Orders
	* - call transportAllCargo()
	* - call transportAllPassengers()
	* You should check whether there is cargo/passengers to transport with the order
	* It should call printOrderSummary after the TransportAllCargo and TransportAllPassengers 
	* have completed for individual orders.
    **/
	public void completeOrders() {
	}
        
		//loop through the array of orders
			//if necessary transportAllCargo();
			//if necessary transportAllPassengers();
			//printOrderSummary();
	}
	
	public void printOrderSummary(Order order){
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("Summary of the order to:  " + order.getDestination());
		System.out.println("Number of cargo transported:  " + order.getNumberOfCargo());
		System.out.println("Number of cargo ship journeys:  " + calculateNumberOfCargoShipJourneys(order.getNumberOfCargo()));
		System.out.println("Total distance covered by the cargo vessel: " + totalDistanceByCargoShip(order) );
		System.out.println("Total time for transporting the cargo and ship return: " + String.format ("%.2f", totalTimeForTransportingCargo(order)));
		System.out.println("Number of passengers transported:  " + order.getNumberOfPassengers());
		System.out.println("Number of ferry ship journeys:  " + calculateNumberOfFerryShipJouneys(order.getNumberOfPassengers()));
		System.out.println("Total distance covered by the ferry vessel: " + totalDistanceByFerryShip(order));
		System.out.println("Total time for transporting the passengers and ship return: " + String.format ("%.2f", totalTimeForTransportingPassengers(order)));
		System.out.println("-------------------------------------------------------------------------------------\n\n");
	}
	
	/**
	* COMPLETE the method.
	* Your method should:
	* calculate the total distance covered by the ship, which should include the 
	* distance of the journey to the destination and back.
	**/
	public int totalDistanceByCargoShip(Order order){
        int totalDistance = order.getDistance() * calculateNumberOfCargoShipJourneys(order.getNumberOfCargo());
		return totalDistance; //should return the correct distance and not 0
    }
	
	/**
	* COMPLETE the method.
	* Your method should:
	* calculate the total distance covered by the ship, which should include the 
	* distance of the journey to the destination and back.
	**/
	public int totalDistanceByFerryShip(Order order){
		return 0; //should return the correct distance and not 0
	}
	
	/**
	* COMPLETE the method.
	* Your method should:
	* calculate the total time needed for the journey to the destination and back. 
	* You should use totalDistanceByCargoShip() first, to ensure you have the distance, 
	* and the maximum speed of the vessel. If necessary, use casting to display the 
	* time as a double, rather than an integer.
	**/
	public double totalTimeForTransportingCargo(Order order){
		return 0; //Should return the correct time 
	}
	
	/**
	* COMPLETE the method.
	* Your method should:
	* calculate the total time needed for the journey to the destination and back. 
	* You should use totalDistanceByFerryShip() first, to ensure you have the distance, 
	* and the maximum speed of the vessel. If necessary, use casting to display the
	* time as a double, rather than an integer.
	**/
	public double totalTimeForTransportingPassengers(Order order){
		return 0; //Should return the correct time
	}
	
	/**
	* COMPLETE the method.
	* Your method should:
	* calculate the the number of journeys to be made for transporting all the cargo. 
	* For example if the length of the ship is 10 and the number of containers to be 
	* transported are 15, your ship should make 2 journeys (1st journey: 10, 2nd journey: 5).
    * Tip: use modulus if necessary for completing the method.
	**/
	public int calculateNumberOfCargoShipJourneys(int containers){        
        int value = containers - aCargoShip.getLength();
        int journeys = 1;
        if(containers == 0) return 0;
        while (value > 0){
            value -= aCargoShip.getLength();
            journeys++;
        }
        return journeys;
	}
	
	/**
	* COMPLETE the method.
	* Your method should:
	* calculate the the number of journeys to be made for transporting all the passengers. 
	* For example if the length of the ship is 10 and the number of passengers to be transported 
	* are 15, your ship should make 2 journeys.(1st journey: 10, 2nd journey: 5).
	* Tip: use modulus if necessary for completing the method.
	**/
	public int calculateNumberOfFerryShipJouneys(int passengers){
		int value = passengers - aCargoShip.getLength();
        int journeys = 1;
        if(passengers == 0) return 0;
        while (value > 0){
            value -= aCargoShip.getLength();
            journeys++;
        }
        return journeys;
	}
	
	public int transportAllCargo(int containers, CargoShip aCargoShip, int travelDistance){
		int numberOfJourneys = calculateNumberOfCargoShipJourneys(containers);
		int remainingContainers = containers;
		
		for (int i = 0; i < numberOfJourneys; i++){
			System.out.println("Loading for journey : " + (i + 1));
			aCargoShip.loadCargo((aCargoShip.getLength() > remainingContainers) ?  remainingContainers : aCargoShip.getLength());
			System.out.println("Starting journey number: " + (i + 1));
			String travel = aCargoShip.move(travelDistance);
			aCargoShip.unloadCargo(travel, (aCargoShip.getLength() > remainingContainers) ?  remainingContainers : aCargoShip.getLength());
			remainingContainers -= aCargoShip.getLength();
			System.out.println("Moving back...");
			aCargoShip.moveBack(travel);
			System.out.println("Ship journey : " + (i + 1) + " is completed.");
		}
		return numberOfJourneys;
	}

	/**
	* COMPLETE the method.
	* Your method should:
	* Provide functionality identical to the transportAllCargo method BUT for passengers
	* Ensure that textual output is also identical to the transportAllCargo method
	**/
	public int transportAllPassengers(int passengers, FerryShip aFerryShip, int travelDistance){
        int numberOfJourneys = calculateNumberOfFerryShipJouneys(passengers);
        int remainingPassengers = passengers;

        for (int i = 0; i < numberOfJourneys; i++){
			System.out.println("Loading for journey : " + (i + 1));
			aFerryShip.boardPassengers((aFerryShip.getLength() > remainingPassengers) ?  remainingPassengers : aFerryShip.getLength());
			System.out.println("Starting journey number: " + (i + 1));
			String travel = aFerryShip.move(travelDistance);
			aFerryShip.disembark(travel, (aFerryShip.getLength() > remainingPassengers) ?  remainingPassengers : aFerryShip.getLength());
			remainingPassengers -= aFerryShip.getLength();
			System.out.println("Moving back...");
			aFerryShip.moveBack(travel);
			System.out.println("Ship journey : " + (i + 1) + " is completed.");
		}
		return numberOfJourneys;
	}
}

class Ship {
	private final int DEFAULT_MAX_SPEED = 5;
	private final int DEFAULT_LENGTH = 10;
	private final int MAX_LENGTH = 50;
	private final int MAX_SPEED = 12;
	
	private int length;
	private int speed;

	//String Representation of the ship. A ship that is not loaded should look like this: \___________/
	private String shipRepresentation = "";
	
	//Character ▓ represents a container. When 4 containers are loaded on a ship the  representation should be: \▓▓▓▓___/ 
	//protected final char containerChar = (char)9619;
	protected final char containerChar = (char)178;
	
	//Character ± represents a passenger. When 4 passengers are loaded on a ship the  representation should be: \±±±±___/ 
	//protected final char passengerChar = (char)177;
	protected final char passengerChar = (char)241;
    
    //constructor that builds a ship with default length and default speed
	public Ship(){
		this.length = DEFAULT_LENGTH;
		this.speed = DEFAULT_MAX_SPEED;
		this.shipRepresentation = buildShipRepresentation();
	}
    
    //constructor that builds a ship with custom length and custom speed after checking
	public Ship(int length, int speed){
		this.length = checkShipLength(length);
		this.speed = checkShipSpeed(speed);
		this.shipRepresentation = buildShipRepresentation();
	}
	
	/**
	* COMPLETE the method.
	* Your method should:
	* check whether the length of the vessel provided to the constructor 
	* is between MAX_LENGTH and <= 0; 
	* This method should return the DEFAULT_LENGTH if the given length is 
	* beyond the acceptable boundaries, otherwise, it should return the given length.
	**/
	public int checkShipLength(int length){
        if(length <= 0 && length >= MAX_LENGTH)
            return DEFAULT_LENGTH;
        else 
            return length;
	}
	
	/**
	* COMPLETE the method.
	* Your method should:
	* check whether the speed of the vessel provided to the constructor 
	* is between MAX_SPEED and <= 0; 
	* This method should return the DEFAULT_MAX_SPEED if the given speed is 
	* beyond the acceptable boundaries, otherwise, it should return the given speed.
	**/
	public int checkShipSpeed(int speed){                                           
		if(speed <= 0 && speed >= MAX_SPEED)
            return DEFAULT_MAX_SPEED;
        else 
            return speed;
	}
	
	public String buildShipRepresentation(){
		String shipString = "\\"; 
		for (int i = 1; i <= this.length; i++){
			shipString += "_";
		}
		shipString += "/"; 
		return shipString;
	}
	
	public void printShip(){
		System.out.println(this.shipRepresentation);
	}
	
	public String move(int movingDistance){
		String travel = "";
		try{
			for (int i = 0; i < movingDistance; i++){
				travel += " ";
				Thread.sleep(1000/speed);
				System.out.print("\r" + travel + this.shipRepresentation);
			}
			System.out.println();
		} 
		catch( InterruptedException exception){
			System.out.println(exception);
		}  
		return travel;
	}
	
	public String moveBack(String travel){
		String backTrack = "";
		try{
			for (int i = travel.length(); i >= 0; i--){
				travel = travel.substring(0, i);
				backTrack += " ";
				Thread.sleep(1000/speed);
				System.out.print("\r" + travel + this.shipRepresentation + backTrack);
			}
			System.out.println("");
		}
		catch( InterruptedException exception){
			System.out.println(exception);
		}  
		return travel;
	}
	
	public void load(int numberOfItems, char itemCharacter){
		String ship = this.getShipRepresentation();
		try{
			for (int i = 1; i <= numberOfItems; i++){
				ship = ship.replaceFirst("_", Character.toString(itemCharacter));
				Thread.sleep(200);
				System.out.print("\r Loading  " + i + "\t" + ship);
				this.setShipRepresentation(ship);
			}
			System.out.println("");
		}
		catch( InterruptedException exception){
			System.out.println(exception);
		}
	}
	
	public boolean unload(String travel, int numberOfContainers, char itemCharacter){
		System.out.println("Unloading ...");
		String ship = this.getShipRepresentation();
		String items = "";
		try{
			while(ship.contains(String.valueOf(itemCharacter))){
				Thread.sleep(200);
				ship = ship.replaceFirst(Character.toString(itemCharacter), "_");
				items += Character.toString(itemCharacter);
				System.out.print("\r" + travel + ship + "\t\t" + items);
			}
			this.setShipRepresentation(ship); 
			System.out.println("");
		}
		catch( InterruptedException exception){
			System.out.println(exception);
		}  
		return true;
	}
	
	public int getLength(){
		return length;
	}

	public void setLength(int length){
		this.length = length;
	}

	public int getMaxSpeed(){
		return speed;
	}
	
	public void setMaxSpeed(int maxSpeed){
		this.speed = maxSpeed;
	}
	
	public String getShipRepresentation(){
		return shipRepresentation;
	}
	
	public void setShipRepresentation(String shipRepresentation){
		this.shipRepresentation = shipRepresentation;
	}
}

/**
 * MODIFY the class FerryShip:
 * - Ensure to define appropriate inheritance hierarchy...DONE
 * - Add a default constructor...DONE
 * - Add a custom constructor which takes two int variables (length and speed) to create an object type Ship...DONE
 **/
class FerryShip extends Ship{
	
	//Add a default Constructor
	FerryShip(){
        super();
    }

	//IMPLEMENT a custom Constructor
	FerryShip(int length, int speed){
		super(length, speed);
	}

	public int boardPassengers(int numberOfPassengers){
		System.out.println("Passengers boarding...");
		//UNCOMMENT the following line of code after correct implementation of the current class
		load(numberOfPassengers, this.passengerChar);
		return numberOfPassengers;
	}
	
	public boolean disembark(String travel, int numberOfPassengers){
		System.out.println("Unloading Cargo...");
		//UNCOMMENT the following line of code after correct implementation of the current class
		unload(travel, numberOfPassengers, this.passengerChar);
		return true;
	}
}

class CargoShip extends Ship{
	
	CargoShip(){
		super();
	}
	
	CargoShip(int length, int speed){
		super(length, speed);
	}
	
	public int loadCargo(int numberOfContainers){
		System.out.println("Loading Cargo...");
		load(numberOfContainers, this.containerChar);
		return numberOfContainers;
	}
	
	public boolean unloadCargo(String travel, int numberOfContainers){
		System.out.println("Unloading Cargo...");
		unload(travel, numberOfContainers, this.containerChar);
		return true;
	}
	
	public void transport(int containers){
		int numberOfJourneys = containers/this.getLength();
	}
}

class Order {
	
	// MODIFY the access modifiers for the instance variables of the Order Class...DONE
	private String customerName;
	private int numberOfCargo;
	private int numberOfPassengers;
	private String destination;
	private int distance;
	
	Order(String customerName, int numberOfCargo, int numberOfPassengers, String destination, int distance){
		this.customerName = customerName;
		this.numberOfCargo = numberOfCargo;
		this.numberOfPassengers = numberOfPassengers;
		this.destination = destination;
		this.distance = distance;
	}
	
	//MODIFY the getter and setter methods below for all the instance variables of this class...DONE

	public String getCustomerName(){
		return this.customerName;
	}
	
	public void setCustomerName(String customerName){
		this.customerName = customerName;
	}
	
	public int getNumberOfCargo(){
		return this.numberOfCargo;
	}
	
	public void setNumberOfCargo(int numberOfCargo){
		this.numberOfCargo = numberOfCargo;
	}
	
	public int getNumberOfPassengers(){
		return this.numberOfPassengers;
	}
	
	public void setNumberOfPassengers(int numberOfPassengers){
		this.numberOfPassengers = numberOfPassengers;
	}
	
	public String getDestination(){
		return this.destination;
	}
	
	public void setDestination(String destination){
		this.destination = destination;
	}
	
	public int getDistance(){
		return this.distance;
	}
	
	public void setDistance(int distance){
		this.distance = distance;
	}
}
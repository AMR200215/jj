package de.tum.cit.ase;

/**
 * This class represents a CargoShip that can carry containers of a specific type.
 * It extends the Container class.
 *
 * @param <T> the type of the content that the containers of this ship can carry
 */
// TODO 1.1: Make this class extend the Container class, and use generics to specify the type of the content that the containers of this ship can carry
public class CargoShip {
    // TODO 1.1: Add a private field to store the containers that are currently on the ship

    /**
     * Constructor for the CargoShip class.
     * CargoShips always have a capacity of 100 containers and are of type CARGO.
     * Initializes the containers list.
     */
    // TODO 1.1: Add a constructor that initializes the containers list

    /**
     * This method is used to load a container onto the ship.
     * It checks if the number of containers on the ship is less than the capacity.
     * If the check passes, the container is added to the ship.
     * If the check fails, an IllegalArgumentException is thrown.
     *
     * @param container the container to be loaded onto the ship
     * @throws IllegalArgumentException if the ship was full
     */
    // TODO 1.2: Add a method to load a container onto the ship

    /**
     * This method is used to unload a container from the ship.
     * It checks if the ship is empty.
     * If the ship is not empty, the last container that was loaded onto the ship is removed and returned.
     * If the ship is empty, an IllegalStateException is thrown.
     *
     * @return the container that was unloaded from the ship
     * @throws IllegalStateException if the ship is empty
     */
    // TODO 1.3: Add a method to unload a container from the ship
}

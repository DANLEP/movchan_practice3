//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.06 at 09:39:04 PM EET 
//


package ua.nure.location.entity;

import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ua.nure.location.entity package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ua.nure.location.entity
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Place }
     * 
     */
    public Place createPlace() {
        return new Place();
    }

    /**
     * Create an instance of {@link AddressType }
     * 
     */
    public AddressType createAddressType() {
        return new AddressType();
    }

    /**
     * Create an instance of {@link Location }
     * 
     */
    public Location createLocation() {
        return new Location();
    }

    /**
     * Create an instance of {@link Locations }
     * 
     */
    public Locations createLocations() {
        return new Locations();
    }

    /**
     * Create an instance of {@link Entity }
     * 
     */
    public Entity createEntity() {
        return new Entity();
    }

    /**
     * Create an instance of {@link CoordinateType }
     * 
     */
    public CoordinateType createCoordinateType() {
        return new CoordinateType();
    }

    /**
     * Create an instance of {@link PriceDetail }
     * 
     */
    public PriceDetail createPriceDetail() {
        return new PriceDetail();
    }

    /**
     * Create an instance of {@link Place.Photos }
     * 
     */
    public Place.Photos createPlacePhotos() {
        return new Place.Photos();
    }

    /**
     * Create an instance of {@link Place.Tags }
     * 
     */
    public Place.Tags createPlaceTags() {
        return new Place.Tags();
    }

    /**
     * Create an instance of {@link AddressType.HouseNumber }
     * 
     */
    public AddressType.HouseNumber createAddressTypeHouseNumber() {
        return new AddressType.HouseNumber();
    }

    /**
     * Create an instance of {@link Location.Area }
     * 
     */
    public Location.Area createLocationArea() {
        return new Location.Area();
    }

    /**
     * Create an instance of {@link Location.Places }
     * 
     */
    public Location.Places createLocationPlaces() {
        return new Location.Places();
    }

}